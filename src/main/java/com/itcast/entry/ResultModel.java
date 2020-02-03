package com.itcast.entry;

/**
 * @作者 itcast
 * @创建日期 2020/2/3 10:04
 **/
public class ResultModel {
    private String code; // 返回的状态   200 成功   500 服务器 403无权限
    private String msg;//返回的消息
    private Object data; //返回的数据

    public ResultModel(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public ResultModel(String code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public ResultModel() {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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
