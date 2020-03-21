package vip.mystery0.tools.java.utils;

import vip.mystery0.tools.kotlin.utils.DateTimeUtilKt;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @author mystery0
 * Create at 2020/3/21
 */
public class DateTimeUtil {
    public static String formatDate(LocalDateTime localDateTime) {
        return DateTimeUtilKt.formatDate(localDateTime);
    }

    public static String formatDate(Instant instant) {
        return DateTimeUtilKt.formatDate(instant);
    }

    public static String formatTime(LocalDateTime date) {
        return DateTimeUtilKt.formatTime(date);
    }

    public static String formatTime(Instant instant) {
        return DateTimeUtilKt.formatTime(instant);
    }

    public static String formatDateTime(LocalDateTime date) {
        return DateTimeUtilKt.formatDateTime(date);
    }

    public static String formatDateTime(Instant instant) {
        return DateTimeUtilKt.formatDateTime(instant);
    }

    public static LocalDate parseDate(String string) {
        return DateTimeUtilKt.parseDate(string);
    }

    public static LocalTime parseTime(String string) {
        return DateTimeUtilKt.parseTime(string);
    }

    public static LocalDateTime parseDateTime(String string) {
        return DateTimeUtilKt.parseDateTime(string);
    }

    public static String formatInstant(Instant instant, String pattern) {
        return DateTimeUtilKt.formatInstant(instant, pattern);
    }

    public static String formatInstant(Instant instant, DateTimeFormatter dateTimeFormatter) {
        return formatLocalDateTime(LocalDateTime.ofInstant(instant, ZoneId.systemDefault()), dateTimeFormatter);
    }

    public static String formatLocalDateTime(LocalDateTime localDateTime, String pattern) {
        return DateTimeUtilKt.formatLocalDataTime(localDateTime, pattern);
    }

    public static String formatLocalDateTime(LocalDateTime localDateTime, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.format(localDateTime);
    }
}
