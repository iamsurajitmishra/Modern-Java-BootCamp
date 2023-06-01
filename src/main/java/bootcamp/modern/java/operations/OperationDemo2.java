package bootcamp.modern.java.operations;

import java.util.Optional;

public class OperationDemo2 {

    public static void main(String[] args) {
        Optional<String> optionalVal = Optional.of("Value");

        // ifPresent(Consumer)
        optionalVal.ifPresent(System.out::println);

        //ifPresentOrElse(consumer, runnable)
        optionalVal
                .ifPresentOrElse(System.out::println,()-> System.out.print("Value is absent"));
        //Try with Optional with empty
        Optional.empty()
                .ifPresentOrElse(System.out::print,()-> System.out.println("Value is absent."));

        //stream()
        optionalVal.stream()
                .forEach(System.out::println);
        Optional.empty()
                .stream()
                .forEach(System.out::println);

        //or(Supplier)
        optionalVal.or(()->Optional.of("New value"))
                .ifPresent(System.out::println);
        Optional.empty()
                .or(()->Optional.of("New value"))
                .ifPresent(System.out::println); //O/P -> New value

        //equals()
        System.out.println(optionalVal.equals(Optional.of("Value"))); // return true

        //hashcode()
        System.out.println(optionalVal.hashCode());
        System.out.println(Optional.empty().hashCode()); // O/P -> 0
    }




}
