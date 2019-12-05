package vip.mystery0.tools.kotlin.utils

/**
 * @author mystery0
 * @date 2019/12/5
 */
inline fun <reified T : Enum<T>> String.enumOf(clazz: Class<T>): T? {
    val up = toUpperCase()
    return clazz.enumConstants.firstOrNull { it.name == up }
}