import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TryStreams {

    public static void main(String[] args) {

        Stream<String> vals = Stream.of("don", "demon", "paper");


        String[] chk = new String[]{"pant", "blouse", "water","tint","tax"};
        List<String> xs = Arrays.stream(chk).sorted().collect(Collectors.toList());
        Map<Integer, List<String>> xs2 = Arrays.stream(chk).sorted().collect(Collectors.groupingBy(String::length));

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"Hello");
        hm.put(2,"Chalo");
        hm.put(3,"Trilo");
        hm.forEach((key, value) -> {
            System.out.println("Key: " + key);
            System.out.println("Values: " + value);
        });

        xs.stream().forEach(System.out::println);

        xs.stream().map(a->a.length()).forEach(System.out::println);

        xs.stream().filter(a->a.contains("a")).forEach(System.out::println);

        String som = vals.collect(Collectors.joining(","));
        System.out.println(som);

        Map<Integer,List<String>> mp = vals.sorted().collect((Collectors.groupingBy(String::length)));
        mp.forEach((key, value) -> {
            System.out.println("MP Key: " + key);
            System.out.println("MP Values: " + value);
        });


    }

}
