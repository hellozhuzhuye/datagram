package top.smartsoftware.datagram.model.kstar.v1;

/**
 * 告警数据单元实例
 */
public class WarnDataUnit {
    //告警点
    private int warnPoint;
    //告警原因
    private int warnReason;
    //告警开始时间
    private String warnStartTime;
    //告警结束时间
    private String warnEndTime;
    //持续时间
    private Integer duration;
    //是否影响充电
    private Integer isAffectCharge;
    //是否上传主站
    private Integer isUploadMainStation;
    //记录存储序号
    private int recordStoreNo;
    //todo 记录存储序号02
    private int recordStoreNo02;
    //告警恢复还是发生
    private Integer isRecoveryOrHappen;

    public int getWarnPoint() {
        return warnPoint;
    }

    public void setWarnPoint(int warnPoint) {
        this.warnPoint = warnPoint;
    }

    public int getWarnReason() {
        return warnReason;
    }

    public void setWarnReason(int warnReason) {
        this.warnReason = warnReason;
    }

    public String getWarnStartTime() {
        return warnStartTime;
    }

    public void setWarnStartTime(String warnStartTime) {
        this.warnStartTime = warnStartTime;
    }

    public String getWarnEndTime() {
        return warnEndTime;
    }

    public void setWarnEndTime(String warnEndTime) {
        this.warnEndTime = warnEndTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getIsAffectCharge() {
        return isAffectCharge;
    }

    public void setIsAffectCharge(Integer isAffectCharge) {
        this.isAffectCharge = isAffectCharge;
    }

    public Integer getIsUploadMainStation() {
        return isUploadMainStation;
    }

    public void setIsUploadMainStation(Integer isUploadMainStation) {
        this.isUploadMainStation = isUploadMainStation;
    }

    public int getRecordStoreNo() {
        return recordStoreNo;
    }

    public void setRecordStoreNo(int recordStoreNo) {
        this.recordStoreNo = recordStoreNo;
    }

    public int getRecordStoreNo02() {
        return recordStoreNo02;
    }

    public void setRecordStoreNo02(int recordStoreNo02) {
        this.recordStoreNo02 = recordStoreNo02;
    }

    public Integer getIsRecoveryOrHappen() {
        return isRecoveryOrHappen;
    }

    public void setIsRecoveryOrHappen(Integer isRecoveryOrHappen) {
        this.isRecoveryOrHappen = isRecoveryOrHappen;
    }

    @Override
    public String toString() {
        return "WarnDataUnit{" +
                " 告警点=" + warnPoint +
                ", 告警原因'" + warnReason  +
                ", 告警开始时间=" + warnStartTime  +
                ", 告警结束时间=" + warnEndTime  +
                ", 持续时间=" + duration +
                ", 是否影响充电=" + isAffectCharge +
                ", 是否上传主站=" + isUploadMainStation +
                ", 记录存储序号=" + recordStoreNo  +
                ", 记录存储序号=" + recordStoreNo02  +
                ", 告警恢复还是发生=" + isRecoveryOrHappen +
                '}';
    }
}
