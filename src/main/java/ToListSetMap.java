import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class ToListSetMap {
    public static void run(){
        List<String> teams = new ArrayList<>();
        teams.add("Poland");
        teams.add("Germany");
        teams.add("Slovakia");
        teams.add("Spain");
        teams.add("Sweden");
        teams.add("Germany");
        teams.add("Sweden");
        teams.stream()
                        .forEach(System.out::println);
        System.out.println();
        teams.stream()
                .filter(x -> x.startsWith("S") )
                .forEach(x1 -> System.out.println(x1));
        System.out.println();
        List<String> teamsStartingWithS = teams.stream()
                .filter(x -> x.startsWith("S"))
                .collect(Collectors.toList());
        System.out.println(teamsStartingWithS);

        Set<String> teamsStartingWithSSet = teams.stream()
                .filter(x -> x.startsWith("S"))
                .collect(Collectors.toSet());

        teamsStartingWithSSet.add("Scotland");
        System.out.println(teamsStartingWithSSet);

        Country country1 = new Country("Poland", "Warsaw");
        Country country2 = new Country("Spain", "Madrid");
        List<Country> countries = new ArrayList<>();
        countries.add(country1);
        countries.add(country2);
        Map<String, String> countriesMap = countries.stream()
                .collect(Collectors.toMap(x -> x.getName(), x -> x.getCapital()));
        System.out.println(countriesMap);


    }
}
