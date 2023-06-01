package bootcamp.modern.java.optional;

import java.util.Optional;

public class GettingValueBack {

    public static void main(String[] args) {
        Integer val = 10;
        Optional<Integer> intVal = Optional.of(val);
        Optional<Integer> isEmpty = Optional.empty();
        //getting the value
        //if val = null then it will throw NoValue exception
        System.out.println(intVal.get());

        //What to do then?
        //Let's use isPresent()

        //#Approach 1
        Integer a = isEmpty.isPresent()?intVal.get():0;
        System.out.println(a);

        //Approach 2
        //orElse()
        //Performance Overhead => Default object always get generated
        // but returned when Optional is empty
        Integer orElse = isEmpty.orElse(0);
        System.out.println(orElse);
        //orElseGet(Supplier<T>)
        //Supplier -> takes nothing and return a value
        //Better performance -> supplier is only get when optional is empty
        Integer orElseGet = isEmpty.orElseGet(()->0);
        System.out.println(orElseGet);
        //In case want to throw an exception
        //orElseThrow(ExceptionSupplier)
        isEmpty.orElseThrow(()-> new IllegalArgumentException());

        //orElseThrow() => introduced in java 10 by default returns NoSuchElementException
        isEmpty.orElseThrow();

    }
}
