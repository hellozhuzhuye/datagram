package top.smartsoftware.datagram.model.kstar.v1;

public class RealTimeDataUnit {

    //整车蓄电池组额定容量
    private Float ratedCapacity;
    //蓄电池组额定总电压
    private Float ratedTotalVoltage;
    //设备状态
    private Integer status;
    //充电卡号
    private String chargeCardNo;
    //vin
    private String vin;
    //充电电压(桩端电表读数)
    private Float equimentChargeVoltage;
    //充电电流(桩端电表读数)
    private Float equimentChargeCurrent;
    //充电时间 秒
    private Integer chargeTime;
    //充电金额
    private Float chargeFee;
    //充电电能
    private Float chargePower;
    //剩余时间
    private Integer remainTime;
    //当前SOC
    private Integer currentSoc;
    //告警信息
    private String warnInfo;
    //充电卡余额
    private Float balance;
    //充电类型
    private Integer chargeType;
    //充电方式
    private Integer chargeMethod;
    //充电模式
    private Integer chargeMode;
    //电压需求
    private Float voltageDemand;
    //电压需求
    private Float currentDemand;
    //车位锁状态
    private Integer lockStatus;
    //当前电能表读数单
    private Float currentPowerValue;
    //充电电压 (直流桩充电模块输出充电电压)
    private Float DCEquimentChargeVoltage;
    //充电电流(直流桩充电模块输出充电电流)
    private Float DCEquimentChargeCurrent;
    //枪正极温度
    private Float pilePositiveTemperature;
    //枪负极温度
    private Float pileNagetiveTemperature;
    //单体动力蓄电池最高允许充电电压
    private Float sBatteryAllowMaxChargeVoltage;
    //动力蓄电池标称总能量
    private Float batteryTotalEnergy;
    //整车动力蓄电池荷电状态(充电前SOC)
    private Float powerBatterySoc;
    //电池充电模式
    private Integer batteryChargeMode;
    //电池允许充电
    private Integer allowCharge;
    //最高允许充电总电压
    private Float allowMaxChargeVoltage;
    //最高允许充电电流
    private Float allowMaxChargeCurrent;
    //整车动力蓄电池当前电池电压
    private Float powerBatteryVoltage;
    //电池单体最高电压
    private Float sBatteryMaxVoltage;
    //电池单体最低电压
    private Float sBatteryMinVoltage;
    //电池单体最高温度
    private Float sBatteryMaxTemperature;
    //电池单体最高温度
    private Float sBatteryMinTemperature;
    //充电桩温度
    private Float equimentTemperature;
    //订单号
    private String orderNo;
    //充电开始时间 BCD
    private String chargeStartTime;
    //充电方式 同启动充电帧
    private Integer chargeMethod02;
    //充电过程服务费
    private Float serviceFee;

    public Float getRatedCapacity() {
        return ratedCapacity;
    }

    public void setRatedCapacity(Float ratedCapacity) {
        this.ratedCapacity = ratedCapacity;
    }

    public Float getRatedTotalVoltage() {
        return ratedTotalVoltage;
    }

    public void setRatedTotalVoltage(Float ratedVoltage) {
        this.ratedTotalVoltage = ratedVoltage;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getChargeCardNo() {
        return chargeCardNo;
    }

    public void setChargeCardNo(String chargeCardNo) {
        this.chargeCardNo = chargeCardNo;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Float getEquimentChargeVoltage() {
        return equimentChargeVoltage;
    }

    public void setEquimentChargeVoltage(Float equimentChargeVoltage) {
        this.equimentChargeVoltage = equimentChargeVoltage;
    }

    public Float getCurrentDemand() {
        return currentDemand;
    }

    public void setCurrentDemand(Float currentDemand) {
        this.currentDemand = currentDemand;
    }

    public Float getEquimentChargeCurrent() {
        return equimentChargeCurrent;
    }

    public void setEquimentChargeCurrent(Float equimentChargeCurrent) {
        this.equimentChargeCurrent = equimentChargeCurrent;
    }

    public Integer getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(Integer chargeTime) {
        this.chargeTime = chargeTime;
    }

    public Float getChargeFee() {
        return chargeFee;
    }

    public void setChargeFee(Float chargeFee) {
        this.chargeFee = chargeFee;
    }

    public Float getChargePower() {
        return chargePower;
    }

    public void setChargePower(Float chargePower) {
        this.chargePower = chargePower;
    }

    public Integer getRemainTime() {
        return remainTime;
    }

    public void setRemainTime(Integer remainTime) {
        this.remainTime = remainTime;
    }

    public Integer getCurrentSoc() {
        return currentSoc;
    }

    public void setCurrentSoc(Integer currentSoc) {
        this.currentSoc = currentSoc;
    }

    public String getWarnInfo() {
        return warnInfo;
    }

    public void setWarnInfo(String warnInfo) {
        this.warnInfo = warnInfo;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getChargeMethod() {
        return chargeMethod;
    }

    public void setChargeMethod(Integer chargeMethod) {
        this.chargeMethod = chargeMethod;
    }

    public Integer getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
    }

    public Float getVoltageDemand() {
        return voltageDemand;
    }

    public void setVoltageDemand(Float voltageDemand) {
        this.voltageDemand = voltageDemand;
    }

    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }

    public Float getCurrentPowerValue() {
        return currentPowerValue;
    }

    public void setCurrentPowerValue(Float currentPowerValue) {
        this.currentPowerValue = currentPowerValue;
    }

    public Float getDCEquimentChargeVoltage() {
        return DCEquimentChargeVoltage;
    }

    public void setDCEquimentChargeVoltage(Float DCEquimentChargeVoltage) {
        this.DCEquimentChargeVoltage = DCEquimentChargeVoltage;
    }

    public Float getDCEquimentChargeCurrent() {
        return DCEquimentChargeCurrent;
    }

    public void setDCEquimentChargeCurrent(Float DCEquimentChargeCurrent) {
        this.DCEquimentChargeCurrent = DCEquimentChargeCurrent;
    }

    public Float getPilePositiveTemperature() {
        return pilePositiveTemperature;
    }

    public void setPilePositiveTemperature(Float pilePositiveTemperature) {
        this.pilePositiveTemperature = pilePositiveTemperature;
    }

    public Float getPileNagetiveTemperature() {
        return pileNagetiveTemperature;
    }

    public void setPileNagetiveTemperature(Float pileNagetiveTemperature) {
        this.pileNagetiveTemperature = pileNagetiveTemperature;
    }

    public Float getsBatteryAllowMaxChargeVoltage() {
        return sBatteryAllowMaxChargeVoltage;
    }

    public void setsBatteryAllowMaxChargeVoltage(Float sBatteryAllowMaxChargeVoltage) {
        this.sBatteryAllowMaxChargeVoltage = sBatteryAllowMaxChargeVoltage;
    }

    public Float getBatteryTotalEnergy() {
        return batteryTotalEnergy;
    }

    public void setBatteryTotalEnergy(Float batteryTotalEnergy) {
        this.batteryTotalEnergy = batteryTotalEnergy;
    }

    public Float getPowerBatterySoc() {
        return powerBatterySoc;
    }

    public void setPowerBatterySoc(Float powerBatterySoc) {
        this.powerBatterySoc = powerBatterySoc;
    }

    public Integer getBatteryChargeMode() {
        return batteryChargeMode;
    }

    public void setBatteryChargeMode(Integer batteryChargeMode) {
        this.batteryChargeMode = batteryChargeMode;
    }

    public Integer getAllowCharge() {
        return allowCharge;
    }

    public void setAllowCharge(Integer allowCharge) {
        this.allowCharge = allowCharge;
    }

    public Float getAllowMaxChargeVoltage() {
        return allowMaxChargeVoltage;
    }

    public void setAllowMaxChargeVoltage(Float allowMaxChargeVoltage) {
        this.allowMaxChargeVoltage = allowMaxChargeVoltage;
    }

    public Float getAllowMaxChargeCurrent() {
        return allowMaxChargeCurrent;
    }

    public void setAllowMaxChargeCurrent(Float allowMaxChargeCurrent) {
        this.allowMaxChargeCurrent = allowMaxChargeCurrent;
    }

    public Float getPowerBatteryVoltage() {
        return powerBatteryVoltage;
    }

    public void setPowerBatteryVoltage(Float powerBatteryVoltage) {
        this.powerBatteryVoltage = powerBatteryVoltage;
    }

    public Float getsBatteryMaxVoltage() {
        return sBatteryMaxVoltage;
    }

    public void setsBatteryMaxVoltage(Float sBatteryMaxVoltage) {
        this.sBatteryMaxVoltage = sBatteryMaxVoltage;
    }

    public Float getsBatteryMinVoltage() {
        return sBatteryMinVoltage;
    }

    public void setsBatteryMinVoltage(Float sBatteryMinVoltage) {
        this.sBatteryMinVoltage = sBatteryMinVoltage;
    }

    public Float getsBatteryMaxTemperature() {
        return sBatteryMaxTemperature;
    }

    public void setsBatteryMaxTemperature(Float sBatteryMaxTemperature) {
        this.sBatteryMaxTemperature = sBatteryMaxTemperature;
    }

    public Float getsBatteryMinTemperature() {
        return sBatteryMinTemperature;
    }

    public void setsBatteryMinTemperature(Float sBatteryMinTemperature) {
        this.sBatteryMinTemperature = sBatteryMinTemperature;
    }

    public Float getEquimentTemperature() {
        return equimentTemperature;
    }

    public void setEquimentTemperature(Float equimentTemperature) {
        this.equimentTemperature = equimentTemperature;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getChargeStartTime() {
        return chargeStartTime;
    }

    public void setChargeStartTime(String chargeStartTime) {
        this.chargeStartTime = chargeStartTime;
    }

    public Integer getChargeMethod02() {
        return chargeMethod02;
    }

    public void setChargeMethod02(Integer chargeMethod02) {
        this.chargeMethod02 = chargeMethod02;
    }

    public Float getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(Float serviceFee) {
        this.serviceFee = serviceFee;
    }

    @Override
    public String toString() {
        return "RealTimeDataUnit{" +
                "  整车蓄电池组额定容量/Ah=" + ratedCapacity +
                ", 整车蓄电池组额定总电压=" + ratedTotalVoltage +
                ", 设备状态=" + status +
                ", 充电卡号='" + chargeCardNo + '\'' +
                ", 车辆VIN='" + vin + '\'' +
                ", 充电电压=" + equimentChargeVoltage +
                ", 充电电流=" + equimentChargeCurrent +
                ", 充电时间=" + chargeTime +
                ", 充电金额=" + chargeFee +
                ", 充电电能=" + chargePower +
                ", 剩余时间=" + remainTime +
                ", 当前SOC=" + currentSoc +
                ", 告警信息='" + warnInfo + '\'' +
                ", 充电卡余额=" + balance +
                ", 充电类型=" + chargeType +
                ", 充电方式=" + chargeMethod +
                ", 充电模式=" + chargeMode +
                ", 电压需求=" + voltageDemand +
                ", 电流需求=" + currentDemand +
                ", 车位锁状态=" + lockStatus +
                ", 当前电能表读数单0.001KWH=" + currentPowerValue +
                ", 充电电压=" + DCEquimentChargeVoltage +
                ", 充电电流=" + DCEquimentChargeCurrent +
                ", 枪正极温度=" + pilePositiveTemperature +
                ", 枪负极温度=" + pileNagetiveTemperature +
                ", 单体动力蓄电池最高允许充电电压=" + sBatteryAllowMaxChargeVoltage +
                ", 动力蓄电池标称总能量=" + batteryTotalEnergy +
                ", 整车动力蓄电池荷电状态(充电前SOC)=" + powerBatterySoc +
                ", 电池充电模式=" + batteryChargeMode +
                ", 电池允许充电=" + allowCharge +
                ", 最高允许充电总电压=" + allowMaxChargeVoltage +
                ", 最高允许充电电流=" + allowMaxChargeCurrent +
                ", 整车动力蓄电池当前电池电压=" + powerBatteryVoltage +
                ", 电池单体最高电压=" + sBatteryMaxVoltage +
                ", 电池单体最低电压=" + sBatteryMinVoltage +
                ", 电池单体最高温度=" + sBatteryMaxTemperature +
                ", 电池单体最低温度=" + sBatteryMinTemperature +
                ", 充电桩温度=" + equimentTemperature +
                ", 订单号='" + orderNo + '\'' +
                ", 充电开始时间='" + chargeStartTime + '\'' +
                ", 充电方式=" + chargeMethod02 +
                '}';
    }
}
