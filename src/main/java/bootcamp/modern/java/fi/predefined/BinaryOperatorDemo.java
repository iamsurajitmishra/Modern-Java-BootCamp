package bootcamp.modern.java.fi.predefined;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<String> biop = (s1,s2) -> (s1+" "+s2);
        System.out.println(biop.apply("Surajit","Mishra"));
    }
}
