package vip.mystery0.tools.kotlin.model.pair

import java.util.*

/**
 * @author 邓易林
 * @date 2019-07-20
 */
class PairArrayList<P : BasePair<*>> : ArrayList<P>() {
    fun <T1> findByFirst(first: T1): P? {
        if (isEmpty()) {
            return null
        }
        for (pair in this) {
            if (pair.first == first) {
                return pair
            }
        }
        return null
    }

    fun <T2> findBySecond(second: T2): P? {
        if (isEmpty()) {
            return null
        }
        val p = get(0)
        if (p is Pair2<*, *>) {
            for (pair in this) {
                val pair2 = pair as Pair2<*, *>
                if (pair2.second == second) {
                    return pair
                }
            }
            return null
        } else {
            throw NoSuchKeyException("列表中的数据没有second这个键")
        }
    }

    fun <T3> findByThird(third: T3): P? {
        if (isEmpty()) {
            return null
        }
        val p = get(0)
        if (p is Pair3<*, *, *>) {
            for (pair in this) {
                val pair3 = pair as Pair3<*, *, *>
                if (pair3.third == third) {
                    return pair
                }
            }
            return null
        } else {
            throw NoSuchKeyException("列表中的数据没有third这个键")
        }
    }

    fun <T4> findByFourth(fourth: T4): P? {
        if (isEmpty()) {
            return null
        }
        val p = get(0)
        if (p is Pair4<*, *, *, *>) {
            for (pair in this) {
                val pair4 = pair as Pair4<*, *, *, *>
                if (pair4.fourth == fourth) {
                    return pair
                }
            }
            return null
        } else {
            throw NoSuchKeyException("列表中的数据没有fourth这个键")
        }
    }

    fun <T5> findByFifth(fifth: T5): P? {
        if (isEmpty()) {
            return null
        }
        val p = get(0)
        if (p is Pair5<*, *, *, *, *>) {
            for (pair in this) {
                val pair5 = pair as Pair5<*, *, *, *, *>
                if (pair5.fifth == fifth) {
                    return pair
                }
            }
            return null
        } else {
            throw NoSuchKeyException("列表中的数据没有fifth这个键")
        }
    }

    fun <T6> findBySixth(sixth: T6): P? {
        if (isEmpty()) {
            return null
        }
        val p = get(0)
        if (p is Pair6<*, *, *, *, *, *>) {
            for (pair in this) {
                val pair6 = pair as Pair6<*, *, *, *, *, *>
                if (pair6.sixth == sixth) {
                    return pair
                }
            }
            return null
        } else {
            throw NoSuchKeyException("列表中的数据没有sixth这个键")
        }
    }

    fun <T7> findBySeventh(seventh: T7): P? {
        if (isEmpty()) {
            return null
        }
        val p = get(0)
        if (p is Pair7<*, *, *, *, *, *, *>) {
            for (pair in this) {
                val pair7 = pair as Pair7<*, *, *, *, *, *, *>
                if (pair7.seventh == seventh) {
                    return pair
                }
            }
            return null
        } else {
            throw NoSuchKeyException("列表中的数据没有seventh这个键")
        }
    }

    fun <T8> findByEighth(eighth: T8): P? {
        if (isEmpty()) {
            return null
        }
        val p = get(0)
        if (p is Pair8<*, *, *, *, *, *, *, *>) {
            for (pair in this) {
                val pair8 = pair as Pair8<*, *, *, *, *, *, *, *>
                if (pair8.eighth == eighth) {
                    return pair
                }
            }
            return null
        } else {
            throw NoSuchKeyException("列表中的数据没有seventh这个键")
        }
    }

    fun <T9> findByNinth(ninth: T9): P? {
        if (isEmpty()) {
            return null
        }
        val p = get(0)
        if (p is Pair9<*, *, *, *, *, *, *, *, *>) {
            for (pair in this) {
                val pair9 = pair as Pair9<*, *, *, *, *, *, *, *, *>
                if (pair9.ninth == ninth) {
                    return pair
                }
            }
            return null
        } else {
            throw NoSuchKeyException("列表中的数据没有seventh这个键")
        }
    }

    fun <T10> findByTenth(tenth: T10): P? {
        if (isEmpty()) {
            return null
        }
        val p = get(0)
        if (p is Pair10<*, *, *, *, *, *, *, *, *, *>) {
            for (pair in this) {
                val pair10 = pair as Pair10<*, *, *, *, *, *, *, *, *, *>
                if (pair10.tenth == tenth) {
                    return pair
                }
            }
            return null
        } else {
            throw NoSuchKeyException("列表中的数据没有seventh这个键")
        }
    }

    fun <T1> containFirst(first: T1): Boolean {
        val p = findByFirst(first)
        return p != null
    }

    fun <T2> containSecond(second: T2): Boolean {
        val p = findBySecond(second)
        return p != null
    }

    fun <T3> containThird(third: T3): Boolean {
        val p = findByThird(third)
        return p != null
    }

    fun <T4> containFourth(fourth: T4): Boolean {
        val p = findByFourth(fourth)
        return p != null
    }

    fun <T5> containFifth(fifth: T5): Boolean {
        val p = findByFifth(fifth)
        return p != null
    }

    fun <T6> containSixth(sixth: T6): Boolean {
        val p = findBySixth(sixth)
        return p != null
    }

    fun <T7> containSeventh(seventh: T7): Boolean {
        val p = findBySeventh(seventh)
        return p != null
    }

    fun <T8> containEighth(eighth: T8): Boolean {
        val p = findByEighth(eighth)
        return p != null
    }

    fun <T9> containNinth(ninth: T9): Boolean {
        val p = findByNinth(ninth)
        return p != null
    }

    fun <T10> containTenth(tenth: T10): Boolean {
        val p = findByTenth(tenth)
        return p != null
    }

    fun <A> removeByFirst(first: A): Boolean {
        val p = findByFirst(first)
        if (p != null) {
            remove(p)
            return true
        }
        return false
    }

    fun <B> removeBySecond(second: B): Boolean {
        val p = findBySecond(second)
        if (p != null) {
            remove(p)
            return true
        }
        return false
    }

    fun <C> removeByThird(third: C): Boolean {
        val p = findByThird(third)
        if (p != null) {
            remove(p)
            return true
        }
        return false
    }


    fun <T4> removeByFourth(fourth: T4): Boolean {
        val p = findByFourth(fourth)
        if (p != null) {
            remove(p)
            return true
        }
        return false
    }

    fun <T5> removeByFifth(fifth: T5): Boolean {
        val p = findByFifth(fifth)
        if (p != null) {
            remove(p)
            return true
        }
        return false
    }

    fun <T6> removeBySixth(sixth: T6): Boolean {
        val p = findBySixth(sixth)
        if (p != null) {
            remove(p)
            return true
        }
        return false
    }

    fun <T7> removeBySeventh(seventh: T7): Boolean {
        val p = findBySeventh(seventh)
        if (p != null) {
            remove(p)
            return true
        }
        return false
    }

    fun <T8> removeByEighth(eighth: T8): Boolean {
        val p = findByEighth(eighth)
        if (p != null) {
            remove(p)
            return true
        }
        return false
    }

    fun <T9> removeByNinth(ninth: T9): Boolean {
        val p = findByNinth(ninth)
        if (p != null) {
            remove(p)
            return true
        }
        return false
    }

    fun <T10> removeByTenth(tenth: T10): Boolean {
        val p = findByTenth(tenth)
        if (p != null) {
            remove(p)
            return true
        }
        return false
    }
}
