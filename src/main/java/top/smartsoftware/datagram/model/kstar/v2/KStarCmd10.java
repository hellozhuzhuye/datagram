package top.smartsoftware.datagram.model.kstar.v2;

import top.smartsoftware.datagram.io.StreamReader;
import top.smartsoftware.datagram.io.StreamWriter;
import top.smartsoftware.datagram.util.ProtocolUtility;

import java.io.Serializable;


public class KStarCmd10 {

    public ReqMsg reqMsg;

    public RspMsg rspMsg;

    public KStarCmd10() {
        reqMsg = new ReqMsg();
        rspMsg = new RspMsg();
    }

    public void createReqMsg(KStarCmd10ReqParam kStarCmd10ReqParam) {
        reqMsg = new ReqMsg(kStarCmd10ReqParam);
    }

    public void createRspMsg(KStarCmd10RspParam kStarCmd10RspParam) {
        rspMsg = new RspMsg(kStarCmd10RspParam);
    }


    public static KStarCmd10 reqFromBytes(byte[] bytes) throws Exception {
        KStarCmd10 body = new KStarCmd10();
        body.reqMsg.reqFromBytes(bytes);
        return body;
    }


    public static KStarCmd10 rspFromBytes(byte[] bytes) throws Exception {
        KStarCmd10 body = new KStarCmd10();
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
        return "KStarCmd10{" +
                "  桩上报=" + reqMsg.toString() +
                ", 平台下发=" + rspMsg.toString() +
                '}';
    }

    public class DataUnit {

    }

    public class ReqMsg implements Serializable {

        //启停确认标识
        private byte confirmFlag;

        //用户号
        private byte[] userNo;

        //订单号
        private byte[] orderNo;

        public ReqMsg() {
        }

        public ReqMsg(KStarCmd10ReqParam kStarCmd10ReqParam) {
            //			this.signTime =
        }


        public void reqFromBytes(byte[] bytes) {
            StreamReader streamReader = new StreamReader(bytes);
            streamReader.order(KStarPacketConst._byteOrder);
            confirmFlag = streamReader.readByte();
            userNo = streamReader.readBytes(20);
            orderNo = streamReader.readBytes(20);
        }

        public byte[] getBytes() {
            StreamWriter writer = new StreamWriter();
            writer.order(KStarPacketConst._byteOrder);
            writer.write(confirmFlag);
            writer.write(userNo);
            writer.write(orderNo);
            return writer.toArray();
        }

        @Override
        public String toString() {
            return "ReqMsg{" +
                    "  确认标志=" + confirmFlag +
                    ", 用户号=" + ProtocolUtility.bytesToASCII(userNo) +
                    ", 订单号=" + ProtocolUtility.bytesToASCII(orderNo) +
                    '}';
        }
    }


    public class RspMsg implements Serializable {

        //启停标志
        private byte bootFlag;

        //用户号
        private byte[] userNo;

        //余额
        private int balance;


        //后台交易流水
        private int orderId;


        //充电模式
        private int chargeMode;


        //充电参数
        private int chargeParam;

        //保留
        private int param;

        public byte getBootFlag() {
            return bootFlag;
        }

        public void setBootFlag(byte bootFlag) {
            this.bootFlag = bootFlag;
        }

        public byte[] getUserNo() {
            return userNo;
        }

        public void setUserNo(byte[] userNo) {
            this.userNo = userNo;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public int getOrderId() {
            return orderId;
        }

        public void setOrderId(int orderId) {
            this.orderId = orderId;
        }

        public int getChargeMode() {
            return chargeMode;
        }

        public void setChargeMode(int chargeMode) {
            this.chargeMode = chargeMode;
        }

        public int getChargeParam() {
            return chargeParam;
        }

        public void setChargeParam(int chargeParam) {
            this.chargeParam = chargeParam;
        }

        public int getParam() {
            return param;
        }

        public void setParam(int param) {
            this.param = param;
        }

        public RspMsg() {

        }

        public RspMsg(KStarCmd10RspParam kStarCmd10RspParam) {
            bootFlag = kStarCmd10RspParam.getBootSign();

            userNo = ProtocolUtility.strToBytes(kStarCmd10RspParam.getUserNo(),20);
            balance = kStarCmd10RspParam.getBalance();
            orderId = kStarCmd10RspParam.getBkOrderNo();
            chargeMode = 0;
            chargeParam = 0;
            param =0 ;
        }

        public void rspFromBytes(byte[] bytes) {
            StreamReader reader = new StreamReader(bytes);
            reader.order(KStarPacketConst._byteOrder);
            bootFlag = reader.readByte();
            userNo = reader.readBytes(20);
            balance = reader.readInt32();
            orderId = reader.readInt32();
            chargeMode = reader.readInt32();
            chargeParam = reader.readInt32();
            param = reader.readInt32();
        }

        public byte[] getBytes() {
            StreamWriter writer = new StreamWriter();
            writer.order(KStarPacketConst._byteOrder);
            writer.write(bootFlag);
            writer.write(userNo);
            writer.write(balance);
            writer.write(orderId);
            writer.write(chargeMode);
            writer.write(chargeParam);
            writer.write(param);
            return writer.toArray();
        }

        @Override
        public String toString() {
            return "RspMsg{" +
                    "启停标志=" + bootFlag +
                    ", 用户号=" + ProtocolUtility.bytesToASCII(userNo) +
                    ", 余额=" + balance +
                    ", 后台交易流水=" + orderId +
                    ", 充电模式=" + chargeMode +
                    ", 充电参数=" + chargeParam +
                    ", 保留=" + param +
                    '}';
        }
    }
}
