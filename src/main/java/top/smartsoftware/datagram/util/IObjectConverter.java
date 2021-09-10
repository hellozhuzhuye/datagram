package top.smartsoftware.datagram.util;

import java.io.Serializable;

/**
 * 对象转换器
 *
 */
public interface IObjectConverter extends Serializable {
	String convertAsString(Object obj);
	
	default String convertAsHexString(Object obj, boolean with0x){
		return convertAsString(obj);
	}
}
