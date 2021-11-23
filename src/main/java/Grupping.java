import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grupping {
    public static void run() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Kamil", 33, 1.75));
        people.add(new Person("Mariusz", 21, 1.8));
        people.add(new Person("Dominik", 37, 1.63));
        people.add(new Person("Daria", 37, 1.63));
        Map<Integer, List<Person>> collect = people.stream()
                .collect(Collectors.groupingBy(x -> x.getAge()));
        System.out.println(collect.toString());
    }
}

