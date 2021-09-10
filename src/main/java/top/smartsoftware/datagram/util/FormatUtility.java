package top.smartsoftware.datagram.util;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 常用类型格式转换实用类，以静态方法提供常用类型格式转换的功能
 * 常用类型格式的处理或转换：支持多种格式，用法如下：
 * <ul>
 * <li>formatNumberString(1234.5,"0") &emsp; // 1235，</li>
 * <li>formatNumberString(12345,"0.00") &emsp; // 12345.00，</li>
 * <li>formatNumberString(1234.0552,"0.000") &emsp; // 1234.056，</li>
 * <li>formatNumberString(12345,"0.00%") &emsp; // 1234500.00%，</li>
 * <li>formatNumberString(12345,"$0.00") &emsp; // $12345.00，</li>
 * <li>formatNumberString(12345,"共0公斤") &emsp; // 共12345公斤，</li>
 * <li>formatNumberString(12345,"#,###.00") &emsp; // 12,345.00</li>
 * </ul>
 * 参数一可以为（Float, int, string, double类型)，返回值为string型
 * <br>
 *
 */
public class FormatUtility {
	private static String FORMAT_STRING="yyyyMMddHHmmssSSS";
	private static SimpleDateFormat _yyyyMMddHHmmssSSSFormat=new SimpleDateFormat(FORMAT_STRING);
	private static SimpleDateFormat _yyyyMMddHHmmssFormat=new SimpleDateFormat("yyyyMMddHHmmss");
	private static SimpleDateFormat _yyyyMMddFormat=new SimpleDateFormat("yyyyMMdd");
	
	static private Date _errorDate = null;
	
	public static Date errorDate(){
		if(_errorDate == null){
	    	Calendar cal = Calendar.getInstance();
	    	cal.set(1, 0, 1, 0, 0, 0);
	    	_errorDate = cal.getTime();		
		}
		return _errorDate;
	}
	
	public static String yyyyMMddHHmmss(Date date){
		return _yyyyMMddHHmmssFormat.format(date);
	}
	
	public static String yyyyMMddHHmmssSSS(Date date){
		return _yyyyMMddHHmmssSSSFormat.format(date);
	}
	
	public static String yyyyMMdd(Date date){
		return _yyyyMMddFormat.format(date);
	}
	
	/**
	 * 根据formart格式（如"0.00%"）格式化数字格式，返回string
	 * @param valueDouble 源数字
	 * @param format 格式（如"0.00%"、"$0.0元"、"#,###.00"等
	 * @return
	 */
    static public String formatNumberString(double valueDouble, String format)
    {
        if (format == null || format == "" || Double.isNaN(valueDouble))
            return "";

        String valueStr = MessageFormat.format("{0, number," + format + "}", valueDouble);

		if(valueStr.startsWith("."))
			valueStr = "0" + valueStr;

        return valueStr;
    }
    
    /**
     * 根据formart（如"0.00%"）把指定的数字进行格式化，返回string
     * @param valueFloat 源数字
     * @param format 格式（如"0.00%"、"$0.0元"、"#,###.00"等
     * @return
     */
    static public String formatNumberString(float valueFloat, String format)
    {
        return formatNumberString(valueFloat + "", format);
    }
    
    /**
     * 根据formart（如"0.00%"）把指定的值进行格式化，返回string
     * @param valueInt 源数字
     * @param format 格式（如"0.00%"、"$0.0元"、"#,###.00"等
     * @return
     */
    static public String FormatNumberString(int valueInt, String format)
    {
        return formatNumberString(valueInt + "", format);
    }
    
    /**
     * 根据formart（如"0.00%"）把指定的值进行格式化，返回string
     * @param valueStr 源数字
     * @param format 格式（如"0.00%"、"$0.0元"、"#,###.00"等
     * @return
     */
    static public String formatNumberString(String valueStr, String format)
    {
        if (valueStr == null || format == null || format == "")
            return "";

        double valueDouble = 0;
        try
        {
            valueDouble = Double.valueOf(valueStr);
        }
        catch (Exception e) { }
        return formatNumberString(valueDouble, format);
    }
    
    /**
     * 将valueStr进行替换处理，使其符合xml的字符规则：需转换的字符有："&amp;"、"&lt;"、"&gt;"，
     * @param valueObj
     * @return
     */
    static public String formatStringForXML(Object valueObj)
    {
        return formatStringForXML(valueObj == null ? "null" : valueObj.toString(), false);
    }
    
    /**
     * 将valueStr进行替换处理，使其符合xml的字符规则:需转换的字符有："&amp;"、"&lt;"、"&gt;"，
     * 如果quoted为true，刚表示返回结果需再加上双引号
     * @param valueObj
     * @param quoted
     * @return
     */
    static public String formatStringForXML(Object valueObj, boolean quoted)
    {
        return formatStringForXML(valueObj == null ? "null" : valueObj.toString(), quoted);
    }
    
    /**
     * 将字符串进行替换处理，使其符合xml的字符规则:需转换的字符有："&amp;"、"&lt;"、"&gt;"，
     * @param valueStr 源字串
     * @return
     */
    static public String formatStringForXML(String valueStr)
    {
        return formatStringForXML(valueStr, false);
    }
    
    /**
     * 将字符串进行替换处理，使其符合xml属性的字符规则:需转换的字符有："&amp;"、"\"、"&lt;"、"&gt;"等
     * @param valueStr 源字串
     * @param quoted 是否在返回值两边加上双引号
     * @return
     */
    static public String formatStringForXMLAttribute(String valueStr, boolean quoted)
    {
        valueStr = formatStringForXML(valueStr, false);
        valueStr = valueStr.replace("\"", "&quot;");
        if (quoted) valueStr = "\"" + valueStr + "\"";
        return valueStr;
    }
    
    /**
     * 将valueStr进行替换处理，使其符合xml的字符规则:需转换的字符有："&amp;"、"&lt;"、"&gt;"，
     * 如果quoted为true，刚表示返回结果需再加上双引号
     * @param valueStr 源字串
     * @param quoted 是否在返回值两边加上双引号
     * @return
     */
    static public String formatStringForXML(String valueStr, boolean quoted)
    {
        if (valueStr == null) valueStr = "";
        valueStr = valueStr.replace("&", "&#38;");
        valueStr = valueStr.replace("<", "&lt;");
        valueStr = valueStr.replace(">", "&gt;");
        if (quoted) valueStr = "\"" + valueStr + "\"";
        return valueStr;
    }
    
    /**
     * 是否是有效的xml字符
     * @param character
     * @return
     */
    public static boolean isLegalXmlChar(char character)
    {
        return
        !(
             (character >= 0x00 && character <= 0x08) ||
             (character >= 0x0B && character <= 0x0C) ||
             (character >= 0x0E && character <= 0x1F) ||
             (character == 0x7F)
        );
    }
    
    /**
     * 清洁xml字符串，把不合法的字符去掉
     * @param sourceStr
     * @return
     */
    public static String sanitizeXmlString(String sourceStr)
    {
        if (sourceStr == null) return sourceStr;

        StringBuilder buffer = new StringBuilder(sourceStr.length());

        for (char c : sourceStr.toCharArray())
        {
            if (isLegalXmlChar(c))
            {
                buffer.append(c);
            }
        }

        return buffer.toString();

    }
    
    /**
     * 将DateTime值转换成指定格式的日期字符串
     * @param dt
     * @param format 日期格式
     * @return 返回对应格式的string值
     */
    static public String formatDateTime(Date dt, String format)
    {
        format = convertFormat(format);
        SimpleDateFormat df = new SimpleDateFormat(format);
        String result = df.format(dt);

        //以下用于防止特别日期选项（民国日期）时造成转换结果与实际formart不符
        if (result.length() != format.length())
        {
            df = new SimpleDateFormat(format, Locale.PRC);
            result = df.format(dt);
        }
        return result;
    }
    
    /**
     * 将string形式的日期转换成Date类型
     * @param dateTimeStr 源日期string
     * @param format 源日期格式
     * @return 返回转换后的Date类型
     */
    static public Date parseDateTime(String dateTimeStr, String format)
    {
        try
        {
            return parseDateTime2(dateTimeStr, format);
        }
        catch (Exception e)
        {
            return errorDate();
        }
    }
    
    
    static private Date parseDateTime2(String dateTimeStr, String format)
    {
    	dateTimeStr = dateTimeStr.trim();
    	format = format.trim();
    	
        Calendar cal = Calendar.getInstance();
        int year = 1970;
        int month = 0;
        int day = 1;
        int hour = 0;
        int minute = 0;
        int second = 0;
        int ms = 0;

        String tmpformat = convertFormat(format);
        if (tmpformat.equals("yyyyMM"))
        {
            year = Integer.valueOf(dateTimeStr.substring(0, 4));
            month = Integer.valueOf(dateTimeStr.substring(4)) - 1;
        }
        else if (tmpformat.equals("yyyy/MM"))
        {
            year = Integer.valueOf(dateTimeStr.substring(0, 4));
            month = Integer.valueOf(dateTimeStr.substring(5)) - 1;
        }
        else if (tmpformat.equals("yyyyMMdd"))
        {
            year = Integer.valueOf(dateTimeStr.substring(0, 4));
            month = Integer.valueOf(dateTimeStr.substring(4, 6)) - 1;
            day = Integer.valueOf(dateTimeStr.substring(6));

        }
        else if (tmpformat.equals("yyyy/MM/dd"))
        {
            year = Integer.valueOf(dateTimeStr.substring(0, 4));
            month = Integer.valueOf(dateTimeStr.substring(5, 7)) - 1;
            day = Integer.valueOf(dateTimeStr.substring(8)) - 1;
        }
        else if (tmpformat.equals("yyyy/MM/dd HH:mm"))
        {
            year = Integer.valueOf(dateTimeStr.substring(0, 4));
            month = Integer.valueOf(dateTimeStr.substring(5, 7)) - 1;
            day = Integer.valueOf(dateTimeStr.substring(8));
            if (dateTimeStr.length()>11)
            hour = Integer.valueOf(dateTimeStr.substring(11, 13));
            if (dateTimeStr.length() > 14)
            minute = Integer.valueOf(dateTimeStr.substring(14, 16));
        }
        else if (tmpformat.equals("yyyyMMddHHmm"))
        {
            year = Integer.valueOf(dateTimeStr.substring(0, 4));
            month = Integer.valueOf(dateTimeStr.substring(4, 6)) - 1;
            day = Integer.valueOf(dateTimeStr.substring(6, 8));
            if (dateTimeStr.length() > 8)
            hour = Integer.valueOf(dateTimeStr.substring(8, 10));
            if (dateTimeStr.length() > 10)
            minute = Integer.valueOf(dateTimeStr.substring(10, 12));
        }
        else if (tmpformat.equals("yyyyMMddHHmmss"))
        {
            year = Integer.valueOf(dateTimeStr.substring(0, 4));
            month = Integer.valueOf(dateTimeStr.substring(4, 6)) - 1;
            day = Integer.valueOf(dateTimeStr.substring(6, 8));
            if (dateTimeStr.length() > 8)
            hour = Integer.valueOf(dateTimeStr.substring(8, 10));
            if (dateTimeStr.length() > 10)
            minute = Integer.valueOf(dateTimeStr.substring(10, 12));
            if (dateTimeStr.length() > 12)
            second = Integer.valueOf(dateTimeStr.substring(12, 14));
        }
        else if (tmpformat.equals("yyMMddHHmmss"))
        {
            year = 2000 + Integer.valueOf(dateTimeStr.substring(0, 2));
            if(year >= 2090){
            	year -= 100; 
            }
            month = Integer.valueOf(dateTimeStr.substring(2, 4)) - 1;
            day = Integer.valueOf(dateTimeStr.substring(4, 6));
            if (dateTimeStr.length() > 8)
            hour = Integer.valueOf(dateTimeStr.substring(6, 8));
            if (dateTimeStr.length() > 10)
            minute = Integer.valueOf(dateTimeStr.substring(8, 10));
            if (dateTimeStr.length() > 12)
            second = Integer.valueOf(dateTimeStr.substring(10, 12));
        }
        else if (tmpformat.equals("yyyyMMddHHmmssSSS"))
        {
            year = Integer.valueOf(dateTimeStr.substring(0, 4));
            month = Integer.valueOf(dateTimeStr.substring(4, 6)) - 1;
            day = Integer.valueOf(dateTimeStr.substring(6, 8));
            if (dateTimeStr.length() > 8)
            hour = Integer.valueOf(dateTimeStr.substring(8, 10));
            if (dateTimeStr.length() > 10)
            minute = Integer.valueOf(dateTimeStr.substring(10, 12));
            if (dateTimeStr.length() > 12)
            second = Integer.valueOf(dateTimeStr.substring(12, 14));
            if (dateTimeStr.length() > 14)
            ms = Integer.valueOf(dateTimeStr.substring(14));            
        }
        else if (tmpformat.equals("HHmm"))
        {
            hour = Integer.valueOf(dateTimeStr.substring(0, 2));
            minute = Integer.valueOf(dateTimeStr.substring(2));
        }
        else if (tmpformat.equals("HH:mm"))
        {
            hour = Integer.valueOf(dateTimeStr.substring(0, 2));
            minute = Integer.valueOf(dateTimeStr.substring(3));
        }
        else if (tmpformat.equals("HHmmss"))
        {
            hour = Integer.valueOf(dateTimeStr.substring(0, 2));
            minute = Integer.valueOf(dateTimeStr.substring(2, 4));
            second = Integer.valueOf(dateTimeStr.substring(4, 6));
        }
        else if (tmpformat.equals("HH:mm:ss"))
        {
            hour = Integer.valueOf(dateTimeStr.substring(0, 2));
            minute = Integer.valueOf(dateTimeStr.substring(3, 5));
            second = Integer.valueOf(dateTimeStr.substring(6, 8));
        }
        else if (tmpformat.equals("yyyy-MM-dd"))
        {
            year = Integer.valueOf(dateTimeStr.substring(0, 4));
            month = Integer.valueOf(dateTimeStr.substring(5, 7)) - 1;
            day = Integer.valueOf(dateTimeStr.substring(8, 10));
        }
        else if (tmpformat.equals("yyyy-MM-dd HH:mm"))
        {
            year = Integer.valueOf(dateTimeStr.substring(0, 4));
            month = Integer.valueOf(dateTimeStr.substring(5, 7)) - 1;
            day = Integer.valueOf(dateTimeStr.substring(8, 10));
            hour = Integer.valueOf(dateTimeStr.substring(11, 13));
            minute = Integer.valueOf(dateTimeStr.substring(14, 16));
        }
        else if (tmpformat.equals("yyyy-MM-dd HH:mm:ss"))
        {
            year = Integer.valueOf(dateTimeStr.substring(0, 4));
            month = Integer.valueOf(dateTimeStr.substring(5, 7)) - 1;
            day = Integer.valueOf(dateTimeStr.substring(8, 10));
            hour = Integer.valueOf(dateTimeStr.substring(11, 13));
            minute = Integer.valueOf(dateTimeStr.substring(14, 16));
            second = Integer.valueOf(dateTimeStr.substring(17,19));
        }
        else if (tmpformat.equals("yyyy-MM-dd HH:mm:ss.S") || tmpformat.equals("yyyy-MM-dd HH:mm:ss.SSS"))
        {
            year = Integer.valueOf(dateTimeStr.substring(0, 4));
            month = Integer.valueOf(dateTimeStr.substring(5, 7)) - 1;
            day = Integer.valueOf(dateTimeStr.substring(8, 10));
            hour = Integer.valueOf(dateTimeStr.substring(11, 13));
            minute = Integer.valueOf(dateTimeStr.substring(14, 16));
            second = Integer.valueOf(dateTimeStr.substring(17, 19));
            ms = Integer.valueOf(dateTimeStr.substring(20));
        }
        cal.set(year, month, day, hour, minute, second);
        cal.set(Calendar.MILLISECOND, ms);
        return cal.getTime();
    }

    public static String convertFormat(String format)
    {
        String tmpformat = format.toUpperCase();
        String res = format;
        if (tmpformat.equals("YYYYMM")) res = "yyyyMM";
        else if (tmpformat.equals("YYYY/MM")) res = "yyyy/MM";
        else if (tmpformat.equals("YYYYMMDD")) res = "yyyyMMdd";
        else if (tmpformat.equals("YYYY/MM/DD")) res = "yyyy/MM/dd";
        else if (tmpformat.equals("YYYY/MM/DD HH:MM")) res = "yyyy/MM/dd HH:mm";
        else if (tmpformat.equals("YYYYMMDDHHMM")) res = "yyyyMMddHHmm";
        else if (tmpformat.equals("YYYYMMDDHHMMSS")) res = "yyyyMMddHHmmss";
        else if (tmpformat.equals("YYYYMMDDHHMMSSSSS")) res = "yyyyMMddHHmmssSSS";
        else if (tmpformat.equals("HHMM")) res = "HHmm";
        else if (tmpformat.equals("HH:MM")) res = "HH:mm";
        else if (tmpformat.equals("HHMMSS")) res = "HHmmss";
        else if (tmpformat.equals("HH:MM:SS")) res = "HH:mm:ss";
        else if (tmpformat.equals("YYYY-MM-DD")) res = "yyyy-MM-dd";
        else if (tmpformat.equals("YYYY-MM-DD HH:MM:SS")) res = "yyyy-MM-dd HH:mm:ss";
        else if (tmpformat.equals("YYYY-MM-DD HH:MM:SS.S")) res = "yyyy-MM-dd HH:mm:ss.S";
        else if (tmpformat.equals("YYYY-MM-DD HH:MM:SS.SSS")) res = "yyyy-MM-dd HH:mm:ss.SSS";
        else if (tmpformat.equals("YYYY-MM-DD HH:MM")) res = "yyyy-MM-dd HH:mm";
        else if (tmpformat.equals("YYMMDDHHMMSS")) res = "yyMMddHHmmss";

        return res;
    }



}
