package cn.bobasyu.exception.enums;

import cn.bobasyu.exception.common.BusinessExceptionAssert;

public enum BusinessExceptionEnum implements BusinessExceptionAssert {

    COMMON_EXCEPTION(500, "{0}"),
    ;


    private final int code;

    private final String message;

    BusinessExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
