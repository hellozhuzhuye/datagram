package top.smartsoftware.datagram.model.shenghong.v16;


import top.smartsoftware.datagram.util.SHUtility;

/**
 *  告警编码定义
 */
public class AlarmCode {
	/**无警告*/
	public static final int NO_WARNINGS = 0;
	/**绝缘检测异常*/
	public static final int INSULATOR_CHECKED_EXCEPTIONS = 1;
	/**控制板工作状态警告*/
	public static final int CONTROLBOARD_WORKSTATUS_WARN = 2;
	/**紧急停机*/
	public static final int EMERGENCY_SHUTDOWN = 3;
	/**控制板通讯异常*/
	public static final int CONTROLBOARD_COMUNICATION_EXCEPTION = 4;
	/**直流输出过压*/
	public static final int DC_OUTPUT_OVERVOLTAGE = 5;
	/**直流输出欠压*/
	public static final int DC_OUTPUT_UNDERVOLTAGE = 6; 
	/**直流输出电流过流*/
	public static final int DC_OUTPUT_CURRENT_FLOW = 7;
	/**直流输出电流断路*/
	public static final int DC_OUTPUT_OPEN_CIRCUIT = 8; 
	/**环境温度过高*/
	public static final int HIGH_AMBIENT_TEMPERATURE = 9;
	/**环境温度过低*/
	public static final int LOW_AMBIENT_TEMPERATURE = 10;
	/**充电桩监控器离线*/
	public static final int PILE_MONITOR_OFFLINE = 11;
	/**系统采集板离线*/
	public static final int SYS_BOARD_OFFLINE = 12;
	/**直流输出反接*/
	public static final int DC_OUTPUT_TRANSPOSITION = 13;
	/**绝缘故障*/
	public static final int INSULATOR_BREAKDOWN = 14;
	/**EPO关机*/
	public static final int EPO_POWER_OFF = 15;
	/**模块类型不一致*/
	public static final int MODULE_TYPE_INCONFORMITY = 16;
	/**熔断器故障*/
	public static final int FUSEIBLE_CUTOUT_BREAKDOWN = 17;
	/**DC接触异常*/
	public static final int DC_TOUCH_EXCEPTION = 18;
	/**模块故障*/
	public static final int MODULE_BREAKDOWN = 19;
	/**模块CAN通信异常*/
	public static final int CAN_EXCEPTION = 20;
	/**交流输入异常*/
	public static final int AC_INPUT_EXCEPTION = 21;
	/**交流输入电压过压*/
	public static final int AC_INPUT_OVERVOLTAGE = 22;
	/**交流输入电压欠压*/
	public static final int AC_INPUT_UNDERVOLTAGE = 23;
	/**交流输入频率过频*/
	public static final int AC_INPUT_FREQUENCY = 24;
	/**交流输入频率欠频*/
	public static final int AC_INPUT_UNDERFREQUENCY = 25;
	/**交流输入电压不平衡*/
	public static final int AC_INPUT_VILTAGE_UNBALANCE = 26;
	/**防雷故障*/
	public static final int THUNDER_BREAKDOWN = 27;
	/**AC接触异常*/
	public static final int AC_TOUCH_EXCEPTION = 28;
	/**交流AC输入A相缺相*/
	public static final int AC_INPUT_A_OVERLOAD = 29;
	/**交流AC输入C相缺相*/
	public static final int AC_INPUT_B_OVERLOAD = 30;
	/**交流AC输入C相缺相*/
	public static final int AC_INPUT_C_OVERLOAD = 31;
	/**直流输出短路*/
	public static final int AC_INPUT_SHORT_CIRCUIT = 32;
	/**电磁锁故障*/
	public static final int ELE_LOCK_BREAKDOWN = 33;
	/**低压辅源异常*/
	public static final int LOW_VOLTAGE_SOURCE_EXCEPTION = 34;
	/**保留*/
	public static final int  RESERVE = 35;
	/**采集器代码错误*/
	public static final int  COLLECT_CODE_ERROR = 36;
	/**控制板通讯故障*/
	public static final int  CONTROL_COM_BREAKDOWN = 1000;
	/**采集板通讯故障*/
	public static final int  COLLECT_COM_BREAKDOWN = 1001;
	/**电表通讯异常*/
	public static final int  AMMETER_COM_EXCEPTION = 1002;
	/**与集中器通信中断*/
	public static final int  CONCENTRATOR_COM_BREAKOFF = 1003;
	/**普天后台通信中断*/
	public static final int  PUTIAN_COM_BREAKOFF= 1004;
	/**系统故障*/
	public static final int  SYS_BREAKDOWN = 1005;
	/**读卡器故障*/
	public static final int  CARD_READER_BREAKDOWN = 1006;
	/**迪文通信告警*/
	public static final int  DEEVEN_COM_WARNINGS = 100001;
	/**读卡器通信告警*/
	public static final int  CARD_READER_WARNINGS = 100002;
	/**防雷器故障*/
	public static final int  THUNDERMACHINE_BREAKDOWN = 100003;
	/**主开关及熔断器故障*/
	public static final int  SWITCH_FUSEIBLE_CUTOUT_BREAKDOWN = 100004;
	/**紧急停机故障*/
	public static final int  EMERGENCY_SHUTDOWN_BREAKDOWN = 100005;
	/**电表1通讯警告*/
	public static final int  AMMETER1_COM_WARNINGS = 100032;
	/**电表2通讯警告*/
	public static final int  AMMETER2_COM_WARNINGS = 100033;
	/**电表3通讯警告*/
	public static final int  AMMETER3_COM_WARNINGS = 100034;
	/**电表4通讯警告*/
	public static final int  AMMETER4_COM_WARNINGS = 100035;
	/**电表5通讯警告*/
	public static final int  AMMETER5_COM_WARNINGS = 100036;
	/**电表6通讯警告*/
	public static final int  AMMETER6_COM_WARNINGS = 100037;
	/**电表7通讯警告*/
	public static final int  AMMETER7_COM_WARNINGS = 100038;
	/**电表8通讯警告*/
	public static final int  AMMETER8_COM_WARNINGS = 100039;
	/**电表9通讯警告*/
	public static final int  AMMETER9_COM_WARNINGS = 100040;
	/**电表10通讯警告*/
	public static final int  AMMETER10_COM_WARNINGS = 100041;
	/**电表11通讯警告*/
	public static final int  AMMETER11_COM_WARNINGS = 100042;
	/**电表12通讯警告*/
	public static final int  AMMETER12_COM_WARNINGS = 100043;
	/**电表13通讯警告*/
	public static final int  AMMETER13_COM_WARNINGS = 100044;
	/**电表14通讯警告*/
	public static final int  AMMETER14_COM_WARNINGS = 100045;
	/**电表15通讯警告*/
	public static final int  AMMETER15_COM_WARNINGS = 100046;
	/**电表16通讯警告*/
	public static final int  AMMETER16_COM_WARNINGS = 100047;
	
	
	
	
	
	
	public static String getCharCause(int code){
		switch (code) {
		case NO_WARNINGS:
			return "无警告";
		case INSULATOR_CHECKED_EXCEPTIONS:
			return "绝缘检测异常";
		case CONTROLBOARD_WORKSTATUS_WARN:
			return "控制板工作状态警告";
		case EMERGENCY_SHUTDOWN:
			return "紧急停机";
		case CONTROLBOARD_COMUNICATION_EXCEPTION:
			return "控制板通讯异常";
		case DC_OUTPUT_OVERVOLTAGE:
			return "直流输出过压";
		case DC_OUTPUT_UNDERVOLTAGE:
			return "直流输出欠压";
		case DC_OUTPUT_CURRENT_FLOW:
			return "直流输出电流过流";
		case DC_OUTPUT_OPEN_CIRCUIT:
			return "直流输出电流断路";
		case HIGH_AMBIENT_TEMPERATURE:
			return "环境温度过高";
		case LOW_AMBIENT_TEMPERATURE:
			return "环境温度过低";
		case PILE_MONITOR_OFFLINE:
			return "充电桩监控器离线";
		case SYS_BOARD_OFFLINE:
			return "系统采集板离线";
		case DC_OUTPUT_TRANSPOSITION:
			return "直流输出反接";
		case INSULATOR_BREAKDOWN:
			return "绝缘故障";
		case EPO_POWER_OFF:
			return "EPO关机";
		case MODULE_TYPE_INCONFORMITY:
			return "模块类型不一致";
		case FUSEIBLE_CUTOUT_BREAKDOWN:
			return "熔断器故障";
		case DC_TOUCH_EXCEPTION:
			return "DC接触异常";
		case MODULE_BREAKDOWN:
			return "模块故障";
		case CAN_EXCEPTION:
			return "模块CAN通信异常";
		case AC_INPUT_EXCEPTION:
			return "交流输入异常";
		case AC_INPUT_OVERVOLTAGE:
			return "交流输入电压过压";
		case AC_INPUT_UNDERVOLTAGE:
			return "交流输入电压欠压";
		case AC_INPUT_FREQUENCY:
			return "交流输入频率过频";
		case AC_INPUT_UNDERFREQUENCY:
			return "交流输入频率欠频";
		case AC_INPUT_VILTAGE_UNBALANCE:
			return "交流输入电压不平衡";
		case THUNDER_BREAKDOWN:
			return "防雷故障";
		case AC_TOUCH_EXCEPTION:
			return "AC接触异常";
		case AC_INPUT_A_OVERLOAD:
			return "交流AC输入A相缺相";
		case AC_INPUT_B_OVERLOAD:
			return "交流AC输入B相缺相";
		case AC_INPUT_C_OVERLOAD:
			return "交流AC输入C相缺相";
		case AC_INPUT_SHORT_CIRCUIT:
			return "直流输出短路";
		case ELE_LOCK_BREAKDOWN:
			return "电磁锁故障";
		case LOW_VOLTAGE_SOURCE_EXCEPTION:
			return "低压辅源异常";
		case RESERVE:
			return "保留";
		case COLLECT_CODE_ERROR:
			return "采集器代码错误";
		case CONTROL_COM_BREAKDOWN:
			return "控制板通讯故障";
		case COLLECT_COM_BREAKDOWN:
			return "采集板通讯故障";
		case AMMETER_COM_EXCEPTION:
			return "电表通讯异常";
		case CONCENTRATOR_COM_BREAKOFF:
			return "与集中器通信中断";
		case PUTIAN_COM_BREAKOFF:
			return "普天后台通信中断";
		case SYS_BREAKDOWN:
			return "系统故障";
		case CARD_READER_BREAKDOWN:
			return "读卡器故障";
		case DEEVEN_COM_WARNINGS:
			return "迪文通信告警";
		case CARD_READER_WARNINGS:
			return "读卡器通信告警";
		case THUNDERMACHINE_BREAKDOWN:
			return "防雷器故障";
		case SWITCH_FUSEIBLE_CUTOUT_BREAKDOWN:
			return "主开关及熔断器故障";
		case EMERGENCY_SHUTDOWN_BREAKDOWN:
			return "紧急停机故障";
		case AMMETER1_COM_WARNINGS:
			return "电表1通讯警告";
		case AMMETER2_COM_WARNINGS:
			return "电表2通讯警告";
		case AMMETER3_COM_WARNINGS:
			return "电表3通讯警告";
		case AMMETER4_COM_WARNINGS:
			return "电表4通讯警告";
		case AMMETER5_COM_WARNINGS:
			return "电表5通讯警告";
		case AMMETER6_COM_WARNINGS:
			return "电表6通讯警告";
		case AMMETER7_COM_WARNINGS:
			return "电表7通讯警告";
		case AMMETER8_COM_WARNINGS:
			return "电表8通讯警告";
		case AMMETER9_COM_WARNINGS:
			return "电表9通讯警告";
		case AMMETER10_COM_WARNINGS:
			return "电表10通讯警告";
		case AMMETER11_COM_WARNINGS:
			return "电表11通讯警告";
		case AMMETER12_COM_WARNINGS:
			return "电表12通讯警告";
		case AMMETER13_COM_WARNINGS:
			return "电表13通讯警告";
		case AMMETER14_COM_WARNINGS:
			return "电表14通讯警告";
		case AMMETER15_COM_WARNINGS:
			return "电表15通讯警告";
		case AMMETER16_COM_WARNINGS:
			return "电表16通讯警告";
			
			
			
			
		default:
			break;
		}
		return "";
	}



	public static String getStrFormBytes(int code, byte[] cmd_bytes) {
		switch (code) {
		case NO_WARNINGS:
		case INSULATOR_CHECKED_EXCEPTIONS:
		case CONTROLBOARD_WORKSTATUS_WARN:
		case EMERGENCY_SHUTDOWN:
		case CONTROLBOARD_COMUNICATION_EXCEPTION:
		case DC_OUTPUT_OVERVOLTAGE:
		case DC_OUTPUT_UNDERVOLTAGE:
		case DC_OUTPUT_CURRENT_FLOW:
		case DC_OUTPUT_OPEN_CIRCUIT:
		case HIGH_AMBIENT_TEMPERATURE:
		case LOW_AMBIENT_TEMPERATURE:
		case PILE_MONITOR_OFFLINE:
		case SYS_BOARD_OFFLINE:
		case DC_OUTPUT_TRANSPOSITION:
		case INSULATOR_BREAKDOWN:
		case EPO_POWER_OFF:
		case MODULE_TYPE_INCONFORMITY:
		case FUSEIBLE_CUTOUT_BREAKDOWN:
		case DC_TOUCH_EXCEPTION:
		case MODULE_BREAKDOWN:
		case CAN_EXCEPTION:
		case AC_INPUT_EXCEPTION:
		case AC_INPUT_OVERVOLTAGE:
		case AC_INPUT_UNDERVOLTAGE:
		case AC_INPUT_FREQUENCY:
		case AC_INPUT_UNDERFREQUENCY:
		case AC_INPUT_VILTAGE_UNBALANCE:
		case THUNDER_BREAKDOWN:
		case AC_TOUCH_EXCEPTION:
		case AC_INPUT_A_OVERLOAD:
		case AC_INPUT_B_OVERLOAD:
		case AC_INPUT_C_OVERLOAD:
		case AC_INPUT_SHORT_CIRCUIT:
		case ELE_LOCK_BREAKDOWN:
		case LOW_VOLTAGE_SOURCE_EXCEPTION:
		case RESERVE:
		case COLLECT_CODE_ERROR:
		case CONTROL_COM_BREAKDOWN:
		case COLLECT_COM_BREAKDOWN:
		case AMMETER_COM_EXCEPTION:
		case CONCENTRATOR_COM_BREAKOFF:
		case PUTIAN_COM_BREAKOFF:
		case SYS_BREAKDOWN:
		case CARD_READER_BREAKDOWN:
		case DEEVEN_COM_WARNINGS:
		case CARD_READER_WARNINGS:
		case THUNDERMACHINE_BREAKDOWN:
		case SWITCH_FUSEIBLE_CUTOUT_BREAKDOWN:
		case EMERGENCY_SHUTDOWN_BREAKDOWN:
		case AMMETER1_COM_WARNINGS:
		case AMMETER2_COM_WARNINGS:
		case AMMETER3_COM_WARNINGS:
		case AMMETER4_COM_WARNINGS:
		case AMMETER5_COM_WARNINGS:
		case AMMETER6_COM_WARNINGS:
		case AMMETER7_COM_WARNINGS:
		case AMMETER8_COM_WARNINGS:
		case AMMETER9_COM_WARNINGS:
		case AMMETER10_COM_WARNINGS:
		case AMMETER11_COM_WARNINGS:
		case AMMETER12_COM_WARNINGS:
		case AMMETER13_COM_WARNINGS:
		case AMMETER14_COM_WARNINGS:
		case AMMETER15_COM_WARNINGS:
		case AMMETER16_COM_WARNINGS:
			return SHUtility.bytesToSN(cmd_bytes);
		default:
			break;
		}
		return "";
	}
	
	
	
}
