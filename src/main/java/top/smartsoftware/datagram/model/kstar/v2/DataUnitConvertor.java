package top.smartsoftware.datagram.model.kstar.v2;




import top.smartsoftware.datagram.io.StreamReader;
import top.smartsoftware.datagram.util.ByteUtility;
import top.smartsoftware.datagram.util.ProtocolUtility;

import java.util.stream.IntStream;

/**
 * 单元数据转换
 */
public class DataUnitConvertor {


    public static RealTimeDataUnit realTimeDataUnit(StreamReader streamReader) {
        RealTimeDataUnit realTimeDataUnit = new RealTimeDataUnit();
        //获取数据单元个数
        int unitNum = streamReader.readInt16();
        //遍历数据单元
        IntStream.range(0, unitNum).boxed().forEach(
                i -> {
                    //判断标识,长度
                    String s = ByteUtility.toHexStringLittle(streamReader.readBytes(2), true);
                    int len = streamReader.readByte();
                    switch (s) {
                        case "0x0603":
                            realTimeDataUnit.setRatedCapacity(((float) streamReader.readUInt16()) / 10);
                            break;
                        case "0x0604":
                            realTimeDataUnit.setRatedTotalVoltage(((float) streamReader.readInt16()) / 10);
                            break;
                        case "0x0B01":
                            realTimeDataUnit.setStatus((int) streamReader.readUInt8());
                            break;
                        case "0x0B02":
                            realTimeDataUnit.setChargeCardNo(ByteUtility.fromASCII(streamReader.readBytes(20)));
                            break;
                        case "0x0B03":
                            realTimeDataUnit.setVin(ByteUtility.fromASCII(streamReader.readBytes(17)));
                            break;
                        case "0x0B04":
                            realTimeDataUnit.setEquimentChargeVoltage(((float) streamReader.readInt32()) / 10);
                            break;
                        case "0x0B05":
                            realTimeDataUnit.setEquimentChargeCurrent(((float) streamReader.readInt32()) / 100);
                            break;
                        case "0x0B06":
                            realTimeDataUnit.setChargeTime(streamReader.readInt32());
                            break;
                        case "0x0B07":
                            realTimeDataUnit.setChargeFee(((float) streamReader.readInt32()) / 100);
                            break;
                        case "0x0B08":
                            realTimeDataUnit.setChargePower(((float) streamReader.readInt32()) / 100);
                            break;
                        case "0x0B09":
                            realTimeDataUnit.setRemainTime((streamReader.readInt32()));
                            break;
                        case "0x0B0A":
                            realTimeDataUnit.setCurrentSoc((int) (streamReader.readUInt8()));
                            break;
                        case "0x0B0B":
                            realTimeDataUnit.setWarnInfo(ByteUtility.fromASCII(streamReader.readBytes(8)));
                            break;
                        case "0x0B0C":
                            realTimeDataUnit.setBalance(((float) streamReader.readUInt32()) / 100);
                            break;
                        case "0x0B0D":
                            realTimeDataUnit.setChargeType((int) streamReader.readUInt8());
                            break;
                        case "0x0B0E":
                            realTimeDataUnit.setChargeMethod((int) streamReader.readUInt8());
                            break;
                        case "0x0B0F":
                            realTimeDataUnit.setChargeMode((int) streamReader.readUInt8());
                            break;
                        case "0x0B10":
                            realTimeDataUnit.setVoltageDemand(((float) streamReader.readInt32()) / 10);
                            break;
                        case "0x0B11":
                            realTimeDataUnit.setCurrentDemand(((float) streamReader.readInt32()) / 10);
                            break;
                        case "0x0B12":
                            realTimeDataUnit.setLockStatus((int) streamReader.readUInt8());
                            break;
                        case "0x0B13":
                            realTimeDataUnit.setCurrentPowerValue(((float) streamReader.readUInt32()) / 1000);
                            break;
                        case "0x0B14":
                            realTimeDataUnit.setDCEquimentChargeVoltage(((float) streamReader.readUInt32()) / 10);
                            break;
                        case "0x0B15":
                            realTimeDataUnit.setDCEquimentChargeCurrent(((float) streamReader.readUInt32()) / 10);
                            break;
                        case "0x0B16":
                            realTimeDataUnit.setPilePositiveTemperature(((float) streamReader.readUInt16()) / 10);
                            break;
                        case "0x0B17":
                            realTimeDataUnit.setPileNagetiveTemperature(((float) streamReader.readUInt16()) / 10);
                            break;
                        case "0x0B18":
                            realTimeDataUnit.setsBatteryAllowMaxChargeVoltage(((float) streamReader.readUInt16()) / 10);
                            break;
                        case "0x0B19":
                            realTimeDataUnit.setBatteryTotalEnergy(((float) streamReader.readUInt16()) / 10);
                            break;
                        case "0x0B1A":
                            realTimeDataUnit.setPowerBatterySoc(((float) streamReader.readUInt16()) / 10);
                            break;
                        case "0x0B1B":
                            realTimeDataUnit.setBatteryChargeMode((int) streamReader.readUInt8());
                            break;
                        case "0x0B1C":
                            realTimeDataUnit.setAllowCharge((int) streamReader.readUInt8());
                            break;
                        case "0x0B1D":
                            realTimeDataUnit.setAllowMaxChargeVoltage(((float) streamReader.readUInt32()) / 10);
                            break;
                        case "0x0B1E":
                            realTimeDataUnit.setAllowMaxChargeCurrent(((float) streamReader.readUInt32()) / 10);
                            break;
                        case "0x0B1F":
                            realTimeDataUnit.setPowerBatteryVoltage(((float) streamReader.readUInt32()) / 10);
                            break;
                        case "0x0B20":
                            realTimeDataUnit.setsBatteryMaxVoltage(((float) streamReader.readUInt32()) / 100);
                            break;
                        case "0x0B21":
                            realTimeDataUnit.setsBatteryMinVoltage(((float) streamReader.readUInt32()) / 100);
                            break;
                        case "0x0B22":
                            realTimeDataUnit.setsBatteryMaxTemperature(((float) streamReader.readUInt32()) / 10);
                        case "0x0B23":
                            realTimeDataUnit.setsBatteryMinTemperature(((float) streamReader.readUInt32()) / 10);
                            break;
                        case "0x0B50":
                            realTimeDataUnit.setEquimentTemperature(((float) streamReader.readUInt32()) / 10);
                            break;
                        case "0x0B51":
                            realTimeDataUnit.setOrderNo(ProtocolUtility.bytesToASCII(streamReader.readBytes(20)));
                            break;
                        case "0x9010":
                            realTimeDataUnit.setChargeStartTime(ByteUtility.fromBCDToKsdChargeTime(streamReader.readBytes(7)));
                            break;
                        case "0x9011":
                            realTimeDataUnit.setChargeMethod02((int) streamReader.readUInt8());
                            break;
                        case "0x9012":
                            realTimeDataUnit.setServiceFee(((float) streamReader.readUInt32()) / 100);
                            break;
                    }
                }
        );
        return realTimeDataUnit;
    }

    public static WarnDataUnit warnDataUnit(StreamReader streamReader) {
        WarnDataUnit warnDataUnit = new WarnDataUnit();
        //获取数据单元个数
        int unitNum = streamReader.readInt16();
        //遍历数据单元
        IntStream.range(0, unitNum).boxed().forEach(
                i -> {
                    //判断标识,长度
                    String s = ByteUtility.toHexStringLittle(streamReader.readBytes(2), true);
                    int len = streamReader.readByte();
                    switch (s) {
                        case "0x0201":
                            warnDataUnit.setWarnPoint(streamReader.readInt32());
                            break;
                        case "0x0202":
                            warnDataUnit.setWarnReason(streamReader.readInt32());
                            break;
                        case "0x0203":
                            warnDataUnit.setWarnStartTime(ByteUtility.fromBCDToKsdChargeTime(streamReader.readBytes(7)));
                            break;
                        case "0x0204":
                            warnDataUnit.setWarnEndTime(ByteUtility.fromBCDToKsdChargeTime(streamReader.readBytes(7)));
                            break;
                        case "0x0205":
                            warnDataUnit.setDuration(streamReader.readInt32());
                            break;
                        case "0x0206":
                            warnDataUnit.setIsAffectCharge((int) streamReader.readUInt8());
                            break;
                        case "0x0207":
                            warnDataUnit.setIsUploadMainStation((int) streamReader.readUInt8());
                            break;
                        case "0x0208":
                            warnDataUnit.setRecordStoreNo((int) streamReader.readUInt32());
                            break;
                        case "0x0209":
                            warnDataUnit.setRecordStoreNo02((int) streamReader.readUInt32());
                            break;
                        case "0x020A":
                            warnDataUnit.setIsRecoveryOrHappen((int) streamReader.readUInt8());
                            break;
                    }
                }
        );
        return warnDataUnit;
    }

    public static HistoryDataUnit historyDataUnit(StreamReader streamReader) {
        HistoryDataUnit historyDataUnit = new HistoryDataUnit();
        //获取数据单元个数
        int unitNum = streamReader.readInt16();
        //遍历数据单元
        IntStream.range(0, unitNum).boxed().forEach(
                i -> {
                    //判断标识,长度
                    String s = ByteUtility.toHexStringLittle(streamReader.readBytes(2), true);
                    int len = streamReader.readByte();
                    switch (s) {
                        case "0x0101":
                            historyDataUnit.setChargeMethod((int) streamReader.readByte());
                            break;
                        case "0x0102":
                            historyDataUnit.setChargeMode((int) streamReader.readByte());
                            break;
                        case "0x0103":
                            byte[] a = new byte[1];
                            a[0] = streamReader.readByte();
                            historyDataUnit.setChargeType(ByteUtility.toHexString(a, true));
                            break;
                        case "0x0104":
                            historyDataUnit.setChargeCardNo(ByteUtility.fromASCII(streamReader.readBytes(20)));
                            break;
                        case "0x0105":
                            historyDataUnit.setVin(ByteUtility.fromASCII(streamReader.readBytes(17)));
                            break;
                        case "0x0106":
                            historyDataUnit.setBalanceBeforeCharge(((float) streamReader.readUInt32()) / 100);
                            break;
                        case "0x0107":
                            historyDataUnit.setChargeVoltage(((float) streamReader.readUInt32()) / 10);
                            break;
                        case "0x0108":
                            historyDataUnit.setChargeCurrent(((float) streamReader.readUInt32()) / 10);
                            break;
                        case "0x0109":
                            historyDataUnit.setChargeTime((streamReader.readInt32()));
                            break;
                        case "0x010A":
                            historyDataUnit.setChargeFee(((float) streamReader.readUInt32()) / 100);
                            break;
                        case "0x010B":
                            historyDataUnit.setChargePower(((float) streamReader.readUInt32()) / 100);
                            break;
                        case "0x010C":
                            historyDataUnit.setChargeStartPower(((float) streamReader.readUInt32()) / 100);
                            break;
                        case "0x010D":
                            historyDataUnit.setChargeEndPower(((float) streamReader.readUInt32()) / 100);
                            break;
                        case "0x010E":
                            historyDataUnit.setRemainTime(streamReader.readInt32());
                            break;
                        case "0x010F":
                            historyDataUnit.setCurrentSoc((int) streamReader.readUInt8());
                            break;
                        case "0x0110":
                            historyDataUnit.setIsUploadMainStation((int) streamReader.readUInt8());
                            break;
                        case "0x0111":
                            historyDataUnit.setIsPay((int) streamReader.readUInt8());
                            break;
                        case "0x0112":
                            historyDataUnit.setChargeAbortReason((int) streamReader.readUInt8());
                            break;
                        case "0x0113":
                            //historyDataUnit.setChargeStartTime(ByteUtility.fromBCD(streamReader.readBytes(7)));
                            historyDataUnit.setChargeStartTime(ByteUtility.fromBCDToKsdChargeTime(streamReader.readBytes(7)));
                            break;
                        case "0x0114":
                            //historyDataUnit.setChargeEndTime(ByteUtility.fromBCD(streamReader.readBytes(7)));
                            historyDataUnit.setChargeEndTime(ByteUtility.fromBCDToKsdChargeTime(streamReader.readBytes(7)));
                            break;
                        case "0x0115":
                            historyDataUnit.setRecordTraceNo(streamReader.readInt32());
                            break;
                        case "0x0116":
                            historyDataUnit.setRecordTraceNo(streamReader.readInt32());
                            break;
                        case "0x0117":
                            historyDataUnit.setPhase1ChargePower(((float) streamReader.readUInt32()) / 1000);
                            historyDataUnit.setPhase1ChargeFee(((float) streamReader.readUInt32()) / 100);
                            historyDataUnit.setPhase2ChargePower(((float) streamReader.readUInt32()) / 1000);
                            historyDataUnit.setPhase2ChargeFee(((float) streamReader.readUInt32()) / 100);
                            historyDataUnit.setPhase3ChargePower(((float) streamReader.readUInt32()) / 1000);
                            historyDataUnit.setPhase3ChargeFee(((float) streamReader.readUInt32()) / 100);
                            historyDataUnit.setPhase4ChargePower(((float) streamReader.readUInt32()) / 1000);
                            historyDataUnit.setPhase4ChargeFee(((float) streamReader.readUInt32()) / 100);
                            historyDataUnit.setPhase5ChargePower(((float) streamReader.readUInt32()) / 1000);
                            historyDataUnit.setPhase5ChargeFee(((float) streamReader.readUInt32()) / 100);
                            historyDataUnit.setPhase6ChargePower(((float) streamReader.readUInt32()) / 1000);
                            historyDataUnit.setPhase6ChargeFee(((float) streamReader.readUInt32()) / 100);
                            historyDataUnit.setPhase7ChargePower(((float) streamReader.readUInt32()) / 1000);
                            historyDataUnit.setPhase7ChargeFee(((float) streamReader.readUInt32()) / 100);
                            historyDataUnit.setPhase8ChargePower(((float) streamReader.readUInt32()) / 1000);
                            historyDataUnit.setPhase8ChargeFee(((float) streamReader.readUInt32()) / 100);
                            historyDataUnit.setPhase9ChargePower(((float) streamReader.readUInt32()) / 1000);
                            historyDataUnit.setPhase9ChargeFee(((float) streamReader.readUInt32()) / 100);
                            historyDataUnit.setPhase10ChargePower(((float) streamReader.readUInt32()) / 1000);
                            historyDataUnit.setPhase10ChargeFee(((float) streamReader.readUInt32()) / 100);
                            break;
                        case "0x0118":
                            historyDataUnit.setSocBeforeCharge((int) streamReader.readUInt8());
                            break;
                        case "0x0119":
                            historyDataUnit.setChargeServiceFee(((float) streamReader.readUInt32()) / 100);
                            break;
                        case "0x011A":
                            historyDataUnit.setOrderNo(ProtocolUtility.bytesToASCII(streamReader.readBytes(20)));
                            break;
                        case "0x011B":
                            historyDataUnit.setPlateformBootChargeMthod((int) streamReader.readUInt8());
                            break;
                    }
                }
        );
        return historyDataUnit;
    }

    public static RateDataUnit rateDataUnit(StreamReader streamReader) {
        RateDataUnit rateDataUnit = new RateDataUnit();
        //获取数据单元个数
        int unitNum = streamReader.readInt16();
        //遍历数据单元
        IntStream.range(0, unitNum).boxed().forEach(
                i -> {
                    //判断标识,长度
                    int flag = streamReader.readUInt16();
                    streamReader.readByte();
                    switch (flag) {
                        case 0x0015:
                        case 0x0016:
                        case 0x0017:
                        case 0x0018:
                        case 0x0019:
                        case 0x001A:
                        case 0x001B:
                        case 0x001C:
                        case 0x001D:
                        case 0x001E:
                            rateDataUnit.addEleFee(streamReader.readInt32());
                            break;
                        case 0x001F:
                        case 0x0020:
                        case 0x0021:
                        case 0x0022:
                        case 0x0023:
                        case 0x0024:
                        case 0x0025:
                        case 0x0026:
                        case 0x0027:
                        case 0x0028:
                            rateDataUnit.addTime(streamReader.readUInt16());
                            break;
                    }
                }
        );
        return rateDataUnit;
    }
}
