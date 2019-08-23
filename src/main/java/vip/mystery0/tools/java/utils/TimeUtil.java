package vip.mystery0.tools.java.utils;

import vip.mystery0.tools.kotlin.utils.TimeUtilKt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

/**
 * @author mystery0
 */
public class TimeUtil {
    public static String formatTime(long time) {
        return TimeUtilKt.formatTime(time);
    }

    public static Calendar toCalendar(long time) {
        return TimeUtilKt.toCalendar(time);
    }

    public static String toDateTimeString(Calendar calendar) {
        return TimeUtilKt.toDateTimeString(calendar);
    }

    public static String toDateString(Calendar calendar) {
        return TimeUtilKt.toDateString(calendar);
    }

    public static String toTimeString(Calendar calendar) {
        return TimeUtilKt.toTimeString(calendar);
    }

    public static String toDateTimeString(LocalDateTime localDateTime) {
        return TimeUtilKt.toDateTimeString(localDateTime);
    }

    public static String toDateString(LocalDate localDate) {
        return TimeUtilKt.toDateString(localDate);
    }

    public static String toTimeString(LocalTime localTime) {
        return TimeUtilKt.toTimeString(localTime);
    }


}
