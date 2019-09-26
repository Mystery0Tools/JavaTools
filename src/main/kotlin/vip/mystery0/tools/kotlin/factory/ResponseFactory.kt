package vip.mystery0.tools.kotlin.factory

import vip.mystery0.tools.kotlin.config.BaseResponseCode
import vip.mystery0.tools.kotlin.model.Response

fun success(): Response<Any> = ResponseFactory.success()
fun <T> success(data: T?): Response<T> = ResponseFactory.success(data)
fun <T> success(data: T?, message: String?): Response<T> = ResponseFactory.success(data, message)
fun failure(): Response<Any> = ResponseFactory.failure()
fun failure(message: String?): Response<Any> = ResponseFactory.failure(message)
fun failure(code: BaseResponseCode): Response<Any> = ResponseFactory.failure(code)
fun failure(code: BaseResponseCode, message: String?): Response<Any> = ResponseFactory.failure(code, message)
fun failure(code: Int, message: String?): Response<Any> = ResponseFactory.failure(code, message)
fun <T> origin(code: Int, data: T?, message: String?): Response<T> = ResponseFactory.origin(code, data, message)

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
    fun failure(code: Int, message: String?): Response<Any> = origin(code, null, message)

    @JvmStatic
    fun <T> origin(code: Int, data: T?, message: String?): Response<T> = Response(code, data, message)
}