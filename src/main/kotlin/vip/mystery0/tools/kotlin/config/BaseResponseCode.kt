package vip.mystery0.tools.kotlin.config

/**
 * @author mystery0
 * @date 2019-07-22
 */
enum class BaseResponseCode(val code: Int, val message: String) {
    ERROR(-1, "failed"),
    DONE(0, "success")
}