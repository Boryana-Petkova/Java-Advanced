package StacksLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> bits = new ArrayDeque<>();

        if (n < 0){
            System.out.println("Cannot handle negative integers");
            return; // използваме return, за да прекратим целия main метод,
                    // докато break използваме в цикли или switch
        }
        if (n == 0){
            System.out.println(0);
            return;
        }
        while (n > 0){
            int bit = n % 2; // извеждаме всеки път остатъка направо в променлива
            bits.push(bit); // записваме я в стека

            n = n / 2; // делим числото, докато не стане 0
        }
        while (!bits.isEmpty()){
            System.out.print(bits.pop());
        }
    }
}
