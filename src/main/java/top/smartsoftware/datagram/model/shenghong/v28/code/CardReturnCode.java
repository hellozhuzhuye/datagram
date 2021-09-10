package top.smartsoftware.datagram.model.shenghong.v28.code;

public class CardReturnCode {

	public static final int SUCCESS = 0;
	public static final int UserNotFound = 1;
	public static final int NotEnoughBalance = 2;
	public static final int CardAllowed = 3;
	public static final int CardNotAllowed = 4;
	public static final int CardNotFound = 5;
	public static final int CardLose = 6;
	public static final int CardPin = 7;
	public static final int PasswordError = 8;
	public static final int CardCharging = 9;
	public static final int AdminNotAllowed = 10;



	public static String getCharCause(int code){
		switch (code) {
			case SUCCESS:
				return "有效账户";
			case UserNotFound:
				return "无效账户";
			case NotEnoughBalance:
				return "金额不足";
			case CardAllowed:
				return "把黑卡恢复正常";
			case CardNotAllowed:
				return "把正常卡变黑卡";
			case CardNotFound:
				return "非法卡号";
			case CardLose:
				return "挂失";
			case CardPin:
				return "销卡";
			case CardCharging:
				return "此卡正在充电中";
			case AdminNotAllowed:
				return "后台禁止充电";
			default:
				break;
		}
		return "";
	}

}