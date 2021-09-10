package top.smartsoftware.datagram.model.kstar.v1;

import java.io.Serializable;

public  class KStarCmd14RspParam implements Serializable {
    private byte acceptConfirmFlag;

    public byte getAcceptConfirmFlag() {
        return acceptConfirmFlag;
    }

    public void setAcceptConfirmFlag(byte acceptConfirmFlag) {
        this.acceptConfirmFlag = acceptConfirmFlag;
    }
}