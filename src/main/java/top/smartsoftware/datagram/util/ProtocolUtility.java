package top.smartsoftware.datagram.util;


import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 协议解析工具
 * <p>
 * Created by Jim on 2020/5/10.
 */
public class ProtocolUtility {

    /**
     * 将int数值转换为占四个字节的byte数组，本方法适用于(低位在前，高位在后)的顺序。 和bytesToInt（）配套使用
     * @param value
     *            要转换的int值
     * @return byte数组
     */
    public static byte[] intToBytes( int value )
    {
        byte[] src = new byte[4];
        src[3] =  (byte) ((value>>24) & 0xFF);
        src[2] =  (byte) ((value>>16) & 0xFF);
        src[1] =  (byte) ((value>>8) & 0xFF);
        src[0] =  (byte) (value & 0xFF);
        return src;
    }

    /**
     * 将int数值转换为占四个字节的byte数组，本方法适用于(高位在前，低位在后)的顺序。  和bytesToInt2（）配套使用
     */
    public static byte[] intToBytes2(int value)
    {
        byte[] src = new byte[4];
        src[0] = (byte) ((value>>24) & 0xFF);
        src[1] = (byte) ((value>>16)& 0xFF);
        src[2] = (byte) ((value>>8)&0xFF);
        src[3] = (byte) (value & 0xFF);
        return src;
    }


    /**
     * byte数组中取int数值，本方法适用于(低位在前，高位在后)的顺序，和和intToBytes（）配套使用
     *
     * @param src
     *            byte数组
     * @param offset
     *            从数组的第offset位开始
     * @return int数值
     */
    public static int bytesToInt(byte[] src, int offset) {
        int value;
        value = (int) ((src[offset] & 0xFF)
                | ((src[offset+1] & 0xFF)<<8)
                | ((src[offset+2] & 0xFF)<<16)
                | ((src[offset+3] & 0xFF)<<24));
        return value;
    }

    /**
     * byte数组中取int数值，本方法适用于(低位在后，高位在前)的顺序。和intToBytes2（）配套使用
     */
    public static int bytesToInt2(byte[] src, int offset) {
        int value;
        value = (int) ( ((src[offset] & 0xFF)<<24)
                |((src[offset+1] & 0xFF)<<16)
                |((src[offset+2] & 0xFF)<<8)
                |(src[offset+3] & 0xFF));
        return value;
    }



    /**
     * 字节转字符
     * @return
     */
    public static String bytesToASCII(byte[] data){
        try{
            if(data == null || data.length == 0){
                return "";
            }
            return ByteUtility.fromASCII(data).trim();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 字节转中文字符
     * @return
     */
    public static String bytesToCNString(byte[] data){
        try{
            if(data == null || data.length == 0 || data[0] == 0){
                return "";
            }
            return new String(data, "GB2312");
        }catch(Exception e){
            try{
                return new String(data, "UTF-8");
            }catch(Exception err){
                throw new RuntimeException(err);
            }
        }
    }

    /**
     * 字节转日期
     * @return
     */
    public static Date bytesToDate(byte[] data){
        String dstr = ByteUtility.fromBCD(data);
        dstr = dstr.substring(0, 14);
        return FormatUtility.parseDateTime(dstr, "yyyyMMddHHmmss");
    }

    public static String bytesToDateString(byte[] data){
        String dstr = ByteUtility.fromBCD(data);
        dstr = dstr.substring(0, 14);
        Date date = FormatUtility.parseDateTime(dstr, "yyyyMMddHHmmss");
        return dateToDateString(date);
    }



    public static String dateToDateString(Date date) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(date);
    }
    /**
     * 日期转字节
     * @param date
     * @return
     */
    public static byte[] datetoBytes(Date date){
        String str = FormatUtility.formatDateTime(date, "yyyyMMddHHmmss");
        byte[] data = ByteUtility.toBCD(str);
        byte[] res = new byte[8];
        System.arraycopy(data, 0, res, 0, 7);
        res[7] = (byte) 0xff;
        return res;
    }


    /**
     * 字符串转字节
     * @param str
     * @return
     */
    public static byte[] strToBytes(String str){
        if(StringUtility.isNullOrEmpty(str)){
            return ByteUtility.toASCII("", 32);
        }
        return ByteUtility.toASCII(str, 32);
    }


    /**
     * 字符串转字节
     * @param str
     * @return
     */
    public static byte[] strToBytes10(String str){
        if(StringUtility.isNullOrEmpty(str)){
            return ByteUtility.toASCII("", 10);
        }
        return ByteUtility.toASCII(str, 10);
    }



    public static byte[] vinToBytes(String str){
        if(StringUtility.isNullOrEmpty(str)){
            return ByteUtility.toASCII("", 17);
        }
        return ByteUtility.toASCII(str, 17);
    }

    public static byte[] strToBytes(String str,int length){
        if(StringUtility.isNullOrEmpty(str)){
            return ByteUtility.toASCII("", length);
        }
        return ByteUtility.toASCII(str, length);
    }


    public static byte[] bytesToBytes(byte[] bytes,int length){
        byte[] data = new byte[length];
        for(int i=0; i<length; i++){
            data[i] = 0;
        }
        byte[] bt3 = new byte[bytes.length+length];
        System.arraycopy(bytes, 0, bt3, 0, bytes.length);
        System.arraycopy(data, 0, bt3, bytes.length, data.length);
        return bt3;
    }


    public static String toHexString(byte[] values){
        StringBuilder res = new StringBuilder("[ ");
        for(byte value : values){
            res.append(StringUtility.toHex(value)).append(" ");
        }
        res.append("]");
        return res.toString();
    }


    public static byte[] getBytes(String str, int length){
        return StringUtility.getBytes(str, "GB2312", length, (byte)0x20);
    }


    public static byte[] getXingXingDate(){
        Calendar cal = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("yy");
        String yearStr = df.format(cal.getTime());
        int year  = ConvertUtility.getValueAsInt(yearStr);
        byte[] time = new byte[6];
        time[0] =(byte) year;
        time[1] = (byte) (cal.get(Calendar.MONTH) + 1); // 0代表1月，11代表12月
        time[2] = (byte) cal.get(Calendar.DAY_OF_MONTH);
        time[3] = (byte) cal.get(Calendar.HOUR_OF_DAY);
        time[4] = (byte) cal.get(Calendar.MINUTE);
        time[5] = (byte) cal.get(Calendar.SECOND);
        return time;
    }


    public static byte[] toBytes(Date date){
        String str = FormatUtility.formatDateTime(date, "yyyyMMddHHmmss");
        byte[] data = ByteUtility.toBCD(str);
        byte[] res = new byte[8];
        System.arraycopy(data, 0, res, 0, 7);
        res[7] = (byte) 0xff;
        return res;
    }

    public static byte[] toBytes2(Date date){
        String str = FormatUtility.formatDateTime(date, "yyyyMMddHHmmss");
        byte[] data = ByteUtility.toBCD(str);
        byte[] res = new byte[7];
        System.arraycopy(data, 0, res, 0, 7);
        return res;
    }


    public static double[] timeShareCompute(short[] chargeTimesDegree){
        //充电分时度数
        StringBuilder chargeTimesDegreeStr = new StringBuilder();
        //分时度数(double 数组)调接口的参数
        double[] timeShare = new double[chargeTimesDegree.length];
        for (int i=0; i<chargeTimesDegree.length; i++){
            timeShare[i] = (double)chargeTimesDegree[i]/100;
        }
        return timeShare;
    }

    public static double[] timeShareCompute(int[] chargeTimesDegree){
        //充电分时度数
        StringBuilder chargeTimesDegreeStr = new StringBuilder();
        //分时度数(double 数组)调接口的参数
        double[] timeShare = new double[chargeTimesDegree.length];
        for (int i=0; i<chargeTimesDegree.length; i++){
            timeShare[i] = (double)chargeTimesDegree[i]/1000;
        }
        return timeShare;
    }

    public static Double[] timeShareComputes(short[] chargeTimesDegree){
        //充电分时度数
        StringBuilder chargeTimesDegreeStr = new StringBuilder();
        //分时度数(double 数组)调接口的参数
        Double[] timeShare = new Double[chargeTimesDegree.length];
        for (int i=0; i<chargeTimesDegree.length; i++){
            timeShare[i] = (double)chargeTimesDegree[i]/100;
        }
        return timeShare;
    }

    public static Double[] timeShareComputes(int[] chargeTimesDegree){
        //充电分时度数
        StringBuilder chargeTimesDegreeStr = new StringBuilder();
        //分时度数(double 数组)调接口的参数
        Double[] timeShare = new Double[chargeTimesDegree.length];
        for (int i=0; i<chargeTimesDegree.length; i++){
            timeShare[i] = (double)chargeTimesDegree[i]/1000;
        }
        return timeShare;
    }

    public static Double[] timeShareComputes(double[] chargeTimesDegree){
        //充电分时度数
        StringBuilder chargeTimesDegreeStr = new StringBuilder();
        //分时度数(double 数组)调接口的参数
        Double[] timeShare = new Double[chargeTimesDegree.length];
        for (int i=0; i<chargeTimesDegree.length; i++){
            timeShare[i] = chargeTimesDegree[i];
        }
        return timeShare;
    }

    public static byte toByte(boolean flag){
        return flag ? (byte)1 : (byte)0;
    }

    public static int toInt(BigDecimal amt){
        int value = amt.multiply(new BigDecimal(100)).intValue();
        return value;
    }


    private static ByteBuffer buffer = ByteBuffer.allocate(8);

    public static long bytesToLong(byte[] bytes) {
        buffer.put(bytes, 0, bytes.length);
        buffer.flip();//need flip
        return buffer.getLong();
    }


    /**
     * 不够位数的在前面补0，保留num的长度位数字
     * @param code
     * @return
     */
    public static String autoGenericCode(String code, int num) {
        String formt = String.format("%0"+num+"d", 0);
        DecimalFormat g1=new DecimalFormat(formt);
        String result = g1.format(Integer.valueOf(code));
        return result;
    }


    /**
     * 不够位数的在前面补0，保留num的长度位数字
     * @param code
     * @return
     */
    public static String autoGenericCode2(String code, int num) {
        String formt = String.format("%0"+num+"d", 0);
        if (code == null)
        {
            return formt;
        }
        int size = code.length();
        int formtLegth = formt.length();
        String a =  formt.substring(0,formtLegth-size);
        return a+code;
    }


    public static String replaceZero(String code) {
        String  no =   code.replaceAll("^(0+)", "");
        return no;
    }

    public static String transfer0x00(String str){
        if(str !=null && str.indexOf(0x00) > -1){
            str = str.replace((char)0x00,' ');
        }
        return str;
    }

    public static byte[] toASCIIWithoutNull(String str, int length) {
        return ByteUtility.toASCIIWithoutNull(str, length);
    }


    public static int getHeight4(byte data){//获取高四位
        int height;
        height = ((data & 0xf0) >> 4);

//        height = ((data >> 4) & 0xf0);
        return height;
    }

    public static int getLow4(byte data){//获取低四位
        int low;
        low = (data & 0x0f);
        return low;
    }


//    //取高四位
//    byte high = (byte) ((abyte>>4) & 0x0f);
//    System.out.println("取高四位"+Integer.toBinaryString(high));
//    //取低四位
//    byte low =  (byte) (abyte & 0x0f);


    public static int getLow4High(byte high,byte low){//获取低四位
        int height;
        height = (high << 4 );
        height += (low & 0x0f);
        return height;
    }

    public static void main(String[] args) {
        String orderNo = autoGenericCode2("111",20);
        System.out.println(orderNo);

//        String txt ="7572D2003836303735353138000000000000000000000000A0000000000000000001003139332E3131322E34312E3139340000000000000000000000000000000015006B737461720000000000000000000000000000006B737461724023323133383930303800000000002F6F70742F6674702F6E65772F6669726D7761726500000000000000000000000000000000000000000000000000000000002F6F70742F6674702F6E65772F6669726D77617265000000000000000000000000000000000000000000000000000000000068891D0000";


//        String txt ="757253003836303735353138000000000000000000000000A000010001016674702D6D6F6E69746F722D323032302D30362D31372E74617200000000000000000000000000000000000000000000000068FA0B0000";
//        String txt ="75728800FD791B004100001400150004F628DC3E160004295C4F3F1700048FC2953F180004295C4F3F1900048FC2953F1A0004295C4F3F1B0004F628DC3E1C0004F628DC3E1D0004CDCC4C3E1E00049A99193F1F00020000200002050021000207002200020B1E2300021100240002150025000215142600021600270002161428000218006810190000";
//        String txt ="75725E00383630373535313800000000000000000000000010000001000131353930333735343031303536363700000000003230323030353235313133393132353400000000B90B0000000000000100000001000000010000000068630A0000";


        String txt ="75724900383630373535313800000000000000000000000010000101010030303030393041344430313537444333000000003030303732443341323035453745313600000000682C0A0000";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < txt.length(); i++) {
            if (i%2 == 0) {
                result.append(" ");
            }

            result.append(txt.charAt(i));
        }
        System.out.println(result.toString());
//        System.out.println(no);

    }

}
