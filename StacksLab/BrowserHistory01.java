package StacksLab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistory01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();
        String input = scanner.nextLine();
        while (!input.equals("Home")){
            if (input.equals("back")){
                if (history.isEmpty() || history.size() == 1){ // ако е само един елемент или празен,
                                                                // нямаме предишни
                    System.out.println("no previous URLs");
                    input = scanner.nextLine(); // прочитаме пак нов ред
                    continue; // и чак тогава тази команда
                }
                history.pop(); // ако имаме повече елементи в стека, премахваме последния,
                                // за да се върнем на предишния и да го принтираме

            }  else { // ако командата е друга, а не back
            history.push(input); // прибавяме нов елемент, тоест URL в случая
            }
            System.out.println(history.peek());

            input = scanner.nextLine();
        }
    }
}
