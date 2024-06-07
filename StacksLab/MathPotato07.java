package StacksLab;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] names = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        PriorityQueue<String> queue = new PriorityQueue<>();
        //Collections.addAll(queue, names); // прехвърляме елементите от масив в опашка
        // OR
        for (String child : names) {
            queue.offer(child);
        }
        int currentSteps = 1;
        while (queue.size() > 1){
            for (int i = 1; i < n; i++) {

                String child = queue.poll();
                queue.offer(child);

            }
            if (isPrime(currentSteps)){
                System.out.println("Prime " + queue.peek());
            } else {
                String removedChild = queue.poll();
                System.out.println("Removed " + removedChild);
            }
            currentSteps++;
        }
        System.out.println("Last is " + queue.poll());
    }
    private static boolean isPrime(int num){
        if (num == 1){
            return false;
        }
        for (int i = 2; i < num ; i++) {
            if (num % i == 0){ // ако се дели на друго число освен на себе си и на 1,
                                // и няма остатък -> е съставно???
                return false;
            }
        }
        return true;
    }
}
