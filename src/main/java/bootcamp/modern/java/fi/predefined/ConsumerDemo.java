package bootcamp.modern.java.fi.predefined;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static  void main(String[] args) {
        Consumer<Integer> numConsumer = e -> System.out.print(e+" ");
        Consumer<String> stringConsumer = e -> System.out.print(e +" ");
        List<String> stringList = List.of("Apple","Orange","Banana");
        List<Integer> numList = List.of(10,20,30,40,50);
        printListItem(stringList, stringConsumer);
        System.out.println();
        printListItem(numList, numConsumer);

    }

    private static <T> void printListItem(List<T> list, Consumer<T> consumer) {
        list.stream()
                .forEach(e->consumer.accept(e));
    }
}
