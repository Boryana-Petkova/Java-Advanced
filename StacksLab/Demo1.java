package StacksLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(13); // индекс 3, въпреки, че е първи въведен
        stack.push(23); // индекс 2
        stack.push(33); // индекс 1
        stack.push(73); // индекс 0

        System.out.println(stack.peek()); // принтира елемента на 0-ва позиция
        System.out.println(stack.peek()); // принтира елемента на 0-ва позиция,
                            // защото не е премахнат и няма как да достъпим следващия елемент
        System.out.println(stack.peek());
    }
}
