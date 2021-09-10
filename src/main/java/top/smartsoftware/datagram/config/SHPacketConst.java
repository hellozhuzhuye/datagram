package top.smartsoftware.datagram.config;

import java.nio.ByteOrder;

/**
 * Created by Jim on 2018/6/5.
 */
public class SHPacketConst {
    public static ByteOrder _byteOrder = ByteOrder.LITTLE_ENDIAN;

    public static final byte[] StartFlag = new byte[]{(byte)0xAA, (byte)0xF5};
}
