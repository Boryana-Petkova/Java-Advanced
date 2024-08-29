package SetAndMapsLab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> vehicles = new HashMap<>();
        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("BMW", 10);

//        for(String key: vehicles.keySet()) // принтираме всичко
//            System.out.println(key + " - " + vehicles.get(key));

//        Set<String> strings = vehicles.keySet(); // вадим само ключовете в сет и принтираме
//        for (String s : strings) {
//            System.out.println(s + " ");
//        }
//        System.out.println();
        Set<Map.Entry<String, Integer>> entries = vehicles.entrySet(); // пак принтираме всичко през сет
        for (Map.Entry<String, Integer> e : entries) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }

    }
}
