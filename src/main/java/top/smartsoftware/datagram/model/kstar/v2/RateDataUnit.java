package top.smartsoftware.datagram.model.kstar.v2;

import top.smartsoftware.datagram.io.StreamWriter;

import java.util.ArrayList;
import java.util.List;

public class RateDataUnit {

    //阶段一电价
    private List<Integer> eleFees = new ArrayList<>();

    //阶段一电价
    private List<Integer>  times = new ArrayList<>();

//    //服务费单价
//    private int serverFee;

//
//    public int getServerFee() {
//        return serverFee;
//    }
//
//    public void setServerFee(int serverFee) {
//        this.serverFee = serverFee;
//    }



    public void addEleFee(int serverFee) {
        this.eleFees.add(serverFee);
    }


    public void addTime(int times) {
        this.times.add(times);
    }


    @Override
    public String toString() {
        return "RateDataUnit{" +
                " count=" + 21 +
                ",eleFees=" + getEle(eleFees) +
                ", times=" +  getTime(times)+
//                ", serverFee=" + Float.intBitsToFloat(serverFee)  +
                '}';
    }

    private String getEle(List<Integer> eleFees) {
        StringBuilder res = new StringBuilder("[ ");
        for(int value : eleFees){
            Float  temp =Float.intBitsToFloat(value);
            res.append(temp).append(" ");
        }
        res.append("]");
        return res.toString();
    }


    private String getTime(List<Integer> times) {
        StringBuilder res = new StringBuilder("[ ");
        for(int value : times){

            byte[] time = unsignedShortToByte2(value);
            res.append(time[0]+":"+time[1]).append(" ");
        }
        res.append("]");
        return res.toString();
    }


    public static byte[] unsignedShortToByte2(int s) {
        byte[] targets = new byte[2];
        targets[1] = (byte) (s >> 8 & 0xFF);
        targets[0] = (byte) (s & 0xFF);
        return targets;
    }


    public byte[] getBytes() {
        StreamWriter writer = new StreamWriter();
        writer.order(KStarPacketConst._byteOrder);
        writer.writeUInt16(21);

        int startEle = 0x0015;
        for (Integer eleFee:eleFees)
        {
            writer.writeUInt16(startEle++);
            writer.write((byte)4);
            writer.write(eleFee);
        }
        for (Integer time:times)
        {
            writer.writeUInt16(startEle++);
            writer.write((byte)2);
            writer.writeUInt16(time);
        }
//        writer.writeUInt16(startEle++);
//        writer.write((byte)2);
//        writer.write(serverFee);
        return writer.toArray();
    }
}
