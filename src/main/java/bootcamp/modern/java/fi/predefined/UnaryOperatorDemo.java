package bootcamp.modern.java.fi.predefined;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 *   Unary Operator -> Extended
 */
public class UnaryOperatorDemo {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> numList = List.of(1,2,3,4,5,6,7,8);
        UnaryOperator<Integer> multiplyHundred = i -> (i*100);
        mapper(numList,multiplyHundred).stream()
                .forEach(e -> System.out.print(e+" "));
    }

    /**
     *
     * @param numList
     * @param multiplyHundred
     * @return
     * @param <T>
     */
    private static <T> List<T> mapper(List<T> numList, UnaryOperator<T> multiplyHundred) {
        List<T> nums = new ArrayList<>();
        numList.stream()
                .forEach(e -> nums.add(multiplyHundred.apply(e)));
        return nums;
    }
}
