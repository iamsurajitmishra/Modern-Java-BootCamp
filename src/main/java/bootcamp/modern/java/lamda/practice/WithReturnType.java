package bootcamp.modern.java.lamda.practice;

public class WithReturnType {
    public static void main(String[] args) {
        //When we have single argument we don't need return keyword
        LengthOfString length = str -> str.length();
        System.out.println(length.len("Surajit"));
    }
}
