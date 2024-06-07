package StacksLab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] names = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();
        //Collections.addAll(queue, names); // прехвърляме елементите от масив в опашка
        // OR
        for (String child : names) {
            queue.offer(child);
        }

        while (queue.size() > 1){
            for (int i = 1; i < n; i++) { // ако n e 10, итерираме от 1 до 9,
                                        // за да може излизайки от for елемента 10 да го махнем
                                            // от опашката и да го принтираме
            String child = queue.poll();
            queue.offer(child);
            }
            String removedChild = queue.poll(); // 10-то дете -> премахваме го от опашката
            System.out.println("Removed " + removedChild); // принтираме го
        }
        System.out.println("Last is " + queue.poll()); // накрая остава едно дете и го принтираме
    }
}
