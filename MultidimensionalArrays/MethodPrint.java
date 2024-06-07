package MultidimensionalArrays;

import java.util.Scanner;

public class MethodPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
    private static void printMatrix (int[][] matrix){
        for (int[] arr : matrix) {
            for (int e : arr) {
                System.out.print(e + " ");
            }
            System.out.println();
        }

    }
}
