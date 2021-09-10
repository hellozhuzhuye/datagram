package top.smartsoftware.datagram.util;



import java.math.BigDecimal;
import java.util.Date;


public class SHUtility {

	public static String bytesToSN(byte[] data){
		try{
			if(data == null || data.length == 0){
				return "";
			}
			return ByteUtility.fromASCII(data).trim();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
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
	
	public static byte[] toBytes(String str){
		if(StringUtility.isNullOrEmpty(str)){
			return ByteUtility.toASCII("", 32);
		}
		return ByteUtility.toASCII(str, 32);
	}
	
	public static byte[] toBytes(String str, int length){
		return ByteUtility.toASCII(str, length);
	}


	public static byte[] toASCIIWithoutNull(String str, int length){
		return ByteUtility.toASCIIWithoutNull(str, length);
	}
	
	public static byte[] toBytes(String str, String enc, int length){
		try{
			byte[] raw = str.getBytes(enc);
			byte[] res = new byte[length];
			if(length < raw.length){
				throw new Exception("length to short");
			}
			System.arraycopy(raw, 0, res, 0, length);
			return res;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return new byte[0];
		}
	}
	
	public static byte[] toBytes(Date date){
		String str = FormatUtility.formatDateTime(date, "yyyyMMddHHmmss");
		byte[] data = ByteUtility.toBCD(str);
		byte[] res = new byte[8];
		System.arraycopy(data, 0, res, 0, 7);
		res[7] = (byte) 0xff;
		return res;
	}
	
	public static Date toDate(byte[] data){
		String dstr = ByteUtility.fromBCD(data);
		dstr = dstr.substring(0, 14);
		return FormatUtility.parseDateTime(dstr, "yyyyMMddHHmmss");
	}



	public static byte[] getBytes(String str, int length){
		return StringUtility.getBytes(str, "GB2312", length, (byte)0x20);
	}

	public static byte[] getBytesWithNull(String str, int length){
		return StringUtility.getBytes(str, "GB2312", length, (byte)0x00);
	}
	
	public static BigDecimal toBigDecimal(long n){
		long intpart = n / 100;
		long decpart = Math.abs(n % 100);
		return new BigDecimal(intpart + "." + decpart);
	}
	
	public static int toInt(BigDecimal amt){
		int value = amt.multiply(new BigDecimal(100)).intValue();
		return value;
	}
	
	public static byte toByte(boolean flag){
		return flag ? (byte)1 : (byte)0;
	}


	public static String toHexString(byte[] values){
		StringBuilder res = new StringBuilder("[ ");
		for(byte value : values){
			res.append(StringUtility.toHex(value)).append(" ");
		}
		res.append("]");
		return res.toString();
	}


	public static String fromBytes(byte[] data, String enc){
		try{
			return new String(data, enc);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}


	
	
//	public static void main(String[] args) throws Exception{
//		int i = 32;
//		System.out.println(Integer.toBinaryString(i));
////		byte[] data = {0x20, 0x15, 0x07, 0x22, 0x13, 0x16, 0x15, (byte)0xff};
////		Date d = toDate(data);
////
////		System.out.println(d);
////
////		byte[] tmp = toBytes(d);
////		System.out.println(StringUtility.toHex(tmp));
////		BigDecimal amt = new BigDecimal(123.567);
////
////		System.out.println(toInt(amt));
////
////		String s = "tests123";
////		byte[] raw = s.getBytes("UTF-8");
////		byte[] tmpraw = new byte[raw.length + 20];
////		System.arraycopy(raw, 0, tmpraw, 0, raw.length);
////
////		String rs = bytesToSN(tmpraw);
////		System.out.println(rs);
////
////		System.out.println(toBigDecimal(-123456));
////
////		s = "闽A12345";
////		raw = s.getBytes("UTF-8");
////		System.out.println("UTF-8 len:" + raw.length);
////
////		raw = s.getBytes("GB2312");
////		System.out.println("GB2312 len" + raw.length);
//	}
	
}
