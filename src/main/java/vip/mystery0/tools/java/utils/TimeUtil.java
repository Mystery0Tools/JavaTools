package vip.mystery0.tools.java.utils;

import vip.mystery0.tools.kotlin.utils.TimeUnit;
import vip.mystery0.tools.kotlin.utils.TimeUtilKt;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author mystery0
 */
public class TimeUtil {
    public static String formatTime(long timeInMillisecond) {
        return TimeUtilKt.formatTime(timeInMillisecond, TimeUnit.MILLISECOND, TimeUnit.DAY);
    }

    public static String formatTime(long timeInMillisecond,
                                    TimeUnit minTimeUnit,
                                    TimeUnit maxTimeUnit) {
        return TimeUtilKt.formatTime(timeInMillisecond, minTimeUnit, maxTimeUnit);
    }

    public static Timestamp toTimestamp(Instant instant) {
        return TimeUtilKt.toTimestamp(instant, ZoneId.systemDefault());
    }

    public static Timestamp toTimestamp(Instant instant, ZoneId zoneId) {
        return TimeUtilKt.toTimestamp(instant, zoneId);
    }

    public static Timestamp toTimestamp(LocalDateTime localDateTime) {
        return TimeUtilKt.toTimestamp(localDateTime);
    }
}
