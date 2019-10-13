package vip.mystery0.tools.kotlin.utils

import java.security.MessageDigest
import java.util.*

fun String.md5(): String = toByteArray().md5()

/**
 * MD5 加密
 * @return MD5 加密之后的字符串
 */
fun ByteArray.md5(): String {
    val digest = MessageDigest.getInstance("MD5")
    val result = digest.digest(this)
    return toHex(result)
}

fun String.sha1(): String = toByteArray().sha1()

/**
 * SHA-1 加密
 * @return SHA-1 加密之后的字符串
 */
fun ByteArray.sha1(): String {
    val digest = MessageDigest.getInstance("SHA-1")
    val result = digest.digest(this)
    return toHex(result)
}

fun String.sha256(): String = toByteArray().sha256()

/**
 * SHA-256 加密
 * @return SHA-256 加密之后的字符串
 */
fun ByteArray.sha256(): String {
    val digest = MessageDigest.getInstance("SHA-256")
    val result = digest.digest(this)
    return toHex(result)
}

/**
 * 将指定byte数组转换为16进制字符串
 * @param byteArray 原始数据
 * @return 转换之后数据
 */
private fun toHex(byteArray: ByteArray): String =
    with(StringBuilder()) {
        byteArray.forEach {
            val value = it
            val hex = value.toInt() and (0xFF)
            val hexStr = Integer.toHexString(hex)
            if (hexStr.length == 1)
                append("0").append(hexStr)
            else
                append(hexStr)
        }
        toString()
    }

fun ByteArray.base64(): ByteArray = Base64.getEncoder().encode(this)
fun ByteArray.deBase64(): ByteArray = Base64.getDecoder().decode(this)
fun ByteArray.base64String(): String = String(base64())
fun ByteArray.deBase64String(): String = String(deBase64())
fun String.base64(): String = toByteArray().base64String()
fun String.deBase64(): String = toByteArray().deBase64String()