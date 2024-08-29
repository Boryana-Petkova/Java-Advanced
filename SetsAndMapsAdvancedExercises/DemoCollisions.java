package SetsAndMapsAdvancedExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DemoCollisions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //collisions in HashMap and HashSet - Колизия е когато имаме два стринга с един код
        //Equals and Hashcode contract
        // - когато правим уникален клас студент, е хубаво
        // да правим метод boolean equals, за да видим дали няма да се дублира с друг студент
        String a = "Siblings";
        String b = "Teheran";

        System.out.println(a.hashCode());//ще получим един hash code и за двата стринга
        System.out.println(b.hashCode()); // това е адреса/bucket-а в случая 231609873


        Map<String, String> map = new HashMap<>();

        map.put(a, "000");
        map.put(b, "asd");
        String element = map.get(a); // така си намираме в bucket-а ключ а
        System.out.println(element);
    }
}
