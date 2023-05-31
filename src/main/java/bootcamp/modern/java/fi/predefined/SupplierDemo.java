package bootcamp.modern.java.fi.predefined;

import java.util.function.Supplier;

/*
  Supplier -> Takes nothing but returns something

@FunctionalInterface
public interface Supplier<T> {
     * Gets a result.
     *
     * @return a result
    T get();
      }
 */
public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = ()-> Math.random();
        System.out.print(randomSupplier.get());
    }
}
