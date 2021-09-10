package top.smartsoftware.datagram.model.kstar.v2;

import java.nio.ByteOrder;

/**
 * Created by Jim on 2018/6/5.
 */
public class KStarPacketConst {
    public static ByteOrder _byteOrder = ByteOrder.LITTLE_ENDIAN;

    public static final byte[] StartFlag = new byte[]{(byte)0x75, (byte)0x72};

    public static final byte EndFlag = (byte) 0x68;


    public static final byte Version = (byte) 0x10;
}
