package top.smartsoftware.datagram.model.shenghong.v28.code;


import top.smartsoftware.datagram.util.SHUtility;

/**
 *  结束原因编码定义
 */
public class EndCauseCode {
	/**正常结束*/
	public static final int NORMAL_END = 0;
	/**接收BMS的辨识报文超时*/
	public static final int RECEIVE_BMS_TIMEOUT = 1;
	/**接收电池充电参数报文超时*/
	public static final int RECEIVE_BATTERYCHARGE_PARAM_TIMEOUT = 2;
	/**接收BMS完成充电准备报文超时*/
	public static final int RECEIVE_BMS_CHARGINGFOR_TIMEOUT = 3;
	/**接收电池总状态报文超时*/
	public static final int RECEIVE_BATTERY_STATUS_TIMEOUT = 4;
	/**接收电池总需求报文超时*/
	public static final int RECEIVE_BATTERY_NEED_TIMEOUT = 5;
	/**接收BMS中止充电报文超时*/
	public static final int RECEIVE_BMS_STOPCHARG_TIMEOUT = 6; 
	/**接收BMS充电统计报文超时*/
	public static final int RECEIVE_BMS_CHARGSTATISTICAL_TIMEOUT = 7;
	
	
	/**收到bem报文停止*/
	public static final int GET_BEM_STOP = 20; 
	/**收到bst报文停止*/
	public static final int GET_BST_STOP = 21;
	/**收到BSM报文错误停止*/
	public static final int GET_BSM_ERROSTOP = 22;
	/**bms温度过高异常*/
	public static final int BMS_TEMPERATUREEXCEPTION = 23;
	/**单体电压过高异常*/
	public static final int SINGLEVOLTAGEEEXCEPTION = 24;
	/**需求电流异常*/
	public static final int CURRENT_NEED_EXCEPTION = 25;
	
	
	/**BST的SOC目标值*/
	public static final int BST_SOC_TARGET = 30;
	/**BST的电压设定值*/
	public static final int BST_VOLYAGE_SETTINGVALUE = 31;
	/**BST单体电压满*/
	public static final int BST_VOLYAGE_FULL = 32;
	/**BST_00_6*/
	public static final int BST_00_6 = 33;
	/**BST绝缘故障*/
	public static final int BST_INSULATOR_BREAKDOWN = 34;
	/**BST连接器过温*/
	public static final int BST_CONNECTOR_OVER_TEMPERATURE = 35;
	/**BST元件过温*/
	public static final int BST_ORIGINAL_OVER_TEMPERATURE = 36;
	/**BST连接器故障*/
	public static final int BST_CONNECTOR_BREAKDOWN = 37;
	/**BST电池组过温*/
	public static final int BST_BATTERY_OVER_TEMPERATURE = 38;
	/**BST其他故障*/
	public static final int BST_OTHER_BREAKDOWN = 39;
	/**BST_02_4*/
	public static final int BST_02_4 = 40;
	/**BST_02_6*/
	public static final int BST_02_6 = 41;
	/**BST电流过大*/
	public static final int BST_OVERCURRENT = 42;
	/**BST电压过大*/
	public static final int BST_OVERVOLYAGE= 43;
	
	
	/**用户中止*/
	public static final int USER_SUSPEND = 200;
	/**系统警告1*/
	public static final int SYS_WARNING_1 = 201;
	/**系统警告2*/
	public static final int SYS_WARNING_2 = 202;
	
	
	/**CC1连接断开*/
	public static final int CC1_CONNECT_BREAK = 300;
	/**用户刷卡停止*/
	public static final int USER_SWIPINGCARD_STOP = 301;
	/**紧急停机*/
	public static final int EMERGENCY_SHUTDOWN = 302;
	/**预处理加电失败*/
	public static final int PRETEATMENT_POWER_FAILURE = 303;
	/**绝缘检测异常*/
	public static final int INSULATOR_CHECK_EXCEPTION = 304;
	/**控制板通讯异常*/
	public static final int  CONTROL_COM_EXCEPTION = 305;
	/**充电电量达到设定值*/
	public static final int  CHARGE_REACHE_SETVALUE = 306;
	/**充电时间达到设定值*/
	public static final int  CHARGE_TIME_SETVALUE = 307;
	/**充电金额达到设定值*/
	public static final int  CHARGE_AMOUNT_SETVALUE = 308;
	/**电表通讯异常*/
	public static final int  AMMETER_COM_EXCEPTION = 309;
	/**充电金额超过用户卡金额*/
	public static final int  CHARGEAMOUNT_OVER_USERCARD = 310;

	/**后台终止*/
	public static final int  BACKGROUNDSYSTEMTERMINATION= 311;
	/**系统告警终止*/
	public static final int  SYS_WARNING_STOP = 312;
	/**后台通信终止*/
	public static final int  BACKGROUNDSYSTEMCOMMUNICATIONSTOP = 313;
	/**充电电压异常中止*/
	public static final int   CHARGE_VOLYAGE_EXCEPTION_STOP = 314;
	/**充电电流异常中止*/
	public static final int  CHARGE_CURRENT_EXCEPTION_STOP = 315;
	/**BMS的SOC满中止*/
	public static final int  BMS_SOC_FULL_STOP = 316;
	/**电表电量异常增大终止*/
	public static final int  METERPOWERINCREASEEXCEPTIONSTOP = 317;
	/**电表电量异常变小终止*/
	public static final int  METERPOWERSMALLEREXCEPTIONSTOP = 318;
	/**VIN不匹配*/
	public static final int  VINMISMATCH = 319;

	/**管理员界面终止*/
	public static final int  ADMININTERFACESTOP = 401;
	/**软件升级*/
	public static final int  SOFTWAREUPGRADE = 402;
	/**充电启动超时*/
	public static final int  CHARGESTARTTIMEOUT = 403;
	/**BMS单体动力蓄电池电压异常*/
	public static final int  BMSSINGLEBATTERYVOLTAGEEXCEPTION = 404;
	/**整车动力蓄电池电荷状态*/
	public static final int  BMSCARPOWERBATTERYSTATE = 405;
	/**BMS动力蓄电池充电过电流*/
	public static final int  BMSPOWERBATTERYCHARGEOVERCURRENT = 406;
	/**BMS动力蓄电池温度过高*/
	public static final int  BMSPOWERBATTERYTEMPERATUREHIGHER = 407;
	/**BMS动力蓄电池绝缘状态*/
	public static final int  BMSPOWERBATTERYINSULATION = 408;
	/**BMS蓄电池组输出连接器状态*/
	public static final int  BMSBATTERYPACKOUTPUTCONNECTORSTATUS = 409;
	/**充电电压超过BMS最大允许值*/
	public static final int  CHARGEVOLTAGEEXCEEDMAXVALUEBMS = 410;
	/**BMS其他状态异常*/
	public static final int  BMSOTHERSTATUSEXCEPTION = 411;
	/**BCS上传电压异常*/
	public static final int  BCSUPLOADVOLTAGEEXCEPTION = 412;


	/**系统其他故障*/
	public static final int  OTHERSYSTEMFAULTS = 2000;
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
	/**系统辅源掉电*/
	public static final int  SYSTEMAUXILIARYSOURCEPOWERDOWN = 2015;
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
	/**断开连接*/
	public static final int  DISCONNECT = 101000;
	/**未准备就绪*/
	public static final int  NOT_READY = 101001;
	/**充电过压*/
	public static final int  CHARGE_OVERVOLTAGE = 101002;
	/**充电过流*/
	public static final int  CHARGE_CURRENT_FLOW = 101003;
	/**充电欠压*/
	public static final int  CHARGE_UNDERVOLTAGE = 101004;
	/**用户刷卡停止充电*/
	public static final int  USER_SWINSCARD_STOPCHARGE = 101005;



	/**后台停止*/
	public static final int  BACKGROUNDSYSTEMSTOP = 101006;
	/**充电时间达到设定值*/
	public static final int  CHARGETIMEREACHSETVALUE = 101007;
	/**充电金额达到设定值*/
	public static final int  CHARGEAMOUNTREACHSETVALUE = 101008;
	/**充电电量达到设定值*/
	public static final int  CHARGEDEGREETREACHSETVALUE = 101009;
	/**应用软件升级停止*/
	public static final int  SOFTWAREUPGRADESTOP = 101010;
	/**系统掉电停止*/
	public static final int  SYSTEMPOWEROFF = 101011;
	/**未知原因*/
	public static final int  UNKNOWNREASON = 101012;
	/**用户界面终止*/
	public static final int  USERINTERFACESTOP = 101013;
	/**金额不足*/
	public static final int  INSUFFICIENTAMOUNUT = 101014;
	/**电池充满*/
	public static final int  BATTERYFULL = 101015;
	/**达到用户设定充电条件停止*/
	public static final int  REACHUSERSETCHARGECONFITIONSTOP = 101016;


	
	
	
	
	
	
	
	public static String getCharCause(int code){
		switch (code) {
		case NORMAL_END:
			return "正常结束";
		case RECEIVE_BMS_TIMEOUT:
			return "接收BMS的辨识报文超时";
		case RECEIVE_BATTERYCHARGE_PARAM_TIMEOUT:
			return "接收电池充电参数报文超时";
		case RECEIVE_BMS_CHARGINGFOR_TIMEOUT:
			return "接收BMS完成充电准备报文超时";
		case RECEIVE_BATTERY_STATUS_TIMEOUT:
			return "接收电池总状态报文超时";
		case RECEIVE_BATTERY_NEED_TIMEOUT:
			return "接收电池总需求报文超时";
		case RECEIVE_BMS_STOPCHARG_TIMEOUT:
			return "接收BMS中止充电报文超时";
		case RECEIVE_BMS_CHARGSTATISTICAL_TIMEOUT:
			return "接收BMS充电统计报文超时";
		case GET_BEM_STOP:
			return "收到bem报文停止";
		case GET_BST_STOP:
			return "收到bst报文停止";
		case GET_BSM_ERROSTOP:
			return "收到BSM报文错误停止";
		case BMS_TEMPERATUREEXCEPTION:
			return "bms温度过高异常";
		case SINGLEVOLTAGEEEXCEPTION:
			return "单体电压过高异常";
		case CURRENT_NEED_EXCEPTION:
			return "需求电流异常";
		case BST_SOC_TARGET:
			return "BST的SOC目标值";
		case BST_VOLYAGE_SETTINGVALUE:
			return "BST的电压设定值";
		case BST_VOLYAGE_FULL:
			return "BST单体电压满";
		case BST_00_6:
			return "BST_00_6";
		case BST_INSULATOR_BREAKDOWN:
			return "BST绝缘故障";
		case BST_CONNECTOR_OVER_TEMPERATURE:
			return "BST连接器过温";
		case BST_ORIGINAL_OVER_TEMPERATURE:
			return "BST元件过温";
		case BST_CONNECTOR_BREAKDOWN:
			return "BST连接器故障";
		case BST_BATTERY_OVER_TEMPERATURE:
			return "BST电池组过温";
		case BST_OTHER_BREAKDOWN:
			return "BST其他故障";
		case BST_02_4:
			return "BST_02_4";
		case BST_02_6:
			return "BST_02_6";
		case BST_OVERCURRENT:
			return "BST电流过大";
		case BST_OVERVOLYAGE:
			return "BST电压过大";
		case USER_SUSPEND:
			return "用户中止";
		case SYS_WARNING_1:
			return "系统警告1";
		case SYS_WARNING_2:
			return "系统警告2";
		case CC1_CONNECT_BREAK:
			return "CC1连接断开";
		case USER_SWIPINGCARD_STOP:
			return "用户刷卡停止";
		case EMERGENCY_SHUTDOWN:
			return "紧急停机";
		case PRETEATMENT_POWER_FAILURE:
			return "预处理加电失败";
		case INSULATOR_CHECK_EXCEPTION:
			return "绝缘检测异常";
		case CONTROL_COM_EXCEPTION:
			return "控制板通讯异常";
		case CHARGE_REACHE_SETVALUE:
			return "充电电量达到设定值";
		case CHARGE_TIME_SETVALUE:
			return "充电时间达到设定值";
		case CHARGE_AMOUNT_SETVALUE:
			return "充电金额达到设定值";
		case AMMETER_COM_EXCEPTION:
			return "电表通讯异常";
		case CHARGEAMOUNT_OVER_USERCARD:
			return "充电金额超过用户卡金额";
		case BACKGROUNDSYSTEMTERMINATION:
			return "后台终止";
		case SYS_WARNING_STOP:
			return "系统告警终止";
		case BACKGROUNDSYSTEMCOMMUNICATIONSTOP:
			return "后台通信终止";
		case CHARGE_VOLYAGE_EXCEPTION_STOP:
			return "充电电压异常中止";
		case CHARGE_CURRENT_EXCEPTION_STOP:
			return "充电电流异常中止";
		case BMS_SOC_FULL_STOP:
			return "BMS的SOC满中止";
		case METERPOWERINCREASEEXCEPTIONSTOP:
			return "电表电量异常增大终止";

			case METERPOWERSMALLEREXCEPTIONSTOP:
				return "电表电量异常变小终止";
			case VINMISMATCH:
				return "VIN不匹配";

			case ADMININTERFACESTOP:
				return "管理员界面终止";
			case SOFTWAREUPGRADE:
				return "软件升级";
			case CHARGESTARTTIMEOUT:
				return "充电启动超时";
			case BMSSINGLEBATTERYVOLTAGEEXCEPTION:
				return "BMS单体动力蓄电池电压异常";
			case BMSCARPOWERBATTERYSTATE:
				return "BMS整车动力蓄电池电荷状态";
			case BMSPOWERBATTERYCHARGEOVERCURRENT:
				return "BMS动力蓄电池充电过电流";
			case BMSPOWERBATTERYTEMPERATUREHIGHER:
				return "BMS动力蓄电池温度过高";
			case BMSPOWERBATTERYINSULATION:
				return "BMS动力蓄电池绝缘状态";
			case BMSBATTERYPACKOUTPUTCONNECTORSTATUS:
				return "BMS蓄电池组输出连接器状态";
			case CHARGEVOLTAGEEXCEEDMAXVALUEBMS:
				return "充电电压超过BMS最大允许值";
			case BMSOTHERSTATUSEXCEPTION:
				return "BMS其他状态异常";
			case BCSUPLOADVOLTAGEEXCEPTION:
				return "BCS上传电压异常";


			case OTHERSYSTEMFAULTS:
				return "系统其他故障";
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
			case SYSTEMAUXILIARYSOURCEPOWERDOWN:
				return "系统辅源掉电";
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
		case DISCONNECT:
			return "断开连接";
		case NOT_READY:
			return "未准备就绪";
		case CHARGE_OVERVOLTAGE:
			return "充电过压";
		case CHARGE_CURRENT_FLOW:
			return "充电过流";
		case CHARGE_UNDERVOLTAGE:
			return "充电欠压";
		case USER_SWINSCARD_STOPCHARGE:
			return "用户刷卡停止充电";

			case BACKGROUNDSYSTEMSTOP:
				return "后台停止";
			case CHARGETIMEREACHSETVALUE:
				return "充电时间达到设定值";
			case CHARGEAMOUNTREACHSETVALUE:
				return "充电金额达到设定值";
			case CHARGEDEGREETREACHSETVALUE:
				return "充电电量达到设定值";
			case SOFTWAREUPGRADESTOP:
				return "应用软件升级停止";
			case SYSTEMPOWEROFF:
				return "系统掉电停止";
			case UNKNOWNREASON:
				return "未知原因";
			case USERINTERFACESTOP:
				return "用户界面终止";
			case INSUFFICIENTAMOUNUT:
				return "金额不足";
			case BATTERYFULL:
				return "电池充满";
			case REACHUSERSETCHARGECONFITIONSTOP:
				return "达到用户设定充电条件停止";
		default:
			break;
		}
		return "";
	}



	public static String getStrFormBytes(int code, byte[] cmd_bytes) {
		switch (code) {
		case NORMAL_END:
		case RECEIVE_BMS_TIMEOUT:
		case RECEIVE_BATTERYCHARGE_PARAM_TIMEOUT:
		case RECEIVE_BMS_CHARGINGFOR_TIMEOUT:
		case RECEIVE_BATTERY_STATUS_TIMEOUT:
		case RECEIVE_BATTERY_NEED_TIMEOUT:
		case RECEIVE_BMS_STOPCHARG_TIMEOUT:
		case RECEIVE_BMS_CHARGSTATISTICAL_TIMEOUT:
		case GET_BEM_STOP:
		case GET_BST_STOP:
		case GET_BSM_ERROSTOP:
		case BMS_TEMPERATUREEXCEPTION:
		case SINGLEVOLTAGEEEXCEPTION:
		case CURRENT_NEED_EXCEPTION:
		case BST_SOC_TARGET:
		case BST_VOLYAGE_SETTINGVALUE:
		case BST_VOLYAGE_FULL:
		case BST_00_6:
		case BST_INSULATOR_BREAKDOWN:
		case BST_CONNECTOR_OVER_TEMPERATURE:
		case BST_ORIGINAL_OVER_TEMPERATURE:
		case BST_CONNECTOR_BREAKDOWN:
		case BST_BATTERY_OVER_TEMPERATURE:
		case BST_OTHER_BREAKDOWN:
		case BST_02_4:
		case BST_02_6:
		case BST_OVERCURRENT:
		case BST_OVERVOLYAGE:
		case USER_SUSPEND:
		case SYS_WARNING_1:
		case SYS_WARNING_2:
		case CC1_CONNECT_BREAK:
		case USER_SWIPINGCARD_STOP:
		case EMERGENCY_SHUTDOWN:
		case PRETEATMENT_POWER_FAILURE:
		case INSULATOR_CHECK_EXCEPTION:
		case CONTROL_COM_EXCEPTION:
		case CHARGE_REACHE_SETVALUE:
		case CHARGE_TIME_SETVALUE:
		case CHARGE_AMOUNT_SETVALUE:
		case AMMETER_COM_EXCEPTION:
		case CHARGEAMOUNT_OVER_USERCARD:
		case BACKGROUNDSYSTEMTERMINATION:
		case SYS_WARNING_STOP:
		case BACKGROUNDSYSTEMCOMMUNICATIONSTOP:
		case CHARGE_VOLYAGE_EXCEPTION_STOP:
		case CHARGE_CURRENT_EXCEPTION_STOP:
		case BMS_SOC_FULL_STOP:
		case METERPOWERINCREASEEXCEPTIONSTOP:
		case METERPOWERSMALLEREXCEPTIONSTOP:
		case VINMISMATCH:
		case ADMININTERFACESTOP:
		case SOFTWAREUPGRADE:
		case CHARGESTARTTIMEOUT:
		case BMSSINGLEBATTERYVOLTAGEEXCEPTION:
		case BMSCARPOWERBATTERYSTATE:
		case BMSPOWERBATTERYCHARGEOVERCURRENT:
		case BMSPOWERBATTERYTEMPERATUREHIGHER:
		case BMSPOWERBATTERYINSULATION:
		case BMSBATTERYPACKOUTPUTCONNECTORSTATUS:
		case CHARGEVOLTAGEEXCEEDMAXVALUEBMS:
		case BMSOTHERSTATUSEXCEPTION:
		case BCSUPLOADVOLTAGEEXCEPTION:
		case OTHERSYSTEMFAULTS:
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
		case SYSTEMAUXILIARYSOURCEPOWERDOWN:
		case DCOUTPUTOPENCIRCUIT:
		case AIRINLETOVERTEMPERATUREPROTECTION:
		case INLETAIRTEMPERATUREPROTECTION:
		case OUTLETTEMPERATUREPROTECTION:
		case GROUPCHARGEMODULEOVERTEMPERATURE:
		case THUNDER_BREAKDOWN:
		case ACCONTACTORABNORMAL:
		case DEEVEN_COM_WARNINGS:
		case CARD_READER_WARNINGS:
		case THUNDERMACHINE_BREAKDOWN:
		case SWITCH_FUSEIBLE_CUTOUT_BREAKDOWN:
		case EMERGENCY_SHUTDOWN_BREAKDOWN:
		case AMMETER1_COM_WARNINGS:
		case AMMETER2_COM_WARNINGS:
		case DISCONNECT:
		case NOT_READY:
		case CHARGE_OVERVOLTAGE:
		case CHARGE_CURRENT_FLOW:
		case CHARGE_UNDERVOLTAGE:
		case USER_SWINSCARD_STOPCHARGE:
		case BACKGROUNDSYSTEMSTOP:
		case CHARGETIMEREACHSETVALUE:
		case CHARGEAMOUNTREACHSETVALUE:
		case CHARGEDEGREETREACHSETVALUE:
		case SOFTWAREUPGRADESTOP:
		case SYSTEMPOWEROFF:
		case UNKNOWNREASON:
		case USERINTERFACESTOP:
		case INSUFFICIENTAMOUNUT:
		case BATTERYFULL:
		case REACHUSERSETCHARGECONFITIONSTOP:


			return SHUtility.bytesToSN(cmd_bytes);
		default:
			break;
		}
		return "";
	}
	
	
	
}
