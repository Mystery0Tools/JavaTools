package vip.mystery0.tools.kotlin.utils

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

/**
 * @author mystery0
 * Create at 2020/1/15
 */
internal class FileUtilKtTest {
    @Test
    fun formatFileSize() {
        formatFileSize(123456789L, "118MB", "117.7MB", "117.74MB", "117.738MB")
        formatFileSize(987654321L, "942MB", "941.9MB", "941.90MB", "941.901MB")
        formatFileSize(File("settings.gradle.kts"), "28B", "28.0B", "28.00B", "28.000B")
    }

    private fun formatFileSize(fileSize: Long, vararg array: String) =
        array.forEachIndexed { index, string -> Assertions.assertEquals(fileSize.formatFileSize(index), string) }

    private fun formatFileSize(file: File, vararg array: String) =
        array.forEachIndexed { index, string -> Assertions.assertEquals(file.formatFileSize(index), string) }
}