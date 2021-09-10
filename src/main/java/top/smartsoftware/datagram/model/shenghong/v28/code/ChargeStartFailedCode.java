package top.smartsoftware.datagram.model.shenghong.v28.code;


import top.smartsoftware.datagram.util.SHUtility;

/**
 *  充电启动失败编码定义
 */
public class ChargeStartFailedCode {

	/**1-15直流充电机*/

	/**CC1未连接*/
	public static final int CC1_NOTCONNECT = 1;
	/**绝缘检测超时*/
	public static final int INSULATIONDETECTIONTIMEOUT = 2;
	/**绝缘检测异常*/
	public static final int INSULATIONDETECTIONEXCEPTION = 3;
	/**充电机暂停服务*/
	public static final int CHARGESERVICESUSPENSION = 4;
	/**充电机系统故障不能充电*/
	public static final int CHARGESYSTEMFAILURECANNOTCHARGE = 5;
	/**辅电不匹配*/
	public static final int AUXILIARYPOWERMISMATCH = 6;
	/**辅电开启失败*/
	public static final int AUXILIARYPOWERFAILEDSTART = 7;
	/**充电启动超时*/
	public static final int CHARGESTARTTIMEOUT = 9;
	/**BMS通信握手失败*/
	public static final int BMSCOMMUNICATIONHANDSHAKEFAILED = 10;
	/**BMS通信握配置败*/
	public static final int BMSCOMMUNICATIONCONFIGFAILED = 11;
	/**BMS参数异常*/
	public static final int BMSPARAMETEREXCEPTION = 12;
	/**桩正在充电中不能在启动*/
	public static final int DC_PILECANNOTSTARTINCHARGE = 13;
	/**本地模式不能启动充电*/
	public static final int DC_LOCALMODECANNOTSTARTCHARGE = 14;
	/**启动未知错误*/
	public static final int STARTUNKNOWNERROR = 15;



	/**100001-100005 交流充电机*/

	/**充电机系统故障*/
	public static final int  CHARGESYSTEMFAILURE = 100001;
	/**车辆准备就绪超时*/
	public static final int  CARREADYTIMEOUT = 100002;
	/**桩正在充电中不能在启动*/
	public static final int  AC_PILECANNOTSTARTINCHARGE = 100003;
	/**本地模式不能启动充电*/
	public static final int  AC_LOCALMODECANNOTSTARTCHARGE = 100004;
	/**枪口号不对*/
	public static final int  PLUGNUMBERWRONG = 100005;




	
	public static String getCharCause(int code){
		switch (code) {
			case CC1_NOTCONNECT:
				return "CC1未连接";
			case INSULATIONDETECTIONTIMEOUT:
				return "绝缘检测超时";
			case INSULATIONDETECTIONEXCEPTION:
				return "绝缘检测异常";
			case CHARGESERVICESUSPENSION:
				return "充电机暂停服务";
			case CHARGESYSTEMFAILURECANNOTCHARGE:
				return "充电机系统故障不能充电";
			case AUXILIARYPOWERMISMATCH:
				return "辅电不匹配";
			case AUXILIARYPOWERFAILEDSTART:
				return "辅电开启失败";
			case CHARGESTARTTIMEOUT:
				return "充电启动超时";
			case BMSCOMMUNICATIONHANDSHAKEFAILED:
				return "BMS通信握手失败";
			case BMSCOMMUNICATIONCONFIGFAILED:
				return "BMS通信握配置败";
			case BMSPARAMETEREXCEPTION:
				return "BMS参数异常";
			case DC_PILECANNOTSTARTINCHARGE:
				return "桩正在充电中不能在启动";
			case DC_LOCALMODECANNOTSTARTCHARGE:
				return "本地模式不能启动充电";
			case STARTUNKNOWNERROR:
				return "启动未知错误";

			case CHARGESYSTEMFAILURE:
				return "充电机系统故障";
			case CARREADYTIMEOUT:
				return "车辆准备就绪超时";
			case AC_PILECANNOTSTARTINCHARGE:
				return "桩正在充电中不能在启动";
			case AC_LOCALMODECANNOTSTARTCHARGE:
				return "本地模式不能启动充电";
			case PLUGNUMBERWRONG:
				return "枪口号不对";


		default:
			break;
		}
		return "";
	}



	public static String getStrFormBytes(int code, byte[] cmd_bytes) {
		switch (code) {
		case CC1_NOTCONNECT:
		case INSULATIONDETECTIONTIMEOUT:
		case INSULATIONDETECTIONEXCEPTION:
		case CHARGESERVICESUSPENSION:
		case CHARGESYSTEMFAILURECANNOTCHARGE:
		case AUXILIARYPOWERMISMATCH:
		case AUXILIARYPOWERFAILEDSTART:
		case CHARGESTARTTIMEOUT:
		case BMSCOMMUNICATIONHANDSHAKEFAILED:
		case BMSCOMMUNICATIONCONFIGFAILED:
		case BMSPARAMETEREXCEPTION:
		case DC_PILECANNOTSTARTINCHARGE:
		case DC_LOCALMODECANNOTSTARTCHARGE:
		case STARTUNKNOWNERROR:

		case CHARGESYSTEMFAILURE:
		case CARREADYTIMEOUT:
		case AC_PILECANNOTSTARTINCHARGE:
		case AC_LOCALMODECANNOTSTARTCHARGE:
		case PLUGNUMBERWRONG:

			return SHUtility.bytesToSN(cmd_bytes);
		default:
			break;
		}
		return "";
	}

	
	
}
