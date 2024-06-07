package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Utils {



    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int [] arr = matrix[i];
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
    public static char [][]readMatrix (Scanner scanner, int rows, int cols){

        char [][] matrix = new char [rows][cols];
        for (int row = 0; row < rows; row++) {
            char [] arr = scanner.nextLine().replaceAll("\\s+", "")
                    .toCharArray();

            matrix[row] = arr;
        }
        return matrix;
    }
}
