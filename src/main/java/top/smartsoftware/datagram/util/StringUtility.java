package top.smartsoftware.datagram.util;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 字符串分割工具类
 *
 */
public class StringUtility {


	/**
	 * 判断字符串是否为空
	 * @param str
	 * @return
	 */
	public static boolean isNullOrEmpty(String str){
		if(str == null || str.equals("")){
			return true;
		}
		return false;
	}


	public static boolean isNullOrEmpty(Object obj){
		if(obj instanceof String){
			return isNullOrEmpty((String)obj);
		}
		if(obj == null){
			return true;
		}

		return false;
	}

	/**
	 * 分割字符串，忽略无效的数字 （字符串格式： "1,44,25,...,32"，分隔符自定义）
	 * @param text 文本
	 * @param seperator 分隔符
	 * @return
	 */
	public static long[] splitUInt32(String text, char seperator)
	{
		List<Long> values = new ArrayList<Long>();
		long temp;
		String[] splits = text.split("\\" + seperator);
		for (String item : splits)
		{
			try{
				temp = Long.valueOf(item);
				values.add(temp);
			}catch(Exception e){
			}
		}
		long[] res = new long[values.size()];
		for(int i=0; i<res.length; i++){
			res[i] = values.get(i);
		}
		return res;
	}


	public static String toHex(byte n){
		return toHex(n, false);
	}

	public static String toHex(int n){
		return toHex(n, false);
	}

	public static String toHex(short n){
		return toHex(n, false);
	}

	public static String toHex(byte n, boolean with0x){
		if(with0x){
			return String.format("0x%02X", n);
		}
		return String.format("%02X", n);
	}

	public static String toHex(long n, boolean with0x){
		if(with0x){
			return String.format("0x%016X", n);
		}
		return String.format("%016X", n);
	}

	public static String toHex(int n, boolean with0x){
		if(with0x){
			return String.format("0x%08X", n);
		}
		return String.format("%08X", n);
	}

	public static String toHex(short n, boolean with0x){
		if(with0x){
			return String.format("0x%04X", n);
		}
		return String.format("%04X", n);
	}


	public static String toHex(byte[] values, boolean with0x){
		StringBuilder res = new StringBuilder(" ");
		if(values == null){
			return "";
		}
		for(byte value : values){
			res.append(StringUtility.toHex(value, with0x)).append(" ");
		}
		return res.toString();
	}

	public static String toHex(int[] values, boolean with0x){
		StringBuilder res = new StringBuilder(" ");
		for(int value : values){
			res.append(StringUtility.toHex(value, with0x)).append(" ");
		}
		return res.toString();
	}

	public static String toHex(short[] values, boolean with0x){
		StringBuilder res = new StringBuilder(" ");
		for(short value : values){
			res.append(StringUtility.toHex(value, with0x)).append(" ");
		}
		return res.toString();
	}


	public static String toHex(long[] values, boolean with0x){
		StringBuilder res = new StringBuilder(" ");
		for(long value : values){
			res.append(StringUtility.toHex(value, with0x)).append(" ");
		}
		return res.toString();
	}

	public static String toHex(byte[] values){
		return toHex(values, false);
	}


	public static String toHexString(byte[] values){
		StringBuilder res = new StringBuilder("[ ");
		for(byte value : values){
			res.append(StringUtility.toHex(value)).append(" ");
		}
		res.append("]");
		return res.toString();
	}


	public static String toDecimalString(byte[] values){
		StringBuilder res = new StringBuilder("[ ");
		for(byte value : values){
			res.append(value).append(".");
		}
		res.append("]");
		return res.toString();
	}


	public static byte[] getBytes(String str, String charset, int length, byte fillStub){
		try{
			byte[] data = str.getBytes(charset);
			byte[] res = new byte[length];
			int len = data.length > length ? length : data.length;
			System.arraycopy(data, 0, res, 0, len);
			if(len < length){
				Arrays.fill(res, len, length, fillStub);
			}
			return res;
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}
