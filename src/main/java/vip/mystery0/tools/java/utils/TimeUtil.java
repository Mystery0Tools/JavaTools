package vip.mystery0.tools.java.utils;

import vip.mystery0.tools.kotlin.utils.TimeUtilKt;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @author mystery0
 */
public class TimeUtil {
    public static String formatDate(LocalDateTime localDateTime) {
        return TimeUtilKt.formatDate(localDateTime);
    }

    public static String formatDate(Instant instant) {
        return TimeUtilKt.formatDate(instant);
    }

    public static String formatTime(LocalDateTime date) {
        return TimeUtilKt.formatTime(date);
    }

    public static String formatTime(Instant instant) {
        return TimeUtilKt.formatTime(instant);
    }

    public static String formatDateTime(LocalDateTime date) {
        return TimeUtilKt.formatDateTime(date);
    }

    public static String formatDateTime(Instant instant) {
        return TimeUtilKt.formatDateTime(instant);
    }

    public static LocalDateTime parseDate(String string) {
        return TimeUtilKt.parseDate(string);
    }

    public static LocalDateTime parseTime(String string) {
        return TimeUtilKt.parseTime(string);
    }

    public static LocalDateTime parseDateTime(String string) {
        return TimeUtilKt.parseDateTime(string);
    }

    public static String formatInstant(Instant instant, String pattern) {
        return TimeUtilKt.formatInstant(instant, pattern);
    }

    public static String formatInstant(Instant instant, DateTimeFormatter dateTimeFormatter) {
        return formatLocalDateTime(LocalDateTime.ofInstant(instant, ZoneId.systemDefault()), dateTimeFormatter);
    }

    public static String formatLocalDateTime(LocalDateTime localDateTime, String pattern) {
        return TimeUtilKt.formatLocalDataTime(localDateTime, pattern);
    }

    public static String formatLocalDateTime(LocalDateTime localDateTime, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.format(localDateTime);
    }
}
