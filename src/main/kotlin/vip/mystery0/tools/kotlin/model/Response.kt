package vip.mystery0.tools.kotlin.model

/**
 * @author mystery0
 * @date 2019-07-22
 */
data class Response<T>(
    var code: Int,
    var data: T?,
    var message: String?
)