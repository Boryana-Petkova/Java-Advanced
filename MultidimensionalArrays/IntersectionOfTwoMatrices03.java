package MultidimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //3
        //4
        //a b c d
        //a b c d
        //a b c d
        //k b c k
        //a b g d
        //a k c d

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char [][] firstMatrix = readMatrix(scanner, rows, cols);
        char [][] secondMatrix = readMatrix(scanner, rows, cols);

        char [][] output = new char[rows][cols]; // третата матрица

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char first = firstMatrix[row][col];
                char second = secondMatrix[row][col];

                char fillChar = first == second ? first : '*';
                output[row][col] = fillChar;
            }
        }
        for (char[] chars: output) {
            for (char c:chars) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    public static char [][]readMatrix (Scanner scanner, int rows, int cols) {

        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            char[] arr = scanner.nextLine().replaceAll("\\s+", "")
                    .toCharArray();

            matrix[row] = arr;
        }
        return matrix;
    }
}
