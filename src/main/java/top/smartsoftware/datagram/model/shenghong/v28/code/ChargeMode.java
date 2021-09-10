package top.smartsoftware.datagram.model.shenghong.v28.code;

public class ChargeMode {
	public static final int NOW_CHARGE = 0;
	public static final int TIME_CHARGE= 1;
	public static final int REASEVR_CHARGE = 2;
	
	
	
	public static String getChargeMode(int code){
		switch (code) {
		case NOW_CHARGE:
			return "即时充电";
		case TIME_CHARGE:
			return "定时启动充电";
		case REASEVR_CHARGE:
			return "预约充电";
		default:
			break;
		}
		return "";
	}
}
