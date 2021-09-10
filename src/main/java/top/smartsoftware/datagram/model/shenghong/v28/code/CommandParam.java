package top.smartsoftware.datagram.model.shenghong.v28.code;


import top.smartsoftware.datagram.util.SHUtility;

/**
 * CMD5
 */
public class CommandParam {
	/**预留*/
	public static final int PARAMETER_A = 1;
	/**停止充电*/
	public static final int STOP_CHARGE = 2;
	/**预留*/
	public static final int PARAMETER_B = 3;
	/***充电控制方式*/
	public static final int CHARGE_CONTROL_MODE = 4;
	/**预留*/
	public static final int PARAMETER_C = 5;
	/**预留*/
	public static final int PARAMETER_D = 6;
	/**电阻模式输出电压*/
	public static final int RESISTIVE_MODE_OUT_VOLTAGE = 7;
	/**电阻模式输出电流*/
	public static final int RESISTIVE_MODE_OUT_CURRENT = 8;
	/**充电模式*/
	public static final int CHARGE_MODE = 9; 
	/**取消预约充电*/
	public static final int CANCELLATION_CHARGE = 10;
	/**设备重启*/
	public static final int DEVICE_REBOOT = 11;
	/**进入升级模式*/
	public static final int ENTER_UPGRDE_MODE = 12;
	/**进入正常应用模式*/
	public static final int ENTER_NORMALAPP_MODE = 13;
	/**立即上报一次签到106报文*/
	public static final int REPORT_SIGN_106 = 14;
	/**立即上报一次桩状态信息104报文*/
	public static final int REPORT_PILE_STATUSINFO_104 = 15;
	/**扫描支付成功*/
	public static final int SCAN_PAYMENT_SUCCESSFUL = 16;
	/**限制最大充电功率*/
	public static final int LIMIT_MAX_CHARGE_POWER = 17;
	/**负载类型*/
	public static final int LOAD_TYPE = 18;
	/**绝缘检测*/
	public static final int INSULATION_DETECTION = 19;
	/**模块类型*/
	public static final int MODULE_TYPE = 20;
	/**本地计费*/
	public static final int LOCAL_BILLING = 21;
	/**刷卡密码输入流程*/
	public static final int CREDIT_CARD_PASSWORD_INPUT_PROCESS = 22;
	/**充电暂停服务*/
	public static final int CHARGE_SUSPENSION_SERVICE = 23;
	/**输出电压较准*/
	public static final int OUTPUT_VOLTAGE_ACCURATE = 24;
	/**充电机限功率*/
	public static final int CHARGER_LIMITED_POWER = 25;



	
	
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
		default:
			break;
		}
		return "";
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
		case PARAMETER_A:
			return "预留";
		case STOP_CHARGE:
			return "停止充电";
		case PARAMETER_B:
			return "预留";
		case CHARGE_CONTROL_MODE:
			return "充电控制方式";
		case PARAMETER_C:
			return "预留";
		case PARAMETER_D:
			return "预留";
		case RESISTIVE_MODE_OUT_VOLTAGE:
			return "电阻模式输出电压";
		case RESISTIVE_MODE_OUT_CURRENT:
			return "电阻模式输出电流";
		case CHARGE_MODE:
			return "充电模式";
		case CANCELLATION_CHARGE:
			return "取消预约充电";
		case DEVICE_REBOOT:
			return "设备重启";
		case ENTER_UPGRDE_MODE:
			return "进入升级模式";
		case ENTER_NORMALAPP_MODE:
			return "进入正常应用模式";
		case REPORT_SIGN_106:
			return "立即上报一次签到106报文";
		case REPORT_PILE_STATUSINFO_104:
			return "立即上报一次桩状态信息104报文";
		case SCAN_PAYMENT_SUCCESSFUL:
			return "扫描支付成功";
		case LIMIT_MAX_CHARGE_POWER:
			return "限制最大充电功率";
		case LOAD_TYPE:
			return "负载类型";
		case INSULATION_DETECTION:
			return "绝缘检测";
		case MODULE_TYPE:
			return "模块类型";
		case LOCAL_BILLING:
			return "本地计费";
		case CREDIT_CARD_PASSWORD_INPUT_PROCESS:
			return "刷卡密码输入流程";
		case CHARGE_SUSPENSION_SERVICE:
			return "充电暂停服务";
		case OUTPUT_VOLTAGE_ACCURATE:
			return "输出电压较准";
		case CHARGER_LIMITED_POWER:
			return "充电机限功率";
			
		default:
			break;
		}
		return "";
	}



	public static String getStrFormBytes(int code, byte[] cmd_bytes) {
		switch (code) {
		case PARAMETER_A:
		case STOP_CHARGE:
		case PARAMETER_B:
		case CHARGE_CONTROL_MODE:
		case PARAMETER_C:
		case PARAMETER_D:
		case RESISTIVE_MODE_OUT_VOLTAGE:
		case RESISTIVE_MODE_OUT_CURRENT:
		case CHARGE_MODE:
		case CANCELLATION_CHARGE:
		case DEVICE_REBOOT:
		case ENTER_UPGRDE_MODE:
		case ENTER_NORMALAPP_MODE:
		case REPORT_SIGN_106:
		case REPORT_PILE_STATUSINFO_104:
		case SCAN_PAYMENT_SUCCESSFUL:
		case LIMIT_MAX_CHARGE_POWER:
		case LOAD_TYPE:
		case INSULATION_DETECTION:
		case MODULE_TYPE:
		case LOCAL_BILLING:
		case CREDIT_CARD_PASSWORD_INPUT_PROCESS:
		case CHARGE_SUSPENSION_SERVICE:
		case OUTPUT_VOLTAGE_ACCURATE:
		case CHARGER_LIMITED_POWER:
			return SHUtility.bytesToSN(cmd_bytes);
		default:
			break;
		}
		return "";
	}
	
	
	
}
