package top.smartsoftware.datagram.model.kstar.v2;

import java.io.Serializable;

/**
 * 充电桩响应启停命令
 */
public class KStarCmd10ReqParam implements Serializable {
    //0x00 启动成功
    //0x01启动失败
    private Integer confirmFlag;

    public Integer getConfirmFlag() {
        return confirmFlag;
    }

    public void setConfirmFlag(Integer confirmFlag) {
        this.confirmFlag = confirmFlag;
    }
}