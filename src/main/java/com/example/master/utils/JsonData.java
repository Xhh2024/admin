package com.example.master.utils;

/**
 * pojo格式转换转换json格式
 * @author 谢环环
 * @date 2023/03/25
 */
public class JsonData {

    /**
     * 返回状态码 -1表示失败, 0表示成功
     */
    private Integer code;

    /**
     * json数据
     */
    private Object data;

    /**
     * 信息
     */
    private String msg;

    public JsonData(){}

    public JsonData(Integer code,Object data, String msg){
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    /**
     * 成功，不返回数据
     * @return
     */
    public static JsonData buildSuccess(){
        return new JsonData(0,null,null);
    }

    /**
     * 成功，返回数据
     * @param data
     * @return
     */
    public static JsonData buildSuccess(Object data){
        return new JsonData(0,data,null);
    }

    /**
     * 失败，返回失败信息
     * @param msg
     * @return
     */
    public static JsonData buildError(String msg){
        return new JsonData(-1,null,msg);
    }

    /**
     * 失败，返回失败信息和状态码
     * @param msg
     * @return
     */
    public static JsonData buildError(Integer code,String msg){
        return new JsonData(code,null,msg);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
