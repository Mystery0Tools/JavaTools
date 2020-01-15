package vip.mystery0.tools.kotlin.utils

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * @author mystery0
 * Create at 2020/1/15
 */
internal class StringUtilKtTest {
    private val origin = "Hello world!"
    private val base64 = "SGVsbG8gd29ybGQh"
    private val md5 = "86fb269d190d2c85f6e0468ceca42a20"
    private val sha1 = "d3486ae9136e7856bc42212385ea797094475802"
    private val sha256 = "c0535e4be2b79ffd93291305436bf889314e4a3faec05ecffcbb7df31ad9e51a"

    @Test
    fun md5() {
        Assertions.assertEquals(origin.md5(), md5)
    }

    @Test
    fun sha1() {
        Assertions.assertEquals(origin.sha1(), sha1)
    }

    @Test
    fun sha256() {
        Assertions.assertEquals(origin.sha256(), sha256)
    }

    @Test
    fun base64() {
        Assertions.assertEquals(origin.base64(), base64)
    }

    @Test
    fun deBase64() {
        Assertions.assertEquals(base64.deBase64(), origin)
    }
}