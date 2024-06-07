package StacksLab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class DemoStackAndDesetichnoAndPriorityQueqe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(13); // индекс 3
        stack.push(23); // индекс 2
        stack.push(33); // индекс 1
        stack.push(73); // индекс 0

        stack.remove(23); // премахваме елемент
        stack.removeAll(Arrays.asList(23)); // или премахваме всеки елемент 23, колкото пъти го има

        while (!stack.isEmpty()) {
            int topElement = stack.pop();
            System.out.println(topElement);
        }*/
        // Преобразуване на десетично число в двоично...
        // 13 -> 1101
        // 13 / 2 = 6  остатък 1
        //  6 / 2 = 3  остатък 0
        //  3 / 2 = 1  остатък 1
        //  1 / 2 = 0  остатък 1
        // накрая двоичното число е остатъците отдолу нагоре, тоест 1101

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        //подрежда ги по възходящ ред, но не съвсем, вътре е по-разбъркано, или със зададен приоритет
        // при String също - от А към края, ако няма зададен друг приоритет
        queue.offer(13);
        queue.offer(4); //
        queue.offer(10); //
        queue.offer(20); //

        System.out.println(queue.poll()); // 4
        System.out.println(queue.poll()); // 10
        System.out.println(queue.poll()); // 13
        System.out.println(queue.poll()); // 20
    }
}
