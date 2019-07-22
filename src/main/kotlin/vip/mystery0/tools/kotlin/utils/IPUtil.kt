package vip.mystery0.tools.kotlin.utils

import javax.servlet.http.HttpServletRequest

/**
 * 获取客户端IP地址;这里通过了Nginx获取;X-Real-IP,
 * @return
 */
fun HttpServletRequest.getClientIP(): String? {
	var ip: String? = this.getHeader("X-Real-IP")
	if (ip != null && ip.isNotEmpty())
		return ip
	if (ip == null || ip.isEmpty() || "unknown".equals(ip, ignoreCase = true))
		ip = this.getHeader("X-Forwarded-For")
	if (ip != null && ip.isNotEmpty())
		return ip
	if (ip == null || ip.isEmpty() || "unknown".equals(ip, ignoreCase = true))
		ip = this.getHeader("Proxy-Client-IP")
	if (ip != null && ip.isNotEmpty())
		return ip
	if (ip == null || ip.isEmpty() || "unknown".equals(ip, ignoreCase = true))
		ip = this.getHeader("WL-Proxy-Client-IP")
	if (ip != null && ip.isNotEmpty())
		return ip
	if (ip == null || ip.isEmpty() || "unknown".equals(ip, ignoreCase = true))
		ip = this.remoteAddr
	return ip
}