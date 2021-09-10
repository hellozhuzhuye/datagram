package top.smartsoftware.datagram.model.shenghong.v28.code;


import top.smartsoftware.datagram.util.SHUtility;

/**
 *  告警编码定义
 */
public class AlarmCode {
	/**无警告*/
	public static final int NO_WARNINGS = 0;
	/**绝缘检测异常*/
	public static final int INSULATOR_CHECKED_EXCEPTIONS = 1;
	/**预留*/
	public static final int RESERVEVALUE = 2;
	/**紧急停机*/
	public static final int EMERGENCY_SHUTDOWN = 3;
	/**预留*/
	public static final int PARAMETERVALUE = 4;
	/**直流输出过压*/
	public static final int DC_OUTPUT_OVERVOLTAGE = 5;
	/**直流输出欠压*/
	public static final int DC_OUTPUT_UNDERVOLTAGE = 6;
	/**预留*/
	public static final int RESERVEVAL = 7;
	/**直流输出断路*/
	public static final int DC_OUTPUT_CIRCUIT = 8;
	/**环境温度过高*/
	public static final int HIGH_AMBIENT_TEMPERATURE = 9;
	/**预留*/
	public static final int RESERVEVARA = 10;
	/**预留*/
	public static final int RESERVEVARB = 11;
	/**预留*/
	public static final int RESERVEVARC = 12;
	/**直流输出反接*/
	public static final int DC_OUTPUT_TRANSPOSITION = 13;
	/**预留*/
	public static final int RESERVEVARD = 14;
	/**预留*/
	public static final int RESERVEVARE = 15;
	/**模块类型不一致*/
	public static final int MODULE_TYPE_INCONFORMITY = 16;
	/**熔断器故障*/
	public static final int FUSEIBLE_CUTOUT_BREAKDOWN = 17;
	/**直流接触异常*/
	public static final int DC_TOUCH_EXCEPTION = 18;
	/**模块故障*/
	public static final int MODULE_BREAKDOWN = 19;
	/**模块CAN通信异常*/
	public static final int CAN_EXCEPTION = 20;
	/**保留*/
	public static final int  RESERVEVAR = 21;
	/**交流输入电压过压*/
	public static final int AC_INPUT_OVERVOLTAGE = 22;
	/**交流输入电压欠压*/
	public static final int AC_INPUT_UNDERVOLTAGE = 23;
	/**交流输入频率过频*/
	public static final int AC_INPUT_FREQUENCY = 24;
	/**交流输入频率欠频*/
	public static final int AC_INPUT_UNDERFREQUENCY = 25;
	/**预留*/
	public static final int RESERVEVARF = 26;
	/**防雷器故障*/
	public static final int THUNDERDEVICE_BREAKDOWN = 27;
	/**预留*/
	public static final int RESERVEVARG = 28;
	/**交流AC输入A相缺相*/
	public static final int AC_INPUT_A_OVERLOAD = 29;
	/**交流AC输入C相缺相*/
	public static final int AC_INPUT_B_OVERLOAD = 30;
	/**交流AC输入C相缺相*/
	public static final int AC_INPUT_C_OVERLOAD = 31;

	/**预留*/
	public static final int RESERVEVARH = 32;
	/**预留*/
	public static final int RESERVEVARI = 33;
	/**预留*/
	public static final int RESERVEVARJ = 34;
	/**预留*/
	public static final int RESERVEVARK = 35;
	/**预留*/
	public static final int RESERVEVARL = 36;
	/**预留*/
	public static final int RESERVEVARM = 40;


	/**控制板通讯故障*/
	public static final int  CONTROL_COM_BREAKDOWN = 1000;
	/**采集板通讯故障*/
	public static final int  COLLECT_COM_BREAKDOWN = 1001;
	/**电表通讯异常*/
	public static final int  AMMETER_COM_EXCEPTION = 1002;
	/**与集中器通信中断*/
	public static final int  CONCENTRATOR_COM_BREAKOFF = 1003;
	/**后台通信中断*/
	public static final int  BACKGROUND_COM_BREAKOFF= 1004;

	/**预留*/
	public static final int RESERVEVARN = 1005;
	/**读卡器故障*/
	public static final int  CARD_READER_BREAKDOWN = 1006;
	/**电表电量为0*/
	public static final int  METERPOWERZERO = 1007;

	/**紧急停机故障*/
	public static final int  EMERGENCYSTOPFAILURE = 2001;
	/**绝缘故障*/
	public static final int  INSULATIONFAULT = 2002;
	/**直流过压*/
	public static final int  DCOVERVOTAGE = 2003;
	/**直流欠压*/
	public static final int  DCUNDERVOTAGE = 2004;
	/**软起失败*/
	public static final int  SOFTFAILED = 2005;
	/**输出反接故障*/
	public static final int  OUTPUTREVERSEFAULT = 2006;
	/**接触器异常*/
	public static final int  CONTACTORABNORMALITY = 2007;
	/**模块故障*/
	public static final int  MODULEFAILURE = 2008;

	/**电网电压高*/
	public static final int  HIGHGRIDVOLTAGE = 2009;
	/**电网电压低*/
	public static final int  LOWGRIDVOLTAGE = 2010;
	/**电网频率高*/
	public static final int  HIGHFREQUENCYGRID = 2011;
	/**电网频率低*/
	public static final int  LOWFREQUENCYGRID = 2012;
	/**模块通信异常*/
	public static final int  MODULECOMMUNICATIONABNORMAL = 2013;
	/**模块类型不一致*/
	public static final int  MODULETYPEINCONSISTENT = 2014;
	/**充电机系统掉电*/
	public static final int  CHARGESYSTEMLOSESPOWER = 2015;

	/**直流输出断路*/
	public static final int  DCOUTPUTOPENCIRCUIT = 2016;
	/**进风口过温保护*/
	public static final int  AIRINLETOVERTEMPERATUREPROTECTION = 2017;
	/**进风口低温保护*/
	public static final int  INLETAIRTEMPERATUREPROTECTION = 2018;
	/**出风口过温保护*/
	public static final int  OUTLETTEMPERATUREPROTECTION = 2019;
	/**群充模块过温*/
	public static final int  GROUPCHARGEMODULEOVERTEMPERATURE = 2020;
	/**防雷故障*/
	public static final int THUNDER_BREAKDOWN = 2021;
	/**交流接触器异常*/
	public static final int  ACCONTACTORABNORMAL = 2022;
	/**充电枪头过温*/
	public static final int  CHARGEPLUGHEADOVERTEMPERATURE = 2023;





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

	/**过压告警*/
	public static final int  OVERVOLTAGEALARM = 100065;
	/**充电欠压告警*/
	public static final int  CHARGEUNDERVOLTAGEALARM = 100066;
	/**过流告警*/
	public static final int  OVERFLOWALARM = 100067;
	/**继电器故障*/
	public static final int  RELAYFAILURE = 100068;
	/**过温告警*/
	public static final int  OVERTEMPERATUREALARM = 100076;
	/**输入欠压告警*/
	public static final int  INPUTUNDERVOLTAGEALARM = 100077;
	
	
	
	
	
	
	public static String getCharCause(int code){
		switch (code) {
		case NO_WARNINGS:
			return "无警告";
		case INSULATOR_CHECKED_EXCEPTIONS:
			return "绝缘检测异常";
		case RESERVEVALUE:
			return "预留";
		case EMERGENCY_SHUTDOWN:
			return "紧急停机";
		case PARAMETERVALUE:
			return "预留";
		case DC_OUTPUT_OVERVOLTAGE:
			return "直流输出过压";
		case DC_OUTPUT_UNDERVOLTAGE:
			return "直流输出欠压";
		case RESERVEVAL:
			return "预留";
		case DC_OUTPUT_CIRCUIT:
			return "直流输出断路";
		case HIGH_AMBIENT_TEMPERATURE:
			return "环境温度过高";
		case RESERVEVARA:
			return "预留";
		case RESERVEVARB:
			return "预留";
		case RESERVEVARC:
			return "预留";
		case DC_OUTPUT_TRANSPOSITION:
			return "直流输出反接";
		case RESERVEVARD:
			return "预留";
		case RESERVEVARE:
			return "预留";
		case MODULE_TYPE_INCONFORMITY:
			return "模块类型不一致";
		case FUSEIBLE_CUTOUT_BREAKDOWN:
			return "熔断器故障";
		case DC_TOUCH_EXCEPTION:
			return "直流接触异常";
		case MODULE_BREAKDOWN:
			return "模块故障";
		case CAN_EXCEPTION:
			return "模块CAN通信异常";
		case RESERVEVAR:
			return "保留";
		case AC_INPUT_OVERVOLTAGE:
			return "交流输入电压过压";
		case AC_INPUT_UNDERVOLTAGE:
			return "交流输入电压欠压";
		case AC_INPUT_FREQUENCY:
			return "交流输入频率过频";
		case AC_INPUT_UNDERFREQUENCY:
			return "交流输入频率欠频";
		case RESERVEVARF:
			return "预留";
		case THUNDERDEVICE_BREAKDOWN:
			return "防雷器故障";
		case RESERVEVARG:
			return "预留";
		case AC_INPUT_A_OVERLOAD:
			return "交流AC输入A相缺相";
		case AC_INPUT_B_OVERLOAD:
			return "交流AC输入B相缺相";
		case AC_INPUT_C_OVERLOAD:
			return "交流AC输入C相缺相";

		case RESERVEVARH:
			return "预留";
		case RESERVEVARI:
			return "预留";
		case RESERVEVARJ:
			return "预留";
		case RESERVEVARK:
			return "预留";
		case RESERVEVARL:
			return "预留";
		case RESERVEVARM:
			return "预留";


		case CONTROL_COM_BREAKDOWN:
			return "控制板通讯故障";
		case COLLECT_COM_BREAKDOWN:
			return "采集板通讯故障";
		case AMMETER_COM_EXCEPTION:
			return "电表通讯异常";
		case CONCENTRATOR_COM_BREAKOFF:
			return "与集中器通信中断";
		case BACKGROUND_COM_BREAKOFF:
			return "后台通信中断";
		case RESERVEVARN:
			return "预留";
		case CARD_READER_BREAKDOWN:
			return "读卡器故障";

			case METERPOWERZERO:
				return "电表电量为0";
			case EMERGENCYSTOPFAILURE:
				return "紧急停机故障";
			case INSULATIONFAULT:
				return "绝缘故障";
			case DCOVERVOTAGE:
				return "直流过压";
			case DCUNDERVOTAGE:
				return "直流欠压";
			case SOFTFAILED:
				return "软起失败";
			case OUTPUTREVERSEFAULT:
				return "输出反接故障";
			case CONTACTORABNORMALITY:
				return "接触器异常";
			case MODULEFAILURE:
				return "模块故障";
			case HIGHGRIDVOLTAGE:
				return "电网电压高";
			case LOWGRIDVOLTAGE:
				return "电网电压低";
			case HIGHFREQUENCYGRID:
				return "电网频率高";
			case LOWFREQUENCYGRID:
				return "电网频率低";
			case MODULECOMMUNICATIONABNORMAL:
				return "模块通信异常";
			case MODULETYPEINCONSISTENT:
				return "模块类型不一致";
			case CHARGESYSTEMLOSESPOWER:
				return "充电机系统掉电";
			case DCOUTPUTOPENCIRCUIT:
				return "直流输出断路";
			case AIRINLETOVERTEMPERATUREPROTECTION:
				return "进风口过温保护";
			case INLETAIRTEMPERATUREPROTECTION:
				return "进风口低温保护";
			case OUTLETTEMPERATUREPROTECTION:
				return "出风口过温保护";
			case GROUPCHARGEMODULEOVERTEMPERATURE:
				return "群充模块过温";
			case THUNDER_BREAKDOWN:
				return "防雷故障";
			case ACCONTACTORABNORMAL:
				return "交流接触器异常";
			case CHARGEPLUGHEADOVERTEMPERATURE:
				return "充电枪头过温";





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

			case OVERVOLTAGEALARM:
				return "过压告警";
			case CHARGEUNDERVOLTAGEALARM:
				return "充电欠压告警";
			case OVERFLOWALARM:
				return "过流告警";
			case RELAYFAILURE:
				return "继电器故障";
			case OVERTEMPERATUREALARM:
				return "过温告警";
			case INPUTUNDERVOLTAGEALARM:
				return "输入欠压告警";

		default:
			break;
		}
		return "";
	}



	public static String getStrFormBytes(int code, byte[] cmd_bytes) {
		switch (code) {
		case NO_WARNINGS:
		case INSULATOR_CHECKED_EXCEPTIONS:
		case RESERVEVALUE:
		case EMERGENCY_SHUTDOWN:
		case PARAMETERVALUE:
		case DC_OUTPUT_OVERVOLTAGE:
		case DC_OUTPUT_UNDERVOLTAGE:
		case RESERVEVAL:
		case DC_OUTPUT_CIRCUIT:
		case HIGH_AMBIENT_TEMPERATURE:
		case RESERVEVARA:
		case RESERVEVARB:
		case RESERVEVARC:
		case DC_OUTPUT_TRANSPOSITION:
		case RESERVEVARD:
		case RESERVEVARE:
		case MODULE_TYPE_INCONFORMITY:
		case FUSEIBLE_CUTOUT_BREAKDOWN:
		case DC_TOUCH_EXCEPTION:
		case MODULE_BREAKDOWN:
		case CAN_EXCEPTION:
		case RESERVEVAR:
		case AC_INPUT_OVERVOLTAGE:
		case AC_INPUT_UNDERVOLTAGE:
		case AC_INPUT_FREQUENCY:
		case AC_INPUT_UNDERFREQUENCY:
		case RESERVEVARF:
		case THUNDERDEVICE_BREAKDOWN:
		case RESERVEVARG:
		case AC_INPUT_A_OVERLOAD:
		case AC_INPUT_B_OVERLOAD:
		case AC_INPUT_C_OVERLOAD:
		case RESERVEVARH:
		case RESERVEVARI:
		case RESERVEVARJ:
		case RESERVEVARK:
		case RESERVEVARL:
		case RESERVEVARM:
		case CONTROL_COM_BREAKDOWN:
		case COLLECT_COM_BREAKDOWN:
		case AMMETER_COM_EXCEPTION:
		case CONCENTRATOR_COM_BREAKOFF:
		case BACKGROUND_COM_BREAKOFF:
		case RESERVEVARN:
		case CARD_READER_BREAKDOWN:

		case METERPOWERZERO:
		case EMERGENCYSTOPFAILURE:
		case INSULATIONFAULT:
		case DCOVERVOTAGE:
		case DCUNDERVOTAGE:
		case SOFTFAILED:
		case OUTPUTREVERSEFAULT:
		case CONTACTORABNORMALITY:
		case MODULEFAILURE:
		case HIGHGRIDVOLTAGE:
		case LOWGRIDVOLTAGE:
		case HIGHFREQUENCYGRID:
		case LOWFREQUENCYGRID:
		case MODULECOMMUNICATIONABNORMAL:
		case MODULETYPEINCONSISTENT:
		case CHARGESYSTEMLOSESPOWER:
		case DCOUTPUTOPENCIRCUIT:
		case AIRINLETOVERTEMPERATUREPROTECTION:
		case INLETAIRTEMPERATUREPROTECTION:
		case OUTLETTEMPERATUREPROTECTION:
		case GROUPCHARGEMODULEOVERTEMPERATURE:
		case THUNDER_BREAKDOWN:
		case ACCONTACTORABNORMAL:
		case CHARGEPLUGHEADOVERTEMPERATURE:




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

		case OVERVOLTAGEALARM:
		case CHARGEUNDERVOLTAGEALARM:
		case OVERFLOWALARM:
		case RELAYFAILURE:
		case OVERTEMPERATUREALARM:
		case INPUTUNDERVOLTAGEALARM:


			return SHUtility.bytesToSN(cmd_bytes);
		default:
			break;
		}
		return "";
	}
	
	
	
}
