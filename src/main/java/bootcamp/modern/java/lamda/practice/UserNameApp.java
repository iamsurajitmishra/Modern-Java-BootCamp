package bootcamp.modern.java.lamda.practice;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class UserNameApp {
    public static void main(String[] args) {
        UserName name = ()-> System.out.println("Let's start with lamda!");
        name.getName();

        Supplier<String> supplier  = ()-> "Hello from supplier";
        System.out.println(supplier.get());

        Consumer<String> consumer = str -> System.out.println("Hello, "+str);
        consumer.accept("Surajit");


    }
}
