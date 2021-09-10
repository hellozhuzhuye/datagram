package top.smartsoftware.datagram.model.shenghong.v28.code;

import top.smartsoftware.datagram.util.SHUtility;

/**
 * cmd10
 */
public class ApplicationParam {
    public static final int REQUEST_GENERATE_PREPAID_PAY_QRCODE = 1;
    public static final int parameter_A= 2;

   /*
   预留3到100
   public static final int parameter_3to100= ;*/



    public static String getCharCause(int code){
        switch (code) {
            case REQUEST_GENERATE_PREPAID_PAY_QRCODE:
                return "请求生成预付费支付二维码";
            case parameter_A:
                return "预留";
            default:
                break;
        }
        return "";
    }


    public static String getStrFormBytes(int code, byte[] cmd_bytes) {
        switch (code) {
            case REQUEST_GENERATE_PREPAID_PAY_QRCODE:
            case parameter_A:
                return SHUtility.bytesToSN(cmd_bytes);
            default:
                break;
        }
        return "";
    }
}
