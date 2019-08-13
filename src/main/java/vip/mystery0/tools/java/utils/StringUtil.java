package vip.mystery0.tools.java.utils;

import vip.mystery0.tools.kotlin.utils.StringUtilKt;

/**
 * @author mystery0
 */
public class StringUtil {
    public static String md5(String text) {
        return StringUtilKt.md5(text);
    }

    public static String sha1(String text) {
        return StringUtilKt.sha1(text);
    }

    public static String sha256(String text) {
        return StringUtilKt.sha256(text);
    }
}
