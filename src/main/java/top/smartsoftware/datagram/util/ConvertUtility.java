package top.smartsoftware.datagram.util;


import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

/**
 * 类型转换实用类，以静态方法提供类型转换常用的功能
 *
 */
public class ConvertUtility {

	private static HashMap<Class, IObjectConverter> _converters = new HashMap<Class, IObjectConverter>();
	
	static{
		IObjectConverter primitiveConverter = new PrimitiveArrayConverter();
		ConvertUtility.addConverter(byte[].class, primitiveConverter);
		ConvertUtility.addConverter(short[].class, primitiveConverter);
		ConvertUtility.addConverter(int[].class, primitiveConverter);
		ConvertUtility.addConverter(long[].class, primitiveConverter);
		ConvertUtility.addConverter(float[].class, primitiveConverter);
		ConvertUtility.addConverter(double[].class, primitiveConverter);
		ConvertUtility.addConverter(boolean[].class, primitiveConverter);

		ConvertUtility.addConverter(boolean.class, new BoolConverter());
		ConvertUtility.addConverter(Boolean.class, new BoolConverter());
		
		ConvertUtility.addConverter(Date.class, new DateTimeConverter());
	}

	public static void addConverter(Class type,IObjectConverter converter)
    {
        _converters.put(type, converter);
    }
	

	
	/**
	 * 获取指定值的int型
	 * @param value 需转换的值
	 * @return
	 */
	public static int getValueAsInt(Object value)
	{
		if(value instanceof Integer){
			return ((Integer)value).intValue();
		}
		if(value instanceof Double){
			Double v = (Double)value;
			return v.intValue();
		}
		if(value instanceof Float){
			Float v = (Float)value;
			return v.intValue();
		}
		try{
			String str = value.toString();
			if(str.startsWith("0x") || str.startsWith("0X")){
				str = str.substring(2);
				return ByteUtility.toInt(str);
			}else{
				BigDecimal dec = new BigDecimal(value.toString());
				return dec.intValue();
			}
		}catch(Exception e){
			return 0;
		}
	}
	
	public static short getValueAsShort(Object value){
		if(value instanceof Short){
			return ((Short)value).shortValue();
		}
		if(value instanceof Double){
			Double v = (Double)value;
			return v.shortValue();
		}
		if(value instanceof Float){
			Float v = (Float)value;
			return v.shortValue();
		}
		try{
			String str = value.toString();
			if(str.startsWith("0x") || str.startsWith("0X")){
				str = str.substring(2);
				return Short.parseShort(str, 16);
			}else{
				BigDecimal dec = new BigDecimal(value.toString());
				return dec.shortValue();
			}
		}catch(Exception e){
			return 0;
		}		
	}
	
	/**
	 * 获取uint32类型
	 * @param value 需转换的值
	 * @return
	 */
	public static long getValueAsUInt32(Object value)
    {
		try{
			String str = value.toString();
			long n = 0;
			if(str.startsWith("0x") || str.startsWith("0X")){
				str = str.substring(2);
				n = Long.parseLong(str, 16);
			}else{
				BigDecimal dec = new BigDecimal(value.toString());
				n = dec.longValue();
			}
			
			return 0x00000000ffffffffl & n;
		}catch(Exception e){
			return 0;
		}
    }
	
	/**
	 * 获取uint32类型
	 * @param value 需转换的值
	 * @return
	 */
	public static int getValueAsUInt(byte value)
    {
		return 0xff & value;
    }
	
	/**
	 * 获取uint32类型
	 * @param value 需转换的值
	 * @return
	 */
	public static int getValueAsUInt(short value)
    {
		return 0xffff & value;
    }
	
	/**
	 * 获取uint32类型
	 * @param value 需转换的值
	 * @return
	 */
	public static long getValueAsUInt(int value)
    {
		return 0x00000000ffffffffl & value;
    }
	
	/**
	 * 获取uint16类型
	 * @param value 需转换的值
	 * @return
	 */
	public static int getValueAsUInt16(Object value)
    {
		try{
			String str = value.toString();
			int n = 0;
			if(str.startsWith("0x") || str.startsWith("0X")){
				str = str.substring(2);
				n = Integer.parseInt(str, 16);
			}else{
				BigDecimal dec = new BigDecimal(value.toString());
				n = dec.intValue();
			}
			return 0xffff & n;
		}catch(Exception e){
			return 0;
		}
    }
	
	/**
	 * 获取uint8类型
	 * @param value 需转换的值
	 * @return
	 */
	public static short getValueAsUInt8(Object value)
	{
		try{
			String str = value.toString();
			short n = 0;
			if(str.startsWith("0x") || str.startsWith("0X")){
				str = str.substring(2);
				n = Short.parseShort(str, 16);
			}else{
				BigDecimal dec = new BigDecimal(value.toString());
				n = dec.shortValue();
			}
			int res = 0xff & n;
			return Integer.valueOf(res).shortValue();
		}catch(Exception e){
			return 0;
		}
	}
	
	public static byte getValueAsByte(Object value){
		if(value instanceof Byte){
			return ((Byte)value).byteValue();
		}
		try{
			String str = value.toString();
			if(str.startsWith("0x") || str.startsWith("0X")){
				str = str.substring(2);
				return ByteUtility.toByte(str);
			}else{
				BigDecimal dec = new BigDecimal(str);
				return dec.byteValue();
			}
		}catch(Exception e){
			return 0;
		}
	}
	
	public static BigDecimal getValueAsBigDecimal(Object value){
		if(value == null || StringUtility.isNullOrEmpty(value)){
			return new BigDecimal("0");
		}
		
		if(value instanceof BigDecimal){
			return (BigDecimal) value;
		}
		try{
			return new BigDecimal(value.toString());
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 获取指定值的long型
	 * @param value 需转换的值
	 * @return
	 */
	public static long getValueAsLong(Object value)
	{
		if(value instanceof Long){
			return ((Long)value).longValue();
		}
		if(value instanceof Double){
			Double v = (Double)value;
			return v.longValue();
		}
		if(value instanceof Float){
			Float v = (Float)value;
			return v.longValue();
		}
		try{
			String str = value.toString();
			if(str.startsWith("0x") || str.startsWith("0X")){
				str = str.substring(2);
				return ByteUtility.toLong(str);
			}else{
				BigDecimal dec = new BigDecimal(value.toString());
				return dec.longValue();
			}
		}catch(Exception e){
			return 0;
		}
	}
	
	/**
	 * 获得指定值的Float型，转换失败则返回0
	 * @param value 需转换的值
	 * @return
	 */
	public static float getValueAsFloat(Object value)
	{
		if(value instanceof Float){
			return ((Float)value).floatValue();
		}
		try{
			BigDecimal dec = new BigDecimal(value.toString());
			return dec.floatValue();
		}catch(Exception e){
			return 0;
		}
	}
	
	/**
	 * 获得指定值的double型，转换失败则返回0
	 * @param value 需转换的值
	 * @return
	 */
	public static double getValueAsDouble(Object value)
	{
		if(value instanceof Double){
			return ((Double)value).doubleValue();
		}
		try{
			BigDecimal dec = new BigDecimal(value.toString());
			return dec.doubleValue();
		}catch(Exception e){
			return 0;
		}
	}
		
	/**
	 * 获得指定值的string型，null则返回""
	 * @param value 需转换的值
	 * @return
	 */
	public static String getValueAsString(Object value)
	{
        if (value == null) return "";
        IObjectConverter convert = getConverter(value);
        if (convert != null)
        {
            return convert.convertAsHexString(value, false);
        }

        return value.toString();

	}
	
	/**
	 * 获得指定值的bool型，如果value是"N"或者"FALSE"(不区分大小写)则返回False，否则返回True
	 * @param value 需转换的值
	 * @return
	 */
	public static boolean getValueAsBool(Object value)
	{
		return getValueAsBool(value, true);
	}
	
	/**
	 * 获得指定值的bool型，如果value是"N"或者"FALSE"(不区分大小写)则返回False，否则返回True
	 * @param value value 需转换的值
	 * @param defaultValue 默认值
	 * @return
	 */
	public static boolean getValueAsBool(Object value,boolean defaultValue) 
	{
        if (value instanceof Boolean) return (Boolean) value;
        
        String valueStr = getValueAsString(value).toUpperCase();
        if (valueStr.equals("N") || valueStr.equals("FALSE") || valueStr.equals("NO") || valueStr.equals("0")) return false;
        if (valueStr.equals("Y") || valueStr.equals("TRUE") || valueStr.equals("YES") || valueStr.equals("1")) return true;
        
        return defaultValue;		
	}
	
	/**
	 * 获得指定值的日期类型
	 * @param value 需转换的值
	 * @return
	 */
	public static Date getValueAsDate(Object value){
		if(value == null){
			return null;
		}
		if(value instanceof Date){
			return (Date) value;
		}else if(value instanceof Calendar){
			Calendar cal = (Calendar) value;
			return cal.getTime();
		}
		try{
			return FormatUtility.parseDateTime(value.toString(), "yyyy-MM-dd HH:mm:ss");
		}catch(Exception e){
			return FormatUtility.parseDateTime(value.toString(), "yyyy-MM-dd");
		}
	}
	
	public static String getValueAsMSJsonDateStr(Date date){
		if(date == null){
			return "";
		}
		long ms = date.getTime();
		StringBuilder sb = new StringBuilder();
		sb.append("/Date(");
		sb.append(ms).append(')').append('/');
		return sb.toString();
	}
	
	public static Date getValueAsDateFromMSJsonDateStr(String datestr){
		if(StringUtility.isNullOrEmpty(datestr)){
			return null;
		}
		int s = datestr.indexOf('(');
		int e = datestr.indexOf(')');
		String msstr = datestr.substring(s+1, e);
		long ms = getValueAsLong(msstr);
		Date dt = new Date();
		dt.setTime(ms);
    	return dt;		
	}
	
	/**
	 * 将object数组转换成string数组
	 * @param values 源数组
	 * @return 返回string类型的目标数组
	 */
	public static String[] toString(Object[] values)
	{
        String[] result = new String[values.length];
        for (int i = 0; i < result.length; i++) 
        	result[i] = getValueAsString(values[i]);
        
        return result;
		
	}

	
    /**
     * 把整形数字以大端模式转换为4个元素的字节数组。
     * 转换后的字节数组，高位在低索引。
     * @param n 
     * @return 4个字节的数组，高位在低索引。
     */
    public static byte[] toBigEndianBytes(int n){
		byte[] res = new byte[4];
		
		res[3] = (byte)((n & 0x000000FF));
		res[2] = (byte)((n & 0x0000FFFF) >>> 8);
		res[1] = (byte)((n & 0x00FFFFFF) >>> 16);
		res[0] = (byte)(n >>> 24);
		
		return res;
    }
    
    public static byte[] toBigEndianBytesCompact(int n){
    	byte[] data = toBigEndianBytes(n);
    	return compactBytes(data);
    }
    
    public static byte[] compactBytes(byte[] data){
    	int zerocount = 0;
    	for(int i=0; i<data.length && data[i] == 0; i++, zerocount++) ;
    	
    	int len = data.length - zerocount;
    	byte[] res = new byte[len];
    	
    	System.arraycopy(data, zerocount, res, 0, len);
    	return res;
    }

    public static byte[] toBigEndianBytes(long n){
		byte[] res = new byte[8];
		
		res[7] = (byte)((n & 0xFFL));
		res[6] = (byte)((n & 0xFFFFL) >>> 8);
		res[5] = (byte)((n & 0xFFFFFFL) >>> 16);
		res[4] = (byte)((n & 0xFFFFFFFFL) >>> 24);
		res[3] = (byte)((n & 0xFFFFFFFFFFL) >>> 32);
		res[2] = (byte)((n & 0xFFFFFFFFFFFFL) >>> 40);
		res[1] = (byte)((n & 0xFFFFFFFFFFFFFFL) >>> 48);
		res[0] = (byte)(n >>> 56);
		
		return res;
    }

    public static byte[] toBigEndianBytesCompact(long n){
    	byte[] data = toBigEndianBytes(n);
    	return compactBytes(data);
    }
    

    /**
     * 把整形数字以小端模式转换为4个元素的字节数组。
     * 转换后的字节数组，低位在低索引。
     * @param n 
     * @return 4个字节的数组，低位在低索引。
     */
    public static byte[] toLittleEndianBytes(int n){
		byte[] res = new byte[4];
		
		res[0] = (byte)((n & 0x000000FF));
		res[1] = (byte)((n & 0x0000FFFF) >>> 8);
		res[2] = (byte)((n & 0x00FFFFFF) >>> 16);
		res[3] = (byte)(n >>> 24);
		
		return res;
    }


	/**
	 * 获取对象对应的转换器
	 * @param obj
	 * @return
	 */
	public static IObjectConverter getConverter(Object obj)
	{
		if(obj == null){
			return null;
		}
		for(Class objclass : _converters.keySet()){
			if(objclass.equals(obj.getClass())){
				return _converters.get(objclass);
			}
		}

		return null;
	}
    
    /**
     * 把字节数组以小端模式拼接为整形。
     * @param bytes
     * @return
     */
    public static int toIntByLittleEdian(byte[] bytes){
		int result = 0;
		for (int i = bytes.length - 1; i >= 0; i--)
		{
			int tmp = bytes[i] & 0x000000FF;
			result += tmp << (i * 8);
		}
		return result;    	
    }

    /**
     * 把字节数组以大端模式拼接为整形。
     * @param bytes
     * @return
     */
    public static int toIntByBigEdian(byte[] bytes){
		int result = 0;
		for (int i = 0; i < bytes.length; i++)
		{
			int tmp = bytes[i] & 0x000000FF;
			result += tmp << ((bytes.length - i - 1) * 8);
		}
		return result;    	
    }

    /**
     * 把字节的高低位进行对调。
     * @param n
     * @return
     */
	public static byte inverseByte(byte n){
		byte res = 0;
		res |= (byte) ((n << 7) & 0x80);
		res |= (byte) ((n >>> 7) & 0x01);
		res |= (byte) ((n << 5) & 0x40);
		res |= (byte) ((n >>> 5) & 0x02);
		res |= (byte) ((n << 3) & 0x20);
		res |= (byte) ((n >>> 3) & 0x04);
		res |= (byte) ((n << 1) & 0x10);
		res |= (byte) ((n >>> 1) & 0x08);
		
		return res;
	}
	
	/**
	 * 把整形数字中的每个字节进行高低位对调。整形中的字节序以小端模式为准（低位在低索引）
	 * @param n
	 * @return
	 */
	public static int inverseBytesByLittleEndian(int n){
		byte[] num = toLittleEndianBytes(n);
		for(int i=0; i<num.length; i++){
			num[i] = inverseByte(num[i]);
		}
		return toIntByLittleEdian(num);
	}

	/**
	 * 把整形数字中的每个字节进行高低位对调。整形中的字节序以大端模式为准（高位在低索引）
	 * @param n
	 * @return
	 */
	public static int inverseBytesByBigEndian(int n){
		byte[] num = toBigEndianBytes(n);
		for(int i=0; i<num.length; i++){
			num[i] = inverseByte(num[i]);
		}
		return toIntByBigEdian(num);
	}


	
	public static boolean isLeap(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int y = cal.get(Calendar.YEAR);
		
		if(y % 100 == 0){
			if(y % 400 == 0){
				return true;
			}
			return false;
		}
		
		return y % 4 == 0;
	}
	
	public static int getLastDayOfMonth(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int n = cal.get(Calendar.MONTH);
		if(n == 1){
			if(isLeap(date)){
				return 29;
			}
			return 28;
		}
				
		if(n == 0 || n == 2 || n == 4 || n == 6 || n == 7 || n == 9 || n == 11){
			return 31;
		}
		return 30;
	}
	
    

	
	
	
	
	private static class DateTimeConverter implements IObjectConverter
	{

		private static final long serialVersionUID = 3154457975794736749L;

		@Override
		public String convertAsString(Object obj) {
            if (obj instanceof Date) return FormatUtility.formatDateTime((Date)obj, "yyyyMMddHHmmss");
            return null;
		}
		
	}
	
	private static class PrimitiveArrayConverter implements IObjectConverter
	{

		private static final long serialVersionUID = 4081785542665022007L;

		@Override
		public String convertAsString(Object obj) {
			if(obj == null){
				return null;
			}
            StringBuilder sb = new StringBuilder();
            if (obj instanceof byte[])
            {
                byte[] bytes = (byte[]) obj;
                for (byte c : bytes)
                {
                    sb.append(getValueAsUInt(c) + ", ");
                }
                return sb.toString();
                
            }else if(obj instanceof int[]){
            	int[] bytes = (int[]) obj;
                for (int c : bytes)
                {
                    sb.append(getValueAsUInt(c) + ", ");
                }
                return sb.toString();
            	
            }else if(obj instanceof short[]){
            	short[] bytes = (short[]) obj;
                for (short c : bytes)
                {
                    sb.append(getValueAsUInt(c) + ", ");
                }
                return sb.toString();
            	
            }else if(obj instanceof long[]){
            	long[] bytes = (long[]) obj;
                for (long c : bytes)
                {
                    sb.append(c + ", ");
                }
                return sb.toString();
            	
            }else if(obj instanceof float[]){
            	float[] bytes = (float[]) obj;
                for (float c : bytes)
                {
                    sb.append(c + ", ");
                }
                return sb.toString();
            	
            }else if(obj instanceof double[]){
            	double[] bytes = (double[]) obj;
                for (double c : bytes)
                {
                    sb.append(c + ", ");
                }
                return sb.toString();
            	
            }else if(obj instanceof boolean[]){
            	boolean[] bytes = (boolean[]) obj;
                for (boolean c : bytes)
                {
                    sb.append(c + ", ");
                }
                return sb.toString();
            	
            }
            return null;
		}
		
		@Override
		public String convertAsHexString(Object obj, boolean with0x) {
			if(obj == null){
				return null;
			}
            StringBuilder sb = new StringBuilder();
            if (obj instanceof byte[])
            {
                byte[] bytes = (byte[]) obj;
                return StringUtility.toHex(bytes, with0x);
                
            }else if(obj instanceof int[]){
            	int[] bytes = (int[]) obj;
                return StringUtility.toHex(bytes, with0x);
            	
            }else if(obj instanceof short[]){
            	short[] bytes = (short[]) obj;
                return StringUtility.toHex(bytes, with0x);
            	
            }else if(obj instanceof long[]){
            	long[] bytes = (long[]) obj;
                return StringUtility.toHex(bytes, with0x);
            	
            }else if(obj instanceof float[]){
            	float[] bytes = (float[]) obj;
                for (float c : bytes)
                {
                    sb.append(c + ", ");
                }
                return sb.toString();
            	
            }else if(obj instanceof double[]){
            	double[] bytes = (double[]) obj;
                for (double c : bytes)
                {
                    sb.append(c + ", ");
                }
                return sb.toString();
            	
            }else if(obj instanceof boolean[]){
            	boolean[] bytes = (boolean[]) obj;
                for (boolean c : bytes)
                {
                    sb.append(c + ", ");
                }
                return sb.toString();
            	
            }
            return null;
		}
		
	}
	
	private static class BoolConverter implements IObjectConverter
	{

		private static final long serialVersionUID = -3547556942163508067L;

		@Override
		public String convertAsString(Object obj) {
			if(obj != null){
				String str = obj.toString();
				boolean res = Boolean.valueOf(str);
				return res ? "1" : "0";
			}
			
            return null;
		}
		
	}



	
	

	
}
