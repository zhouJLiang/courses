package com.q.courses.code;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author zjl
 * @Date 2019/4/17 22:59
 */
@Data
public class Result implements Serializable {
    //判断结果
    private boolean success;
    //返回信息
    private String message;

    int code = 1;
    public Result() {
    }

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
