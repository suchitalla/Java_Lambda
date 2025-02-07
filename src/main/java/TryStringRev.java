import java.util.Optional;

public class TryStringRev {

    public static void main(String[] args) {



        Optional<String> nonEmpty = Optional.of("Hello");
        nonEmpty.ifPresent(value -> System.out.println(value));

        Optional<String> upper = nonEmpty.map(String::toUpperCase);
        upper.ifPresent(value -> System.out.println(value));

        Optional<String> result = nonEmpty.filter(value -> value.startsWith("H"));
        result.ifPresent(value -> System.out.println(value));

        Optional<String> name = Optional.of("Java");
        Optional<Integer> length = name.flatMap(n -> Optional.of(n.length()));
        length.ifPresent(value -> System.out.println(value));

        Optional<String> empty = Optional.empty();
        String result1 = empty.orElseGet(() -> "Computed Default");
        System.out.println(result1);
       try
       {
           empty.orElseThrow(() -> new IllegalArgumentException("Value not present!"));
       }
       catch(Exception e)
       {

           System.out.println("End Of Program");
       }


    }
}
