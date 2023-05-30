package bootcamp.modern.java.lamda;

import java.util.stream.IntStream;

public class ImperativeVSDeclarative {

    // Problem : count all even number within (0,100)

    public static void main(String[] args) {
        int countEven = 0;
        //imperative style
        for (int i=0;i<=100;i++){
            if(i%2==0){
                countEven+=i;
            }
        }
        System.out.println(countEven);


        //declarative style
        int sumOfEven =  IntStream.rangeClosed(0,100)
                .filter(i -> i%2==0)
                .reduce((x,y)->(x+y))
                .getAsInt();

        System.out.println(sumOfEven);
    }
}
