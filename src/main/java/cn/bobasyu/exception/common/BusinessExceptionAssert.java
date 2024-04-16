package cn.bobasyu.exception.common;

import java.text.MessageFormat;

public interface BusinessExceptionAssert extends IResponseEnum, Assert {
    @Override
    default BusinessException newException(Object... args) {
        String msg = MessageFormat.format(getMessage(), args);
        return new BusinessException(this, args, msg);
    }

    @Override
    default BusinessException newException(Throwable t, Object... args) {
        String msg = MessageFormat.format(getMessage(), args);
        return new BusinessException(this, args, msg, t);
    }
}
