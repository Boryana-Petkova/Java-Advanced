package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= n ; i++) {
            String command = scanner.nextLine();
            if (command.startsWith("1")){
                //1 X" - Push the element X into the stack.
                int element = Integer.parseInt(command.split(" ")[1]);
                stack.push(element);

            } else if (command.contains("2")){
                if (!stack.isEmpty()){
                    stack.pop();
                }

            } else if (command.contains("3")){
                if (!stack.isEmpty()) {
                    System.out.println(Collections.max(stack));
                    // намираме най-голямото число в стека
                }

            }
        }
    }
}
