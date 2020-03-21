package vip.mystery0.tools.kotlin.utils

import java.time.*
import java.time.format.DateTimeFormatter
import java.util.*

/**
 * @author mystery0
 * Create at 2020/3/21
 */
private val DATE_FORMATTER by lazy { DateTimeFormatter.ofPattern("yyyy-MM-dd") }
private val TIME_FORMATTER by lazy { DateTimeFormatter.ofPattern("HH:mm:ss") }
private val DATE_TIME_FORMATTER by lazy { DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss") }

private fun getFormatter(pattern: String?): DateTimeFormatter? =
    if (pattern == null) null else DateTimeFormatter.ofPattern(pattern, Locale.getDefault())

fun LocalDateTime.formatDate(): String = formatLocalDataTime(DATE_FORMATTER)
fun LocalDate.formatDate(): String = atStartOfDay().formatLocalDataTime(DATE_FORMATTER)
fun Instant.formatDate(): String = formatInstant(DATE_FORMATTER)

fun LocalDateTime.formatTime(): String = formatLocalDataTime(TIME_FORMATTER)
fun LocalTime.formatTime(): String = atDate(LocalDate.now()).formatLocalDataTime(TIME_FORMATTER)
fun Instant.formatTime(): String = formatInstant(TIME_FORMATTER)

fun LocalDateTime.formatDateTime(): String = formatLocalDataTime(DATE_TIME_FORMATTER)
fun Instant.formatDateTime(): String = formatInstant(DATE_TIME_FORMATTER)

fun String.parseDate(): LocalDate = LocalDate.parse(this, DATE_FORMATTER)
fun String.parseTime(): LocalTime = LocalTime.parse(this, TIME_FORMATTER)
fun String.parseDateTime(): LocalDateTime = LocalDateTime.parse(this, DATE_TIME_FORMATTER)

fun LocalDateTime.formatLocalDataTime(pattern: String? = null): String =
    formatLocalDataTime(getFormatter(pattern) ?: DATE_TIME_FORMATTER)

fun LocalDateTime.formatLocalDataTime(dateTimeFormatter: DateTimeFormatter = DATE_TIME_FORMATTER): String =
    dateTimeFormatter.format(this)

fun Instant.formatInstant(pattern: String? = null): String =
    formatInstant(getFormatter(pattern) ?: DATE_TIME_FORMATTER)

fun Instant.formatInstant(dateTimeFormatter: DateTimeFormatter = DATE_TIME_FORMATTER): String =
    LocalDateTime.ofInstant(this, ZoneId.systemDefault()).formatLocalDataTime(dateTimeFormatter)