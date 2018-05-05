package com.smart.program.common;

/**
 * 系统异常处理信息
 */
public class ErrorConstant {

    public static final int SUCCESS_CODE = 200;
    public static final String SUCCESS_MSG = "SUCCESS";

    public static final int ERROR_CODE = 500;
    public static final String ERROR_MSG = "系统异常";

    //转账相关
    public static final int RECHARGE_ERROR = 3000000;
    public static final String RECHARGE_ERROR_MSG = "转账失败";

    public static final int PACKAGE_IS_NULL_ERROR = 3000001;
    public static final String PACKAGE_IS_NULL_ERROR_MSG = "套餐信息不存在";
}
