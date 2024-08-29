package SetAndMapsLab;

import java.util.*;
import java.util.stream.Collectors;

public class DemoSortingValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, Integer> mp = new TreeMap<>();
        mp.put("Aries", 1);
        mp.put("Taurus", 2);
        mp.put("Gemini", 3);


        //Sorting in Ascending Order by Value
            Map<String, Integer> result = mp.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));

    }
}
