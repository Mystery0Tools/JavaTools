package vip.mystery0.tools.kotlin.utils

interface ValueAble<T> {
    fun getValue(): T

    fun valueOf(t: T): ValueAble<T>
}