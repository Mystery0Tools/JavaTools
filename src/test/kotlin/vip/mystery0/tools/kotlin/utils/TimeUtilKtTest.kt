package vip.mystery0.tools.kotlin.utils

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime

/**
 * @author mystery0
 * Create at 2020/1/16
 */
internal class TimeUtilKtTest {
    @Test
    fun formatTime() {
        val localDate = LocalDate.now()
        val localDateTime = LocalDateTime.now()
        val instant = Instant.now()
        Assertions.assertEquals(0L.formatTime(), "0毫秒")
        Assertions.assertEquals(1L.formatTime(), "1毫秒")
        Assertions.assertEquals(946742399999L.formatTime(), "10957天15小时59分59秒999毫秒")
        println(localDate.atStartOfDay().formatDate())
        println(localDate.atStartOfDay().formatTime())
        println(localDate.atStartOfDay().formatDateTime())
        println(localDateTime.formatDate())
        println(localDateTime.formatTime())
        println(localDateTime.formatDateTime())
        println(instant.formatDate())
        println(instant.formatTime())
        println(instant.formatDateTime())
        val dateTimeString = "2000-01-01 23:59:59"
        val dateString = "2000-01-01"
        val timeString = "23:59:59"
        val dateTime = dateTimeString.parseDateTime()
        val date = dateString.parseDate()
        val time = timeString.parseTime()
        println(dateTime)
        println(date)
        println(time)
        Assertions.assertEquals(dateTime.year, 2000)
        Assertions.assertEquals(dateTime.monthValue, 1)
        Assertions.assertEquals(dateTime.dayOfMonth, 1)
        Assertions.assertEquals(dateTime.hour, 23)
        Assertions.assertEquals(dateTime.minute, 59)
        Assertions.assertEquals(dateTime.second, 59)
        Assertions.assertEquals(dateTime.nano, 0)
        Assertions.assertEquals(date.year, 2000)
        Assertions.assertEquals(date.monthValue, 1)
        Assertions.assertEquals(date.dayOfMonth, 1)
        Assertions.assertEquals(time.hour, 23)
        Assertions.assertEquals(time.minute, 59)
        Assertions.assertEquals(time.second, 59)
    }

    @Test
    fun toTimestamp() {
        val localDateTime = LocalDateTime.now()
        val instant = Instant.now()
        println(localDateTime.toTimestamp())
        println(instant.toTimestamp())
    }
}