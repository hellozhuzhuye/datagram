package top.smartsoftware.datagram.model.kstar.v2;

/**
 * 历史数据单元实例
 */
public class HistoryDataUnit {
    //充电方式
    private Integer chargeMethod;
    //充电模式
    private Integer chargeMode;
    //充电类型
    private String chargeType;
    //充电卡号
    private String chargeCardNo;
    //车辆VIN
    private String vin;
    //充电前余额
    private Float balanceBeforeCharge;
    //充电电压
    private Float chargeVoltage;
    //充电电流
    private Float chargeCurrent;
    //充电时间
    private Integer chargeTime;
    //充电金额
    private Float chargeFee;
    //充电电能
    private Float chargePower;
    //充电开始电能
    private Float chargeStartPower;
    //充电结束电能
    private Float chargeEndPower;
    //剩余时间
    private Integer remainTime;
    //当前soc
    private Integer currentSoc;
    //是否上传主站
    private Integer isUploadMainStation;
    //是否付费
    private Integer isPay;
    //充电终止原因
    private Integer chargeAbortReason;
    //充电开始时间
    private String chargeStartTime;
    //充电结束时间
    private String chargeEndTime;
    //记录流水号
    private int recordTraceNo;
    //记录存储序号
    private int recordStoreNo;
    //10个时段充电电量以及充电金额
    private Float phase1ChargePower;
    private Float phase1ChargeFee;
    private Float phase2ChargePower;
    private Float phase2ChargeFee;
    private Float phase3ChargePower;
    private Float phase3ChargeFee;
    private Float phase4ChargePower;
    private Float phase4ChargeFee;
    private Float phase5ChargePower;
    private Float phase5ChargeFee;
    private Float phase6ChargePower;
    private Float phase6ChargeFee;
    private Float phase7ChargePower;
    private Float phase7ChargeFee;
    private Float phase8ChargePower;
    private Float phase8ChargeFee;
    private Float phase9ChargePower;
    private Float phase9ChargeFee;
    private Float phase10ChargePower;
    private Float phase10ChargeFee;
    //充电前SOC
    private Integer socBeforeCharge;
    //充电服务费
    private Float chargeServiceFee;
    //订单号
    private String orderNo;
    //平台启动充电方式
    private Integer plateformBootChargeMthod;

    public Integer getSocBeforeCharge() {
        return socBeforeCharge;
    }

    public void setSocBeforeCharge(Integer socBeforeCharge) {
        this.socBeforeCharge = socBeforeCharge;
    }

    public Float getChargeServiceFee() {
        return chargeServiceFee;
    }

    public void setChargeServiceFee(Float chargeServiceFee) {
        this.chargeServiceFee = chargeServiceFee;
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

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
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

    public Float getBalanceBeforeCharge() {
        return balanceBeforeCharge;
    }

    public void setBalanceBeforeCharge(Float balanceBeforeCharge) {
        this.balanceBeforeCharge = balanceBeforeCharge;
    }

    public Float getChargeVoltage() {
        return chargeVoltage;
    }

    public void setChargeVoltage(Float chargeVoltage) {
        this.chargeVoltage = chargeVoltage;
    }

    public Float getChargeCurrent() {
        return chargeCurrent;
    }

    public void setChargeCurrent(Float chargeCurrent) {
        this.chargeCurrent = chargeCurrent;
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

    public Float getChargeStartPower() {
        return chargeStartPower;
    }

    public void setChargeStartPower(Float chargeStartPower) {
        this.chargeStartPower = chargeStartPower;
    }

    public Float getChargeEndPower() {
        return chargeEndPower;
    }

    public void setChargeEndPower(Float chargeEndPower) {
        this.chargeEndPower = chargeEndPower;
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

    public Integer getIsUploadMainStation() {
        return isUploadMainStation;
    }

    public void setIsUploadMainStation(Integer isUploadMainStation) {
        this.isUploadMainStation = isUploadMainStation;
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    public Integer getChargeAbortReason() {
        return chargeAbortReason;
    }

    public void setChargeAbortReason(Integer chargeAbortReason) {
        this.chargeAbortReason = chargeAbortReason;
    }

    public String getChargeStartTime() {
        return chargeStartTime;
    }

    public void setChargeStartTime(String chargeStartTime) {
        this.chargeStartTime = chargeStartTime;
    }

    public String getChargeEndTime() {
        return chargeEndTime;
    }

    public void setChargeEndTime(String chargeEndTime) {
        this.chargeEndTime = chargeEndTime;
    }

    public int getRecordTraceNo() {
        return recordTraceNo;
    }

    public void setRecordTraceNo(int recordTraceNo) {
        this.recordTraceNo = recordTraceNo;
    }

    public int getRecordStoreNo() {
        return recordStoreNo;
    }

    public void setRecordStoreNo(int recordStoreNo) {
        this.recordStoreNo = recordStoreNo;
    }

    public Float getPhase1ChargePower() {
        return phase1ChargePower;
    }

    public void setPhase1ChargePower(Float phase1ChargePower) {
        this.phase1ChargePower = phase1ChargePower;
    }

    public Float getPhase1ChargeFee() {
        return phase1ChargeFee;
    }

    public void setPhase1ChargeFee(Float phase1ChargeFee) {
        this.phase1ChargeFee = phase1ChargeFee;
    }

    public Float getPhase2ChargePower() {
        return phase2ChargePower;
    }

    public void setPhase2ChargePower(Float phase2ChargePower) {
        this.phase2ChargePower = phase2ChargePower;
    }

    public Float getPhase2ChargeFee() {
        return phase2ChargeFee;
    }

    public void setPhase2ChargeFee(Float phase2ChargeFee) {
        this.phase2ChargeFee = phase2ChargeFee;
    }

    public Float getPhase3ChargePower() {
        return phase3ChargePower;
    }

    public void setPhase3ChargePower(Float phase3ChargePower) {
        this.phase3ChargePower = phase3ChargePower;
    }

    public Float getPhase3ChargeFee() {
        return phase3ChargeFee;
    }

    public void setPhase3ChargeFee(Float phase3ChargeFee) {
        this.phase3ChargeFee = phase3ChargeFee;
    }

    public Float getPhase4ChargePower() {
        return phase4ChargePower;
    }

    public void setPhase4ChargePower(Float phase4ChargePower) {
        this.phase4ChargePower = phase4ChargePower;
    }

    public Float getPhase4ChargeFee() {
        return phase4ChargeFee;
    }

    public void setPhase4ChargeFee(Float phase4ChargeFee) {
        this.phase4ChargeFee = phase4ChargeFee;
    }

    public Float getPhase5ChargePower() {
        return phase5ChargePower;
    }

    public void setPhase5ChargePower(Float phase5ChargePower) {
        this.phase5ChargePower = phase5ChargePower;
    }

    public Float getPhase5ChargeFee() {
        return phase5ChargeFee;
    }

    public void setPhase5ChargeFee(Float phase5ChargeFee) {
        this.phase5ChargeFee = phase5ChargeFee;
    }

    public Float getPhase6ChargePower() {
        return phase6ChargePower;
    }

    public void setPhase6ChargePower(Float phase6ChargePower) {
        this.phase6ChargePower = phase6ChargePower;
    }

    public Float getPhase6ChargeFee() {
        return phase6ChargeFee;
    }

    public void setPhase6ChargeFee(Float phase6ChargeFee) {
        this.phase6ChargeFee = phase6ChargeFee;
    }

    public Float getPhase7ChargePower() {
        return phase7ChargePower;
    }

    public void setPhase7ChargePower(Float phase7ChargePower) {
        this.phase7ChargePower = phase7ChargePower;
    }

    public Float getPhase7ChargeFee() {
        return phase7ChargeFee;
    }

    public void setPhase7ChargeFee(Float phase7ChargeFee) {
        this.phase7ChargeFee = phase7ChargeFee;
    }

    public Float getPhase8ChargePower() {
        return phase8ChargePower;
    }

    public void setPhase8ChargePower(Float phase8ChargePower) {
        this.phase8ChargePower = phase8ChargePower;
    }

    public Float getPhase8ChargeFee() {
        return phase8ChargeFee;
    }

    public void setPhase8ChargeFee(Float phase8ChargeFee) {
        this.phase8ChargeFee = phase8ChargeFee;
    }

    public Float getPhase9ChargePower() {
        return phase9ChargePower;
    }

    public void setPhase9ChargePower(Float phase9ChargePower) {
        this.phase9ChargePower = phase9ChargePower;
    }

    public Float getPhase9ChargeFee() {
        return phase9ChargeFee;
    }

    public void setPhase9ChargeFee(Float phase9ChargeFee) {
        this.phase9ChargeFee = phase9ChargeFee;
    }

    public Float getPhase10ChargePower() {
        return phase10ChargePower;
    }

    public void setPhase10ChargePower(Float phase10ChargePower) {
        this.phase10ChargePower = phase10ChargePower;
    }

    public Float getPhase10ChargeFee() {
        return phase10ChargeFee;
    }

    public void setPhase10ChargeFee(Float phase10ChargeFee) {
        this.phase10ChargeFee = phase10ChargeFee;
    }

    public Integer getPlateformBootChargeMthod() {
        return plateformBootChargeMthod;
    }

    public void setPlateformBootChargeMthod(Integer plateformBootChargeMthod) {
        this.plateformBootChargeMthod = plateformBootChargeMthod;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "HistoryDataUnit{" +
                "  充电方式=" + chargeMethod +
                ", 充电模式=" + chargeMode +
                ", 充电类型=" + chargeType  +
                ", 充电卡号=" + chargeCardNo  +
                ", 车辆VIN=" + vin  +
                ", 充电前余额=" + balanceBeforeCharge +
                ", 充电电压=" + chargeVoltage +
                ", 充电电流=" + chargeCurrent +
                ", 充电时间=" + chargeTime +
                ", 充电金额=" + chargeFee +
                ", 充电电能=" + chargePower +
                ", 充电开始电能=" + chargeStartPower +
                ", 充电结束电能=" + chargeEndPower +
                ", 剩余时间=" + remainTime +
                ", 当前SOC=" + currentSoc +
                ", 是否上传主站=" + isUploadMainStation +
                ", 是否付费=" + isPay +
                ", 充电终止原因=" + chargeAbortReason +
                ", 充电开始时间=" + chargeStartTime +
                ", 充电结束时间=" + chargeEndTime  +
                ", 记录流水号=" + recordTraceNo + '\'' +
                ", 记录存储序号=" + recordStoreNo + '\'' +
                ", 1时段充电电量=" + phase1ChargePower +
                ", 1时段充电金额=" + phase1ChargeFee +
                ", 2时段充电电量=" + phase2ChargePower +
                ", 2时段充电金额=" + phase2ChargeFee +
                ", 3时段充电电量=" + phase3ChargePower +
                ", 3时段充电金额=" + phase3ChargeFee +
                ", 4时段充电电量=" + phase4ChargePower +
                ", 4时段充电金额=" + phase4ChargeFee +
                ", 5时段充电电量=" + phase5ChargePower +
                ", 5时段充电金额=" + phase5ChargeFee +
                ", 6时段充电电量=" + phase6ChargePower +
                ", 6时段充电金额=" + phase6ChargeFee +
                ", 7时段充电电量=" + phase7ChargePower +
                ", 7时段充电金额=" + phase7ChargeFee +
                ", 8时段充电电量=" + phase8ChargePower +
                ", 8时段充电金额=" + phase8ChargeFee +
                ", 9时段充电电量=" + phase9ChargePower +
                ", 9时段充电金额=" + phase9ChargeFee +
                ", 10时段充电电量=" + phase10ChargePower +
                ", 10时段充电金额=" + phase10ChargeFee +
                ", 充电前SOC=" + socBeforeCharge +
                ", 充电服务费=" + chargeServiceFee +
                ", 订单号=" + orderNo  +
                ", 平台启动充电方式=" + plateformBootChargeMthod +
                '}';
    }
}
