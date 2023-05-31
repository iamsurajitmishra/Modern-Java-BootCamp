package bootcamp.modern.java.method.reference;

import java.util.function.BiFunction;

public class StaticMethodReference {
    public static void main(String[] args) {
        BiFunction<String,String,String> bifun = A_Class::staticMethod; //used static method reference
        System.out.println(bifun.apply("Surajit","Mishra"));
    }
}

class A_Class{
    /**
     *
     * @param a
     * @param b
     * @return
     */
    static String staticMethod(String a, String b){
        return (a+" "+b);
    }
}
