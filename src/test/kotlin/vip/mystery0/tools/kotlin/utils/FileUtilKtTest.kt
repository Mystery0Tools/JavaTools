package vip.mystery0.tools.kotlin.utils

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * @author mystery0
 * Create at 2020/1/15
 */
class FileUtilKtTest {
    @Test
    fun formatFileSize() {
        formatFileSize(123456789L, "118MB", "117.7MB", "117.74MB", "117.738MB")
        formatFileSize(987654321L, "942MB", "941.9MB", "941.90MB", "941.901MB")
    }

    private fun formatFileSize(fileSize: Long, vararg array: String) {
        array.forEachIndexed { index, string ->
            val result = fileSize.formatFileSize(index)
            println(result)
            Assertions.assertEquals(result, string)
        }
    }
}