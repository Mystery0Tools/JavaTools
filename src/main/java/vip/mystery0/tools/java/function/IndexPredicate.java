package vip.mystery0.tools.java.function;

/**
 * @author mystery0
 * @date 2019-08-21
 */
@FunctionalInterface
public interface IndexPredicate<T> {
    boolean test(int index, T t);
}
