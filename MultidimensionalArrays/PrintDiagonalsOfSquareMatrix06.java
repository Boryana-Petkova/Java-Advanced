package MultidimensionalArrays;

import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //4
        //1 2 3 2
        //1 1 2 4
        //1 2 1 4
        //2 2 3 1
        int [][] matrix = new int [n][n];

        for (int i = 0; i < matrix.length; i++) {
            String[] dataCols = scanner.nextLine().split(" ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(dataCols[j]);
            }
        }
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][i] + " ");
            }
            System.out.println();
            for (int i = matrix.length -1, col = 0; col < matrix.length; i--, col++) {
                System.out.print(matrix[i][col] + " ");

        }
    }
}
