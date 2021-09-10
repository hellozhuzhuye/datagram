package top.smartsoftware.datagram.factory;

import top.smartsoftware.datagram.service.BaseDatagramAnalysisService;

import java.util.HashMap;
import java.util.Map;

public class DatagramAnalysisFactory {

    private static Map<String, BaseDatagramAnalysisService> SERVICE_REGISTERS = new HashMap<>();

    public static void register(String protocolCode, BaseDatagramAnalysisService datagramAnalysisService) {
        if (null != protocolCode && !"".equals(protocolCode)) {
            SERVICE_REGISTERS.put(protocolCode, datagramAnalysisService);
        }
    }

    public static BaseDatagramAnalysisService get(String protocolCode) {
        return SERVICE_REGISTERS.get(protocolCode);
    }
}
