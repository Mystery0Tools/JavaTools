package vip.mystery0.tools.java.utils;

/**
 * @author mystery0
 * @date 2019/12/5
 */
public class Utils {
    public static <T extends Enum<T>> T nameOf(Class<T> clazz, String name) {
        if (name == null) {
            return null;
        }
        if (!clazz.isEnum()) {
            throw new RuntimeException("这个类不是枚举类");
        }
        for (T constant : clazz.getEnumConstants()) {
            if (constant.name().equals(name.toUpperCase())) {
                return constant;
            }
        }
        return null;
    }
}
