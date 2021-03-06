package top.smartsoftware.datagram.model.shenghong.v16;


import top.smartsoftware.datagram.config.SHPacketConst;
import top.smartsoftware.datagram.io.StreamReader;
import top.smartsoftware.datagram.io.StreamWriter;
import top.smartsoftware.datagram.model.AbstractBaseCommand;
import top.smartsoftware.datagram.util.FormatUtility;
import top.smartsoftware.datagram.util.SHUtility;

import java.io.Serializable;


public class ShCmd202 extends AbstractBaseCommand {
	
    private ReqMsg reqMsg;

	public ShCmd202()
	{

	}


	public ShCmd202(int reason , int conut, byte[] raw, short[] times) {
		reqMsg = new ReqMsg();
		reqMsg.setUser_id((short) SHCmdV16Const.paramVar1);
		reqMsg.setCmd_no((short) SHCmdV16Const.paramVar2);
		reqMsg.setPlug_position_Type((byte)1);
		reqMsg.setCar_no(raw);

		reqMsg.setStart_charge_time(raw);
		reqMsg.setEnd_charge_time(raw);
		reqMsg.setCharge_total_time(conut);
		reqMsg.setStart_soc((byte)1);
		reqMsg.setEnd_soc((byte)1);
		reqMsg.setStop_charge_reason(reason);
		reqMsg.setCurr_charge_degree(conut);
		reqMsg.setStart_degree(conut);
		reqMsg.setEnd_degree(conut);
		reqMsg.setCharge_fee(conut);
		reqMsg.setParamValue(conut);
		reqMsg.setBefore_chargefee(conut);
		reqMsg.setAfter_chargefee(conut);
		reqMsg.setService_charge(conut);
		reqMsg.setOffline_pay((byte)1);
		reqMsg.setCharge_strategy((byte)1);
		reqMsg.setCharge_strategy_param(conut);
		reqMsg.setVin(raw);
		reqMsg.setPlate(raw);
		reqMsg.setMulti_charge_degrees(times);

//		reqMsg.setTime_1_power(time);
//		reqMsg.setTime_2_power(time);
//		reqMsg.setTime_3_power(time);
//		reqMsg.setTime_4_power(time);
//		reqMsg.setTime_5_power(time);
//		reqMsg.setTime_6_power(time);
//		reqMsg.setTime_7_power(time);
//		reqMsg.setTime_8_power(time);
//		reqMsg.setTime_9_power(time);
//		reqMsg.setTime_10_power(time);
//		reqMsg.setTime_11_power(time);
//		reqMsg.setTime_12_power(time);
//		reqMsg.setTime_13_power(time);
//		reqMsg.setTime_14_power(time);
//		reqMsg.setTime_15_power(time);
//		reqMsg.setTime_16_power(time);
//		reqMsg.setTime_17_power(time);
//		reqMsg.setTime_18_power(time);
//		reqMsg.setTime_19_power(time);
//		reqMsg.setTime_20_power(time);
//		reqMsg.setTime_21_power(time);
//		reqMsg.setTime_22_power(time);
//		reqMsg.setTime_23_power(time);
//		reqMsg.setTime_24_power(time);
//		reqMsg.setTime_25_power(time);
//		reqMsg.setTime_26_power(time);
//		reqMsg.setTime_27_power(time);
//		reqMsg.setTime_28_power(time);
//		reqMsg.setTime_29_power(time);
//		reqMsg.setTime_30_power(time);
//		reqMsg.setTime_31_power(time);
//		reqMsg.setTime_32_power(time);
//		reqMsg.setTime_33_power(time);
//		reqMsg.setTime_34_power(time);
//		reqMsg.setTime_35_power(time);
//		reqMsg.setTime_36_power(time);
//		reqMsg.setTime_37_power(time);
//		reqMsg.setTime_38_power(time);
//		reqMsg.setTime_39_power(time);
//		reqMsg.setTime_40_power(time);
//		reqMsg.setTime_41_power(time);
//		reqMsg.setTime_42_power(time);
//		reqMsg.setTime_43_power(time);
//		reqMsg.setTime_44_power(time);
//		reqMsg.setTime_45_power(time);
//		reqMsg.setTime_46_power(time);
//		reqMsg.setTime_47_power(time);
//		reqMsg.setTime_48_power(time);

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
	    	 * user_id:TODO(??????ID). 
	    	 */ 
	    	private short user_id;
	    	
	    	/** 
	    	 * cmd_no:TODO(????????????). 
	    	 */ 
	    	private short cmd_no;
	    	
	    	/** 
	    	 * pile_sn(???????????????). 
	    	 */ 
	    	private byte[] pile_sn;
	    	
	    	/** 
	    	 * plug_position_Type:(?????????????????????). 
	    	 */ 
	    	private byte plug_position_Type;
	    	
	    	/** 
	    	 * plug_no(????????????). 
	    	 */ 
	    	private byte plug_no;
	    	
	    	/** 
	    	 * car_no:(????????????). 
	    	 */ 
	    	private  byte[] car_no;
	    	
	    	/** 
	    	 * start_charge_time(??????????????????). 
	    	 */ 
	    	private byte[] start_charge_time;
	    	
	    	/** 
	    	 * end_charge_time(??????????????????). 
	    	 */ 
	    	private byte[] end_charge_time;
	    	
	    	/** 
	    	 * charge_total_time(??????????????????). 
	    	 */ 
	    	private int charge_total_time;
	    	/** 
	    	 * start_soc(?????? SOC). 
	    	 */ 
	    	private byte start_soc;
	    	/** 
	    	 * end_soc(?????? SOC). 
	    	 */ 
	    	private byte end_soc;
	    	/** 
	    	 * stop_charge_reason(??????????????????). 
	    	 */ 
	    	private int stop_charge_reason;
	    	/** 
	    	 * curr_charge_degree(??????????????????). 
	    	 */ 
	    	private int curr_charge_degree;
	    	/** 
	    	 * start_degree(?????????????????????). 
	    	 */ 
	    	private int start_degree;
	    	/** 
	    	 * end_degree(?????????????????????). 
	    	 */ 
	    	private int end_degree;
	    	/** 
	    	 * charge_fee(??????????????????). 
	    	 */ 
	    	private int charge_fee;
	    	
	    	/** 
	    	 * paramValue(??????). 
	    	 */ 
	    	private int paramValue;
	    	
	    	/** 
	    	 * before_chargefee:TODO(??????????????????). 
	    	 */ 
	    	private int before_chargefee;
	    	
	    	/** 
	    	 * after_chargefee:TODO(??????????????????). 
	    	 */ 
	    	private int after_chargefee;
	    	
	    	/** 
	    	 * service_charge(???????????????). 
	    	 */ 
	    	private int service_charge;
	    	
	    	/** 
	    	 * offline_pay(??????????????????). 
	    	 */
	    	private byte offline_pay;
	    	
	    	/** 
	    	 * charge_strategy:(????????????). 
	    	 */ 
	    	private byte charge_strategy;
	    	
	    	/** 
	    	 * charge_strategy_param:(??????????????????). 
	    	 */ 
	    	private int charge_strategy_param;
	    	
	    	/** 
	    	 * vin:TODO(??????VIN???). 
	    	 */ 
	    	private byte[] vin;
	    	
	    	/** 
	    	 * plate:TODO(?????????). 
	    	 */ 
	    	private byte[] plate;


		/**
		 * plate:TODO(????????????).
		 */
		private short[] multi_charge_degrees;

		public short[] getMulti_charge_degrees() {
			return multi_charge_degrees;
		}

		public void setMulti_charge_degrees(short[] multi_charge_degrees) {
			this.multi_charge_degrees = multi_charge_degrees;
		}

		//	    	/**
//	    	 * time_1_power(??????1??????).
//	    	 */
//	    	private short Time_1_power;
//
//	    	/**
//	    	 * time_2_power(??????2??????).
//	    	 */
//	    	private short Time_2_power;
//
//	    	/**
//	    	 * time_3_power(??????3??????).
//	    	 */
//	    	private short Time_3_power;
//
//	    	/**
//	    	 * time_4_power(??????4??????).
//	    	 */
//	    	private short Time_4_power;
//
//	    	/**
//	    	 * time_5_power(??????5??????).
//	    	 */
//	    	private short Time_5_power;
//
//	    	/**
//	    	 * time_6_power(??????6??????).
//	    	 */
//	    	private short Time_6_power;
//
//	    	/**
//	    	 * time_7_power(??????7??????).
//	    	 */
//	    	private short Time_7_power;
//
//	    	/**
//	    	 * time_8_power(??????8??????).
//	    	 */
//	    	private short Time_8_power;
//
//	    	/**
//	    	 * time_9_power(??????9??????).
//	    	 */
//	    	private short Time_9_power;
//
//	    	/**
//	    	 * time_10_power(??????10??????).
//	    	 */
//	    	private short Time_10_power;
//
//	    	/**
//	    	 * time_11_power(??????11??????).
//	    	 */
//	    	private short Time_11_power;
//
//	    	/**
//	    	 * time_12_power(??????12??????).
//	    	 */
//	    	private short Time_12_power;
//
//	    	/**
//	    	 * time_13_power(??????13??????).
//	    	 */
//	    	private short Time_13_power;
//
//	    	/**
//	    	 * time_14_power(??????14??????).
//	    	 */
//	    	private short Time_14_power;
//
//	    	/**
//	    	 * time_15_power(??????1??????).
//	    	 */
//	    	private short Time_15_power;
//
//	    	/**
//	    	 * time_16_power(??????1??????).
//	    	 */
//	    	private short Time_16_power;
//
//	    	/**
//	    	 * time_17_power(??????17??????).
//	    	 */
//	    	private short Time_17_power;
//
//	    	/**
//	    	 * time_18_power(??????1??????).
//	    	 */
//	    	private short Time_18_power;
//
//	    	/**
//	    	 * time_19_power(??????19??????).
//	    	 */
//	    	private short Time_19_power;
//
//	    	/**
//	    	 * time_20_power(??????20??????).
//	    	 */
//	    	private short Time_20_power;
//
//	    	/**
//	    	 * time_21_power(??????21??????).
//	    	 */
//	    	private short Time_21_power;
//
//	    	/**
//	    	 * time_22_power(??????22??????).
//	    	 */
//	    	private short Time_22_power;
//
//	    	/**
//	    	 * time_23_power(??????23??????).
//	    	 */
//	    	private short Time_23_power;
//
//	    	/**
//	    	 * time_24_power(??????24??????).
//	    	 */
//	    	private short Time_24_power;
//
//	    	/**
//	    	 * time_25_power(??????25??????).
//	    	 */
//	    	private short Time_25_power;
//
//	    	/**
//	    	 * time_26_power(??????26??????).
//	    	 */
//	    	private short Time_26_power;
//	    	/**
//	    	 * Time_27_power(??????27??????).
//	    	 */
//	    	private short Time_27_power;
//
//	    	/**
//	    	 * Time_28_power(??????28??????).
//	    	 */
//	    	private short Time_28_power;
//
//	    	/**
//	    	 * Time_29_power(??????29??????).
//	    	 */
//	    	private short Time_29_power;
//
//	    	/**
//	    	 * Time_30_power(??????30??????).
//	    	 */
//	    	private short Time_30_power;
//
//	    	/**
//	    	 * time_31_power(??????31??????).
//	    	 */
//	    	private short Time_31_power;
//
//	    	/**
//	    	 * Time_32_power(??????32??????).
//	    	 */
//	    	private short Time_32_power;
//
//	    	/**
//	    	 * time_33_power(??????33??????).
//	    	 */
//	    	private short time_33_power;
//
//	    	/**
//	    	 * Time_34_power(??????34??????).
//	    	 */
//	    	private short Time_34_power;
//
//	    	/**
//	    	 * Time_35_power(??????35??????).
//	    	 */
//	    	private short Time_35_power;
//
//	    	/**
//	    	 * Time_36_power(??????36??????).
//	    	 */
//	    	private short Time_36_power;
//
//	    	/**
//	    	 * Time_37_power(??????37??????).
//	    	 */
//	    	private short Time_37_power;
//
//	    	/**
//	    	 * Time_38_power(??????38??????).
//	    	 */
//	    	private short Time_38_power;
//
//	    	/**
//	    	 * Time_39_power(??????39??????).
//	    	 */
//	    	private short Time_39_power;
//
//	    	/**
//	    	 * Time_40_power(??????40??????).
//	    	 */
//	    	private short Time_40_power;
//
//	    	/**
//	    	 * Time_41_power(??????41??????).
//	    	 */
//	    	private short Time_41_power;
//
//	    	/**
//	    	 * Time_42_power(??????42??????).
//	    	 */
//	    	private short Time_42_power;
//
//	    	/**
//	    	 * Time_43_power(??????43??????).
//	    	 */
//	    	private short Time_43_power;
//
//	    	/**
//	    	 * Time_44_power(??????44??????).
//	    	 */
//	    	private short Time_44_power;
//
//	    	/**
//	    	 * Time_45_power(??????45??????).
//	    	 */
//	    	private short Time_45_power;
//
//	    	/**
//	    	 * Time_46_power(??????46??????).
//	    	 */
//	    	private short Time_46_power;
//
//	    	/**
//	    	 * Time_47_power(??????47??????).
//	    	 */
//	    	private short Time_47_power;
//
//	    	/**
//	    	 * Time_48_power(??????48??????).
//	    	 */
//	    	private short Time_48_power;
	    	
	    	/** 
	    	 * startcharge_mode:(????????????). 
	    	 */ 
	    	private byte startcharge_mode;
	    	
	    	
		public ReqMsg(byte[] bytes) {
			StreamReader reader = new StreamReader(bytes);
			reader.order(SHPacketConst._byteOrder);
			setUser_id(reader.readShort());
			setCmd_no(reader.readShort());
			setPile_sn(reader.readBytes(32));
			setPlug_position_Type(reader.readByte());
			setPlug_no(reader.readByte());
			setCar_no(reader.readBytes(32));
			setStart_charge_time(reader.readBytes(8));
			setEnd_charge_time(reader.readBytes(8));
			setCharge_total_time(reader.readInt32());
			setStart_soc(reader.readByte());
			setEnd_soc(reader.readByte());
			setStop_charge_reason(reader.readInt32());
			setCurr_charge_degree(reader.readInt32());
			setStart_degree(reader.readInt32());
			setEnd_degree(reader.readInt32());
			setCharge_fee(reader.readInt32());
			setParamValue(reader.readInt32());
			setBefore_chargefee(reader.readInt32());
			setAfter_chargefee(reader.readInt32());
			setService_charge(reader.readInt32());
			setOffline_pay(reader.readByte());
			setCharge_strategy(reader.readByte());
			setCharge_strategy_param(reader.readInt32());
			setVin(reader.readBytes(17));
			setPlate(reader.readBytes(8));
			short[] elecquantities = new short[48];
			for(int i=0; i<elecquantities.length; i++){
				elecquantities[i] = reader.readShort();
			}
			setMulti_charge_degrees(elecquantities);
			
//			setTime_1_power(reader.readShort());
//			setTime_2_power(reader.readShort());
//			setTime_3_power(reader.readShort());
//			setTime_4_power(reader.readShort());
//			setTime_5_power(reader.readShort());
//			setTime_6_power(reader.readShort());
//			setTime_7_power(reader.readShort());
//			setTime_8_power(reader.readShort());
//			setTime_9_power(reader.readShort());
//			setTime_10_power(reader.readShort());
//			setTime_11_power(reader.readShort());
//			setTime_12_power(reader.readShort());
//			setTime_13_power(reader.readShort());
//			setTime_14_power(reader.readShort());
//			setTime_15_power(reader.readShort());
//			setTime_16_power(reader.readShort());
//			setTime_17_power(reader.readShort());
//			setTime_18_power(reader.readShort());
//			setTime_19_power(reader.readShort());
//			setTime_20_power(reader.readShort());
//			setTime_21_power(reader.readShort());
//			setTime_22_power(reader.readShort());
//			setTime_23_power(reader.readShort());
//			setTime_24_power(reader.readShort());
//			setTime_25_power(reader.readShort());
//			setTime_26_power(reader.readShort());
//			setTime_27_power(reader.readShort());
//			setTime_28_power(reader.readShort());
//			setTime_29_power(reader.readShort());
//			setTime_30_power(reader.readShort());
//			setTime_31_power(reader.readShort());
//			setTime_32_power(reader.readShort());
//			setTime_33_power(reader.readShort());
//			setTime_34_power(reader.readShort());
//			setTime_35_power(reader.readShort());
//			setTime_36_power(reader.readShort());
//			setTime_37_power(reader.readShort());
//			setTime_38_power(reader.readShort());
//			setTime_39_power(reader.readShort());
//			setTime_40_power(reader.readShort());
//			setTime_41_power(reader.readShort());
//			setTime_42_power(reader.readShort());
//			setTime_43_power(reader.readShort());
//			setTime_44_power(reader.readShort());
//			setTime_45_power(reader.readShort());
//			setTime_46_power(reader.readShort());
//			setTime_47_power(reader.readShort());
//			setTime_48_power(reader.readShort());
			
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


		public byte[] getPile_sn() {
			return pile_sn;
		}


		public void setPile_sn(byte[] pile_sn) {
			this.pile_sn = pile_sn;
		}


		public byte getPlug_position_Type() {
			return plug_position_Type;
		}


		public void setPlug_position_Type(byte plug_position_Type) {
			this.plug_position_Type = plug_position_Type;
		}


		public byte getPlug_no() {
			return plug_no;
		}


		public void setPlug_no(byte plug_no) {
			this.plug_no = plug_no;
		}


		public byte[] getCar_no() {
			return car_no;
		}


		public void setCar_no(byte[] car_no) {
			this.car_no = car_no;
		}


		public byte[] getStart_charge_time() {
			return start_charge_time;
		}


		public void setStart_charge_time(byte[] start_charge_time) {
			this.start_charge_time = start_charge_time;
		}


		public byte[] getEnd_charge_time() {
			return end_charge_time;
		}


		public void setEnd_charge_time(byte[] end_charge_time) {
			this.end_charge_time = end_charge_time;
		}



		public int getCharge_total_time() {
			return charge_total_time;
		}


		public void setCharge_total_time(int charge_total_time) {
			this.charge_total_time = charge_total_time;
		}


		public byte getStart_soc() {
			return start_soc;
		}


		public void setStart_soc(byte start_soc) {
			this.start_soc = start_soc;
		}


		public byte getEnd_soc() {
			return end_soc;
		}


		public void setEnd_soc(byte end_soc) {
			this.end_soc = end_soc;
		}


		public int getStop_charge_reason() {
			return stop_charge_reason;
		}


		public void setStop_charge_reason(int stop_charge_reason) {
			this.stop_charge_reason = stop_charge_reason;
		}


		public int getCurr_charge_degree() {
			return curr_charge_degree;
		}


		public void setCurr_charge_degree(int curr_charge_degree) {
			this.curr_charge_degree = curr_charge_degree;
		}


		public int getStart_degree() {
			return start_degree;
		}


		public void setStart_degree(int start_degree) {
			this.start_degree = start_degree;
		}


		public int getEnd_degree() {
			return end_degree;
		}


		public void setEnd_degree(int end_degree) {
			this.end_degree = end_degree;
		}


		public int getCharge_fee() {
			return charge_fee;
		}


		public void setCharge_fee(int charge_fee) {
			this.charge_fee = charge_fee;
		}


		public int getParamValue() {
			return paramValue;
		}


		public void setParamValue(int paramValue) {
			this.paramValue = paramValue;
		}


		public int getBefore_chargefee() {
			return before_chargefee;
		}


		public void setBefore_chargefee(int before_chargefee) {
			this.before_chargefee = before_chargefee;
		}


		public int getAfter_chargefee() {
			return after_chargefee;
		}


		public void setAfter_chargefee(int after_chargefee) {
			this.after_chargefee = after_chargefee;
		}


		public int getService_charge() {
			return service_charge;
		}


		public void setService_charge(int service_charge) {
			this.service_charge = service_charge;
		}


		public byte getOffline_pay() {
			return offline_pay;
		}


		public void setOffline_pay(byte offline_pay) {
			this.offline_pay = offline_pay;
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


		public byte[] getVin() {
			return vin;
		}


		public void setVin(byte[] vin) {
			this.vin = vin;
		}


		public byte[] getPlate() {
			return plate;
		}




		public void setPlate(byte[] plate) {
			this.plate = plate;
		}


//		public short getTime_1_power() {
//			return Time_1_power;
//		}
//
//
//		public void setTime_1_power(short time_1_power) {
//			Time_1_power = time_1_power;
//		}
//
//
//		public short getTime_2_power() {
//			return Time_2_power;
//		}
//
//
//		public void setTime_2_power(short time_2_power) {
//			Time_2_power = time_2_power;
//		}
//
//
//		public short getTime_3_power() {
//			return Time_3_power;
//		}
//
//
//		public void setTime_3_power(short time_3_power) {
//			Time_3_power = time_3_power;
//		}
//
//
//		public short getTime_4_power() {
//			return Time_4_power;
//		}
//
//
//		public void setTime_4_power(short time_4_power) {
//			Time_4_power = time_4_power;
//		}
//
//
//		public short getTime_5_power() {
//			return Time_5_power;
//		}
//
//
//		public void setTime_5_power(short time_5_power) {
//			Time_5_power = time_5_power;
//		}
//
//
//		public short getTime_6_power() {
//			return Time_6_power;
//		}
//
//
//		public void setTime_6_power(short time_6_power) {
//			Time_6_power = time_6_power;
//		}
//
//
//		public short getTime_7_power() {
//			return Time_7_power;
//		}
//
//
//		public void setTime_7_power(short time_7_power) {
//			Time_7_power = time_7_power;
//		}
//
//
//		public short getTime_8_power() {
//			return Time_8_power;
//		}
//
//
//		public void setTime_8_power(short time_8_power) {
//			Time_8_power = time_8_power;
//		}
//
//
//		public short getTime_9_power() {
//			return Time_9_power;
//		}
//
//
//		public void setTime_9_power(short time_9_power) {
//			Time_9_power = time_9_power;
//		}
//
//
//		public short getTime_10_power() {
//			return Time_10_power;
//		}
//
//
//		public void setTime_10_power(short time_10_power) {
//			Time_10_power = time_10_power;
//		}
//
//
//		public short getTime_11_power() {
//			return Time_11_power;
//		}
//
//
//		public void setTime_11_power(short time_11_power) {
//			Time_11_power = time_11_power;
//		}
//
//
//		public short getTime_12_power() {
//			return Time_12_power;
//		}
//
//
//		public void setTime_12_power(short time_12_power) {
//			Time_12_power = time_12_power;
//		}
//
//
//		public short getTime_13_power() {
//			return Time_13_power;
//		}
//
//
//		public void setTime_13_power(short time_13_power) {
//			Time_13_power = time_13_power;
//		}
//
//
//		public short getTime_14_power() {
//			return Time_14_power;
//		}
//
//
//		public void setTime_14_power(short time_14_power) {
//			Time_14_power = time_14_power;
//		}
//
//
//		public short getTime_15_power() {
//			return Time_15_power;
//		}
//
//
//		public void setTime_15_power(short time_15_power) {
//			Time_15_power = time_15_power;
//		}
//
//
//		public short getTime_16_power() {
//			return Time_16_power;
//		}
//
//
//		public void setTime_16_power(short time_16_power) {
//			Time_16_power = time_16_power;
//		}
//
//
//		public short getTime_17_power() {
//			return Time_17_power;
//		}
//
//
//		public void setTime_17_power(short time_17_power) {
//			Time_17_power = time_17_power;
//		}
//
//
//		public short getTime_18_power() {
//			return Time_18_power;
//		}
//
//
//		public void setTime_18_power(short time_18_power) {
//			Time_18_power = time_18_power;
//		}
//
//
//		public short getTime_19_power() {
//			return Time_19_power;
//		}
//
//
//		public void setTime_19_power(short time_19_power) {
//			Time_19_power = time_19_power;
//		}
//
//
//		public short getTime_20_power() {
//			return Time_20_power;
//		}
//
//
//		public void setTime_20_power(short time_20_power) {
//			Time_20_power = time_20_power;
//		}
//
//
//		public short getTime_21_power() {
//			return Time_21_power;
//		}
//
//
//		public void setTime_21_power(short time_21_power) {
//			Time_21_power = time_21_power;
//		}
//
//
//		public short getTime_22_power() {
//			return Time_22_power;
//		}
//
//
//		public void setTime_22_power(short time_22_power) {
//			Time_22_power = time_22_power;
//		}
//
//
//		public short getTime_23_power() {
//			return Time_23_power;
//		}
//
//
//		public void setTime_23_power(short time_23_power) {
//			Time_23_power = time_23_power;
//		}
//
//
//		public short getTime_24_power() {
//			return Time_24_power;
//		}
//
//
//		public void setTime_24_power(short time_24_power) {
//			Time_24_power = time_24_power;
//		}
//
//
//		public short getTime_25_power() {
//			return Time_25_power;
//		}
//
//
//		public void setTime_25_power(short time_25_power) {
//			Time_25_power = time_25_power;
//		}
//
//
//		public short getTime_26_power() {
//			return Time_26_power;
//		}
//
//
//		public void setTime_26_power(short time_26_power) {
//			Time_26_power = time_26_power;
//		}
//
//
//		public short getTime_27_power() {
//			return Time_27_power;
//		}
//
//
//		public void setTime_27_power(short time_27_power) {
//			Time_27_power = time_27_power;
//		}
//
//
//		public short getTime_28_power() {
//			return Time_28_power;
//		}
//
//
//		public void setTime_28_power(short time_28_power) {
//			Time_28_power = time_28_power;
//		}
//
//
//		public short getTime_29_power() {
//			return Time_29_power;
//		}
//
//
//		public void setTime_29_power(short time_29_power) {
//			Time_29_power = time_29_power;
//		}
//
//
//		public short getTime_30_power() {
//			return Time_30_power;
//		}
//
//
//		public void setTime_30_power(short time_30_power) {
//			Time_30_power = time_30_power;
//		}
//
//
//		public short getTime_31_power() {
//			return Time_31_power;
//		}
//
//
//		public void setTime_31_power(short time_31_power) {
//			Time_31_power = time_31_power;
//		}
//
//
//		public short getTime_32_power() {
//			return Time_32_power;
//		}
//
//
//		public void setTime_32_power(short time_32_power) {
//			Time_32_power = time_32_power;
//		}
//
//
//		public short getTime_33_power() {
//			return time_33_power;
//		}
//
//
//		public void setTime_33_power(short time_33_power) {
//			this.time_33_power = time_33_power;
//		}
//
//
//		public short getTime_34_power() {
//			return Time_34_power;
//		}
//
//
//		public void setTime_34_power(short time_34_power) {
//			Time_34_power = time_34_power;
//		}
//
//
//		public short getTime_35_power() {
//			return Time_35_power;
//		}
//
//
//		public void setTime_35_power(short time_35_power) {
//			Time_35_power = time_35_power;
//		}
//
//
//		public short getTime_36_power() {
//			return Time_36_power;
//		}
//
//
//		public void setTime_36_power(short time_36_power) {
//			Time_36_power = time_36_power;
//		}
//
//
//		public short getTime_37_power() {
//			return Time_37_power;
//		}
//
//
//		public void setTime_37_power(short time_37_power) {
//			Time_37_power = time_37_power;
//		}
//
//
//		public short getTime_38_power() {
//			return Time_38_power;
//		}
//
//
//		public void setTime_38_power(short time_38_power) {
//			Time_38_power = time_38_power;
//		}
//
//
//		public short getTime_39_power() {
//			return Time_39_power;
//		}
//
//
//		public void setTime_39_power(short time_39_power) {
//			Time_39_power = time_39_power;
//		}
//
//
//		public short getTime_40_power() {
//			return Time_40_power;
//		}
//
//
//		public void setTime_40_power(short time_40_power) {
//			Time_40_power = time_40_power;
//		}
//
//
//		public short getTime_41_power() {
//			return Time_41_power;
//		}
//
//
//		public void setTime_41_power(short time_41_power) {
//			Time_41_power = time_41_power;
//		}
//
//
//		public short getTime_42_power() {
//			return Time_42_power;
//		}
//
//
//		public void setTime_42_power(short time_42_power) {
//			Time_42_power = time_42_power;
//		}
//
//
//		public short getTime_43_power() {
//			return Time_43_power;
//		}
//
//
//		public void setTime_43_power(short time_43_power) {
//			Time_43_power = time_43_power;
//		}
//
//
//		public short getTime_44_power() {
//			return Time_44_power;
//		}
//
//
//		public void setTime_44_power(short time_44_power) {
//			Time_44_power = time_44_power;
//		}
//
//
//		public short getTime_45_power() {
//			return Time_45_power;
//		}
//
//
//		public void setTime_45_power(short time_45_power) {
//			Time_45_power = time_45_power;
//		}
//
//
//		public short getTime_46_power() {
//			return Time_46_power;
//		}
//
//
//		public void setTime_46_power(short time_46_power) {
//			Time_46_power = time_46_power;
//		}
//
//
//		public short getTime_47_power() {
//			return Time_47_power;
//		}
//
//
//		public void setTime_47_power(short time_47_power) {
//			Time_47_power = time_47_power;
//		}
//
//
//		public short getTime_48_power() {
//			return Time_48_power;
//		}
//
//
//		public void setTime_48_power(short time_48_power) {
//			Time_48_power = time_48_power;
//		}


		public byte getStartcharge_mode() {
			return startcharge_mode;
		}


		public void setStartcharge_mode(byte startcharge_mode) {
			this.startcharge_mode = startcharge_mode;
		}


		@Override
		public String toString() {
			return "ReqMsg [?????? ID=" + user_id + ", ????????????=" + cmd_no + ", ???????????????=" + SHUtility.bytesToSN(pile_sn)
					+ ", ?????????????????????=" + plug_position_Type + ", ????????????=" + plug_no + ", ????????????="
					+ SHUtility.bytesToSN(car_no)  + ", ??????????????????=" + FormatUtility.yyyyMMddHHmmss(SHUtility.toDate(start_charge_time))
					+ ", ??????????????????=" +FormatUtility.yyyyMMddHHmmss(SHUtility.toDate(end_charge_time))  + ", ??????????????????="
					+ charge_total_time + ", ?????? SOC=" + start_soc + ", ?????? SOC=" + end_soc + ", ??????????????????="
					+ stop_charge_reason + ", ??????????????????=" + curr_charge_degree + ", ?????????????????????="
					+ start_degree + ", ?????????????????????=" + end_degree + ", ??????????????????=" + charge_fee + ", ??????="
					+ paramValue + ", ??????????????????=" + before_chargefee + ", ??????????????????=" + after_chargefee
					+ ", ???????????????=" + service_charge + ", ??????????????????=" + offline_pay + ", ????????????="
					+ charge_strategy + ", ??????????????????=" + charge_strategy_param + ", ?????? VIN="
					+ SHUtility.bytesToSN(vin)+ ", ?????????=" + SHUtility.bytesToCNString(plate)
					//", ?????? 1 ??????=" + Time_1_power
//					+ ", ?????? 2 ??????=" + Time_2_power + ", ?????? 3 ??????=" + Time_3_power + ", ?????? 4 ??????="
//					+ Time_4_power + ", ?????? 5 ??????=" + Time_5_power + ", ?????? 6 ??????=" + Time_6_power
//					+ ", ?????? 7 ??????=" + Time_7_power + ", ?????? 8 ??????=" + Time_8_power + ", ?????? 9 ??????="
//					+ Time_9_power + ", ?????? 2 ??????=" + Time_10_power + ", ?????? 11 ??????=" + Time_11_power
//					+ ", ?????? 12 ??????=" + Time_12_power + ", ?????? 13 ??????=" + Time_13_power + ", ?????? 14 ??????="
//					+ Time_14_power + ", ?????? 15 ??????=" + Time_15_power + ", ?????? 16 ??????=" + Time_16_power
//					+ ", ?????? 17 ??????=" + Time_17_power + ", ?????? 18 ??????=" + Time_18_power + ", ?????? 19 ??????="
//					+ Time_19_power + ", ?????? 20 ??????=" + Time_20_power + ", ?????? 21 ??????=" + Time_21_power
//					+ ", ?????? 22 ??????=" + Time_22_power + ", ?????? 23 ??????=" + Time_23_power + ", ?????? 24 ??????="
//					+ Time_24_power + ", ?????? 25 ??????=" + Time_25_power + ", ?????? 26 ??????=" + Time_26_power
//					+ ", ?????? 27 ??????=" + Time_27_power + ", ?????? 28 ??????=" + Time_28_power + ", ?????? 29 ??????="
//					+ Time_29_power + ", ?????? 30 ??????=" + Time_30_power + ", ?????? 31 ??????=" + Time_31_power
//					+ ", ?????? 32 ??????=" + Time_32_power + ", ?????? 33 ??????=" + time_33_power + ", ?????? 34 ??????="
//					+ Time_34_power + ", ?????? 35 ??????=" + Time_35_power + ", ?????? 36 ??????=" + Time_36_power
//					+ ", ?????? 37 ??????=" + Time_37_power + ", ?????? 38 ??????=" + Time_38_power + ", ?????? 39 ??????="
//					+ Time_39_power + ", ?????? 40 ??????=" + Time_40_power + ", ?????? 41 ??????=" + Time_41_power
//					+ ", ?????? 42 ??????=" + Time_42_power + ", ?????? 43 ??????=" + Time_43_power + ", ?????? 44 ??????="
//					+ Time_44_power + ", ?????? 45 ??????=" + Time_45_power + ", ?????? 46 ??????=" + Time_46_power
//					+ ", ?????? 47 ??????=" + Time_47_power + ", ?????? 48 ??????=" + Time_48_power + ", ????????????="
					+ "????????????=" + startcharge_mode + "]";
		}

		public byte[] getBytes() {
			StreamWriter writer = new StreamWriter();
			writer.order(SHPacketConst._byteOrder);
			writer.writeUInt16(user_id);
			writer.writeUInt16(cmd_no);
			writer.write(plug_position_Type);
			writer.write(car_no);
			writer.write(start_charge_time);
			writer.write(charge_total_time);
			writer.write(start_soc);
			writer.write(end_soc);
			writer.write(stop_charge_reason);
			writer.write(curr_charge_degree);
			writer.write(start_degree);
			writer.write(end_degree);
			writer.write(charge_fee);
			writer.write(paramValue);
			writer.write(before_chargefee);
			writer.write(after_chargefee);
			writer.write(service_charge);
			writer.write(offline_pay);
			writer.write(charge_strategy);
			writer.write(charge_strategy_param);
			writer.write(vin);
			writer.write(plate);
			for (short multi_charge_degree : multi_charge_degrees)
			{
				writer.write(multi_charge_degree);
			}


//			writer.write(Time_1_power);
//			writer.write(Time_2_power);
//			writer.write(Time_3_power);
//			writer.write(Time_4_power);
//			writer.write(Time_5_power);
//			writer.write(Time_6_power);
//			writer.write(Time_7_power);
//			writer.write(Time_8_power);
//			writer.write(Time_9_power);
//			writer.write(Time_10_power);
//			writer.write(Time_11_power);
//			writer.write(Time_12_power);
//			writer.write(Time_13_power);
//			writer.write(Time_14_power);
//			writer.write(Time_15_power);
//			writer.write(Time_16_power);
//			writer.write(Time_17_power);
//			writer.write(Time_18_power);
//			writer.write(Time_19_power);
//			writer.write(Time_20_power);
//			writer.write(Time_21_power);
//			writer.write(Time_22_power);
//			writer.write(Time_23_power);
//			writer.write(Time_24_power);
//			writer.write(Time_25_power);
//			writer.write(Time_26_power);
//			writer.write(Time_27_power);
//			writer.write(Time_28_power);
//			writer.write(Time_29_power);
//			writer.write(Time_30_power);
//			writer.write(Time_31_power);
//			writer.write(Time_32_power);
//			writer.write(time_33_power);
//			writer.write(Time_34_power);
//			writer.write(Time_35_power);
//			writer.write(Time_36_power);
//			writer.write(Time_37_power);
//			writer.write(Time_38_power);
//			writer.write(Time_39_power);
//			writer.write(Time_40_power);
//			writer.write(Time_41_power);
//			writer.write(Time_42_power);
//			writer.write(Time_43_power);
//			writer.write(Time_44_power);
//			writer.write(Time_45_power);
//			writer.write(Time_46_power);
//			writer.write(Time_47_power);
//			writer.write(Time_48_power);
			return writer.toArray();
		}

    }

    public ReqMsg getReqMsg() {
        return reqMsg;
    }

	@Override
	public String toString() {
		return "RX:???????????????????????????????????????:ShCmd202 [reqMsg=" + reqMsg.toString() + "]";
	}

}
