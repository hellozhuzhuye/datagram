package top.smartsoftware.datagram.util;

public class CommonResponse {

    private Integer code;	//返回码
    private String msg;		//返回提示信息
    private Object extraInfo;
    private Object data;	//返回数据

    /**
     * 成功请求
     * @param data
     * @return
     */
    public static CommonResponse success(Object data){
        CommonResponse res = new CommonResponse();
        res.setCode(1000);
        res.setMsg("请求成功");
        res.setData(data);
        return res;
    }

    /**
     * 成功请求
     * @param
     * @return
     */
    public static CommonResponse success(){
        CommonResponse res = new CommonResponse();
        res.setCode(1000);
        res.setMsg("请求成功");
        res.setData(null);
        return res;
    }

    /**
     * 返回自定义数据
     * @param msg
     * @param errorCode
     * @return
     */
    public static CommonResponse custom(String msg, int errorCode){
        CommonResponse res = new CommonResponse();
        res.setCode(errorCode);
        res.setMsg(msg);
        res.setData(null);
        return res;
    }

    /**
     * 返回自定义数据
     * @param msg
     * @param errorCode
     * @param data
     * @return
     */
    public static CommonResponse custom(String msg, int errorCode, Object data){
        CommonResponse res = new CommonResponse();
        res.setCode(errorCode);
        res.setMsg(msg);
        res.setData(data);
        return res;
    }

    public Object getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(Object extraInfo) {
        this.extraInfo = extraInfo;
    }

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
