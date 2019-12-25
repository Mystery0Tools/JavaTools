package vip.mystery0.tools.kotlin.factory

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import java.lang.reflect.Type

/**
 * @author mystery0
 * @date 2019-07-22
 */
object JsonFactory {
    val objectMapper: ObjectMapper by lazy { ObjectMapper() }
}

fun <T> String.fromJson(clazz: Class<T>): T = JsonFactory.objectMapper.readValue(this, clazz)

fun <T> String.fromJson(typeReference: TypeReference<T>): T = JsonFactory.objectMapper.readValue(this, typeReference)

fun <T> String.fromJson(type: Type): T = JsonFactory.objectMapper.readValue(this, object : TypeReference<T>() {
    override fun getType(): Type = type
})

fun <T : Any?> T.toJson(): String {
    if (this == null) return ""
    return JsonFactory.objectMapper.writeValueAsString(this)
}