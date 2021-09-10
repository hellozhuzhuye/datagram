package top.smartsoftware.datagram.model;

/**
 * socke指令基类
 */
public interface BaseCommand {

    public short getCid();

    public void bodyFromBytes(byte[] bytes) throws Exception;

    public byte[] bodyToBytes() throws Exception;

    public byte[] toBytes() throws Exception;

}
