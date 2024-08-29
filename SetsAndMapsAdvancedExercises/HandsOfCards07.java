package SetsAndMapsAdvancedExercises;

import java.util.*;

public class HandsOfCards07 {
    // (S -> 4, H-> 3, D -> 2, C -> 1)
    static Map<String, Integer> types = Map.of("S", 4,
            "H", 3,
            "D", 2,
            "C", 1); // с Map.of така директно си прибавяме ключовете и стойностите

    // Powers 2 to 10 have the same value, and J to A is 11 to 14.
    static Map<String, Integer> power = new HashMap<>(Map.of("2", 2,
            "3", 3,
            "4", 4,
            "5", 5,
            "6", 6,
            "7", 7,
            "8", 8,
            "9", 9,
            "10", 10,
            "J", 11)); // приема по този начин до 11 стойности

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        power.put("Q", 12);
        power.put("K", 13);
        power.put("A", 14);

        Map<String, Set<String>> players = new LinkedHashMap<>();
        // избираме мап със сет вътре, за да не проверяваме дали дадена карта вече я има

        String input = scanner.nextLine();

        while (!"JOKER".equals(input)) {
            String[] tokens = input.split(": ");
            String playerName = tokens[0];

//            if (!players.containsKey(playerName)) {
//                players.put(playerName, new HashSet<>());
//            }
            players.putIfAbsent(playerName, new HashSet<>());

            String[] cards = tokens[1].split(", ");

            for (String card : cards) {
                players.get(playerName).add(card);
            }

            input = scanner.nextLine();
        }

        //        for (Map.Entry<String, Set<String>> entrySet : players.entrySet()) {
        //            String playerName = entrySet.getKey();
        //            int points = calculatePoints(entrySet.getValue());
        //            System.out.printf("%s: %d\n", playerName, points);
        //        }
        players.forEach((key, value) -> {
            int points = calculatePoints(value);
            System.out.printf("%s: %d\n", key, points);
        });
    }

    private static int calculatePoints(Set<String> cards) {
        int points = 0;

        for (String card : cards) {
            String cardPower = card.substring(0, card.length() - 1);
            //3H, 10S - понеже има карти от три символа, трябва да направим субстринг
            String type = String.valueOf(card.charAt(card.length() - 1));
            // първо си взимаме символа, който е последен винаги - 3H, 10S и го правим на стринг

            points += power.get(cardPower) * types.get(type);
            // на всеки играч му намираме точките и ги умножаваме
        }

        return points;
    }
}
