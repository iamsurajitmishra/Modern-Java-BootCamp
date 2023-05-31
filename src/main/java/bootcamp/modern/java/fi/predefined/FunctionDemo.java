package bootcamp.modern.java.fi.predefined;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
/*
   Function -> Takes input of some type and returns result in different type
 */
public class FunctionDemo {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       // Function<String,Integer> fun = (str) -> str.length();
        Function<String,Integer> fun = String::length; //Class::instanceMethod
        System.out.println(fun.apply("Hello Function!!"));

        List<String> stringList = List.of("Surajit", "Abhijit","Rituparna","Nilachal","Kalpana","Sanchita");

        mapper(stringList, fun).stream()
                .forEach(obj -> System.out.print(obj+" "));

    }

    /**
     *
     * @param genList
     * @param fun
     * @return
     * @param <T>
     * @param <R>
     */

    private static<T,R> List<R> mapper(List<T> genList, Function<T, R> fun) {
        List<R> list = new ArrayList<>();
        genList.stream()
                .forEach(str -> list.add(fun.apply(str)));
        return list;
    }
}
