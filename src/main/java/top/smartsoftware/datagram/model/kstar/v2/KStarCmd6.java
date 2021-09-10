package top.smartsoftware.datagram.model.kstar.v2;



import top.smartsoftware.datagram.io.StreamReader;
import top.smartsoftware.datagram.io.StreamWriter;

import java.io.Serializable;


public class KStarCmd6 {

    public ReqMsg reqMsg;

    public RspMsg rspMsg;

    public KStarCmd6() {
        reqMsg = new ReqMsg();
        rspMsg = new RspMsg();
    }

    public void createReqMsg(KStarCmd06ReqParam kStarCmd06ReqParam) {
        reqMsg = new ReqMsg(kStarCmd06ReqParam);
    }

    public void createRspMsg(KStarCmd06RspParam kStarCmd06RspParam) {
        rspMsg = new RspMsg(kStarCmd06RspParam);
    }


    public static KStarCmd6 reqFromBytes(byte[] bytes) {
        KStarCmd6 body = new KStarCmd6();
        body.reqMsg.reqFromBytes(bytes);
        return body;
    }


    public static KStarCmd6 rspFromBytes(byte[] bytes) {
        KStarCmd6 body = new KStarCmd6();
        body.rspMsg.rspFromBytes(bytes);
        return body;
    }

    public byte[] reqBodyToBytes() throws Exception {
        if (reqMsg == null) {
            return null;
        }
        return reqMsg.getBytes();
    }


    public byte[] rspBodyToBytes() throws Exception {
        if (rspMsg == null) {
            return null;
        }
        return rspMsg.getBytes();
    }

    @Override
    public String toString() {
        return "KStarCmd6{" +
                "  桩上报=" + reqMsg.toString() +
                ", 平台下发=" + rspMsg.toString() +
                '}';
    }

    public class DataUnit {

    }

    public class ReqMsg implements Serializable {

        public HistoryDataUnit historyDataUnit;


        public ReqMsg() {

        }

        public ReqMsg(KStarCmd06ReqParam kStarCmd06ReqParam) {
            //			this.signTime =
        }


        public void reqFromBytes(byte[] bytes) {
            StreamReader streamReader = new StreamReader(bytes);
            streamReader.order(KStarPacketConst._byteOrder);
            historyDataUnit = DataUnitConvertor.historyDataUnit(streamReader);
        }

        public HistoryDataUnit getHistoryDataUnit() {
            return historyDataUnit;
        }

        public void setHistoryDataUnit(HistoryDataUnit historyDataUnit) {
            this.historyDataUnit = historyDataUnit;
        }

        public byte[] getBytes() {
            StreamWriter writer = new StreamWriter();
            writer.order(KStarPacketConst._byteOrder);
            return writer.toArray();


        }

        @Override
        public String toString() {
            return "ReqMsg{" +
                    "  数据单元=" + historyDataUnit +
                    '}';
        }
    }


    public class RspMsg implements Serializable {

        //记录序号
        private int recordNo;
        //记录存储序号
        private int recordStoreNo;
        //记录存储结果
        private int recordStoreConsequence;

        public RspMsg() {

        }

        public RspMsg(KStarCmd06RspParam kStarCmd06RspParam) {
            recordNo = kStarCmd06RspParam.getRecordNo();
            recordStoreNo = kStarCmd06RspParam.getRecordStoreNo();
            recordStoreConsequence = kStarCmd06RspParam.getRecordStoreConsequence();
        }

        public void rspFromBytes(byte[] bytes) {
        }

        public byte[] getBytes() {
            StreamWriter writer = new StreamWriter();
            writer.order(KStarPacketConst._byteOrder);
            writer.write(recordNo);
            writer.write(recordStoreNo);
            writer.write(recordStoreConsequence);
            return writer.toArray();
        }

        @Override
        public String toString() {
            return "RspMsg{" +
                    "  序号=" + recordNo +
                    "  存储序号=" + recordStoreNo +
                    "  后台记录存储结果=" + recordStoreConsequence +

                    '}';
        }


    }
}
