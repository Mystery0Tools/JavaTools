package vip.mystery0.tools.kotlin.utils

import vip.mystery0.tools.kotlin.model.pair.Pair2
import vip.mystery0.tools.kotlin.model.pair.PairArrayList

/**
 * @author mystery0
 * @date 2019-08-21
 */
fun <T : Any> T?.require(): T {
    requireNotNull(this) { "Required value was null." }
    return this
}

fun <T> splitCollection(first: Collection<T>, second: Collection<T>, function: (T) -> Any): PairArrayList<Pair2<T, T>> {
    val result = PairArrayList<Pair2<T, T>>()
    if (first.isEmpty() && second.isEmpty())
        return result
    if (first.isEmpty() && second.isNotEmpty()) {
        for (t in second) {
            result.add(Pair2(null, t))
        }
        return result
    }
    if (first.isNotEmpty() && second.isEmpty()) {
        for (t in first) {
            result.add(Pair2(t, null))
        }
        return result
    }
    val firstMap = HashMap<Any, T>(first.size)
    first.forEach { t -> firstMap[function(t)] = t }
    val secondMap = HashMap<Any, T>(second.size)
    second.forEach { t -> secondMap[function(t)] = t }
    for (o in firstMap.keys) {
        if (secondMap.containsKey(o)) {
            //两个都包含，那么需要更新
            result.add(Pair2(firstMap[o], secondMap[o]))
            secondMap.remove(o)
        } else {
            //只有第一个有，第二个没有，说明是删除
            result.add(Pair2(firstMap[o], null))
        }
    }
    //此时第二个剩下的所有都是第一个没有的，那么属于新增
    for (o in secondMap.keys) {
        result.add(Pair2(null, secondMap[o]))
    }
    return result
}