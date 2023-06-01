package bootcamp.modern.java.operations;

import java.util.Optional;

public class OperationDemo1 {

    public static void main(String[] args) {

        Optional<String> optionalVal = Optional.of("This is a optional value");
        Optional<String> empty = Optional.empty();

        //map() => modifies the value of Optional
        Optional<String> map=optionalVal.map(val -> "Replaced");
        System.out.println(map.get());

        //map() -> empty optional
        //NoSuchElementException occur
        Optional<String> nmap = Optional.empty().map(val -> "Replaced");
        //System.out.println(nmap.get());

        //Let's try invoking orElse() on the above statement
        String orElse = empty.map(val -> "Replaced").orElse("Empty");
        System.out.println(orElse);



        //filter() => Checks the condition on an Optional
        //
        Optional<String> filter = optionalVal.filter(val -> val.contains("optional"));
        System.out.println(filter.get());


        //flatmap()
        //Works like map() => only thing is it already return an optional
        Optional<String> flatmap = optionalVal.flatMap(val ->Optional.of("Replaced"));
        System.out.println(flatmap.get());


    }
}
