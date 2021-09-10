package top.smartsoftware.datagram.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteOrder;

public class StreamWriter implements Serializable
{
	private static final long serialVersionUID = 8858843561940467092L;

	private ByteArrayOutputStream _stream=new ByteArrayOutputStream();
    private byte[] _buffer = new byte[8];
    private ByteOrder _byteOrder;

    public StreamWriter(){
        _byteOrder = ByteOrder.BIG_ENDIAN;
    }
    
    public ByteOrder order(){
    	return _byteOrder;
    }
    
    public void order(ByteOrder order){
    	this._byteOrder = order;
    }


    /// <summary>
    /// 
    /// </summary>
    public StreamWriter write(boolean value)
    {
		try {
			_stream.write(new byte[] { (byte) (value ? 1 : 0) });
		} catch (IOException ex) {
		}
		return this;
    }

    /// <summary>
    /// Writes a 1-byte unsigned integer value to the underlying stream.
    /// </summary>
    public StreamWriter write(byte value)
    {
		try {
			_stream.write(new byte[] { value });
		} catch (IOException ex) {
		}
		return this;
    }

    /// <summary>
    /// Writes a 2-byte signed integer value to the underlying stream.
    /// </summary>
    public StreamWriter write(short value)
    {
    	if(order() == ByteOrder.LITTLE_ENDIAN){
			_buffer[0] = (byte) (value & 0xFF);
			_buffer[1] = (byte) ((value & 0xFF00) >> 8);
    	}else{
            _buffer[0] = (byte)(value >> 8);
            _buffer[1] = (byte)value;
    	}
        _stream.write(_buffer,0,2);
		return this;
    }

    /// <summary>
    /// Writes a 4-byte signed integer value to the underlying stream.
    /// </summary>
	public StreamWriter write(int value) {
		if(order() == ByteOrder.LITTLE_ENDIAN){
			_buffer[0] = (byte) (value & 0xFF);
			_buffer[1] = (byte) ((value & 0xFF00) >> 8);
			_buffer[2] = (byte) ((value & 0xFF0000) >> 16);
			_buffer[3] = (byte) ((value & 0xFF000000) >> 24);
		}else{
			_buffer[0] = (byte) (value >> 24);
			_buffer[1] = (byte) (value >> 16);
			_buffer[2] = (byte) (value >> 8);
			_buffer[3] = (byte) value;
		}
		_stream.write(_buffer,0,4);
		return this;
	}

    public StreamWriter write(long value)
    {
    	if(order() == ByteOrder.LITTLE_ENDIAN){
			_buffer[0] = (byte) (value & 0xFFL);
			_buffer[1] = (byte) ((value & 0xFF00L) >> 8);
			_buffer[2] = (byte) ((value & 0xFF0000L) >> 16);
			_buffer[3] = (byte) ((value & 0xFF000000L) >> 24);
            _buffer[4] = (byte) ((value & 0xFF00000000L) >> 32);
            _buffer[5] = (byte) ((value & 0xFF0000000000L) >> 40);
            _buffer[6] = (byte) ((value & 0xFF000000000000L) >> 48);
            _buffer[7] = (byte) ((value & 0xFF00000000000000L) >> 56);
    	}else{
            _buffer[0] = (byte)(value >> 56);
            _buffer[1] = (byte)(value >> 48);
            _buffer[2] = (byte)(value >> 40);
            _buffer[3] = (byte)(value >> 32);
            _buffer[4] = (byte)(value >> 24);
            _buffer[5] = (byte)(value >> 16);
            _buffer[6] = (byte)(value >> 8);
            _buffer[7] = (byte)value;
    	}

        _stream.write(_buffer,0,8);
		return this;
    }
    
    public StreamWriter writeUInt32(long value){
    	if(order() == ByteOrder.LITTLE_ENDIAN){
			_buffer[0] = (byte) (value & 0xFFL);
			_buffer[1] = (byte) ((value & 0xFF00L) >> 8);
			_buffer[2] = (byte) ((value & 0xFF0000L) >> 16);
			_buffer[3] = (byte) ((value & 0xFF000000L) >> 24);
    	}else{
            _buffer[0] = (byte)(value >> 24);
            _buffer[1] = (byte)(value >> 16);
            _buffer[2] = (byte)(value >> 8);
            _buffer[3] = (byte)value;
    	}

        _stream.write(_buffer,0,4);
    	return this;
    }

    /// <summary>
    /// 写入用24位表示的数字。
    /// </summary>
    /// <param name="value"></param>
    public StreamWriter writeInt24(int value)
    {
    	if(order() == ByteOrder.LITTLE_ENDIAN){
            write(new byte[] {
            		(byte)(value & 0xFF),
            		(byte)((value & 0xFF00) >> 8),
            		(byte)((value & 0xFF0000) >> 16) 
            	  });
    	}else{
            write(new byte[] {
            		(byte)(value>>16),
            		(byte)(value>>8),
            		(byte)(value) 
            	  });
    	}
        return this;
    }
    
    public StreamWriter writeUInt16(int value){
    	if(order() == ByteOrder.LITTLE_ENDIAN){
            write(new byte[] {
            		(byte)(value & 0xFF),
            		(byte)((value & 0xFF00) >> 8)
            	  });
    	}else{
            write(new byte[] {
            		(byte)(value >> 8),
            		(byte)(value) 
            	  });
    	}
        return this;
    }

    /// <summary>
    /// 写入用8位或16位表示的数字。
    /// </summary>
    /// <param name="value"></param>
    public StreamWriter writeInt8or16(short value)
    {
        if (value > 0x7F)
        {
            write((short)(0x8000 | value));
        }
        else
        {
            write(new byte[]{(byte)value});
        }
        return this;
    }

    /// <summary>
    /// 写入用16位或32位表示的数字。
    /// </summary>
    /// <param name="value"></param>
    public StreamWriter writeInt16or32(int value)
    {
        if (value > 0x7FFF)
        {
            write((int)(0x80000000 | value));
        }
        else
        {
        	write((short)value);
        }
        return this;
    }
    
    /// <summary>
    /// Writes a sequence of bytes to the underlying stream
    /// </summary>
    public StreamWriter write(byte[] buffer)
    {
    	_stream.write(buffer,0,buffer.length);
		return this;
    }

    /// <summary>
    /// Writes a sequence of bytes to the underlying stream
    /// </summary>
    public StreamWriter write(byte[] buffer, int offset, int size)
    {
        _stream.write(buffer,offset,size);
        return this;
    }

    public StreamWriter writeString(String value)
    {
        if (value == null)
        {
            value = "";
        }
        
        byte[] bytes=new byte[]{};
        try{
           bytes=value.getBytes("UTF-8");
        } catch(Exception ex){
        	return this;
        }
        
        writeInt24(bytes.length);
        write(bytes);
        return this;
    }

    public StreamWriter writeShortString(String value)
    {
        if (value == null)
        {
            value = "";
        }

        byte[] bytes=new byte[]{};
		try {
			bytes = value.getBytes("UTF-8");
		} catch (IOException ex) {
			return this;
		}
        byte shortLen = (byte)bytes.length;
        if (bytes.length != shortLen) throw new Error("Value is larger that i can not been formatted by short string");
        write(shortLen);

        write(bytes);
        return this;
    }

    /// <summary>
    /// Gets the total stream length.
    /// </summary>
	public int length() {
		return _stream.size();
	}

    /// <summary>
    /// Gets the entire stream content as a byte array.
    /// </summary>
    public byte[] toArray()
    {
        return _stream.toByteArray();
    }
    
    public void clear()
    {
        if (this._stream != null)
        {
        	try {
				this._stream.close();
			} catch (IOException e) {
			}
        }
        this._stream=new ByteArrayOutputStream();
    }
}
