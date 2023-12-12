package oops.java;

public class Main {

    /*
      => Cat class
      => With all its atributes
     */
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("Tommy");
        c1.setAge(5);
        c1.setColor("Yellow");
        c1.setGender(Gender.MALE);
        c1.setWeight(20);

        System.out.println(c1);
        c1.breath();
        c1.eat("Non-veg");

        Helicopter h1 = new Helicopter();
        h1.setOrigin("KOLKATA");
        h1.setDest("HYDERABAD");
        h1.setPassenger("SURAJIT MISHRA");

        System.out.println(h1);
    }
}
