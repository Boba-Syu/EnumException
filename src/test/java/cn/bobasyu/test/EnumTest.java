package cn.bobasyu.test;


import cn.bobasyu.exception.enums.BusinessExceptionEnum;
import org.junit.Test;

public class EnumTest {
    @Test
    public void assertConditionTest() {
        try {
            BusinessExceptionEnum.COMMON_EXCEPTION.assertCondition(true, "test condition");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void assertNotNullTest() {
        try {
            BusinessExceptionEnum.COMMON_EXCEPTION.assertNotNull(null, "test null");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void assertGraterThanZero() {
        try {
            int arg = -1;
            BusinessExceptionEnum.COMMON_EXCEPTION.assertGreaterThanZero(arg, String.format("test greater than zero, %s", arg));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void throwTest() {
        try {
            throw BusinessExceptionEnum.COMMON_EXCEPTION.newException("test throw");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
