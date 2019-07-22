package vip.mystery0.tools.java.utils;

import vip.mystery0.tools.kotlin.utils.IPUtilKt;

import javax.servlet.http.HttpServletRequest;

/**
 * @author mystery0
 * @date 2019-07-22
 */
public class IPUtil {
    public static String getClientIP(HttpServletRequest request) {
        return IPUtilKt.getClientIP(request);
    }
}
