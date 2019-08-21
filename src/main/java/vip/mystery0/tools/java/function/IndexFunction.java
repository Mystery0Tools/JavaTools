package vip.mystery0.tools.java.function;

/**
 * @author mystery0
 */
@FunctionalInterface
public interface IndexFunction<T,R> {
    R apply(int index, T t);
}
