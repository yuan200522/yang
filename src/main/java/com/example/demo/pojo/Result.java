package com.example.demo.pojo;

public class Result {
    private String msg;
    private Integer code;
    private Object data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Result(String msg, Integer code, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public Result() {
    }
    public static  Result success(Object data){
        return new Result("success",1,data);
    }
    public static  Result error(String msg){
        return new Result("error",0,null);
    }
    public static  Result success(){
        return new Result("success",1,null);
    }

    @Override
    public String toString() {
        return "Result{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
