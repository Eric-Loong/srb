package com.eric.srb.common.result;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;


@Data
public class R {//统一返回结果对象
    //响应状态码
    private Integer code;
    //响应信息
    private String message;
    //返回信息
    private Map<String, Object> data = new HashMap<>();

    //构造函数私有化
    private R() {
    }

    //返回成功结果
    public static R ok() {
        R r = new R();
        r.setCode(ResponseEnum.SUCCESS.getCode());
        r.setMessage(ResponseEnum.SUCCESS.getMessage());
        return r;
    }

    //返回失败结果
    public static R error() {
        R r = new R();
        r.setCode(ResponseEnum.ERROR.getCode());
        r.setMessage(ResponseEnum.ERROR.getMessage());
        return r;
    }

    //设定响应结果
    public static R setResult(ResponseEnum responseEnum) {
        R r = new R();
        r.setCode(responseEnum.getCode());
        r.setMessage(responseEnum.getMessage());
        return r;
    }

    //设置返回数据
    public R data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    //设置返回数据（表类型）
    public R data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }

    //设置返回消息
    public R message(String message) {
        this.setMessage(message);
        return this;
    }

    //设置返回消息
    public R code(Integer code) {
        this.setCode(code);
        return this;
    }
}
