package top.smartsoftware.datagram.model.shenghong.v28.code;


import top.smartsoftware.datagram.io.StreamReader;
import top.smartsoftware.datagram.config.SHPacketConst;

/**
 * 后台服务器向充电桩下发充电桩整形工作参数命令
 */
public class IntParamAddr {
	/** 签到时间间隔 */
	public static final int SIGN_TIME_INTERVAL = 1;
	/** 充电桩项目类型 */
	public static final int PILE_ITEM_TYPE = 2;
	/** 充电枪个数 */
	public static final int PLUG_NO = 3;
	/** 通道号 */
	public static final int CHANEL_NUM = 4;
	/** 最高充电电压 */
	public static final int CHARGE_VOLTAGE_MAC = 5;
	/** 最高充电电流 */
	public static final int CHARGE_CURRENT_MAC = 6;
	/** 读卡器类型 */
	public static final int CARD_READER_TYPE = 7;
	/** 读卡器波特率 */
	public static final int CARD_READER_BANDRATE = 8;
	/** 充电卡片协议编号 */
	public static final int CHARGECARD_AGREEMENTNUM = 9;
	/** 后台验证 */
	public static final int BACKGROUND_VERIFICATION = 10;
	/** 车牌验证 */
	public static final int PLATENUM_VERIFICATION = 11;
	/** 车卡VIN绑定 */
	public static final int CARCARD_VIN_BINDING = 12;
	/** BMS单体保护电压 */
	public static final int BMS_MONOMERP_PROTECTIVR_VOLTAGE = 13;
	/** BMS单体保护温度 */
	public static final int BMS_MONOMERP_PROTECTIVR_TEMPERATURE = 14;
	/** 调试地址1 */
	public static final int DEBUG_ADDRESS_1 = 15;
	/** 调试地址2 */
	public static final int DEBUG_ADDRESS_2 = 16;
	/** 调试地址3 */
	public static final int DEBUG_ADDRESS_3 = 17;
	/** 调试地址4 */
	public static final int DEBUG_ADDRESS_4 = 18;
	/** 调试地址5 */
	public static final int DEBUG_ADDRESS_5 = 19;
	/** 定时上报间隔 */
	public static final int TIMING_INTERVAL = 20;
	/** 心跳上报周期 */
	public static final int HEARTBEAT_REPORT_PERIOD = 21;
	/** 心跳包检测超时次数 */
	public static final int HEARTBEAT_PACHKET_TIMEOUT = 22;
	/** 充电桩状态信息报上报周期 */
	public static final int PILE_STATUSINFO_REPORT = 23;
	/** 通信模式 */
	public static final int COMMUNICATION_MODE = 24;
	/** 中心服务器地址 */
	public static final int CENTRAL_SERVER_ADDRESS = 25;
	/** 中心服务器端口 */
	public static final int CENTRAL_SERVER_PORT = 26;
	/** 服务费价格 */
	public static final int SERVICE_CHARGE = 27;
	/** 全时段电费费率 */
	public static final int HOURLY_RATES = 28;
	/** 广告灯开启起始小时 */
	public static final int ADVERTISING_LIGHTS_HOUR = 29;
	/** 广告灯开启起始分钟 */
	public static final int ADVERTISING_LIGHTS_MINUTE = 30;
	/** 广告灯开启起始小时 */
	public static final int ADVERTISING_CLOSE_HOUR = 31;
	/** 广告灯开启起始分钟 */
	public static final int ADVERTISING_CLOSE_MINUTE = 32;
	/** 调试控制地址 */
	public static final int DEBUG_CONTROL_ADDRESS = 33;
	/** 调试控制数据 */
	public static final int ADVERTISING_CLOSE_DATE = 34;

	/** 过压值 */
	public static final int OVERVOLTAGE = 35;
	/** 欠压值 */
	public static final int UNDEROVERVOLTAGE = 36;
	/**过流值 */
	public static final int OVERCURRENTVALUE = 37;
	/**辅源类型*/
	public static final int SUPPLEMENTARY_SOURCE_TYPE = 39;
	/**充电枪类型*/
	public static final int PLUG_TYPE = 40;
	/**控制板软件版本*/
	public static final int CONTROL_BOARD_SOFTWARE_VERSION = 41;
	/**采集板软件版本*/
	public static final int COLLECTOR_BOARD_SOFTWARE_VERSION = 42;
	/**模块类型*/
	public static final int MODULE_TYPE = 43;
	/**组号*/
	public static final int CROUP_NO= 44;
	/**地址*/
	public static final int ADDRESS = 45;
	/**最大组号*/
	public static final int MAX_GROUP_NO = 46;
	/**最大地址*/
	public static final int MAX_ADDRESS = 47;
	/**双充模式*/
	public static final int DOUBLE_CHARGE_MODE = 48;
	/**界面类型*/
	public static final int INTERFACE_TYPE = 49;
	/**预留IO类型*/
	public static final int RESERVED_IO_TYPE = 50;
	/**环境低温值*/
	public static final int LOW_AMBIENT_TEMPERATURE = 51;
	/**群充模块数量*/
	public static final int GROUP_CHARGE_MODULE_QUANTITY = 52;
	/**指示灯类型*/
	public static final int INDICATOR_TYPE = 53;
	/**电表类型*/
	public static final int METER_TYPE = 54;
	/**充电卡类型*/
	public static final int CHARGE_CARD_TYPE = 55;
	/**CAN3外部通信地址*/
	public static final int CAN3_EXTERNAL_COMMUNICATION_ADDRESS = 56;
	/**BMS类型*/
	public static final int BMS_TYPE = 57;
	/**充电卡后台验证*/
	public static final int CHARGE_CARD_BACKGROUND_VERIFICATION = 58;
	/**认证方式*/
	public static final int VERIFICATION_METHOD = 59;
	/**充电限电压*/
	public static final int CHARGE_LIMIT_VOLTAGE = 60;
	/**充电限电流*/
	public static final int CHARGE_LIMIT_CURRENT = 61;
	/**快充段起始小时*/
	public static final int FAST_CHARGE_START_HOUR = 62;
	/**快充段起始分钟*/
	public static final int FAST_CHARGE_START_MINUTE = 63;
	/**快充段结束小时*/
	public static final int FAST_CHARGE_END_HOUR = 64;
	/**快充段结束分钟*/
	public static final int FAST_CHARGE_END_MINUTE = 65;
	/**状态A和状态B*/
	public static final int STATUS_A_STATUS_B= 66;
	/**模块电压*/
	public static final int MODULE_VOLTAGE= 67;
	/**绝缘正电压*/
	public static final int INSULATION_POSITIVE_VOLTAGE= 68;
	/**绝缘负电压*/
	public static final int INSULATION_NEGATIVE_VOLTAGE= 69;
	/**绝缘阻抗*/
	public static final int INSULATION_RESISTANCE= 70;
	/**枪正端温度保护*/
	public static final int PULG_POSITIVE_TEMPERATURE_PROTECTION= 71;
	/**枪负端温度保护*/
	public static final int PULG_NEGATIVE_TEMPERATURE_PROTECTION= 72;
	/**模块数量*/
	public static final int MODULE_NUM= 73;
	/**电表电能*/
	public static final int METER_POWER= 74;
	/**后台支持计费优惠功能*/
	public static final int BACK_SUPPORT_BILLING_FEATURES= 75;
	/**环境过温保护*/
	public static final int ENVIROMENTAL_OVER_TEMPERATURE_PROTECTION= 76;








	public static String getCharCause(int code) {
		switch (code) {
		case SIGN_TIME_INTERVAL:
			return "签到时间间隔";
		case PILE_ITEM_TYPE:
			return "充电桩项目类型";
		case PLUG_NO:
			return "充电枪个数";
		case CHANEL_NUM:
			return "通道号";
		case CHARGE_VOLTAGE_MAC:
			return "最高充电电压";
		case CHARGE_CURRENT_MAC:
			return "最高充电电流";
		case CARD_READER_TYPE:
			return "读卡器类型";
		case CARD_READER_BANDRATE:
			return "读卡器波特率";
		case CHARGECARD_AGREEMENTNUM:
			return "充电卡片协议编号";
		case BACKGROUND_VERIFICATION:
			return "后台验证";
		case PLATENUM_VERIFICATION:
			return "车牌验证";
		case CARCARD_VIN_BINDING:
			return "车卡VIN绑定";
		case BMS_MONOMERP_PROTECTIVR_VOLTAGE:
			return "BMS单体保护电压";
		case BMS_MONOMERP_PROTECTIVR_TEMPERATURE:
			return "BMS单体保护温度";
		case DEBUG_ADDRESS_1:
			return "调试地址1";
		case DEBUG_ADDRESS_2:
			return "调试地址2";
		case DEBUG_ADDRESS_3:
			return "调试地址3";
		case DEBUG_ADDRESS_4:
			return "调试地址4";
		case DEBUG_ADDRESS_5:
			return "调试地址5";
		case TIMING_INTERVAL:
			return "定时上报间隔";
		case HEARTBEAT_REPORT_PERIOD:
			return "心跳上报周期";
		case HEARTBEAT_PACHKET_TIMEOUT:
			return "心跳包检测超时次数";
		case PILE_STATUSINFO_REPORT:
			return "充电桩状态信息报上报周期";
		case COMMUNICATION_MODE:
			return "通信模式";
		case CENTRAL_SERVER_ADDRESS:
			return "中心服务器地址";
		case CENTRAL_SERVER_PORT:
			return "中心服务器端口";
		case SERVICE_CHARGE:
			return "服务费价格";
		case HOURLY_RATES:
			return "全时段电费费率";
		case ADVERTISING_LIGHTS_HOUR:
			return "广告灯开启起始小时";
		case ADVERTISING_LIGHTS_MINUTE:
			return "广告灯开启起始分钟";
		case ADVERTISING_CLOSE_HOUR:
			return "广告灯开启起始小时";
		case ADVERTISING_CLOSE_MINUTE:
			return "广告灯开启起始分钟";
		case DEBUG_CONTROL_ADDRESS:
			return "调试控制地址";
		case ADVERTISING_CLOSE_DATE:
			return "调试控制数据";
		case OVERVOLTAGE:
			return "过压值";
		case UNDEROVERVOLTAGE:
			return "欠压值";
		case OVERCURRENTVALUE:
			return "过流值";
		case SUPPLEMENTARY_SOURCE_TYPE:
			return "辅源类型";
		case PLUG_TYPE:
			return "充电枪类型";
		case CONTROL_BOARD_SOFTWARE_VERSION:
			return "控制板软件版本";
		case COLLECTOR_BOARD_SOFTWARE_VERSION:
			return "采集板软件版本";
		case MODULE_TYPE:
			return "模块类型";
		case CROUP_NO:
			return "组号	";
		case ADDRESS:
			return "地址";
		case MAX_GROUP_NO:
			return "最大组号";
		case MAX_ADDRESS:
			return "最大地址";
		case DOUBLE_CHARGE_MODE:
			return "双充模式";
		case INTERFACE_TYPE:
			return "界面类型";
		case RESERVED_IO_TYPE:
			return "预留IO类型";
		case LOW_AMBIENT_TEMPERATURE:
			return "环境低温值";
		case GROUP_CHARGE_MODULE_QUANTITY:
			return "群充模块数量";
		case INDICATOR_TYPE:
			return "指示灯类型";
		case METER_TYPE:
			return "电表类型";
		case CHARGE_CARD_TYPE:
			return "充电卡类型";
		case CAN3_EXTERNAL_COMMUNICATION_ADDRESS:
			return "CAN3外部通信地址";
		case BMS_TYPE:
			return "BMS类型";
		case CHARGE_CARD_BACKGROUND_VERIFICATION:
			return "充电卡后台验证";
		case VERIFICATION_METHOD:
			return "认证方式";
		case CHARGE_LIMIT_VOLTAGE:
			return "充电限电压";
		case CHARGE_LIMIT_CURRENT:
			return "充电限电流";
		case FAST_CHARGE_START_HOUR:
			return "快充段起始小时";
		case FAST_CHARGE_START_MINUTE:
			return "快充段起始分钟";
		case FAST_CHARGE_END_HOUR:
			return "快充段结束小时";
		case FAST_CHARGE_END_MINUTE:
			return "快充段结束分钟";
		case STATUS_A_STATUS_B:
			return "状态A和状态B";
		case MODULE_VOLTAGE:
			return "模块电压";
		case INSULATION_POSITIVE_VOLTAGE:
			return "绝缘正电压";
		case INSULATION_NEGATIVE_VOLTAGE:
			return "绝缘负电压";
		case INSULATION_RESISTANCE:
			return "绝缘阻抗";
		case PULG_POSITIVE_TEMPERATURE_PROTECTION:
			return "枪正端温度保护";
		case PULG_NEGATIVE_TEMPERATURE_PROTECTION:
			return "枪负端温度保护";
		case MODULE_NUM:
			return "模块数量";
		case METER_POWER:
			return "电表电能";
		case BACK_SUPPORT_BILLING_FEATURES:
			return "后台支持计费优惠功能";
		case ENVIROMENTAL_OVER_TEMPERATURE_PROTECTION:
			return "环境过温保护";

		default:
			break;
		}
		return "";
	}

	public static String getStrFormBytes(int code, short cmd_byte_count, byte[] cmd_bytes) {
		StreamReader reader = new StreamReader(cmd_bytes);
		reader.order(SHPacketConst._byteOrder);
		int num = cmd_byte_count/4;
		String temp = "";
		for (int i = 0; i < num; i++) {
			code = code + i;
			switch (code) {
			case SIGN_TIME_INTERVAL:
			case PILE_ITEM_TYPE:
			case PLUG_NO:
			case CHANEL_NUM:
			case CHARGE_VOLTAGE_MAC:
			case CHARGE_CURRENT_MAC:
			case CARD_READER_TYPE:
			case CARD_READER_BANDRATE:
			case CHARGECARD_AGREEMENTNUM:
			case BACKGROUND_VERIFICATION:
			case PLATENUM_VERIFICATION:
			case CARCARD_VIN_BINDING:
			case BMS_MONOMERP_PROTECTIVR_VOLTAGE:
			case BMS_MONOMERP_PROTECTIVR_TEMPERATURE:
			case DEBUG_ADDRESS_1:
			case DEBUG_ADDRESS_2:
			case DEBUG_ADDRESS_3:
			case DEBUG_ADDRESS_4:
			case DEBUG_ADDRESS_5:
			case TIMING_INTERVAL:
			case HEARTBEAT_REPORT_PERIOD:
			case HEARTBEAT_PACHKET_TIMEOUT:
			case PILE_STATUSINFO_REPORT:
			case COMMUNICATION_MODE:
			case CENTRAL_SERVER_ADDRESS:
			case CENTRAL_SERVER_PORT:
			case SERVICE_CHARGE:
			case HOURLY_RATES:
			case ADVERTISING_LIGHTS_HOUR:
			case ADVERTISING_LIGHTS_MINUTE:
			case ADVERTISING_CLOSE_HOUR:
			case ADVERTISING_CLOSE_MINUTE:
			case DEBUG_CONTROL_ADDRESS:
			case ADVERTISING_CLOSE_DATE:
			case OVERVOLTAGE:
			case UNDEROVERVOLTAGE:
			case OVERCURRENTVALUE:
			case SUPPLEMENTARY_SOURCE_TYPE:
			case PLUG_TYPE:
			case CONTROL_BOARD_SOFTWARE_VERSION:
			case COLLECTOR_BOARD_SOFTWARE_VERSION:
			case MODULE_TYPE:
			case CROUP_NO:
			case ADDRESS:
			case MAX_GROUP_NO:
			case MAX_ADDRESS:
			case DOUBLE_CHARGE_MODE:
			case INTERFACE_TYPE:
			case RESERVED_IO_TYPE:
			case LOW_AMBIENT_TEMPERATURE:
			case GROUP_CHARGE_MODULE_QUANTITY:
			case INDICATOR_TYPE:
			case METER_TYPE:
			case CHARGE_CARD_TYPE:
			case CAN3_EXTERNAL_COMMUNICATION_ADDRESS:
			case BMS_TYPE:
			case CHARGE_CARD_BACKGROUND_VERIFICATION:
			case VERIFICATION_METHOD:
			case CHARGE_LIMIT_VOLTAGE:
			case CHARGE_LIMIT_CURRENT:
			case FAST_CHARGE_START_HOUR:
			case FAST_CHARGE_START_MINUTE:
			case FAST_CHARGE_END_HOUR:
			case FAST_CHARGE_END_MINUTE:
			case STATUS_A_STATUS_B:
			case MODULE_VOLTAGE:
			case INSULATION_POSITIVE_VOLTAGE:
			case INSULATION_NEGATIVE_VOLTAGE:
			case INSULATION_RESISTANCE:
			case PULG_POSITIVE_TEMPERATURE_PROTECTION:
			case PULG_NEGATIVE_TEMPERATURE_PROTECTION:
			case MODULE_NUM:
			case METER_POWER:
			case BACK_SUPPORT_BILLING_FEATURES:
			case ENVIROMENTAL_OVER_TEMPERATURE_PROTECTION:

				temp = temp + reader.readInt32() + ",";
			default:
				break;
			}
		}
		return temp;
	}

}
