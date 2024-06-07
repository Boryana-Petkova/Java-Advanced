package StacksAndQueuesExercises;

import java.util.Scanner;

public class recursiveFibonacci06 {
    public static long [] memoryForFib;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        memoryForFib = new long [n + 1];
        System.out.println(fibonacci(n));



        // fibonacci формула 1, 1, 2, 3, 5, 8, 13, 21, 34…
        // f1 = 1; f2 = 1; //винаги първите две числа на фибоначи са еднакви
        // f3 = f1 + f2;
        // f4 = f2 + f3;
        // f5 = f3 + f4;
        // и т.н...
    }
    public static long fibonacci (int n){
       if (n <= 1){
           return 1;
       }
       if (memoryForFib[n] != 0){
           return memoryForFib[n];

       }
            return memoryForFib[n] = fibonacci(n-1) + fibonacci(n-2);
    }
}
