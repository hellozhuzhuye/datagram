package top.smartsoftware.datagram.model.shenghong.v28.code;


/**
 *  告警编码定义
 */
public class SysAlarmCode {

	/**预留*/
	public static final int BIT10 = 10;
	/**紧急停机*/
	public static final int BIT11 = 11;
	/**绝缘故障*/
	public static final int BIT12 = 12;
	/**直流过压*/
	public static final int BIT13 = 13;
	/**直流欠压*/
	public static final int BIT14 = 14;
	/**软启失败*/
	public static final int BIT15 = 15;
	/**直流输出反接*/
	public static final int BIT16 = 16;
	/**直流接触器异常*/
	public static final int BIT17 = 17;


	/**模块故障*/
	public static final int BIT20 = 20;
	/**交流输入过压*/
	public static final int BIT21 = 21;
	/**交流输入欠压*/
	public static final int BIT22 = 22;
	/**交流输入过频*/
	public static final int BIT23 = 23;
	/**交流输入欠频*/
	public static final int BIT24 = 24;
	/**模块通信异常*/
	public static final int BIT25 = 25;
	/**模块类型不一致*/
	public static final int BIT26 = 26;
	/**系统辅源掉电*/
	public static final int BIT27 = 27;

	/**直流输出断路*/
	public static final int BIT30 = 30;
	/**进风口过温保护*/
	public static final int BIT31 = 31;
	/**进风口低温保护*/
	public static final int BIT32 = 32;
	/**出风口过温保护*/
	public static final int BIT33 = 33;
	/**群充模块过温*/
	public static final int BIT34 = 34;
	/**防雷故障*/
	public static final int BIT35 = 35;
	/**交流接触器异常*/
	public static final int BIT36 = 36;
	/**充电枪头过温*/
	public static final int BIT37 = 37;

	/**直流输出过流*/
	public static final int BIT40 = 40;
	/**充电枪锁异常*/
	public static final int BIT41 = 41;
	/**快充段，此枪无效*/
	public static final int BIT42 = 42;
	/**门禁保护*/
	public static final int BIT43 = 43;
	/**CAN3 通信错误(扩展板)*/
	public static final int BIT44 = 44;
	/**运行剩余天数无效/群充 模块通信故障*/
	public static final int BIT45 = 45;
	/**输入缺相*/
	public static final int BIT46 = 46;
	/**控制导引故障*/
	public static final int BIT47 = 47;

	/**模块未准备就绪*/
	public static final int BIT50 = 50;
//	/**充电枪锁异常*/
//	public static final int BIT51 = 51;
//	/**快充段，此枪无效*/
//	public static final int BIT52 = 52;
//	/**门禁保护*/
//	public static final int BIT53 = 53;
//	/**CAN3 通信错误(扩展板)*/
//	public static final int BIT54 = 54;
//	/**运行剩余天数无效/群充 模块通信故障*/
//	public static final int BIT55 = 55;
//	/**输入缺相*/
//	public static final int BIT56 = 56;
//	/**控制导引故障*/
//	public static final int BIT57 = 57;


	/**GPRS 串口通信故障*/
	public static final int BIT104 = 104;
//	/**充电枪锁异常*/
//	public static final int BIT41 = 41;
//	/**快充段，此枪无效*/
//	public static final int BIT42 = 42;
//	/**门禁保护*/
//	public static final int BIT43 = 43;
//	/**CAN3 通信错误(扩展板)*/
//	public static final int BIT44 = 44;
//	/**运行剩余天数无效/群充 模块通信故障*/
//	public static final int BIT45 = 45;
//	/**输入缺相*/
//	public static final int BIT46 = 46;
//	/**控制导引故障*/
//	public static final int BIT47 = 47;


	/**直流输出电流过流*/
	public static final int BIT110 = 110;
	/**充电桩监控器离线*/
	public static final int BIT111 = 111;
	/**系统采集板离线*/
	public static final int BIT112 = 112;
	/**控制板通讯故障*/
	public static final int BIT113 = 113;
	/**交流输入电压不平衡*/
	public static final int BIT114 = 114;
	/**AC 接触器异常*/
	public static final int BIT115 = 115;
	/**交流 AC 输入 A 相缺相*/
	public static final int BIT116 = 116;
	/**交流 AC 输入 B 相缺相*/
	public static final int BIT117 = 117;


	/**交流 AC 输入 C 相缺相*/
	public static final int BIT120 = 120;
	/**直流输出短路*/
	public static final int BIT121 = 121;
	/**电磁锁故障*/
	public static final int BIT122 = 122;
	/**熔断器故障*/
	public static final int BIT123 = 123;
	/**电表电量为 0*/
	public static final int BIT124 = 124;


	/**迪文通信告警*/
	public static final int BIT130 = 130;
	/**电表 1 通信告警*/
	public static final int BIT131 = 131;
	/**读卡器通信告警*/
	public static final int BIT132 = 132;
	/**电表 2 通信告警*/
	public static final int BIT133 = 133;
	/**电磁锁上锁故障*/
	public static final int BIT134 = 134;
	/**电磁锁解锁故障*/
	public static final int BIT135 = 135;
	/**启动失败告警*/
	public static final int BIT136 = 136;
	/**充电无电流*/
	public static final int BIT137 = 137;

	/**有电流断开连接*/
	public static final int BIT140 = 140;




	public static String getCharCause(int code){

		switch (code) {
		case BIT10:
			return "预留";
		case BIT11:
			return "紧急停机";
		case BIT12:
			return "绝缘故障";
		case BIT13:
			return "直流过压";
		case BIT14:
			return "直流欠压";
		case BIT15:
			return "软启失败";
		case BIT16:
			return "直流输出反接";
		case BIT17:
			return "直流接触器异常";
		case BIT20:
			return "模块故障";
		case BIT21:
			return "交流输入过压";
		case BIT22:
			return "交流输入欠压";
		case BIT23:
			return "交流输入过频";
		case BIT24:
			return "直流欠压";
		case BIT25:
			return "软启失败";
		case BIT26:
			return "直流输出反接";
		case BIT27:
			return "直流接触器异常";
		case BIT30:
			return "直流输出断路";
		case BIT31:
			return "进风口过温保护";
		case BIT32:
			return "进风口低温保护";
		case BIT33:
			return "出风口过温保护";
		case BIT34:
			return "群充模块过温";
		case BIT35:
			return "防雷故障";
		case BIT36:
			return "交流接触器异常";
		case BIT37:
			return "充电枪头过温";
		case BIT40:
			return "直流输出过流";
		case BIT41:
			return "充电枪锁异常";
		case BIT42:
			return "快充段，此枪无效";
		case BIT43:
			return "门禁保护";
		case BIT44:
			return "CAN3 通信错误(扩展板)";
		case BIT45:
			return "运行剩余天数无效/群充 模块通信故障";
		case BIT46:
			return "输入缺相";
		case BIT47:
			return "控制导引故障";
		case BIT50:
			return "模块未准备就绪";
			case BIT104:
				return "GPRS 串口通信故障";

			case BIT110:
				return "直流输出电流过流";
			case BIT111:
				return "充电桩监控器离线";
			case BIT112:
				return "系统采集板离线";
			case BIT113:
				return "控制板通讯故障";
			case BIT114:
				return "交流输入电压不平衡";
			case BIT115:
				return "AC 接触器异常";
			case BIT116:
				return "交流 AC 输入 A 相缺相";
			case BIT117:
				return "交流 AC 输入 B 相缺相";

			case BIT120:
				return "交流 AC 输入 C 相缺相";
			case BIT121:
				return "直流输出短路";
			case BIT122:
				return "电磁锁故障";
			case BIT123:
				return "熔断器故障";
			case BIT124:
				return "电表电量为 0";

			case BIT130:
				return "迪文通信告警";
			case BIT131:
				return "电表 1 通信告警";
			case BIT132:
				return "读卡器通信告警";
			case BIT133:
				return "电表 2 通信告警";
			case BIT134:
				return "电磁锁上锁故障";
			case BIT135:
				return "电磁锁解锁故障";
			case BIT136:
				return "启动失败告警";
			case BIT137:
				return "充电无电流";
			case BIT140:
				return "有电流断开连接";

		default:
			break;
		}
		return "未知";
	}



	
	
	
}
