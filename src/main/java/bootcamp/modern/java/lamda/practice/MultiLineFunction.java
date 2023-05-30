package bootcamp.modern.java.lamda.practice;

public class MultiLineFunction {
    public static void main(String[] args) {
        LengthOfString len = str -> {
            int l = str.length();
            System.out.println("Length of string is : "+l);
            return l;
        };
        System.out.println(len.len("Abhijit"));
    }
}
