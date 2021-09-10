package top.smartsoftware.datagram.model.kstar.v1;

import top.smartsoftware.datagram.model.kstar.v2.KStarPacketConst;

import top.smartsoftware.datagram.io.StreamReader;
import top.smartsoftware.datagram.io.StreamWriter;

import java.io.Serializable;

public class KStarCmd14 {

    public ReqMsg reqMsg;

    public RspMsg rspMsg;

    public KStarCmd14() {
        reqMsg = new ReqMsg();
        rspMsg = new RspMsg();
    }

    public void createReqMsg(KStarCmd14ReqParam kStarCmd14ReqParam) {
        reqMsg = new ReqMsg(kStarCmd14ReqParam);
    }

    public void createRspMsg(KStarCmd14RspParam kStarCmd14RspParam) {
        rspMsg = new RspMsg(kStarCmd14RspParam);
    }


    public static KStarCmd14 reqFromBytes(byte[] bytes)  {
        KStarCmd14 body = new KStarCmd14();
        body.reqMsg.reqFromBytes(bytes);
        return body;
    }


    public static KStarCmd14 rspFromBytes(byte[] bytes)  {
        KStarCmd14 body = new KStarCmd14();
        body.rspMsg.rspFromBytes(bytes);
        return body;
    }

    public byte[] reqBodyToBytes()  {
        if (reqMsg == null) {
            return null;
        }
        return reqMsg.getBytes();
    }


    public byte[] rspBodyToBytes() {
        if (rspMsg == null) {
            return null;
        }
        return rspMsg.getBytes();
    }

    @Override
    public String toString() {
        return "KStarCmd14{" +
                "  桩上报=" + reqMsg.toString() +
                ", 平台下发=" + rspMsg.toString() +
                '}';
    }

    public class DataUnit {

    }

    public class ReqMsg implements Serializable {

        public RealTimeDataUnit realTimeDataUnit;

        public ReqMsg() {

        }

        public ReqMsg(KStarCmd14ReqParam kStarCmd14ReqParam) {
            //			this.signTime =
        }


        public void reqFromBytes(byte[] bytes) {
            StreamReader streamReader = new StreamReader(bytes);
            streamReader.order(KStarPacketConst._byteOrder);
            realTimeDataUnit = DataUnitConvertor.realTimeDataUnit(streamReader);
        }

        public byte[] getBytes() {
            StreamWriter writer = new StreamWriter();
            writer.order(KStarPacketConst._byteOrder);
            return writer.toArray();
        }

        @Override
        public String toString() {
            return "ReqMsg{" +
                    "  数据单元=" + realTimeDataUnit +
                    '}';
        }
    }


    public class RspMsg implements Serializable {

        //记录存储序号
        private short count;

        private byte acceptConfirmFlag;

        public RspMsg() {

        }

        public RspMsg(KStarCmd14RspParam kStarCmd14RspParam) {
            count = 1;
            acceptConfirmFlag = kStarCmd14RspParam.getAcceptConfirmFlag();
        }

        public void rspFromBytes(byte[] bytes) {
        }

        public byte[] getBytes() {
            StreamWriter writer = new StreamWriter();
            writer.order(KStarPacketConst._byteOrder);
            writer.write(count);
            writer.write(acceptConfirmFlag);
            return writer.toArray();
        }

        @Override
        public String toString() {
            return "RspMsg{" +
                    "  上传单元个数=" + count +
                    "  确认标志=" + acceptConfirmFlag +
                    '}';
        }


    }
}
