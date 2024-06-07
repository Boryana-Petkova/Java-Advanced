package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class DemoMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 2;
        int cols = 3;

        int [][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
                //String[] rowFromConsole =  scanner.nextLine().split("\\s+");
                // четем всеки ред от конзолата и махаме кавички и запетаи

                // Втори вариент, по-удобен, String масивът го правим на int масив
            int[] rowFromConsole =  Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
                //for (int col = 0; col < cols; col++) {
                //matrix[row][col] = Integer.parseInt(rowFromConsole[col]);
                // взимаме всяко число от прочетения ред и го слагаме на ред и колона,
                    // като първо нареждаме на първи ред
                //}
            matrix[row] = rowFromConsole; // по-удобно, вече int масивът, което е числата на
                                            // единия ред директно ги наливаме
                                            // в прочетения ред на матрицата
        }
//        for (int row = 0; row < rows; row++) {
//            for (int col = 0; col < cols; col++) {
//                System.out.print(matrix[row][col] + " ");
//            }
//            System.out.println();
//        }
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
