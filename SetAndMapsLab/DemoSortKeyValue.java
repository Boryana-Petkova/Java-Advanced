package SetAndMapsLab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DemoSortKeyValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> students = new HashMap<>();
        students.put("Asen", 4);
        students.put("Ivan", 3);
        students.put("Didi", 6);
        students.put("Ani", 5);

//        students.entrySet().stream().sorted((left, right) -> {
//            int result = right.getValue().compareTo(left.getValue());
//            if (result == 0){
//                result = left.getKey().compareTo(right.getKey());
//            }
//            return result;
//        }).forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

            students.values().stream().forEach(num -> System.out.printf("%d ", num));
        System.out.println();
            students.keySet().stream().forEach(name -> System.out.printf("%s ", name));

    }
}
