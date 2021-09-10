package top.smartsoftware.datagram.model.kstar.v2;

import java.io.Serializable;

/**
 * 平台下发启停参数
 */
public class KStarCmd10RspParam implements Serializable {
    //启停标识
    private byte bootSign;

    //用户
    private String userNo;

    //启停标识
    private String orderNo;

    //后台交易流水号
    private Integer bkOrderNo;

    //启停标识
    private int balance ;

    public byte getBootSign() {
        return bootSign;
    }

    public void setBootSign(byte bootSign) {
        this.bootSign = bootSign;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public Integer getBkOrderNo() {
        return bkOrderNo;
    }

    public void setBkOrderNo(Integer bkOrderNo) {
        this.bkOrderNo = bkOrderNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}