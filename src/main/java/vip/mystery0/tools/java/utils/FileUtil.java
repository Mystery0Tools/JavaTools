package vip.mystery0.tools.java.utils;

import vip.mystery0.tools.kotlin.utils.FileUtilKt;

import java.io.File;

/**
 * @author mystery0
 */
public class FileUtil {
    public static String formatFileSize(File file) {
        return formatFileSize(file, 2);
    }

    public static String formatFileSize(File file, int decimalNum) {
        return FileUtilKt.formatFileSize(file, decimalNum);
    }

    public static String formatFileSize(long size) {
        return formatFileSize(size, 2);
    }

    public static String formatFileSize(long size, int decimalNum) {
        return FileUtilKt.formatFileSize(size, decimalNum);
    }

    public static void copyFile(File input, File output) {
        FileUtilKt.copyTo(input, output);
    }
}
