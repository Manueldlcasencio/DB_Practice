package com.orion.db.models;

public class DefaultMessageModel implements DefaultModel {
    private String msg;

    public DefaultMessageModel(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
