package vip.mystery0.tools.kotlin.utils

import java.sql.Timestamp
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

/**
 * 毫秒转化时分秒毫秒
 * @return
 */
enum class TimeUnit(val level: Int, val unit: String, val interval: Int) {
    MILLISECOND(0, "毫秒", 1000),
    SECOND(1, "秒", 60),
    MINUTE(2, "分", 60),
    HOUR(3, "小时", 24),
    DAY(4, "天", 1)
}

fun Long.formatTime(
    minTimeUnit: TimeUnit = TimeUnit.MILLISECOND,
    maxTimeUnit: TimeUnit = TimeUnit.DAY
): String {
    if (minTimeUnit.level > maxTimeUnit.level) {
        //等级不正确，抛出异常
        throw NumberFormatException("等级设置错误")
    }
    val ss = 1000
    val mi = ss * 60
    val hh = mi * 60
    val dd = hh * 24

    if (this <= 0) return "0${minTimeUnit.unit}"
    if (maxTimeUnit == TimeUnit.MILLISECOND) return "$this${TimeUnit.MILLISECOND.unit}"

    val day = this / dd
    var hour = (this - day * dd) / hh
    var minute = (this - day * dd - hour * hh) / mi
    var second = (this - day * dd - hour * hh - minute * mi) / ss
    var milliSecond = this % ss

    val sb = StringBuffer()
    if (day > 0) {
        val unit = TimeUnit.DAY
        val nextUnit = TimeUnit.HOUR
        if (maxTimeUnit.level < unit.level) {
            hour += day * nextUnit.interval
        } else {
            sb.append(day).append(unit.unit)
        }
        if (minTimeUnit.level == unit.level) return sb.toString()
    }
    if (hour > 0) {
        val unit = TimeUnit.HOUR
        val nextUnit = TimeUnit.MINUTE
        if (maxTimeUnit.level < unit.level) {
            minute += hour * nextUnit.interval
        } else {
            sb.append(hour).append(unit.unit)
        }
        if (minTimeUnit.level == unit.level) return sb.toString()
    }
    if (minute > 0) {
        val unit = TimeUnit.MINUTE
        val nextUnit = TimeUnit.SECOND
        if (maxTimeUnit.level < unit.level) {
            second += minute * nextUnit.interval
        } else {
            sb.append(minute).append(unit.unit)
        }
        if (minTimeUnit.level == unit.level) return sb.toString()
    }
    if (second > 0) {
        val unit = TimeUnit.SECOND
        val nextUnit = TimeUnit.MILLISECOND
        if (maxTimeUnit.level < unit.level) {
            milliSecond += second * nextUnit.interval
        } else {
            sb.append(second).append(unit.unit)
        }
        if (minTimeUnit.level == unit.level) return sb.toString()
    }
    if (milliSecond > 0) {
        val unit = TimeUnit.MILLISECOND
        sb.append(milliSecond).append(unit.unit)
    }
    return sb.toString()
}

fun Instant.toTimestamp(zoneId: ZoneId = ZoneId.systemDefault()): Timestamp =
    Timestamp.valueOf(LocalDateTime.ofInstant(this, zoneId))

fun LocalDateTime.toTimestamp(): Timestamp = Timestamp.valueOf(this)