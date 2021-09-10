package top.smartsoftware.datagram.model.shenghong.v28.code;

/**
 * Created by Jim on 2018/10/12.
 */
public class ChargeWorkState {


    /**0‐空闲中*/
    public static final int WORK_FREE = 0;
    /**1-正准备开始充电*/
    public static final int WORK_READY = 1;
    /**2‐充电进行中*/
    public static final int WORK_CHARGING = 2;
    /**3‐充电结束*/
    public static final int WORK_OVER = 3;
    /**4‐启动失败*/
    public static final int WORK_FAIL = 4;
    /**5‐预约状态*/
    public static final int WORK_RESEVE = 5;
    /**6‐系统故障(不能给汽车充 电)*/
    public static final int WORK_FALUT = 6;



    public static String getChargeWorkState(int code){
        switch (code) {
            case WORK_FREE:
                return "空闲中";
            case WORK_READY:
                return "正准备开始充电";
            case WORK_CHARGING:
                return "充电进行中";
            case WORK_OVER:
                return "充电结束";
            case WORK_FAIL:
                return "启动失败";
            case WORK_RESEVE:
                return "预约状态";
            case WORK_FALUT:
                return "系统故障";
            default:
                break;
        }
        return "";
    }
}
