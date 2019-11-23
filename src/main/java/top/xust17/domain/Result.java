package top.xust17.domain;

import java.io.Serializable;

public class Result implements Serializable {


    private int code;//返回的业务码  0：成功执行  1：发生错误
    private String message;//信息

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result() {
        this.code=0;
        this.message = "执行成功";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
