package vip.mystery0.tools.java.utils;

import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import vip.mystery0.tools.java.function.IndexFunction;
import vip.mystery0.tools.java.function.IndexPredicate;
import vip.mystery0.tools.kotlin.model.exception.CollectionException;
import vip.mystery0.tools.kotlin.model.pair.Pair2;
import vip.mystery0.tools.kotlin.model.pair.PairKt;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author mystery0
 * @date 2019-08-21
 */
public class CollectionUtil {
    public static <T> List<T> emptyList() {
        return CollectionsKt.emptyList();
    }

    public static <T> List<T> listOf() {
        return emptyList();
    }

    public static <T> List<T> listOf(T params) {
        return CollectionsKt.listOf(params);
    }

    @SafeVarargs
    public static <T> List<T> listOf(T... params) {
        return CollectionsKt.listOf(params);
    }

    public static <T> ArrayList<T> emptyArrayList() {
        return new ArrayList<>(0);
    }

    public static <T> ArrayList<T> arrayListOf() {
        return emptyArrayList();
    }

    @SuppressWarnings("unchecked assignment")
    public static <T> ArrayList<T> arrayListOf(T params) {
        return CollectionsKt.arrayListOf(params);
    }

    @SafeVarargs
    public static <T> ArrayList<T> arrayListOf(T... params) {
        return CollectionsKt.arrayListOf(params);
    }

    public static <K, V> Map<K, V> emptyMap() {
        return MapsKt.emptyMap();
    }

    public static <K, V> Map<K, V> mapOf() {
        return emptyMap();
    }

    public static <K, V> Map<K, V> mapOf(Pair2<K, V> pair2) {
        Pair<K, V> pair = new Pair<>(pair2.getFirst(), pair2.getSecond());
        return MapsKt.mapOf(pair);
    }

    @SuppressWarnings("unchecked assignment")
    @SafeVarargs
    public static <K, V> Map<K, V> mapOf(Pair2<K, V>... pair2) {
        if (pair2.length == 0) {
            return emptyMap();
        }
        Pair<K, V>[] pairs = new Pair[pair2.length];
        for (int i = 0; i < pair2.length; i++) {
            pairs[i] = PairKt.toPair(pair2[i]);
        }
        return MapsKt.mapOf(pairs);
    }

    public static <K, V> HashMap<K, V> hashMapOf() {
        return new HashMap<>(0);
    }

    @SafeVarargs
    public static <K, V> HashMap<K, V> hashMapOf(Pair2<K, V>... pair2) {
        if (pair2.length == 0) {
            return new HashMap<>(0);
        }
        HashMap<K, V> map = new HashMap<>(pair2.length);
        for (Pair2<K, V> kvPair2 : pair2) {
            map.put(kvPair2.getFirst(), kvPair2.getSecond());
        }
        return map;
    }

    public static <T> Set<T> emptySet() {
        return SetsKt.emptySet();
    }

    public static <T> Set<T> setOf() {
        return emptySet();
    }

    public static <T> Set<T> setOf(T params) {
        return SetsKt.setOf(params);
    }

    @SafeVarargs
    public static <T> Set<T> setOf(T... params) {
        return SetsKt.setOf(params);
    }

    @SafeVarargs
    public static <T> HashSet<T> hashSetOf(T... params) {
        return SetsKt.hashSetOf(params);
    }

    public static <A, B> List<B> map(Iterable<A> collection, Function<A, B> function) {
        if (collection == null) {
            throw new CollectionException();
        }
        return CollectionsKt.map(collection, function::apply);
    }

    public static <A, B> List<B> mapIndexed(Iterable<A> collection, IndexFunction<A, B> function) {
        if (collection == null) {
            throw new CollectionException();
        }
        return CollectionsKt.mapIndexed(collection, function::apply);
    }

    public static <T> List<T> filter(Iterable<T> collection, Predicate<T> predicate) {
        if (collection == null) {
            throw new CollectionException();
        }
        return CollectionsKt.filter(collection, predicate::test);
    }

    public static <T, C extends Collection<T>> C filterTo(Iterable<T> collection, C c, Predicate<T> predicate) {
        return CollectionsKt.filterTo(collection, c, predicate::test);
    }

    public static <T> List<T> filterIndexed(Iterable<T> collection, IndexPredicate<T> indexPredicate) {
        if (collection == null) {
            throw new CollectionException();
        }
        return CollectionsKt.filterIndexed(collection, indexPredicate::test);
    }

    public static <T, C extends Collection<T>> C filterIndexedTo(Iterable<T> collection, C c, IndexPredicate<T> indexPredicate) {
        if (collection == null) {
            throw new CollectionException();
        }
        return CollectionsKt.filterIndexedTo(collection, c, indexPredicate::test);
    }

    public static <T> List<T> filterNotNull(Iterable<T> collection) {
        if (collection == null) {
            throw new CollectionException();
        }
        return CollectionsKt.filterNotNull(collection);
    }

    public static <T, C extends Collection<T>> C filterNotNullTo(Iterable<T> collection, C c) {
        if (collection == null) {
            throw new CollectionException();
        }
        return CollectionsKt.filterNotNullTo(collection, c);
    }

    public static <T> void reverse(List<T> collection) {
        CollectionsKt.reverse(collection);
    }

    public static <T> List<T> reverse(Iterable<T> collection) {
        return CollectionsKt.reversed(collection);
    }

    public static <T extends Comparable<T>> void sort(List<T> collection) {
        CollectionsKt.sort(collection);
    }

    public static <T extends Comparable<T>> List<T> sortedWith(Iterable<T> collection, Comparator<T> comparable) {
        return CollectionsKt.sortedWith(collection, comparable);
    }

    public static <T extends Comparable<T>> List<T> sorted(List<T> collection) {
        return CollectionsKt.sorted(collection);
    }

    public static <T extends Comparable<T>> List<T> sortedDescending(List<T> collection) {
        return CollectionsKt.sortedDescending(collection);
    }
}
