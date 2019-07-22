package vip.mystery0.tools.java.factory;

import vip.mystery0.tools.kotlin.factory.JsonFactoryKt;

/**
 * @author mystery0
 * @date 2019-07-22
 */
public class JsonFactory {
    public static <T> T fromJson(String json, Class<T> clazz) {
        return JsonFactoryKt.fromJson(json, clazz);
    }

    public static String toJson(Object object) {
        return JsonFactoryKt.toJson(object);
    }
}
