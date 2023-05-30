package bootcamp.modern.java.lamda.practice;

public class NoParamNoReturnTypes {

    public static void main(String[] args) {
        Name add = () -> System.out.print("Hey, I am Surajit!");
        add.myName();
    }

}
