package vip.mystery0.tools.java.utils;

/**
 * @author mystery0
 */
public class Utils {
    public static <T extends Enum<T>> T nameOf(Class<T> clazz, String name) {
        if (name == null) {
            return null;
        }
        if (!clazz.isEnum()) {
            throw new RuntimeException("this class is not an enum class");
        }
        for (T constant : clazz.getEnumConstants()) {
            if (constant.name().equals(name.toUpperCase())) {
                return constant;
            }
        }
        return null;
    }
}
