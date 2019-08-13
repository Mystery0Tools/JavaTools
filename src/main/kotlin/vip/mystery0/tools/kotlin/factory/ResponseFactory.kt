package vip.mystery0.tools.kotlin.factory

import vip.mystery0.tools.kotlin.config.BaseResponseCode
import vip.mystery0.tools.kotlin.model.Response

/**
 * @author mystery0
 * @date 2019-07-22
 */
object ResponseFactory {
    @JvmStatic
    fun success(): Response<Any> = success(null)

    @JvmStatic
    fun <T> success(data: T?): Response<T> = success(data, BaseResponseCode.DONE.message)

    @JvmStatic
    fun <T> success(data: T?, message: String?): Response<T> = origin(BaseResponseCode.DONE.code, data, message)

    fun failure(): Response<Any> = failure(BaseResponseCode.ERROR)

    @JvmStatic
    fun failure(message: String?): Response<Any> = origin(BaseResponseCode.ERROR.code, null, message)

    @JvmStatic
    fun failure(code: BaseResponseCode): Response<Any> = failure(code, code.message)

    @JvmStatic
    fun failure(code: BaseResponseCode, message: String?): Response<Any> = origin(code.code, null, message)

    @JvmStatic
    fun <T> origin(code: Int, data: T?, message: String?): Response<T> = Response(code, data, message)
}