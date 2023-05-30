package bootcamp.modern.java.fi;
/*

Functional Interface -> An interface with having only single abstract method marked by
@Functionalinterface anotation

 */
public class FunctionalInterface {
    public static void main(String[] args) {

        //data as parameter
        MyFunInterface fun = ()-> System.out.println("This is a functional interface.");
        fun.myfun();

        //behaviour as parameter
        getMyFun(()-> System.out.println("Behaviour as parameter."));

    }

    // passing behaviour as parameter
    public static void getMyFun(MyFunInterface fun){
        fun.myfun();
    }


}
