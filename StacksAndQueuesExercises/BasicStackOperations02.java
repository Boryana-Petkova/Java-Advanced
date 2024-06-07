package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // чете първо число от Стринг "5 2 13", тоест 5,
        // тоест скенера по този начин замества правенето на масив, за да вземе всяко число като int
        int s = scanner.nextInt(); // 2
        int x = scanner.nextInt(); // 13

        //1 13 45 32 4 - втория ред от конзолата

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= n ; i++) {
            stack.push(scanner.nextInt()); // добавяме число от втория ред,
                                            // прочетен от конзолата -> 1
        }
        for (int i = 1; i <= s ; i++) {
            stack.pop(); // махаме
        }
        if (stack.contains(x)){ // ако стека съдържа стойността на x, принтирай true
                                // contains връща true or false!!!
            System.out.println("true");
        } else {
            if (stack.isEmpty()){
                System.out.println(0);
            } else {
                System.out.println(Collections.min(stack));
                // принтирай най-малкото число от стека
            }
        }
    }
}
