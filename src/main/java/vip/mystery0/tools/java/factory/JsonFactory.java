package vip.mystery0.tools.java.factory;

import com.fasterxml.jackson.core.type.TypeReference;
import vip.mystery0.tools.kotlin.factory.JsonFactoryKt;

import java.lang.reflect.Type;

/**
 * @author mystery0
 */
public class JsonFactory {
    public static <T> T fromJson(String json, Class<T> clazz) {
        return JsonFactoryKt.fromJson(json, clazz);
    }

    public static <T> T fromJson(String json, TypeReference<T> typeReference) {
        return JsonFactoryKt.fromJson(json, typeReference);
    }

    public static <T> T fromJson(String json, Type type) {
        return JsonFactoryKt.fromJson(json, type);
    }

    public static String toJson(Object object) {
        return JsonFactoryKt.toJson(object);
    }
}
