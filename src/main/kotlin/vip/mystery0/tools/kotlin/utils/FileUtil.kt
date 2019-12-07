package vip.mystery0.tools.kotlin.utils

import vip.mystery0.tools.java.utils.IOUtils
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import java.text.DecimalFormat

/**
 * 格式化文件大小
 * @param decimalNum 要格式化的小数位数
 * @return 格式化之后的字符串
 */
fun File.formatFileSize(decimalNum: Int = 2): String = if (exists()) length().formatFileSize(decimalNum) else "0B"

/**
 * 格式化文件大小
 * @param decimalNum 要格式化的小数位数
 * @return 格式化之后的字符串
 */
fun Long.formatFileSize(decimalNum: Int = 2): String {
    if (this == 0L)
        return "0B"
    val formatString = StringBuilder()
    formatString.append("#.")
    for (i in 0 until decimalNum)
        formatString.append('0')
    val decimalFormat = DecimalFormat(formatString.toString())
    val fileSizeString: String
    fileSizeString = when {
        this < 1024 -> decimalFormat.format(this) + 'B'
        this < 1024 * 1024 -> decimalFormat.format(this.toFloat() / 1024f) + "KB"
        this < 1024 * 1024 * 1024 -> decimalFormat.format(this.toFloat() / 1024f / 1024f) + "MB"
        else -> decimalFormat.format(this.toFloat() / 1024f / 1024f / 1024f) + "GB"
    }
    return fileSizeString
}

fun File.copyTo(file: File) {
    if (!this.exists())
        throw RuntimeException("源文件不存在！")
    if (!this.isFile)
        throw RuntimeException("该项不是文件：${this.name}(${this.absolutePath})")
    if (file.parentFile == null)
        throw RuntimeException("输出目录创建失败！")
    if (!file.parentFile!!.exists() && !file.parentFile!!.mkdirs())
        throw RuntimeException("输出目录创建失败！")
    var fileInputStream: FileInputStream? = null
    var fileOutputStream: FileOutputStream? = null
    try {
        fileInputStream = FileInputStream(this)
        fileOutputStream = FileOutputStream(file)
        fileInputStream.copyTo(fileOutputStream)
    } catch (e: IOException) {
        e.printStackTrace()
        throw RuntimeException(e)
    } finally {
        IOUtils.closeQuietly(fileInputStream)
        IOUtils.closeQuietly(fileOutputStream)
    }
}