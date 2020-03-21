package vip.mystery0.tools.kotlin.utils

import java.sql.Timestamp
import java.time.*
import java.time.format.DateTimeFormatter
import java.util.*

/**
 * 毫秒转化时分秒毫秒
 * @return
 */
fun Long.formatTime(): String {
    if (this <= 0) return "0毫秒"
    val ss = 1000
    val mi = ss * 60
    val hh = mi * 60
    val dd = hh * 24

    val day = this / dd
    val hour = (this - day * dd) / hh
    val minute = (this - day * dd - hour * hh) / mi
    val second = (this - day * dd - hour * hh - minute * mi) / ss
    val milliSecond = this % ss

    val sb = StringBuffer()
    if (day > 0) {
        sb.append(day.toString() + "天")
    }
    if (hour > 0) {
        sb.append(hour.toString() + "小时")
    }
    if (minute > 0) {
        sb.append(minute.toString() + "分")
    }
    if (second > 0) {
        sb.append(second.toString() + "秒")
    }
    if (milliSecond > 0) {
        sb.append(milliSecond.toString() + "毫秒")
    }
    return sb.toString()
}

fun Instant.toTimestamp(zoneId: ZoneId = ZoneId.systemDefault()): Timestamp =
    Timestamp.valueOf(LocalDateTime.ofInstant(this, zoneId))

fun LocalDateTime.toTimestamp(): Timestamp = Timestamp.valueOf(this)