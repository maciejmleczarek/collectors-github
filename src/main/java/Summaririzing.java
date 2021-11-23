import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Summaririzing {
    public static void run(){
        List<Person> people = new ArrayList<>();
        people.add(new Person("Kamil", 33, 1.75));
        people.add(new Person("Mariusz", 21, 1.8));
        people.add(new Person("Dominik", 37, 1.63));
        IntSummaryStatistics collect = people.stream()
                .collect(Collectors.summarizingInt(person -> person.getAge()));
        System.out.println(collect.getMax());
        System.out.println(collect.getAverage());
        System.out.println(collect.getCount());
        System.out.println(collect.getSum());

    }
}
