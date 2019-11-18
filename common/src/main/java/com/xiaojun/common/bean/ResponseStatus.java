package com.xiaojun.common.bean;

/**
 * @author xiaojun
 */

public enum ResponseStatus {
    SUCCESS(20000,"成功"),
    ERROR(40001,"失败");

    private Integer status;
    private String msg;
    private ResponseStatus(Integer status, String msg){
        this.status = status;
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
