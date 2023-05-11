package com.sec.ggkt.result;

import lombok.Data;

@Data
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    // 成功方法,有Data
    public static<T> Result<T> ok(){
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setMessage("success");
        return result;
    }

    // 失败方法，没有Data
    public static<T> Result<T> fail(){
        Result<T> result = new Result<>();
        result.setCode(400);
        result.setMessage("fail");

        return result;
    }

    // 成功方法,有Data
    public static<T> Result<T> ok(T data){
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setMessage("success");
        if(data!=null){
            result.setData(data);
        }
        return result;
    }

    // 失败方法，有Data
    public static<T> Result<T> fail(T data){
        Result<T> result = new Result<>();
        result.setCode(400);
        result.setMessage("fail");
        if(data!=null){
            result.setData(data);
        }
        return result;
    }
}
