package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class DemoMatrixShort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 2;
        int cols = 3;

        int [][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix [row] =  Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        printMatrix(rows, cols, matrix); // създаване на метод ->
                                    // селектираме всичко и контрол, алт и буква М

        printMatrixWithForeach(matrix); // втори вариант принтиране
    }

    private static void printMatrixWithForeach(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void printMatrix(int rows, int cols, int[][] matrix) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
