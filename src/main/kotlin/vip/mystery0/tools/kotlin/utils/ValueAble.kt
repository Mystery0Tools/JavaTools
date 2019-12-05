package vip.mystery0.tools.kotlin.utils

/**
 * @author mystery0
 * @date 2019/12/5
 */
interface ValueAble<T> {
    fun getValue(): T

    fun valueOf(t: T): ValueAble<T>
}