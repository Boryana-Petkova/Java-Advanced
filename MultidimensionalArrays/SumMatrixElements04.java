package MultidimensionalArrays;

import java.util.Scanner;

public class SumMatrixElements04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        //3, 6
        //7, 1, 3, 3, 2, 1
        //1, 3, 9, 8, 5, 6
        //4, 6, 7, 9, 1, 0

        int [][] matrix =  new int [rows][cols];
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            String [] dataCols = scanner.nextLine().split(", ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(dataCols[j]);
                sum += matrix [i][j];
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
