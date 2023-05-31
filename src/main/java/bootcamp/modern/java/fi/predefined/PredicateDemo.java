package bootcamp.modern.java.fi.predefined;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        List<String> list = List.of("Apple","","Orange","");
        List<Integer> numList = List.of(10,11,12,13,50,60,100);

        //create a predicate
        Predicate<String> filterByNonEmptyString = str -> !str.isEmpty();

        // create a predicate for even numbers
        Predicate<Integer> filterbyEvenNumber = e -> e%2 == 0;

        //Based on the filter filterByEvenNumber
        filterBy(numList,filterbyEvenNumber)
                .stream()
                .forEach(e-> System.out.print(e+" "));

        System.out.println();
        //Based on the predicate it will filter out the list
        filterBy(list,filterByNonEmptyString)
                .stream()
                .forEach(e -> System.out.print(e+" "));
    }

    private static <T> List<T> filterBy(List<T> list, Predicate<T> filterByNonEmptyString) {
        List<T> newList = new ArrayList<>();
        for (T str:list){
            //pass the string to the test()
            if (filterByNonEmptyString.test(str)){
                newList.add(str);
            }
        }
        return newList;
    }
}
