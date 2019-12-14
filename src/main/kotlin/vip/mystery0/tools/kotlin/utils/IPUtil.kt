package vip.mystery0.tools.kotlin.utils

import javax.servlet.http.HttpServletRequest

/**
 * 获取客户端IP地址
 * 先查询提前定义的请求头，如果有，那么直接获取，否则走正常流程获取
 * @return
 */
fun HttpServletRequest.getClientIP(): String? {
    var ip: String? = this.getHeader("Mystery0-Client-IP")
    if (ip != null && ip.isNotBlank())
        return ip
    if (ip == null || ip.isBlank() || "unknown".equals(ip, ignoreCase = true))
        ip = this.getHeader("X-Real-IP")
    if (ip != null && ip.isNotBlank())
        return ip
    if (ip == null || ip.isBlank() || "unknown".equals(ip, ignoreCase = true))
        ip = this.getHeader("X-Forwarded-For")
    if (ip != null && ip.isNotBlank())
        return ip
    if (ip == null || ip.isBlank() || "unknown".equals(ip, ignoreCase = true))
        ip = this.getHeader("Proxy-Client-IP")
    if (ip != null && ip.isNotBlank())
        return ip
    if (ip == null || ip.isBlank() || "unknown".equals(ip, ignoreCase = true))
        ip = this.getHeader("WL-Proxy-Client-IP")
    if (ip != null && ip.isNotBlank())
        return ip
    if (ip == null || ip.isBlank() || "unknown".equals(ip, ignoreCase = true))
        ip = this.remoteAddr
    if (ip == "0:0:0:0:0:0:0:1")
        ip = "127.0.0.1"
    return ip
}

val HttpServletRequest.host: String
    get() = requestURL.substring(0, requestURL.length - requestURI.length)