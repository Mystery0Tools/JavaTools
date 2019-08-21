package vip.mystery0.tools.java.function;

/**
 * @author mystery0
 */
@FunctionalInterface
public interface IndexPredicate<T> {
    boolean test(int index, T t);
}
