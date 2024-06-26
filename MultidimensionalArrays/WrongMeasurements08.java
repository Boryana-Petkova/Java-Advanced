package MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class WrongMeasurements08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] matrix = readMatrix(scanner);
        int [] arr = readArray(scanner);

        int wrongValue = matrix[arr[0]][arr[1]];

        List<int[]> correctedValues = new ArrayList<>(); // ще държим новите стойности -
                                                    // ред, колона, нова стойност/сумата тоест

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == wrongValue) {
                    int sum = 0;

                    if (isInBounds(matrix, r - 1, c) && matrix[r - 1][c] != wrongValue ) {
                    //Top
                    sum += matrix[r - 1][c];
                    }
                    if (isInBounds(matrix, r, c - 1) && matrix[r][c - 1] != wrongValue ) {
                    // Left
                    sum += matrix[r][c - 1];
                    }
                    if (isInBounds(matrix, r + 1, c) && matrix[r + 1][c] != wrongValue ) {
                        // Down
                        sum += matrix[r + 1][c];
                    }
                    if (isInBounds(matrix, r, c + 1) && matrix[r][c + 1] != wrongValue ) {
                        // Right
                        sum += matrix[r][c + 1];
                    }
                    int [] parameters = new int[3];
                    parameters[0] = r;
                    parameters[1] = c;
                    parameters[2] = sum;

                    correctedValues.add(parameters);
                }
            }
        }
        for (int[] element: correctedValues) {
            matrix [element[0]][element[1]] = element[2];
                        // 0 е редът, 1 е колоната, 2 е сумата
        }
        printMatrix(matrix);
    }
    private static void printMatrix (int[][] matrix){
        for (int[] arr : matrix) {
            for (int e : arr) {
                System.out.print(e + " ");
            }
            System.out.println();
        }

    }
    private static boolean isInBounds(int[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length
                && c >= 0 && c < matrix[r].length;
    }
    private static int[][] readMatrix (Scanner scanner){
        int size = Integer.parseInt(scanner.nextLine());

        int [][] matrix = new int [size][size];

        for (int i = 0; i < size; i++) {
            matrix[i] = readArray(scanner);

        }
        return matrix;

    }
    private static int [] readArray (Scanner scanner){
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
