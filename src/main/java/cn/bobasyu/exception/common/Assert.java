package cn.bobasyu.exception.common;

import java.util.Arrays;
import java.util.function.Predicate;

public interface Assert {

    BusinessException newException(Object... args);

    BusinessException newException(Throwable t, Object... args);

    default void assertNotNull(Object obj) throws BusinessException {
        if (obj == null) {
            throw newException(obj);
        }
    }

    default void assertNotNull(Object... obj) throws BusinessException {
        if (obj == null || Arrays.stream(obj).anyMatch(Predicate.isEqual(null))) {
            throw newException(obj);
        }
    }

    default void assertNotNull(Object obj, String... args) throws BusinessException {
        if (obj == null) {
            throw newException(args);
        }
    }

    default void assertGreaterThanZero(Integer integer) throws BusinessException {
        if (integer == null || integer < 1) {
            throw newException(integer);
        }
    }

    default void assertGreaterThanZero(Integer integer, Object... args) throws BusinessException {
        if (integer == null || integer < 1) {
            throw newException(args);
        }
    }

    default void assertCondition(Boolean flag, String... args) throws BusinessException {
        if (flag) {
            throw newException(args);
        }
    }
}
