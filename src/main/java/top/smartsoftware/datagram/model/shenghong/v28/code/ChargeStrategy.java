package top.smartsoftware.datagram.model.shenghong.v28.code;

public class ChargeStrategy {
	public static final int FullCharge = 0;
	public static final int TimeControl = 1;
	public static final int AmountControl = 2;
	public static final int QuantityControl = 3;
	
	
	
	public static String getChargeStrategy(int code){
		switch (code) {
		case FullCharge:
			return "自动充满";
		case TimeControl:
			return "按时间充满";
		case AmountControl:
			return "定金额";
		case QuantityControl:
			return "按电量充满";
		default:
			break;
		}
		return "";
	}
}
