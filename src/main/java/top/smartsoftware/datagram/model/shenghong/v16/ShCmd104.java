package top.smartsoftware.datagram.model.shenghong.v16;



import top.smartsoftware.datagram.config.SHPacketConst;
import top.smartsoftware.datagram.io.StreamReader;
import top.smartsoftware.datagram.io.StreamWriter;
import top.smartsoftware.datagram.model.AbstractBaseCommand;
import top.smartsoftware.datagram.util.FormatUtility;
import top.smartsoftware.datagram.util.SHUtility;

import java.io.Serializable;



public class ShCmd104 extends AbstractBaseCommand {
	
    private ReqMsg reqMsg;


	public ShCmd104() {

	}

	public ShCmd104(int paramaddr, int count, byte[] raw) {
		reqMsg = new ReqMsg();
		reqMsg.setUser_id((short) SHCmdV16Const.paramVar1);
		reqMsg.setCmd_no((short) SHCmdV16Const.paramVar2);
		reqMsg.setPile_sn(raw);
		reqMsg.setPlug_cnt((byte)1);
		reqMsg.setPlug_no((byte)1);
		reqMsg.setPlug_Type((byte)1);
		reqMsg.setPlug_workstate((byte)1);
		reqMsg.setCurrent_SOC((byte)1);
		reqMsg.setChargeSysFault_State(count);
		reqMsg.setCarConnect_State((byte)1);

		reqMsg.setInternalVar1(paramaddr);
		reqMsg.setInternalVar2(paramaddr);
		reqMsg.setInternalVar3(paramaddr);

		reqMsg.setDcCharge_Voltage((short)1);
		reqMsg.setDcCharge_Current((short)1);
		reqMsg.setBMS_NeedVolt((short)1);
		reqMsg.setBMS_NeedCurrent((short)1);
		reqMsg.setBMS_ChargeMode((byte)1);
		reqMsg.setAC_A_Volt((short)1);
		reqMsg.setAC_B_Volt((short)1);
		reqMsg.setAC_C_Volt((short)1);
		reqMsg.setAC_A_Current((short)1);
		reqMsg.setAC_B_Current((short)1);
		reqMsg.setAC_C_Current((short)1);
		reqMsg.setTotal_Time((byte)1);
		reqMsg.setTotal_Degree((byte)1);
		reqMsg.setBeforeChargeElecMeterDegree((byte)1);
		reqMsg.setElecMeterDegree((byte)1);
		reqMsg.setChargeBootMode((byte)1);
		reqMsg.setCharge_strategy((byte)1);
		reqMsg.setCharge_strategy_param((byte)1);
		reqMsg.setReserveFlag((byte)1);
		reqMsg.setCard_no(raw);
		reqMsg.setReserveTimeout((byte)1);
		reqMsg.setReserveChargeTime(raw);
		reqMsg.setCardBalanceBeforeCharge((byte)1);

		reqMsg.setSysVar1(paramaddr);
		reqMsg.setSysVar2(paramaddr);
		reqMsg.setSysVar3(paramaddr);
		reqMsg.setSysVar4(paramaddr);
		reqMsg.setSysVar5(paramaddr);

		reqMsg.setStartcharge_mode((byte)1);

	}

	public short getCid() {
		return SHCmdV16Const.PILE_CHAR_PARAM_TO_PILE;
	}

	public void bodyFromBytes(byte[] bytes) throws Exception {
        reqMsg = new ReqMsg(bytes);
	}

	public byte[] bodyToBytes() throws Exception {
		if (reqMsg==null)
		{
			return null;
		}
		return reqMsg.getBytes();
	}

    public class ReqMsg implements Serializable {
	    	/** 
	    	 * user_id:TODO(用户ID). 
	    	 */ 
	    	private short user_id;
	    	
	    	/** 
	    	 * cmd_no:TODO(指令序号). 
	    	 */ 
	    	private short cmd_no;
	    	
	    	/** 
	    	 * pile_sn(充电桩编码). 
	    	 */ 
	    	private byte[] pile_sn;
	    	
	    	/** 
	    	 * plug_cnt:(充电枪数量). 
	    	 */ 
	    	private byte plug_cnt;
	    	
	    	/** 
	    	 * plug_no:(充电口号). 
	    	 */ 
	    	private byte plug_no;
	    	
	    	/** 
	    	 * plug_Type:(充电枪类型). 
	    	 */ 
	    	private byte plug_Type;
	    	
	    	/** 
	    	 * plug_workstate:(工作状态). 
	    	 */ 
	    	private byte plug_workstate;
	    	
	    	/** 
	    	 * current_SOC:(当前SOC %). 
	    	 */ 
	    	private byte current_SOC;
	    	
	    	/** 
	    	 * chargeSysFault_State:(告警状态)
	    	 */ 
	    	private int chargeSysFault_State;
	    	
	    	/** 
	    	 * carConnect_State:(车连接状态)
	    	 * 
	    	 */ 
	    	private byte carConnect_State;
	    	
	    	/** 
	    	 * internalVar1:(内部变量 1). 
	    	 */ 
	    	private int internalVar1;
	    	
	    	/** 
	    	 * internalVar2:(内部变量 2). 
	    	 */ 
	    	private int internalVar2;
	    	
	    	/** 
	    	 * internalVar3:(内部变量 3). 
	    	 */ 
	    	private int internalVar3;
	    	
	    	/** 
	    	 * dcCharge_Voltage:(直流充电电压). 
	    	 */ 
	    	private short dcCharge_Voltage;
	    	
	    	/** 
	    	 * dcCharge_Current:(直流充电电流). 
	    	 */ 
	    	private short dcCharge_Current;
	    	
	    	/** 
	    	 * BMS_NeedVolt:(BMS 需求电压). 
	    	 */ 
	    	private short BMS_NeedVolt;
	    	
	    	/** 
	    	 * BMS_NeedCurrent(BMS 需求电流). 
	    	 */ 
	    	
	    	private short BMS_NeedCurrent;
	    	
	    	/** 
	    	 * BMS_ChargeMode:(BMS 充电模式). 
	    	 */ 
	    	private byte BMS_ChargeMode;
	    	
	    	/** 
	    	 * AC_A_Volt:(交流 A 相充电电压). 
	    	 */ 
	    	private short AC_A_Volt;
	    	
	    	/** 
	    	 * AC_B_Volt:(交流 B 相充电电压). 
	    	 */ 
	    	private short AC_B_Volt;
	    	
	    	/** 
	    	 * AC_C_Volt:(交流 C 相充电电压). 
	    	 */ 
	    	private short AC_C_Volt;
	    	
	    	/** 
	    	 * AC_A_Current:(交流 A 相充电电流). 
	    	 */ 
	    	private short AC_A_Current;
	    	
	    	/** 
	    	 * AC_B_Current:(交流 B 相充电电流). 
	    	 */ 
	    	private short AC_B_Current;
	    	
	    	/** 
	    	 * AC_C_Current:(交流 C 相充电电流). 
	    	 */ 
	    	private short AC_C_Current;
	    	
	    	/** 
	    	 * TotalTime:(充电时长(秒)). 
	    	 */ 
	    	private int Total_Time;
	    	
	    	/** 
	    	 * TotalDegree:(此次充电电量 (0.01kwh)). 
	    	 */ 
	    	private int Total_Degree;
	    	
	    	/** 
	    	 * BeforeChargeElecMeterDegree:(充电前电表读数). 
	    	 */ 
	    	private int BeforeChargeElecMeterDegree;
	    	
	    	/** 
	    	 * ElecMeterDegree:(当前电表读数). 
	    	 */ 
	    	private int ElecMeterDegree;
	    	
	    	/** 
	    	 * ChargeBootMode:(充电启动方式). 
	    	 */ 
	    	private byte ChargeBootMode;
	    	
	    	/** 
	    	 * charge_strategy:(充电策略). 
	    	 */ 
	    	private byte charge_strategy;
	    	
	    	/** 
	    	 * charge_strategy_param:(充电策略参数). 
	    	 */ 
	    	private int charge_strategy_param;
	    	
	    	/** 
	    	 * ReserveFlag:预约标志). 
	    	 */ 
	    	private byte ReserveFlag;
	    	
	    	/** 
	    	 * card_no:(充电/预约卡号). 
	    	 */ 
	    	private byte[] card_no;
	    	
	    	/** 
	    	 * ReserveTimeout:(预约超时时间). 
	    	 */ 
	    	private byte ReserveTimeout;
	    	
	    	/** 
	    	 * ReserveChargeTime:(预约/开始充电开始时间). 
	    	 */ 
	    	private byte[] ReserveChargeTime;
	    	
	    	/** 
	    	 * CardBalanceBeforeCharge:(充电前卡余额). 
	    	 */ 
	    	private int CardBalanceBeforeCharge;
	    	
	    	/** 
	    	 * SysVar1:(系统变量 1). 
	    	 */ 
	    	private int SysVar1;
	    	
	    	/** 
	    	 * SysVar2:(系统变量 2). 
	    	 */ 
	    	private int SysVar2;
	    	
	    	/** 
	    	 * SysVar3:(系统变量 3). 
	    	 */ 
	    	private int SysVar3;
	    	
	    	/** 
	    	 * SysVar4:(系统变量 4). 
	    	 */ 
	    	private int SysVar4;
	    	
	    	/** 
	    	 * SysVar5:(系统变量 5). 
	    	 */ 
	    	private int SysVar5;
	    	
	    	/** 
	    	 * startcharge_mode:(启动方式). 
	    	 */ 
	    	private byte startcharge_mode;
	    	
	    	
		public ReqMsg(byte[] bytes) {
			StreamReader reader = new StreamReader(bytes);
			reader.order(SHPacketConst._byteOrder);
			setUser_id(reader.readShort());
			setCmd_no(reader.readShort());
			setPile_sn(reader.readBytes(32));
			setPlug_cnt(reader.readByte());
			setPlug_no(reader.readByte());
			setPlug_Type(reader.readByte());
			setPlug_workstate(reader.readByte());
			setCurrent_SOC(reader.readByte());
			setChargeSysFault_State(reader.readInt32());
			setCarConnect_State(reader.readByte());
			setInternalVar1(reader.readInt32());
			setInternalVar2(reader.readInt32());
			setInternalVar3(reader.readInt32());
			setDcCharge_Voltage(reader.readShort());
			setDcCharge_Current(reader.readShort());
			setBMS_NeedVolt(reader.readShort());
			setBMS_NeedCurrent(reader.readShort());
			setBMS_ChargeMode(reader.readByte());
			setAC_A_Volt(reader.readShort());
			setAC_B_Volt(reader.readShort());
			setAC_C_Volt(reader.readShort());
			setAC_A_Current(reader.readShort());
			setAC_B_Current(reader.readShort());
			setAC_C_Current(reader.readShort());
			setTotal_Time(reader.readInt32());
			setTotal_Degree(reader.readInt32());
			setBeforeChargeElecMeterDegree(reader.readInt32());
			setElecMeterDegree(reader.readInt32());
			setChargeBootMode(reader.readByte());
			setCharge_strategy(reader.readByte());
			setCharge_strategy_param(reader.readInt32());
			setReserveFlag(reader.readByte());
			setCard_no(reader.readBytes(32));
			setReserveTimeout(reader.readByte());
			setReserveChargeTime(reader.readBytes());
			setCardBalanceBeforeCharge(reader.readByte());
			setSysVar1(reader.readInt32());
			setSysVar2(reader.readInt32());
			setSysVar3(reader.readInt32());
			setSysVar4(reader.readInt32());
			setSysVar5(reader.readInt32());
			setStartcharge_mode(reader.readByte());
			
		}

		public ReqMsg() {

		}

		public short getUser_id() {
			return user_id;
		}

		public void setUser_id(short user_id) {
			this.user_id = user_id;
		}

		public short getCmd_no() {
			return cmd_no;
		}

		public void setCmd_no(short cmd_no) {
			this.cmd_no = cmd_no;
		}


		public byte getPlug_no() {
			if (plug_cnt == 1 && plug_no == 0)
			{
				plug_no = 1;
			}
			return plug_no;
		}

		public void setPlug_no(byte plug_no) {
			this.plug_no = plug_no;
		}

		public byte[] getPile_sn() {
			return pile_sn;
		}

		public void setPile_sn(byte[] pile_sn) {
			this.pile_sn = pile_sn;
		}

		public byte getPlug_cnt() {
			return plug_cnt;
		}

		public void setPlug_cnt(byte plug_cnt) {
			this.plug_cnt = plug_cnt;
		}

		public byte getPlug_Type() {
			return plug_Type;
		}

		public void setPlug_Type(byte plug_Type) {
			this.plug_Type = plug_Type;
		}
		

		public byte getPlug_workstate() {
			return plug_workstate;
		}

		public void setPlug_workstate(byte plug_workstate) {
			this.plug_workstate = plug_workstate;
		}

		public byte getCurrent_SOC() {
			return current_SOC;
		}

		public void setCurrent_SOC(byte current_SOC) {
			this.current_SOC = current_SOC;
		}

		public int getChargeSysFault_State() {
			return chargeSysFault_State;
		}

		public void setChargeSysFault_State(int chargeSysFault_State) {
			this.chargeSysFault_State = chargeSysFault_State;
		}

		public byte getCarConnect_State() {
			return carConnect_State;
		}

		public void setCarConnect_State(byte carConnect_State) {
			this.carConnect_State = carConnect_State;
		}

		public int getInternalVar1() {
			return internalVar1;
		}

		public void setInternalVar1(int internalVar1) {
			this.internalVar1 = internalVar1;
		}

		public int getInternalVar2() {
			return internalVar2;
		}

		public void setInternalVar2(int internalVar2) {
			this.internalVar2 = internalVar2;
		}

		public int getInternalVar3() {
			return internalVar3;
		}

		public void setInternalVar3(int internalVar3) {
			this.internalVar3 = internalVar3;
		}

		public short getDcCharge_Voltage() {
			return dcCharge_Voltage;
		}

		public void setDcCharge_Voltage(short dcCharge_Voltage) {
			this.dcCharge_Voltage = dcCharge_Voltage;
		}

		public short getDcCharge_Current() {
			return dcCharge_Current;
		}

		public void setDcCharge_Current(short dcCharge_Current) {
			this.dcCharge_Current = dcCharge_Current;
		}

		public short getBMS_NeedVolt() {
			return BMS_NeedVolt;
		}

		public void setBMS_NeedVolt(short bMS_NeedVolt) {
			BMS_NeedVolt = bMS_NeedVolt;
		}

		public short getBMS_NeedCurrent() {
			return BMS_NeedCurrent;
		}

		public void setBMS_NeedCurrent(short bMS_NeedCurrent) {
			BMS_NeedCurrent = bMS_NeedCurrent;
		}

		public byte getBMS_ChargeMode() {
			return BMS_ChargeMode;
		}

		public void setBMS_ChargeMode(byte bMS_ChargeMode) {
			BMS_ChargeMode = bMS_ChargeMode;
		}

		public short getAC_A_Volt() {
			return AC_A_Volt;
		}

		public void setAC_A_Volt(short aC_A_Volt) {
			AC_A_Volt = aC_A_Volt;
		}

		public short getAC_B_Volt() {
			return AC_B_Volt;
		}

		public void setAC_B_Volt(short aC_B_Volt) {
			AC_B_Volt = aC_B_Volt;
		}

		public short getAC_C_Volt() {
			return AC_C_Volt;
		}

		public void setAC_C_Volt(short aC_C_Volt) {
			AC_C_Volt = aC_C_Volt;
		}

		public short getAC_A_Current() {
			return AC_A_Current;
		}

		public void setAC_A_Current(short aC_A_Current) {
			AC_A_Current = aC_A_Current;
		}

		public short getAC_B_Current() {
			return AC_B_Current;
		}

		public void setAC_B_Current(short aC_B_Current) {
			AC_B_Current = aC_B_Current;
		}

		public short getAC_C_Current() {
			return AC_C_Current;
		}

		public void setAC_C_Current(short aC_C_Current) {
			AC_C_Current = aC_C_Current;
		}

		public int getTotal_Time() {
			return Total_Time;
		}

		public void setTotal_Time(int total_Time) {
			Total_Time = total_Time;
		}

		public int getTotal_Degree() {
			return Total_Degree;
		}

		public void setTotal_Degree(int total_Degree) {
			Total_Degree = total_Degree;
		}

		public int getBeforeChargeElecMeterDegree() {
			return BeforeChargeElecMeterDegree;
		}

		public void setBeforeChargeElecMeterDegree(int beforeChargeElecMeterDegree) {
			BeforeChargeElecMeterDegree = beforeChargeElecMeterDegree;
		}

		public int getElecMeterDegree() {
			return ElecMeterDegree;
		}

		public void setElecMeterDegree(int elecMeterDegree) {
			ElecMeterDegree = elecMeterDegree;
		}

		public byte getChargeBootMode() {
			return ChargeBootMode;
		}

		public void setChargeBootMode(byte chargeBootMode) {
			ChargeBootMode = chargeBootMode;
		}


		public byte getCharge_strategy() {
			return charge_strategy;
		}

		public void setCharge_strategy(byte charge_strategy) {
			this.charge_strategy = charge_strategy;
		}

		public int getCharge_strategy_param() {
			return charge_strategy_param;
		}

		public void setCharge_strategy_param(int charge_strategy_param) {
			this.charge_strategy_param = charge_strategy_param;
		}

		public byte getReserveFlag() {
			return ReserveFlag;
		}

		public void setReserveFlag(byte reserveFlag) {
			ReserveFlag = reserveFlag;
		}


		public byte[] getCard_no() {
			return card_no;
		}

		public void setCard_no(byte[] card_no) {
			this.card_no = card_no;
		}

		public byte getReserveTimeout() {
			return ReserveTimeout;
		}

		public void setReserveTimeout(byte reserveTimeout) {
			ReserveTimeout = reserveTimeout;
		}

		public byte[] getReserveChargeTime() {
			return ReserveChargeTime;
		}

		public void setReserveChargeTime(byte[] reserveChargeTime) {
			ReserveChargeTime = reserveChargeTime;
		}

		public int getCardBalanceBeforeCharge() {
			return CardBalanceBeforeCharge;
		}

		public void setCardBalanceBeforeCharge(int cardBalanceBeforeCharge) {
			CardBalanceBeforeCharge = cardBalanceBeforeCharge;
		}

		public int getSysVar1() {
			return SysVar1;
		}

		public void setSysVar1(int sysVar1) {
			SysVar1 = sysVar1;
		}

		public int getSysVar2() {
			return SysVar2;
		}

		public void setSysVar2(int sysVar2) {
			SysVar2 = sysVar2;
		}

		public int getSysVar3() {
			return SysVar3;
		}

		public void setSysVar3(int sysVar3) {
			SysVar3 = sysVar3;
		}

		public int getSysVar4() {
			return SysVar4;
		}

		public void setSysVar4(int sysVar4) {
			SysVar4 = sysVar4;
		}

		public int getSysVar5() {
			return SysVar5;
		}

		public void setSysVar5(int sysVar5) {
			SysVar5 = sysVar5;
		}
		

		public byte getStartcharge_mode() {
			return startcharge_mode;
		}

		public void setStartcharge_mode(byte startcharge_mode) {
			this.startcharge_mode = startcharge_mode;
		}

		@Override
		public String toString() {
			return "ReqMsg [用户 ID=" + user_id + ", 指令序号=" + cmd_no + ", 充电桩编码=" + SHUtility.bytesToSN(pile_sn)
					+ ", 充电枪数量=" + plug_cnt + ", 充电口号=" + plug_no + ", 充电枪类型=" + ControlCmdAddr.getPileType(plug_Type)
					+ ", 工作状态=" + ControlCmdAddr.getPileWorkStatus(plug_workstate) + ", 当前SOC %=" + current_SOC + ", 告警状态="
					+ AlarmCode.getCharCause(chargeSysFault_State) + ", 车连接状态=" + ControlCmdAddr.getPileCarConnectStatus(carConnect_State) + ", 内部变量 1=" + internalVar1
					+ ", 内部变量 2=" + internalVar2 + ", 内部变量 3=" + internalVar3 + ", 直流充电电压="
					+ dcCharge_Voltage + ", 直流充电电流=" + dcCharge_Current + ", BMS 需求电压=" + BMS_NeedVolt
					+ ", BMS 需求电流=" + BMS_NeedCurrent + ", BMS 充电模式=" + BMS_ChargeMode + ", 交流 A 相充电电压="
					+ AC_A_Volt + ", 交流 B 相充电电压=" + AC_B_Volt + ", 交流 C 相充电电压=" + AC_C_Volt + ", 交流 A 相充电电流="
					+ AC_A_Current + ", 交流 B 相充电电流=" + AC_B_Current + ", 交流 C 相充电电流=" + AC_C_Current
					+ ", 充电时长(秒)=" + Total_Time + ", 此次充电电量(0.01k w h=" + Total_Degree + ", 充电前电表读数="
					+ BeforeChargeElecMeterDegree + ", 当前电表读数=" + ElecMeterDegree + ", 充电启动方式="
					+ ControlCmdAddr.getPileChargeMode(ChargeBootMode) + ", 充电策略=" + ChargeStrategy.getChargeStrategy(charge_strategy) + ", charge_strategy_param="
					+ charge_strategy_param + ", 预约标志=" + ReserveFlag + ", 充电/预约卡号=" + SHUtility.bytesToSN(card_no)
					+ ", 预约超时时间=" + ReserveTimeout + ", 预约开始充电开始时间=" + FormatUtility.yyyyMMddHHmmss(SHUtility.toDate(ReserveChargeTime))
					+ ", 充电前卡余额=" + CardBalanceBeforeCharge + ", SysVar1=" + SysVar1 + ", SysVar2="
					+ SysVar2 + ", SysVar3=" + SysVar3 + ", SysVar4=" + SysVar4 + ", SysVar5=" + SysVar5
					+ ", 启动方式=" + startcharge_mode + "]";
		}


		public byte[] getBytes() {
			StreamWriter writer = new StreamWriter();
			writer.order(SHPacketConst._byteOrder);
			writer.writeUInt16(user_id);
			writer.writeUInt16(cmd_no);
			writer.write(pile_sn);
			writer.write(plug_cnt);
			writer.write(plug_no);
			writer.write(plug_Type);
			writer.write(plug_workstate);
			writer.write(current_SOC);
			writer.write(chargeSysFault_State);
			writer.write(carConnect_State);
			writer.write(internalVar1);
			writer.write(internalVar2);
			writer.write(internalVar3);
			writer.write(dcCharge_Voltage);
			writer.write(dcCharge_Current);
			writer.write(BMS_NeedVolt);
			writer.write(BMS_NeedCurrent);
			writer.write(BMS_ChargeMode);
			writer.write(AC_A_Volt);
			writer.write(AC_B_Volt);
			writer.write(AC_C_Volt);
			writer.write(AC_A_Current);
			writer.write(AC_B_Current);
			writer.write(AC_C_Current);
			writer.write(Total_Time);
			writer.write(Total_Degree);
			writer.write(BeforeChargeElecMeterDegree);
			writer.write(ElecMeterDegree);
			writer.write(ChargeBootMode);
			writer.write(charge_strategy);
			writer.write(charge_strategy_param);
			writer.write(ReserveFlag);
			writer.write(card_no);
			writer.write(ReserveTimeout);
			writer.write(ReserveChargeTime);
			writer.write(CardBalanceBeforeCharge);
			writer.write(SysVar1);
			writer.write(SysVar2);
			writer.write(SysVar3);
			writer.write(SysVar4);
			writer.write(SysVar5);
			writer.write(startcharge_mode);
			return writer.toArray();
		}


    }

    public ReqMsg getReqMsg() {
        return reqMsg;
    }

	@Override
	public String toString() {
		return "RX:充电桩状态信息包上报:ShCmd104 [reqMsg=" + reqMsg.toString() + "]";
	}

}
