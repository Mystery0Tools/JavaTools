package vip.mystery0.tools.kotlin.factory

import com.fasterxml.jackson.databind.ObjectMapper

/**
 * @author mystery0
 * @date 2019-07-22
 */
object JsonFactory {
    val objectMapper: ObjectMapper by lazy { ObjectMapper() }
}

fun <T> String.fromJson(clazz: Class<T>): T = JsonFactory.objectMapper.readValue(this, clazz)

fun Any.toJson(): String = JsonFactory.objectMapper.writeValueAsString(this)