package bootcamp.modern.java.lamda.practice;

public class WithParamNoReturnTypes {
    public static void main(String[] args) {
        MathOperation add = (a,b) -> System.out.println(a+b);
        MathOperation sub = (a,b) -> System.out.println(a-b);
        MathOperation mul = (a,b) -> System.out.println(a*b);

        add.operation(10,20);
        sub.operation(10,20);
        mul.operation(10,20);
    }
}
