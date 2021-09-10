package top.smartsoftware.datagram.util;

public class ConstUtil {

    public enum PROTOCOL {

        BACN_V16("BACN_V16", "百城V16协议"),
        BACN_V28("BACN_V28", "百城V28协议"),
        SH_V16("SH_V16", "盛宏V16协议"),
        SH_V28("SH_V28", "盛宏V28协议"),
        KSTAR_V1("KSTAR_V1", "科士达新协议"),
        KSTAR_V2("KSTAR_V2", "科士达旧协议");


        String protocolCode;
        String protocolName;

        PROTOCOL(String protocolCode, String protocolName) {
            this.protocolCode = protocolCode;
            this.protocolName = protocolName;
        }

        public String getProtocolCode() {
            return protocolCode;
        }

        public void setProtocolCode(String protocolCode) {
            this.protocolCode = protocolCode;
        }

        public String getProtocolName() {
            return protocolName;
        }

        public void setProtocolName(String protocolName) {
            this.protocolName = protocolName;
        }
    }
}



