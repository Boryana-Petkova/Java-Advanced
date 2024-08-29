package SetAndMapsLab;

import java.util.*;

public class Count04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        LinkedHashMap<Double, Integer> countNumberMap = new LinkedHashMap<>();

        for (int i = 0; i < numbersArr.length; i++) {
            if (countNumberMap.containsKey(numbersArr[i])){
                int countNumber = countNumberMap.get(numbersArr[i]);
                countNumber++;
                countNumberMap.put(numbersArr[i], countNumber);
            } else {
                countNumberMap.put(numbersArr[i], 1);
            }
        }
        for (Map.Entry<Double, Integer> entry: countNumberMap.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
