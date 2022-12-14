package com.hut.entity;

public class Result<T> {
    private Integer code;
    private String meg;
    private T data;

    public Result() {
    }

    public Result(Integer code, String meg, T data) {
        this.code = code;
        this.meg = meg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMeg() {
        return meg;
    }

    public void setMeg(String meg) {
        this.meg = meg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", meg='" + meg + '\'' +
                ", data=" + data +
                '}';
    }
}
