package com.gandawijaya.klinfix.model;

public class LoginResponse {

    String message,error;
    int code;
    Data data;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
//    public LoginResponse(String message, int code, Data data) {
//        this.message = message;
//        this.code = code;
//        this.data = data;
//    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
