import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.*;
import java.util.stream.Collectors;

public class CountingSummingAveraging {
    public static void run(){
        List<Person> people = new ArrayList<>();
        people.add(new Person("Kamil", 33, 1.75));
        people.add(new Person("Mariusz", 21, 1.8));
        people.add(new Person("Dominik", 37, 1.63));
        Long collect = people.stream()
                .collect(Collectors.counting());
        System.out.println(collect);
        Integer collect1 = people.stream()
                .collect(Collectors.summingInt(x -> x.getAge()));
        System.out.println(collect1);

        Double collect2 = people.stream()
                .collect(Collectors.averagingInt(x -> x.getAge()));
        System.out.println(collect2);

        Optional<Integer> collect3 = people.stream()
                .map(person -> person.getAge())
                .collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println(collect3.get());

    }
}
