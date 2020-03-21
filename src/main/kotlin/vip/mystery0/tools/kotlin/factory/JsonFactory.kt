package vip.mystery0.tools.kotlin.factory

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import java.lang.reflect.Type
import kotlin.reflect.KClass

/**
 * @author mystery0
 * @date 2019-07-22
 */
object JsonFactory {
    private var objectMapper: ObjectMapper? = null

    fun getObjectMapper(): ObjectMapper = if (objectMapper == null) {
        objectMapper = ObjectMapper()
        objectMapper!!
    } else objectMapper!!

    fun setObjectMapper(objectMapper: ObjectMapper) {
        this.objectMapper = objectMapper
    }
}

fun <T : Any> String.fromJson(clazz: KClass<T>): T = JsonFactory.getObjectMapper().readValue(this, clazz.java)

fun <T> String.fromJson(clazz: Class<T>): T = JsonFactory.getObjectMapper().readValue(this, clazz)

fun <T> String.fromJson(typeReference: TypeReference<T>): T = JsonFactory.getObjectMapper().readValue(this, typeReference)

fun <T> String.fromJson(type: Type): T = JsonFactory.getObjectMapper().readValue(this, object : TypeReference<T>() {
    override fun getType(): Type = type
})

fun <T : Any?> T.toJson(): String {
    if (this == null) return ""
    return JsonFactory.getObjectMapper().writeValueAsString(this)
}