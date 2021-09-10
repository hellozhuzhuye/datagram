package top.smartsoftware.datagram.model.kstar.v1;

import java.io.Serializable;

public class KStarCmd06RspParam implements Serializable {

    //记录序号
    private int recordNo;

    //记录存储序号
    private int recordStoreNo;

    //记录存储结果
    private int recordStoreConsequence;

    public int getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(int recordNo) {
        this.recordNo = recordNo;
    }

    public int getRecordStoreNo() {
        return recordStoreNo;
    }

    public void setRecordStoreNo(int recordStoreNo) {
        this.recordStoreNo = recordStoreNo;
    }

    public int getRecordStoreConsequence() {
        return recordStoreConsequence;
    }

    public void setRecordStoreConsequence(int recordStoreConsequence) {
        this.recordStoreConsequence = recordStoreConsequence;
    }
}