package bootcamp.modern.java.method.reference;

import java.util.function.Consumer;
import java.util.stream.IntStream;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,10)
                //.forEach(e -> System.out.print(e+" "));
                .forEach(System.out::print); //

        System.out.println();
        //lets create consumer
        Consumer<Integer> integerConsumer = e -> System.out.print(e+" ");
        IntStream.rangeClosed(1,10)
                .forEach(value -> integerConsumer.accept(value));

    }
}
