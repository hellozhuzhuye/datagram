package top.smartsoftware.datagram.factory;


import top.smartsoftware.datagram.model.BaseCommand;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class CommandFactory {

    private static String CMD_BASE_PACKAGE = "top.smartsoftware.datagram.model.shenghong";
    private static String CMD_HEAD = "ShCmd";

    /**
     * 缓存存在的class信息
     */
    private static final Map<String, Class<?>> clazz = new ConcurrentHashMap<String, Class<?>>();

    /**
     * 缓存不存在的class信息
     */
    private static final Map<String, Boolean> clazz_null = new ConcurrentHashMap<String, Boolean>();




    public static BaseCommand createCommand(int command, String version)  throws Exception {
        Class<?> c = getClazz(command, version);
        if (c == null)
            return null;
        else
            return (BaseCommand) c.newInstance();

    }

    /**
     * 获取类
     *
     * @param command
     * @param version
     * @return
     */
    protected static Class<?> getClazz(int command, String version) {
        String key = version + command;
        Class<?> c = clazz.get(key);
        if (c == null) {
            if (clazz_null.get(key) != null)
                return null;
            try {
                c = Class.forName(getBasePackage(version) + generateSubPackage(command));
            } catch (ClassNotFoundException e) {
                clazz_null.put(key, true);
                return null;
            }
            clazz.put(key, c);
        }
        return c;
    }


    /**
     * 按规则 组装全局 获取package
     *
     * @param version
     * @return
     */
    private static String getBasePackage(String version) {
        return CMD_BASE_PACKAGE+version+".";
    }


    /**
     * 按规则 组装全局 类名
     *
     * @param commandCode
     * @return
     */
    private static String generateSubPackage(int commandCode) {
        return CMD_HEAD + commandCode;
    }
}
