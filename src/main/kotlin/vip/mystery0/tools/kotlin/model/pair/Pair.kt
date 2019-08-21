package vip.mystery0.tools.kotlin.model.pair

import java.io.Serializable

/**
 * @author mystery0
 * @date 2019-07-22
 */
fun <T1, T2> Pair2<T1, T2>.toPair(): Pair<T1, T2> {
    if (first == null || second == null)
        throw NoSuchKeyException()
    return Pair(first!!, second!!)
}

abstract class BasePair<T1>(open var first: T1?) : Serializable {
    override fun toString(): String {
        return "BasePair(first=$first)"
    }
}

open class Pair2<T1, T2>(
    override var first: T1?,
    open var second: T2?
) : BasePair<T1>(first), Serializable {
    override fun toString(): String {
        return "Pair2(first=$first, second=$second)"
    }
}

open class Pair3<T1, T2, T3>(
    override var first: T1?,
    override var second: T2?,
    open var third: T3?
) : Pair2<T1, T2>(first, second), Serializable {
    override fun toString(): String {
        return "Pair3(first=$first, second=$second, third=$third)"
    }
}

open class Pair4<T1, T2, T3, T4>(
    override var first: T1?,
    override var second: T2?,
    override var third: T3?,
    open var fourth: T4?
) : Pair3<T1, T2, T3>(first, second, third), Serializable {
    override fun toString(): String {
        return "Pair4(first=$first, second=$second, third=$third, fourth=$fourth)"
    }
}

open class Pair5<T1, T2, T3, T4, T5>(
    override var first: T1?,
    override var second: T2?,
    override var third: T3?,
    override var fourth: T4?,
    open var fifth: T5?
) : Pair4<T1, T2, T3, T4>(first, second, third, fourth), Serializable {
    override fun toString(): String {
        return "Pair5(first=$first, second=$second, third=$third, fourth=$fourth, fifth=$fifth)"
    }
}

open class Pair6<T1, T2, T3, T4, T5, T6>(
    override var first: T1?,
    override var second: T2?,
    override var third: T3?,
    override var fourth: T4?,
    override var fifth: T5?,
    open var sixth: T6?
) : Pair5<T1, T2, T3, T4, T5>(first, second, third, fourth, fifth), Serializable {
    override fun toString(): String {
        return "Pair6(first=$first, second=$second, third=$third, fourth=$fourth, fifth=$fifth, sixth=$sixth)"
    }
}

open class Pair7<T1, T2, T3, T4, T5, T6, T7>(
    override var first: T1?,
    override var second: T2?,
    override var third: T3?,
    override var fourth: T4?,
    override var fifth: T5?,
    override var sixth: T6?,
    open var seventh: T7?
) : Pair6<T1, T2, T3, T4, T5, T6>(first, second, third, fourth, fifth, sixth), Serializable {
    override fun toString(): String {
        return "Pair7(first=$first, second=$second, third=$third, fourth=$fourth, fifth=$fifth, sixth=$sixth, seventh=$seventh)"
    }
}

open class Pair8<T1, T2, T3, T4, T5, T6, T7, T8>(
    override var first: T1?,
    override var second: T2?,
    override var third: T3?,
    override var fourth: T4?,
    override var fifth: T5?,
    override var sixth: T6?,
    override var seventh: T7?,
    open var eighth: T8?
) : Pair7<T1, T2, T3, T4, T5, T6, T7>(first, second, third, fourth, fifth, sixth, seventh), Serializable {
    override fun toString(): String {
        return "Pair8(first=$first, second=$second, third=$third, fourth=$fourth, fifth=$fifth, sixth=$sixth, seventh=$seventh, eighth=$eighth)"
    }
}

open class Pair9<T1, T2, T3, T4, T5, T6, T7, T8, T9>(
    override var first: T1?,
    override var second: T2?,
    override var third: T3?,
    override var fourth: T4?,
    override var fifth: T5?,
    override var sixth: T6?,
    override var seventh: T7?,
    override var eighth: T8?,
    open var ninth: T9?
) : Pair8<T1, T2, T3, T4, T5, T6, T7, T8>(first, second, third, fourth, fifth, sixth, seventh, eighth), Serializable {
    override fun toString(): String {
        return "Pair9(first=$first, second=$second, third=$third, fourth=$fourth, fifth=$fifth, sixth=$sixth, seventh=$seventh, eighth=$eighth, ninth=$ninth)"
    }
}

open class Pair10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>(
    override var first: T1?,
    override var second: T2?,
    override var third: T3?,
    override var fourth: T4?,
    override var fifth: T5?,
    override var sixth: T6?,
    override var seventh: T7?,
    override var eighth: T8?,
    override var ninth: T9?,
    open var tenth: T10?
) : Pair9<T1, T2, T3, T4, T5, T6, T7, T8, T9>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth),
    Serializable {
    override fun toString(): String {
        return "Pair10(first=$first, second=$second, third=$third, fourth=$fourth, fifth=$fifth, sixth=$sixth, seventh=$seventh, eighth=$eighth, ninth=$ninth, tenth=$tenth)"
    }
}