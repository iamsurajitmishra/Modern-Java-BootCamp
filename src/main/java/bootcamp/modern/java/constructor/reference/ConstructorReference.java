package bootcamp.modern.java.constructor.reference;

import java.util.function.Function;

public class ConstructorReference {
    public static void main(String[] args) {
        Function<Runnable,Thread> threadGenerator = Thread::new;
        Runnable task1 = ()-> System.out.println("Task1 executed.");
        Runnable task2 = ()-> System.out.println("Task2 executed.");

        Thread t1 = threadGenerator.apply(task1);
        Thread t2 = threadGenerator.apply(task2);

        //More concise way
        threadGenerator.apply(()-> System.out.println("Task 3 executed.")).start();

        t1.start();
        t2.start();
    }


}
