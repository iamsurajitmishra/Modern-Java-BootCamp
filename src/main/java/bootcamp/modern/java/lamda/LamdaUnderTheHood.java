package bootcamp.modern.java.lamda;

import bootcamp.modern.java.fi.MyFunInterface;

public class LamdaUnderTheHood {


    public static void main(String[] args) {

        /*
          Below code will create two different class for two anonymous class
         */
//        MyFunInterface fun1 = new MyFunInterface() {
//            @Override
//            public void myfun() {
//                System.out.println("This is fun1");
//            }
//        };
//        MyFunInterface fun2 = new MyFunInterface() {
//            @Override
//            public void myfun() {
//                System.out.println("This is fun2");
//            }
//        };

        /*
           Now let's see for lamda
         */
        MyFunInterface fun3 = ()-> System.out.println("This is fun3");
        MyFunInterface fun4 = () -> System.out.println("This is fun4");

        //calling
//        fun1.myfun();
//        fun2.myfun();

        fun3.myfun();
        fun4.myfun();
    }

}
