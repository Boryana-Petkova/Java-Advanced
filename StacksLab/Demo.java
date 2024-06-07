package StacksLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(13); // индекс 3
        stack.push(23); // индекс 2
        stack.push(33); // индекс 1
        stack.push(73); // индекс 0
        // стекът принтира винаги последния въведен елемент, тоест 73 в случая
        while (!stack.isEmpty()){
            int topElement = stack.pop(); // взимам и премахвам елемент
            System.out.println(topElement); // принтирам елемента и на 0-вата му позиция
                                                            // застава следващия елемент
        }
    }
}
