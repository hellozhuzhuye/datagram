package top.smartsoftware.datagram.model.shenghong.v16;


import top.smartsoftware.datagram.util.SHUtility;


public class ControlCmdAddr {
	/**开始充电*/
	public static final int START_CHARGE = 1;
	/**停止充电*/
	public static final int STOP_CHARGE = 2;
	/**充电启动方式*/
	public static final int START_CHARGE_MODE = 3;
	/***充电控制方式*/
	public static final int CHARGE_CONTROL_MODE = 4;
	/**充电策略*/
	public static final int CHARGE_STRATEGY = 5;
	/**充电策略参数*/
	public static final int CHARGE_STRATEGY_PARAM = 6;
	/**充电电压*/
	public static final int CHARGE_VOLTAGE = 7; 
	/**充电电流*/
	public static final int CHARGE_CURRENT = 8;
	/**充电模式*/
	public static final int CHARGE_MODE = 9; 
	/**取消预约充电*/
	public static final int CANCELLATION_CHARGE = 10;
	/**设备重启*/
	public static final int DEVICE_REBOOT = 11;
	/**进入IAP模式*/
	public static final int ENTER_IAP_MODE = 12;
	/**进入正常应用模式*/
	public static final int ENTER_NORMALAPP_MODE = 13;
	/**立即上报一次签到106报文*/
	public static final int REPORT_SIGN_106 = 14;
	/**立即上报一次桩状态信息104报文*/
	public static final int REPORT_PILE_STATUSINFO_104 = 15;
	
	
	
	//桩类型
	public static final int DC= 1;
	public static final int AC = 2;

	public static String getPileType(int code){
		switch (code) {
		case DC:
			return "直流";
		case AC:
			return "交流";
		default:
			break;
		}
		return "";
	}
	
	
	//参数模式
	public static final int PARAM_QUERY= 0;
	public static final int PARAM_SET = 1;

	public static String getParamSendType(int code){
		switch (code) {
		case PARAM_QUERY:
			return "查询";
		case PARAM_SET:
			return "设置";
		default:
			break;
		}
		return "";
	}
	
	
	
	//工作状态
	public static final int PILE_FREE= 0;
	public static final int PILE_READY_CHARGE= 1;
	public static final int PILE_IN_CHARGE= 2;
	public static final int PILE_OVER_CHARGE= 3;
	public static final int PILE_FAIL_CHARGE= 4;
	public static final int PILE_PLUG_CON_CAR= 5;
	public static final int PILE_PLUG_FALUT= 6;
	
	public static String getPileWorkStatus(int code){
		switch (code) {
		case PILE_FREE:
			return "空闲中"+code;
		case PILE_READY_CHARGE:
			return "正准备开始充电"+code;
		case PILE_IN_CHARGE:
			return "充电进行中"+code;
		case PILE_OVER_CHARGE:
			return "充电结束"+code;
		case PILE_FAIL_CHARGE:
			return "启动失败"+code;
		case PILE_PLUG_CON_CAR:
			return "已插枪"+code;
		case PILE_PLUG_FALUT:
			return "故障"+code;
		default:
			break;
		}
		return ""+code;
	}
	
	
	
	
	//车连接状态
	public static final int CAR_BREAK= 0;
	public static final int CAR_CONNECT_PART= 1;
	public static final int CAR_CONNECT_ALL= 2;
	
	public static String getPileCarConnectStatus(int code){
		switch (code) {
		case CAR_BREAK:
			return "断开";
		case CAR_CONNECT_PART:
			return "半连接";
		case CAR_CONNECT_ALL:
			return "连接";
		default:
			break;
		}
		return "";
	}
	
	
	
	//充电启动方式
	public static final int CHARGE_CARD_MODE= 0;
	public static final int CHARGE_SYS_MODE= 1;
	public static final int CHARGE_ADMIN_MODE= 2;
	
	public static String getPileChargeMode(int code){
		switch (code) {
		case CHARGE_CARD_MODE:
			return "本地刷卡启动";
		case CHARGE_SYS_MODE:
			return "后台启动";
		case CHARGE_ADMIN_MODE:
			return "本地管理员启动";
		default:
			break;
		}
		return "";
	}
	
	
	
	public static String getCharCause(int code){
		switch (code) {
		case START_CHARGE:
			return "开始充电";
		case STOP_CHARGE:
			return "停止充电";
		case START_CHARGE_MODE:
			return "充电启动方式";
		case CHARGE_CONTROL_MODE:
			return "充电控制方式";
		case CHARGE_STRATEGY:
			return "充电策略";
		case CHARGE_STRATEGY_PARAM:
			return "充电策略参数";
		case CHARGE_VOLTAGE:
			return "充电电压";
		case CHARGE_CURRENT:
			return "充电电流";
		case CHARGE_MODE:
			return "充电模式";
		case CANCELLATION_CHARGE:
			return "取消预约充电";
		case DEVICE_REBOOT:
			return "设备重启";
		case ENTER_IAP_MODE:
			return "进入IAP模式";
		case ENTER_NORMALAPP_MODE:
			return "进入正常应用模式";
		case REPORT_SIGN_106:
			return "立即上报一次签到106报文";
		case REPORT_PILE_STATUSINFO_104:
			return "立即上报一次桩状态信息104报文";
			
		default:
			break;
		}
		return "";
	}



	public static String getStrFormBytes(int code, byte[] cmd_bytes) {
		switch (code) {
		case START_CHARGE:
		case STOP_CHARGE:
		case START_CHARGE_MODE:
		case CHARGE_CONTROL_MODE:
		case CHARGE_STRATEGY:
		case CHARGE_STRATEGY_PARAM:
		case CHARGE_VOLTAGE:
		case CHARGE_CURRENT:
		case CHARGE_MODE:
		case CANCELLATION_CHARGE:
		case DEVICE_REBOOT:
		case ENTER_IAP_MODE:
		case ENTER_NORMALAPP_MODE:
		case REPORT_SIGN_106:
		case REPORT_PILE_STATUSINFO_104:
			return SHUtility.bytesToSN(cmd_bytes);
		default:
			break;
		}
		return "";
	}
	
	
	
}
