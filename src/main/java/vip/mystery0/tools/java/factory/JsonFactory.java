package vip.mystery0.tools.java.factory;

import com.fasterxml.jackson.core.type.TypeReference;
import vip.mystery0.tools.kotlin.factory.JsonFactoryKt;

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

    public static String toJson(Object object) {
        return JsonFactoryKt.toJson(object);
    }
}
