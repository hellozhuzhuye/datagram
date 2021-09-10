package top.smartsoftware.datagram.model.shenghong.v28;


import top.smartsoftware.datagram.config.SHPacketConst;
import top.smartsoftware.datagram.io.StreamReader;
import top.smartsoftware.datagram.io.StreamWriter;
import top.smartsoftware.datagram.model.BaseCommand;
import top.smartsoftware.datagram.model.shenghong.v28.code.ShCmd504;
import top.smartsoftware.datagram.util.StringUtility;

public class SHPacket {

	/**
	 * 2byte 起始域 固定为 0xAA0xF5
	 */
	protected byte[] startRegion;
	
	/**
	 * 2byte 长度域  起始域到校验和域整个报文长度
	 */
	protected int lengthRegion;
	

	/**
	 * 1byte 版本域   本次版本 0x10
	 */
	protected byte  versionRegion;

	/**
	 * 1byte 序列号域  报文的流水号
	 */
	protected byte UIDRegion;


	/**
	 * 2byte 命令CMD
	 */
	protected int command;
	
	/**
	 * 数据对象
	 */
	protected BaseCommand commandBody;
	
	/**
	 * Nbyte 数据域
	 */
	// 消息体字节数组
	protected byte[] msgBodyBytesRegion;

	/**
	 * 校验码 1byte
	 */
	protected byte checkSum;


	public SHPacket(byte[] datas) {
		StreamReader reader = new StreamReader(datas);
		reader.order(SHPacketConst._byteOrder);
		this.startRegion = reader.readBytes(2);
		this.lengthRegion = reader.readUInt16();
		this.versionRegion = reader.readByte();
		this.UIDRegion = reader.readByte();
		this.command = reader.readUInt16();
		this.msgBodyBytesRegion = reader.readBytes(lengthRegion - 9);
		this.checkSum = reader.readByte();
	}


	public SHPacket(byte[] datas, byte[] startRegion) {
		StreamReader reader = new StreamReader(datas);
		reader.order(SHPacketConst._byteOrder);
		this.startRegion = startRegion;
		this.lengthRegion = reader.readUInt16();
		this.versionRegion = reader.readByte();
		this.UIDRegion = reader.readByte();
		this.command = reader.readUInt16();
		this.msgBodyBytesRegion = reader.readBytes(lengthRegion - 9);
		this.checkSum = reader.readByte();
	}

	public SHPacket() {

	}





	/**  获取指令内容
	 * @return
	 */
	public BaseCommand getCommandObj(String code) {
		try {
//			BaseCommand command = CommandFactory.createCommand(this.command,version);
			if("502".equals(code)){
				ShCmd502 shCmd502 = new ShCmd502();
				shCmd502.bodyFromBytes(this.msgBodyBytesRegion);
				commandBody = shCmd502;
			}
			if("202".equals(code)){
				ShCmd202 shCmd202 = new ShCmd202();
				shCmd202.bodyFromBytes(this.msgBodyBytesRegion);
				commandBody = shCmd202;
			}
			if ("504".equals(code)){
				ShCmd504 shCmd504 = new ShCmd504();
				shCmd504.bodyFromBytes(this.msgBodyBytesRegion);
				commandBody = shCmd504;
			}
			if ("104".equals(code)){
				ShCmd104 shCmd104 = new ShCmd104();
				shCmd104.bodyFromBytes(this.msgBodyBytesRegion);
				commandBody = shCmd104;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return commandBody;
	}



	@Override
	public String toString() {
		return "包: [起始域=" + StringUtility.toHexString(startRegion) + ", 长度域=" + String.format("%4d", lengthRegion)
				+ ", 版本域=" + versionRegion + ", 序列号域=" + String.format("%3d", UIDRegion) + ", 命令代 CMD=" + String.format("%4d", command)
//				+ ", 数据域=" + commandBody.toString()
				+ ", 校验和域=" + checkSum + "]" + ", msgBodyBytesRegion=" + StringUtility.toHexString(msgBodyBytesRegion);
	}


	public boolean validateChecksum() {
		int value = 0;
		for(int i=0; i<2; i++){
			value += ((this.command >> (8*i)) & 0xFF);
		}
		if(this.msgBodyBytesRegion == null){
			return false;
		}
		for(byte n : this.msgBodyBytesRegion){
			value += (n & 0xff);
		}
		value = value & 0xff;
		int chksum = this.checkSum & 0xff;
		return value == chksum;
	}




	public void correctChecksum() {
		int value = 0;
		for(int i=0; i<2; i++){
			value += ((this.command >> (8*i)) & 0xFF);
		}
		if(msgBodyBytesRegion == null || msgBodyBytesRegion.length == 0){
			this.checkSum = (byte)value;
			return;
		}

		for(byte n : msgBodyBytesRegion){
			value += (n & 0xff);
		}
		this.checkSum = (byte)value;

	}


	public void generateChecksum(byte[] data){
		int value = 0;
		for(int i=0; i<2; i++){
			value += ((this.command >> (8*i)) & 0xFF);
		}
		if(data == null || data.length == 0){
			this.checkSum = (byte)value;
			return;
		}

		for(byte n : data){
			value += (n & 0xff);
		}
		this.checkSum = (byte)value;
	}

	public byte[] getAllBytes() {
		StreamWriter sw = new StreamWriter();
		sw.order(SHPacketConst._byteOrder);
		sw.write(startRegion);
		sw.writeUInt16(lengthRegion);
		sw.write(versionRegion);
		sw.write(UIDRegion);
		sw.write((short)command);
		if (msgBodyBytesRegion!=null)
		{
			sw.write(msgBodyBytesRegion);
		}
		sw.write(checkSum);
		return sw.toArray();
	}



	public byte[] getStartRegion() {
		return startRegion;
	}

	public void setStartRegion(byte[] startRegion) {
		this.startRegion = startRegion;
	}

	public int getLengthRegion() {
		return lengthRegion;
	}

	public void setLengthRegion(int lengthRegion) {
		this.lengthRegion = lengthRegion;
	}

	public byte getVersionRegion() {
		return versionRegion;
	}

	public void setVersionRegion(byte versionRegion) {
		this.versionRegion = versionRegion;
	}

	public byte getUIDRegion() {
		return UIDRegion;
	}

	public void setUIDRegion(byte UIDRegion) {
		this.UIDRegion = UIDRegion;
	}


	public int getCommand() {
		return command;
	}

	public void setCommand(int command) {
		this.command = command;
	}

	public BaseCommand getCommandBody() {
		return commandBody;
	}

	public void setCommandBody(BaseCommand commandBody)  {
		this.commandBody = commandBody;
	}

	public byte[] getMsgBodyBytesRegion() {
		return msgBodyBytesRegion;
	}

	public void setMsgBodyBytesRegion(byte[] msgBodyBytesRegion) {
		this.msgBodyBytesRegion = msgBodyBytesRegion;
	}

	public byte getCheckSum() {
		return checkSum;
	}

	public void setCheckSum(byte checkSum) {
		this.checkSum = checkSum;
	}
}
