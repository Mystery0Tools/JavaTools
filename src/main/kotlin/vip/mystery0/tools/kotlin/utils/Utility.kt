package vip.mystery0.tools.kotlin.utils

inline fun <reified T : Enum<T>> String.enumOf(clazz: Class<T>): T? {
    if (!clazz.isEnum) throw RuntimeException("${clazz.name} isn't enum class")
    val up = toUpperCase()
    return clazz.enumConstants.firstOrNull { it.name == up }
}