package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumberswithAStack01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String []text = scanner.nextLine().split(" ");
        //1 2 3 4 5
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (int i = 0; i < text.length; i++) {
            String element = text[i];
            stack.push(element); // слагаме в стек всеки елемент
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // принтираме като махаме всеки елемент
                                                    // по условието на задачата
        }
    }
}
