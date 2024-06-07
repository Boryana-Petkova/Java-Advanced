package StacksAndQueuesExercises;

import java.util.Scanner;

public class DemoRecurs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println(factorial(5));

        //5!
        // 1*2*3*4*5
        //4!*5
        //3!*4*5
        //2!*3*4*5
        //1!*2*3*4*5
    }
    public static int factorial (int n) {
        // рекурсията трябва да има дъно
        if (n == 0){
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}
