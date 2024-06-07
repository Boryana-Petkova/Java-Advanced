package MultidimensionalArraysExercises;

import java.util.Scanner;

public class DemoSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] matrix = new int [2][3];
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                matrix [row][col] = 5;
            }
        }
        System.out.println(); // Получаваме 5 във всяка колона на ред
    }
}
