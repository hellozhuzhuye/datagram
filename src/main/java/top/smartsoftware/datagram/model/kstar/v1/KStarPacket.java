package top.smartsoftware.datagram.model.kstar.v1;


import top.smartsoftware.datagram.io.StreamReader;
import top.smartsoftware.datagram.io.StreamWriter;
import top.smartsoftware.datagram.model.kstar.v2.KStarPacketConst;

public class KStarPacket {

	/**
	 * 2byte 起始域 固定为 0xAA0xF5
	 */
	protected byte[] startRegion;

	/**
	 * 2byte 长度域  起始域到校验和域整个报文长度
	 */
	protected int lengthRegion;


	/**
	 * 20byte 终端号
	 */
	protected byte[]  sn;


	/**
	 * 2byte 命令字
	 */
	protected int command;


	/**
	 * byte 帧来源
	 */
	protected byte cmdSource;

	/**
	 * byte 帧来源
	 */
	protected byte plugNo;

	/**
	 * byte 传输类型
	 */
	protected byte cmdType;

	/**
	 * Nbyte 数据域
	 */
	// 消息体字节数组
	protected byte[] msgBodyBytesRegion;

	/**
	 * 结束标识 1byte
	 */
	protected byte endFlag;

	/**
	 * 校验码 4byte
	 */
	protected int checkSum;

	public KStarPacket() {

	}


	public KStarPacket(byte[] datas, byte[] startRegion) {
		StreamReader reader = new StreamReader(datas);
		reader.order(KStarPacketConst._byteOrder);
		this.startRegion = KStarPacketConst.StartFlag;
		this.lengthRegion = reader.readUInt16();
		this.sn = reader.readBytes(20);
		this.command = reader.readUInt16();
		this.cmdSource = reader.readByte();
		this.plugNo = reader.readByte();
		this.cmdType = reader.readByte();
		this.msgBodyBytesRegion = reader.readBytes(lengthRegion - 32);
		this.endFlag = reader.readByte();
		this.checkSum = reader.readInt32();
	}


	public byte[] getAllBytes() {
		StreamWriter sw = new StreamWriter();
		sw.order(KStarPacketConst._byteOrder);
		sw.write(startRegion);
		sw.writeUInt16(lengthRegion);
		sw.write(sn);
		sw.writeUInt16(command);
		sw.write(cmdSource);
		sw.write(plugNo);
		sw.write(cmdType);
		sw.write(msgBodyBytesRegion);
		sw.write(endFlag);
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

	public byte[] getSn() {
		return sn;
	}

	public void setSn(byte[] sn) {
		this.sn = sn;
	}

	public byte getPlugNo() {
		return plugNo;
	}

	public void setPlugNo(byte plugNo) {
		this.plugNo = plugNo;
	}

	public int getCommand() {
		return command;
	}

	public void setCommand(int command) {
		this.command = command;
	}

	public byte getCmdSource() {
		return cmdSource;
	}

	public void setCmdSource(byte cmdSource) {
		this.cmdSource = cmdSource;
	}


	public byte getCmdType() {
		return cmdType;
	}

	public void setCmdType(byte cmdType) {
		this.cmdType = cmdType;
	}

	public byte[] getMsgBodyBytesRegion() {
		return msgBodyBytesRegion;
	}

	public void setMsgBodyBytesRegion(byte[] msgBodyBytesRegion) {
		this.msgBodyBytesRegion = msgBodyBytesRegion;
		this.lengthRegion = this.msgBodyBytesRegion.length + 32;
		this.checkSum = generateChecksum();
	}

	public byte getEndFlag() {
		return endFlag;
	}

	public void setEndFlag(byte endFlag) {
		this.endFlag = endFlag;
	}

	public int getCheckSum() {
		return checkSum;
	}

	public void setCheckSum(int checkSum) {
		this.checkSum = checkSum;
	}

	public boolean validateChecksum() {
		int chksum = this.checkSum;
		int value = 0;
		this.checkSum = 0;
		for(byte n : getAllBytes()){
			value +=(n & 0xff);
		}
//		System.out.println(value);
		this.checkSum = chksum;
		return value == chksum;
	}

	public int generateChecksum(){
		int value = 0;
		this.checkSum = 0;
		for(byte n : getAllBytes()){
			value += (n & 0xff);
		}
		return  value;
	}
}
