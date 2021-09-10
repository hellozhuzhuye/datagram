package top.smartsoftware.datagram.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ByteUtility {
	
	private static Map<Character, Byte> hexCode = new HashMap<Character, Byte>();
	
	static{
		hexCode.put('0', (byte)0);
		hexCode.put('1', (byte)1);
		hexCode.put('2', (byte)2);
		hexCode.put('3', (byte)3);
		hexCode.put('4', (byte)4);
		hexCode.put('5', (byte)5);
		hexCode.put('6', (byte)6);
		hexCode.put('7', (byte)7);
		hexCode.put('8', (byte)8);
		hexCode.put('9', (byte)9);
		hexCode.put('a', (byte)10);
		hexCode.put('b', (byte)11);
		hexCode.put('c', (byte)12);
		hexCode.put('d', (byte)13);
		hexCode.put('e', (byte)14);
		hexCode.put('f', (byte)15);
		hexCode.put('A', (byte)10);
		hexCode.put('B', (byte)11);
		hexCode.put('C', (byte)12);
		hexCode.put('D', (byte)13);
		hexCode.put('E', (byte)14);
		hexCode.put('F', (byte)15);
	}

	/**
	 * 把字节转成16进制字符串
	 * 小端
	 *
	 * @param bytes
	 * @param prefix 是否带"0x"前缀
	 * @return
	 */
	public static String toHexStringLittle(byte[] bytes, boolean prefix) {
		return toHexStringLittle(bytes, 0, bytes.length, prefix);
	}

	public static String fromBCDToKsdChargeTime(byte[] data) {
		StringBuilder sb = new StringBuilder();
		Stream.iterate(0, i -> i + 1).limit(data.length).forEach(i -> {
			if (i==0){
				sb.append(String.format("%02X", data[i+1]));
			}
			if (i==1){
				sb.append(String.format("%02X", data[i-1]));
			}
			if (i!=0&&i!=1){
				sb.append(String.format("%02X", data[i]));
			}
		});
		return sb.toString();
	}

	/**
	 * 把字节转成16进制字符串
	 * 小端
	 *
	 * @param bytes
	 * @param startIndex bytes的起始位置
	 * @param length     长度
	 * @param prefix     是否带"0x"前缀
	 * @return
	 */
	public static String toHexStringLittle(byte[] bytes, int startIndex, int length, boolean prefix) {
		StringBuilder ret = new StringBuilder();
		if (prefix) ret.append("0x");
		for (int i = bytes.length - 1; i >= 0; i--) {
			String hex = String.format("%02X", bytes[i] & 0xFF);
			ret.append(hex);
		}
		return ret.toString();
	}

	public static byte getByte(char c){
		return hexCode.get(c);
	}

	public static byte[] hexToByte(String inHex) {
		inHex=inHex.replace(" ", "");
		int hexlen = inHex.length();
		byte[] result;
		if (hexlen % 2 == 1){
			//奇数
			hexlen++;
			result = new byte[(hexlen/2)];
			inHex="0"+inHex;
		}else {
			//偶数
			result = new byte[(hexlen/2)];
		}
		int j=0;
		for (int i = 0; i < hexlen; i+=2){
			result[j]=(byte)Integer.parseInt(inHex.substring(i,i+2),16);
			j++;
		}
		return result;
	}

	public static byte[] charToByte(char c) { 
        byte[] b = new byte[2]; 
        b[0] = (byte) ((c & 0xFF00) >> 8); 
        b[1] = (byte) (c & 0xFF); 
        return b; 
    }
	
	public static long toLong(String str){
		long n = 0l;
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			n = (n << 4) | getByte(c);
		}
		return n;
	}

	public static int toInt(String str){
		int n = 0;
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			n = (n << 4) | getByte(c);
		}
		return n;
	}

	public static short toShort(String str){
		int n = 0;
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			n = (n << 4) | getByte(c);
		}
		return (short)n;
	}

	public static byte toByte(String str){
		int n = 0;
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			n = (n << 4) | getByte(c);
		}
		return (byte)n;
	}

	public static long toBCDLong(String str){
		long n = 0l;
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			n = (n * 10) + getByte(c);
		}
		return n;
	}

	public static int toBCDInt(String str){
		int n = 0;
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			n = (n * 10) + getByte(c);
		}
		return n;
	}

	public static short toBCDShort(String str){
		int n = 0;
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			n = (n * 10) + getByte(c);
		}
		return (short)n;
	}

	public static byte toBCDByte(String str){
		int n = 0;
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			n = (n * 16) + getByte(c);
		}
		return (byte)n;
	}

	/**
	 * 把字节连接成字符串
	 * @param bytes
	 * @param splitChar 分隔符
	 * @return
	 */
	public static String joinAsString(byte[] bytes,char splitChar)
	{
        String result = "";
        for (byte item : bytes)
        {
            result += item + "" + splitChar;    
        }
        return result;
	}
	
	public static String toHexString(byte[] bytes){
		return toHexString(bytes, false);
	}

	/**
	 * 把字节转成16进制字符串
	 * @param bytes
	 * @param prefix 是否带"0x"前缀
	 * @return
	 */
	public static String toHexString(byte[] bytes,boolean prefix){
		return toHexString(bytes,0,bytes.length,prefix);
	}
	
	/**
	 * 把字节转成16进制字符串
	 * @param bytes
	 * @param startIndex bytes的起始位置
	 * @param length 长度
	 * @param prefix 是否带"0x"前缀
	 * @return
	 */
	public static String toHexString(byte[] bytes,int startIndex,int length,boolean prefix){
		StringBuilder ret = new StringBuilder();
		if (prefix) ret.append("0x");
		for (int i = startIndex; i < bytes.length && (i-startIndex)<length; i++) {			
			String hex = String.format("%02X", bytes[i] & 0xFF);
			ret.append(hex);
		}
		return ret.toString();
	}
	
	public static String toHexString(byte[] bytes,int startIndex,int length){
		return toHexString(bytes, startIndex, length, false);
	}
	
	public static String fromBCD(byte n){
		return String.format("%02X", n);
	}
	
	public static String fromBCD(byte[] data){
		StringBuilder sb = new StringBuilder();
		for(byte b : data){
			sb.append(String.format("%02X", b));
		}
		return sb.toString();
	}
	
	public static byte[] toBCD(String str){
		try{
			byte[] data = new byte[str.length() / 2];
			
			for(int i=0, j=0; i<str.length(); i+=2, j++){
				char c1 = str.charAt(i);
				char c2 = str.charAt(i+1);
				byte b1 = hexCode.get(c1);
				byte b2 = hexCode.get(c2);
				data[j] = (byte) ((b1 << 4) | b2);
			}
			return data;
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	public static String fromASCII(byte[] data){
	    StringBuilder sb = new StringBuilder("");
	    for (int i = 0; i < data.length; ++ i) {
	        if (data[i] < 0){
	        	return toHexString(data);
	        }else if(data[i] == 0){
	        	break;
	        }
	        sb.append((char) data[i]);
	    }
	    return sb.toString();

	}
	
	public static byte[] toASCIIWithoutNull(String str){
		byte[] data = new byte[str.length()];
		for(int i=0; i<str.length(); i++){
			data[i] = (byte) str.charAt(i);
		}
		return data;
	}


	public static byte[] toASCIIWithoutNull(String str, int len){
		byte[] data = new byte[len];
		int j = 0;
		if(StringUtility.isNullOrEmpty(str)){
			data[0] = 0;
		}else{
			for(int i=0; i<str.length() && i<len; i++, j++){
				data[i] = (byte) str.charAt(i);
			}
		}
		return data;
	}
	
	
	
	public static byte[] toASCII(String str){
		byte[] data = new byte[str.length() + 1];
		for(int i=0; i<str.length(); i++){
			data[i] = (byte) str.charAt(i);
		}
		data[str.length()] = 0;
		return data;
	}
	
	public static byte[] toASCII(String str, int len){
		byte[] data = new byte[len];
		int j = 0;
		if(StringUtility.isNullOrEmpty(str)){
			data[0] = 0;
		}else{
			for(int i=0; i<str.length() && i<len-1; i++, j++){
				data[i] = (byte) str.charAt(i);
			}
		}
		data[j] = 0;
		return data;
	}
	
	
	public static byte[] toHexData(String hexstr){
		String[] data = hexstr.split(" ");
		byte[] res = new byte[data.length];
		for(int i=0; i<data.length; i++){
			String str = data[i];
			res[i] = toBCDByte(str);
		}
		return res;
	}
	
	public static byte[] toBytes(byte fill, int length){
		byte[] res = new byte[length];
		Array.setByte(res, 0, fill);
		return res;
	}
	
	public static byte calculateChecksum(byte[] data){
		byte value = 0;
		for(byte n : data){
			value += n;
		}
		return (byte)value;
	}


	/**
	 * Bit转Byte
	 */
	public static byte[] InputStreamToBytes( InputStream ins) throws IOException {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		try{
			byte[] data = new byte[0];
			data = new byte[1024];
			int len = -1;
			while((len = ins.read(data)) != -1){
				os.write(data, 0, len);
			}
			os.flush();
			data = os.toByteArray();
			return data;
		}catch(Exception e){
			throw e;
		}finally{
			if(ins != null){
				ins.close();
			}
			os.close();
		}
	}



	/** 
	 * Bit转Byte 
	 */  
	public static byte BitToByte(String byteStr) {  
	    int re, len;  
	    if (null == byteStr) {  
	        return 0;  
	    }  
	    len = byteStr.length();  
	    if (len != 4 && len != 8) {  
	        return 0;  
	    }  
	    if (len == 8) {// 8 bit处理  
	        if (byteStr.charAt(0) == '0') {// 正数  
	            re = Integer.parseInt(byteStr, 2);  
	        } else {// 负数  
	            re = Integer.parseInt(byteStr, 2) - 256;  
	        }  
	    } else {//4 bit处理  
	        re = Integer.parseInt(byteStr, 2);  
	    }  
	    return (byte) re;  
	} 
	
	
	/** 
     * 将byte转换为一个长度为8的byte数组，数组每个值代表bit 
     */  
    public static byte[] getBooleanArray(byte b) {  
        byte[] array = new byte[8];  
        for (int i = 7; i >= 0; i--) {  
            array[i] = (byte)(b & 1);  
            b = (byte) (b >> 1);  
        }  
        return array;  
    }  
    /** 
     * 把byte转为字符串的bit 
     */  
    public static String byteToBit(byte b) {  
        return ""  
                + (byte) ((b >> 7) & 0x1) + (byte) ((b >> 6) & 0x1)  
                + (byte) ((b >> 5) & 0x1) + (byte) ((b >> 4) & 0x1)  
                + (byte) ((b >> 3) & 0x1) + (byte) ((b >> 2) & 0x1)  
                + (byte) ((b >> 1) & 0x1) + (byte) ((b >> 0) & 0x1);  
    } 
	

}
