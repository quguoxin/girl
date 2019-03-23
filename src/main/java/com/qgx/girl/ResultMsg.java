package com.qgx.girl;

import lombok.Data;

@Data
public class ResultMsg<T> {

    private int code;
    private String msg;
    private T data;

    public static <T> ResultMsg<T> success(T data) {
        return new ResultMsg<T>(data);
    }


    public static <T> ResultMsg<T> error(ErrorMsg errorMsg) {
        return new ResultMsg<T>(errorMsg);
    }

    private ResultMsg(T data) {
        this.code = 0;//默认000000是成功
        this.msg = "SUCCESS";
        this.data = data;
    }

    private ResultMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private ResultMsg(ErrorMsg errorMsg) {
        if (errorMsg != null) {
            this.code = errorMsg.getCode();
            this.msg = errorMsg.getMsg();
        }
    }

}

