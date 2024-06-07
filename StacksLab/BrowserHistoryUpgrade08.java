package StacksLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stackUrls = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        String currentInput = "";

        while (!(currentInput = scanner.nextLine()).equals("Home")) {
            if ("back".equals(currentInput)) {
                if (stackUrls.size() > 1) {
                    String toRemove = stackUrls.pop();
                    forward.push(toRemove);
                    System.out.println(stackUrls.peek());
                } else {
                    System.out.println("no previous URLs");
                }
                continue;
            }
            if ("forward".equals(currentInput)) {
                if (forward.size() > 0) {
                    String something = forward.pop();
                    System.out.println(something);
                    stackUrls.push(something);
                } else {
                    System.out.println("no next URLs");
                }
                continue;
            }

            System.out.println(currentInput);
            stackUrls.push(currentInput);
            forward.clear();
        }
    }
}
