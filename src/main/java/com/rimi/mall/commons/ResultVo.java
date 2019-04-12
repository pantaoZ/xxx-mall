package com.rimi.mall.commons;

import java.io.Serializable;

/**
 * 一般返回类型
 *
 * @author admin
 * @date 2019-04-12
 * 16:13
 */
public class ResultVo implements Result, Serializable {
    // 状态码
    private int code;
    // 消息
    private String msg;

    public ResultVo(){
    }

    public ResultVo(ResultCode resultCode){
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();

    }
    // 成功
    public static Result success(){
        return of(ResultCode.SUCCESS);
    }

    // 失败
    public static Result failure(){
        return of(ResultCode.FAILURE);
    }

    // 状态码
    public static Result of(ResultCode resultCode){
        return new ResultVo(resultCode);
    }



    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
