import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    public static void run() {
        List<String> names = new ArrayList<>();
        names.add("Kamil");
        names.add("Mariusz");
        names.add("Dominik");
        names.remove("Dominik");
        String joined = names.stream()
                .collect(Collectors.joining(" "));
        System.out.println(joined);

    }
}
