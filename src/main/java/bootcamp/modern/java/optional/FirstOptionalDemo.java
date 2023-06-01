package bootcamp.modern.java.optional;

import java.util.Optional;

/**
 * Optional => is a box which wraps a value in it provide a better way to check
 * nullability so that we can avoid NullPointerException
 * => It consumes 16 bytes
 * => It's a separate object
 * => Don't think no new object will be created while using Optional, don't use
 *    optional wherever you see a null
 * => Optional is immutable
 *
 */

public class FirstOptionalDemo {
    public static void main(String[] args) {
        String val = "This is a demo for Optional class";
        Optional<String> optionalVal = Optional.of(val);

        val = null;

        //empty
        //returns empty optional
        Optional<String> empty = Optional.empty();

        //nullable
        // if val = null .ofNullable(val) return an empty Optional
        Optional<String> nullable = Optional.ofNullable(val);
        Optional<String> emptyOptional = Optional.ofNullable(null);

        /*
           Don't use get()
         */
        System.out.println(optionalVal.get());
        //System.out.println(nullable.get());
        //System.out.println(emptyOptional.get());

    }

}
