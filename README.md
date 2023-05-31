# Modern-Java-BootCamp
Java8, Lamda, Functional Interfaces


## Predefined most used functional interface
* `Predicate<T>`
  * used for checking a condition
  * After checking the condition it will return true or false
  * T -> boolean
  * IntPredicate, LongPredicate, DoublePredicate
* `Consumer<T>`
  * Consumer takes an input and returns nothing
  * T -> void
  * IntConsumer, LongConsumer, DoubleConsumer
* `Function<T>`
  * 
* Supplier

```
### BinaryOperator extends BiFunction
### UnaryOperator extends Function
```


## Method Reference & Constructor reference:
* Method Reference
 * `object::instanceMethod` => Method reference to an instance method of an existing object
 * `Class::StaticMethod` => Method reference to static method of the class
 * `Class::instanceMethod` => Method reference to an instance method of an input object of a particular type
 * `Class::new` => Method reference to constructor => Thread :: new

 
