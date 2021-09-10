package top.smartsoftware.datagram.model.shenghong.v28.code;


import top.smartsoftware.datagram.util.SHUtility;
import top.smartsoftware.datagram.util.FormatUtility;

public class CharParamAddr {
	public static final int PileSN = 1;//充电桩编码
	public static final int TimeSync = 2;//标准时钟时间
	public static final int AdminPwd = 3;//管理员密码
	public static final int OperatorPwd = 4;//操作员密码
	public static final int MAC = 5;//MAC 地址
	public static final int PILE_LOGIN_SERVER_PASSWORD = 6;//桩登入服务器密码
	public static final int PILE_MAIN_INTERFACE_QR_CODE= 7;//桩主界面二维码
	public static final int HotLine1 = 8;//客户服务热线 1
	public static final int HotLine2 = 9;//客户服务热线 2
	public static final int USER_PAY_QRCode = 10; // 用户支付二维码
	public static final int PILE_MAIN_INTERFACE_QR_CODE_PREFIX = 11; //桩主界面二维码前缀
	public static final int DLT645_2007_BATTERY_ADDRESS = 12; //DLT645-2007电池地址
	public static final int DOMAIN_URL = 13; //域名

	public static final int PLUG_MAIN_INTERFACE_QR_CODE = 14; //枪主界面二维码
	
	
	
	
	
	public static String getCharCause(int code){
		switch (code) {
		case PileSN:
			return "充电桩编码";
		case TimeSync:
			return "标准时钟时间";
		case AdminPwd:
			return "管理员密码";
		case OperatorPwd:
			return "操作员密码";
		case MAC:
			return "MAC 地址";
		case PILE_LOGIN_SERVER_PASSWORD:
			return "桩登入服务器密码";
		case PILE_MAIN_INTERFACE_QR_CODE:
			return "桩主界面二维码";
		case HotLine1:
			return "客户服务热线 1";
		case HotLine2:
			return "客户服务热线 2";
		case USER_PAY_QRCode:
			return "用户支付二维码";
		case PILE_MAIN_INTERFACE_QR_CODE_PREFIX:
			return "桩主界面二维码前缀";
		case DLT645_2007_BATTERY_ADDRESS:
			return "DLT645-2007电池地址";
		default:
			break;
		}
		return "";
	}



	public static int getParamLength(int code){
		switch (code) {
			case PileSN:
				return 32;
			case TimeSync:
				return 8;
			case AdminPwd:
				return 8;
			case OperatorPwd:
				return 8;
			case MAC:
				return 6;
			case PILE_LOGIN_SERVER_PASSWORD:
				return 16;
			case PILE_MAIN_INTERFACE_QR_CODE:
				return 256;
			case HotLine1:
				return 16;
			case HotLine2:
				return 16;
			case USER_PAY_QRCode:
				return 256;
			case PILE_MAIN_INTERFACE_QR_CODE_PREFIX:
				return 128;
			case DLT645_2007_BATTERY_ADDRESS:
				return 12;
			default:
				break;
		}
		return 0;
	}



	public static String getStrFormBytes(int code, byte[] cmd_bytes) {
		switch (code) {
		case TimeSync:
			return FormatUtility.yyyyMMddHHmmss(SHUtility.toDate(cmd_bytes));
		case PileSN:
		case AdminPwd:
		case OperatorPwd:
		case MAC:
		case PILE_LOGIN_SERVER_PASSWORD:
		case PILE_MAIN_INTERFACE_QR_CODE:
		case HotLine1:
		case HotLine2:
		case USER_PAY_QRCode:
		case PILE_MAIN_INTERFACE_QR_CODE_PREFIX:
		case DLT645_2007_BATTERY_ADDRESS:
			return SHUtility.bytesToSN(cmd_bytes);
		default:
			break;
		}
		return "";
	}
	
	
	
}
