package StacksLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> printDocs = new ArrayDeque<>();
        while (!input.equals("print")){
            if (input.equals("cancel")){
                if (printDocs.isEmpty()){
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printDocs.pop());
                    // принтираме Canceled и името на документа и го премахваме
                }
            } else {
                printDocs.offer(input); // прибавяме в опашката
            }

            input = scanner.nextLine();
        }
        while (!printDocs.isEmpty()){
            System.out.println(printDocs.pop());
        }
    }
}
