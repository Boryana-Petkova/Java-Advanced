package MultidimensionalArrays;

import java.util.Scanner;

public class MethodIsInBounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    }
    private static boolean isInBounds(int[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length
                && c >= 0 && c < matrix[r].length;
    }
}
