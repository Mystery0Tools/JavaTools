package vip.mystery0.tools.java.utils;

import vip.mystery0.tools.kotlin.model.pair.Pair2;
import vip.mystery0.tools.kotlin.model.pair.PairArrayList;
import vip.mystery0.tools.kotlin.utils.DataSetUtilKt;

import java.util.Collection;
import java.util.function.Function;

/**
 * @author mystery0
 * @date 2019-08-21
 */
public class DataSetUtil {
    public static <T> PairArrayList<Pair2<T, T>> splitCollection(Collection<T> first,
                                                                 Collection<T> second,
                                                                 Function<T, Object> function) {
        return DataSetUtilKt.splitCollection(first, second, function::apply);
    }
}
