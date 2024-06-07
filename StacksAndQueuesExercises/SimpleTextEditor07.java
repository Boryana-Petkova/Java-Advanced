package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder currentTextBuilder = new StringBuilder();
        ArrayDeque<String> tetxStack = new ArrayDeque<>();

        for (int i = 1; i <= n ; i++) {
            String command = scanner.nextLine();

            if (command.startsWith("1")){ // използваме вместо contains заради условията
                //1 {string}" - appends [string] to the end of the text
                tetxStack.push(currentTextBuilder.toString());
                // съхраняваме текущия стринг/текст в стек преди всяка модификация!!!,
                // тоест стека държи предната модификация, и ако трябва да я върнем, ние ги пазим, без новата.
            String textToAppend = command.split("\\s+")[1];
            currentTextBuilder.append(textToAppend);

            } else if (command.startsWith("2")) {
                //2 {count}" - erases the last [count] elements from the text
                tetxStack.push(currentTextBuilder.toString());
                int count = Integer.parseInt(command.split("\\s+")[1]);
                currentTextBuilder.delete(currentTextBuilder.length() -count, currentTextBuilder.length());

            } else if (command.startsWith("3")) {
                //3 {index}" - returns the element at position [index] from the text.
                int index = Integer.parseInt(command.split("\\s+")[1]);
                System.out.println(currentTextBuilder.charAt(index - 1));
                //приемаме , че принтираме елемента на позицията, не на индекса,
                // тоест буквално на 3-та позиция кой елемент стои
            } else if (command.startsWith("4")){
                if (!tetxStack.isEmpty()) {
                    String last = tetxStack.pop();
                    currentTextBuilder = new StringBuilder(last);
                }

            }
        }
    }
}
