package vip.mystery0.tools.kotlin.utils

import vip.mystery0.tools.kotlin.model.LRUCache
import java.time.*
import java.time.format.DateTimeFormatter
import java.util.*

/**
 * @author mystery0
 * Create at 2020/3/21
 */
private val formatterLRUCache by lazy { LRUCache<DateTimeFormatter>(5) }

fun getFormatter(pattern: String): DateTimeFormatter = formatterLRUCache.getOrElse(pattern) {
    val formatter = DateTimeFormatter.ofPattern(pattern, Locale.getDefault())
    formatterLRUCache[pattern] = formatter
    formatter
}

fun LocalDateTime.formatDate(): String = formatLocalDataTime(getFormatter("yyyy-MM-dd"))
fun LocalDate.formatDate(): String = atStartOfDay().formatLocalDataTime(getFormatter("yyyy-MM-dd"))
fun Instant.formatDate(): String = formatInstant(getFormatter("yyyy-MM-dd"))

fun LocalDateTime.formatTime(): String = formatLocalDataTime(getFormatter("HH:mm:ss"))
fun LocalTime.formatTime(): String = atDate(LocalDate.now()).formatLocalDataTime(getFormatter("HH:mm:ss"))
fun Instant.formatTime(): String = formatInstant(getFormatter("HH:mm:ss"))

fun LocalDateTime.formatDateTime(): String = formatLocalDataTime(getFormatter("yyyy-MM-dd HH:mm:ss"))
fun Instant.formatDateTime(): String = formatInstant(getFormatter("yyyy-MM-dd HH:mm:ss"))

fun String.parseDate(): LocalDate = LocalDate.parse(this, getFormatter("yyyy-MM-dd"))
fun String.parseTime(): LocalTime = LocalTime.parse(this, getFormatter("HH:mm:ss"))
fun String.parseDateTime(): LocalDateTime = LocalDateTime.parse(this, getFormatter("yyyy-MM-dd HH:mm:ss"))

fun LocalDateTime.formatLocalDataTime(pattern: String? = null): String =
    formatLocalDataTime(if (pattern == null) getFormatter("yyyy-MM-dd HH:mm:ss") else getFormatter(pattern))

fun LocalDateTime.formatLocalDataTime(dateTimeFormatter: DateTimeFormatter = getFormatter("yyyy-MM-dd HH:mm:ss")): String =
    dateTimeFormatter.format(this)

fun Instant.formatInstant(pattern: String? = null): String =
    formatInstant(if (pattern == null) getFormatter("yyyy-MM-dd HH:mm:ss") else getFormatter(pattern))

fun Instant.formatInstant(dateTimeFormatter: DateTimeFormatter = getFormatter("yyyy-MM-dd HH:mm:ss")): String =
    LocalDateTime.ofInstant(this, ZoneId.systemDefault()).formatLocalDataTime(dateTimeFormatter)