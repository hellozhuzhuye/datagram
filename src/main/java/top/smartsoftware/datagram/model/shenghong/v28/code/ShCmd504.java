package top.smartsoftware.datagram.model.shenghong.v28.code;


import top.smartsoftware.datagram.config.SHPacketConst;
import top.smartsoftware.datagram.io.StreamReader;
import top.smartsoftware.datagram.model.AbstractBaseCommand;
import top.smartsoftware.datagram.model.SHCmdV28Const;
import top.smartsoftware.datagram.util.ByteUtility;
import top.smartsoftware.datagram.util.FormatUtility;
import top.smartsoftware.datagram.util.SHUtility;

import java.io.Serializable;


/**
 * @author: xiaojian
 * @date: 16-7-5
 * @time: 下午5:19
 * @version: V1.0
 */
public class ShCmd504 extends AbstractBaseCommand {
	
    private ReqMsg reqMsg;

	public short getCid() {
		return SHCmdV28Const.PILE_CHAR_PARAM_TO_PILE;
	}

	public void bodyFromBytes(byte[] bytes) throws Exception {
        reqMsg = new ReqMsg(bytes);
	}

	public byte[] bodyToBytes() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

    public class ReqMsg implements Serializable {
		/**
		 * paramValueFirst(预留).
		 */
		private short paramValueFirst;

		/**
		 * paramValueSecond(预留).
		 */
		private short paramValueSecond;
	    	
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
	    	 * currentMaxAlertCode:(当前最高告警编码)
	    	 */ 
	    	private int currentMaxAlertCode;
	    	
	    	/** 
	    	 * carConnect_State:(车连接状态)
	    	 * 
	    	 */ 
	    	private byte carConnect_State;

		/**
		 * cumulativeChargeAmount:(本次充电累计充电电费)
		 *
		 */
		private int cumulativeChargeAmount;
	    	
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
		 * remainChargeTime:(剩余充电时间).
		 */
		private short remainChargeTime;
	    	
	    	/** 
	    	 * TotalTime:(充电时长(秒)). 
	    	 */ 
	    	private int Total_Time;
	    	
	    	/** 
	    	 * TotalDegree:(本次充电累计充电电量 (0.01kwh)).
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
		 * parameterVar:(预留).
		 */
		private int parameterVar;

		/**
		 * chargePower:(充电功率).
		 */
		private  int chargePower;

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
		 * outletTemperature:(出风口温度)
		 */
		private byte outletTemperature;

		/**
		 * ambientTemperature:(环境温度)
		 */
		private byte ambientTemperature;

		/**
		 * plugTemperature:(充电枪温度)
		 */
		private byte plugTemperature;

		/**
		 * carVINCode:(车辆VIN码)
		 */
		private byte[] carVINCode;

		/**
		 * doorState:(舱门状态)
		 */
		private  byte doorState;

		/**
		 * order_no:(订单号).
		 */
		private byte[] order_no;
	    	
		public ReqMsg(byte[] bytes) {
			StreamReader reader = new StreamReader(bytes);
			reader.order(SHPacketConst._byteOrder);
			setParamValueFirst(reader.readShort());
			setParamValueSecond(reader.readShort());
			setPile_sn(reader.readBytes(32));
			setPlug_cnt(reader.readByte());
			setPlug_no(reader.readByte());
			setPlug_Type(reader.readByte());
			setPlug_workstate(reader.readByte());
			setCurrent_SOC(reader.readByte());
			setCurrentMaxAlertCode(reader.readInt32());
			setCarConnect_State(reader.readByte());
			setCumulativeChargeAmount(reader.readInt32());
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
			setRemainChargeTime(reader.readShort());
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
			setReserveChargeTime(reader.readBytes(8));
			setCardBalanceBeforeCharge(reader.readInt32());
			setParameterVar(reader.readInt32());
			setChargePower(reader.readInt32());
			setSysVar3(reader.readInt32());
			setSysVar4(reader.readInt32());
			setSysVar5(reader.readInt32());
			setOutletTemperature(reader.readByte());
			setAmbientTemperature(reader.readByte());
			setPlugTemperature(reader.readByte());
			setCarVINCode(reader.readBytes(18));
			setDoorState(reader.readByte());
			setOrder_no(reader.readBytes(32));
		}

		public byte[] getOrder_no() {
			return order_no;
		}

		public void setOrder_no(byte[] order_no) {
			this.order_no = order_no;
		}

		public short getParamValueFirst() {
			return paramValueFirst;
		}

		public void setParamValueFirst(short paramValueFirst) {
			this.paramValueFirst = paramValueFirst;
		}

		public short getParamValueSecond() {
			return paramValueSecond;
		}

		public void setParamValueSecond(short paramValueSecond) {
			this.paramValueSecond = paramValueSecond;
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

		public byte getPlug_no() {
			return plug_no;
		}

		public void setPlug_no(byte plug_no) {
			this.plug_no = plug_no;
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

		public int getCurrentMaxAlertCode() {
			return currentMaxAlertCode;
		}

		public void setCurrentMaxAlertCode(int currentMaxAlertCode) {
			this.currentMaxAlertCode = currentMaxAlertCode;
		}

		public byte getCarConnect_State() {
			return carConnect_State;
		}

		public void setCarConnect_State(byte carConnect_State) {
			this.carConnect_State = carConnect_State;
		}

		public int getCumulativeChargeAmount() {
			return cumulativeChargeAmount;
		}

		public void setCumulativeChargeAmount(int cumulativeChargeAmount) {
			this.cumulativeChargeAmount = cumulativeChargeAmount;
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

		public void setBMS_NeedVolt(short BMS_NeedVolt) {
			this.BMS_NeedVolt = BMS_NeedVolt;
		}

		public short getBMS_NeedCurrent() {
			return BMS_NeedCurrent;
		}

		public void setBMS_NeedCurrent(short BMS_NeedCurrent) {
			this.BMS_NeedCurrent = BMS_NeedCurrent;
		}

		public byte getBMS_ChargeMode() {
			return BMS_ChargeMode;
		}

		public void setBMS_ChargeMode(byte BMS_ChargeMode) {
			this.BMS_ChargeMode = BMS_ChargeMode;
		}

		public short getAC_A_Volt() {
			return AC_A_Volt;
		}

		public void setAC_A_Volt(short AC_A_Volt) {
			this.AC_A_Volt = AC_A_Volt;
		}

		public short getAC_B_Volt() {
			return AC_B_Volt;
		}

		public void setAC_B_Volt(short AC_B_Volt) {
			this.AC_B_Volt = AC_B_Volt;
		}

		public short getAC_C_Volt() {
			return AC_C_Volt;
		}

		public void setAC_C_Volt(short AC_C_Volt) {
			this.AC_C_Volt = AC_C_Volt;
		}

		public short getAC_A_Current() {
			return AC_A_Current;
		}

		public void setAC_A_Current(short AC_A_Current) {
			this.AC_A_Current = AC_A_Current;
		}

		public short getAC_B_Current() {
			return AC_B_Current;
		}

		public void setAC_B_Current(short AC_B_Current) {
			this.AC_B_Current = AC_B_Current;
		}

		public short getAC_C_Current() {
			return AC_C_Current;
		}

		public void setAC_C_Current(short AC_C_Current) {
			this.AC_C_Current = AC_C_Current;
		}

		public short getRemainChargeTime() {
			return remainChargeTime;
		}

		public void setRemainChargeTime(short remainChargeTime) {
			this.remainChargeTime = remainChargeTime;
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

		public int getParameterVar() {
			return parameterVar;
		}

		public void setParameterVar(int parameterVar) {
			this.parameterVar = parameterVar;
		}

		public int getChargePower() {
			return chargePower;
		}

		public void setChargePower(int chargePower) {
			this.chargePower = chargePower;
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

		public byte getOutletTemperature() {
			return outletTemperature;
		}

		public void setOutletTemperature(byte outletTemperature) {
			this.outletTemperature = outletTemperature;
		}

		public byte getAmbientTemperature() {
			return ambientTemperature;
		}

		public void setAmbientTemperature(byte ambientTemperature) {
			this.ambientTemperature = ambientTemperature;
		}

		public byte getPlugTemperature() {
			return plugTemperature;
		}

		public void setPlugTemperature(byte plugTemperature) {
			this.plugTemperature = plugTemperature;
		}

		public byte[] getCarVINCode() {
			return carVINCode;
		}

		public void setCarVINCode(byte[] carVINCode) {
			this.carVINCode = carVINCode;
		}

		public byte getDoorState() {
			return doorState;
		}

		public void setDoorState(byte doorState) {
			this.doorState = doorState;
		}

		@Override
		public String toString() {
			return "ReqMsg{" +
					"用户 ID=" + paramValueFirst +
					", 指令序号=" + paramValueSecond +
					", 充电枪数量=" + plug_cnt +
					", 充电桩编码=" + SHUtility.bytesToSN(pile_sn) +
					", 充电口号=" + plug_no +
					", 充电枪类型=" + ControlCmdAddr.getPileType(plug_Type) +
					", 工作状态=" + ControlCmdAddr.getPileWorkStatus(plug_workstate) +
					", 车连接状态=" + ControlCmdAddr.getPileCarConnectStatus(carConnect_State) +
					", 枪状态=" + SysVar5 +
					", 充电/预约卡号=" + SHUtility.bytesToSN(card_no) +
					", 车辆VIN=" +  ByteUtility.fromASCII(carVINCode) +
					", BMS 需求电压=" + BMS_NeedVolt +
					", BMS 需求电流=" + BMS_NeedCurrent +
					", 直流充电电压=" + dcCharge_Voltage +
					", 直流充电电流=" + dcCharge_Current +
					", 充电功率=" + chargePower +
					", 此次充电电量(0.01k w h=" + Total_Degree +
					", 本次充电累计费用=" + cumulativeChargeAmount +
					", 预约开始充电开始时间=" + FormatUtility.yyyyMMddHHmmss(SHUtility.toDate(ReserveChargeTime)) +
					", 充电时长(秒)=" + Total_Time +
					", 剩余充电时长(秒)=" + remainChargeTime +
					", 当前SOC=" + current_SOC +
					", 充电前电表读数=" + BeforeChargeElecMeterDegree +
					", 当前电表读数=" + ElecMeterDegree +
					", 充电启动方式=" + ControlCmdAddr.getPileChargeMode(ChargeBootMode) +
					", 充电策略=" + ChargeStrategy.getChargeStrategy(charge_strategy) +
					", 充电策略参数=" + charge_strategy_param +
					", 告警状态=" + AlarmCode.getCharCause(currentMaxAlertCode) +
					", 内部变量 2=" + internalVar2 +
					", 内部变量 3=" + internalVar3 +
					", BMS 充电模式=" + BMS_ChargeMode +
					", 交流 A 相充电电压=" + AC_A_Volt +
					", 交流 B 相充电电压=" + AC_B_Volt +
					", 交流 C 相充电电压=" + AC_C_Volt +
					", 交流 A 相充电电流=" + AC_A_Current +
					", 交流 B 相充电电流=" + AC_B_Current +
					", 交流 C 相充电电流=" + AC_C_Current +
					", 预约标志=" + ReserveFlag +
					", 预约超时时间=" + ReserveTimeout +
					", 充电前卡余额=" + CardBalanceBeforeCharge +
					", parameterVar=" + parameterVar +
					", SysVar3=" + SysVar3 +
					", SysVar4=" + SysVar4 +
					", SysVar5(插枪状态)=" + SysVar5 +
					", 出风口温度=" + outletTemperature +
					", 环境温度=" + ambientTemperature +
					", 充电枪温度=" + plugTemperature +
					", 舱门状态=" + doorState +
					", 订单号=" + SHUtility.bytesToSN(order_no) +
					'}';
		}
	}

    public ReqMsg getReqMsg() {
        return reqMsg;
    }

	@Override
	public String toString() {
//		if (reqMsg.plug_no==1)
//		{
//			return "RX:充电桩状态信息包上报:ShCmd104 [reqMsg=" + reqMsg.toString() + "]";
//
//		}
//		return "";

		return "RX:充电桩状态信息包上报:ShCmd504 [reqMsg=" + reqMsg.toString() + "]";

	}

}
