package bootcamp.modern.java.fi.predefined;

import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static void main(String[] args) {
        BiFunction<String, String, Integer> bifun = (a,b) -> (a.length() + b.length());
        System.out.println(bifun.apply("Surajit","Abhijit"));
    }

}
