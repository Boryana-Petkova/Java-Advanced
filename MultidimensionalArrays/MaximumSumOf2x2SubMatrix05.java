package MultidimensionalArrays;

import java.util.Scanner;

public class MaximumSumOf2x2SubMatrix05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(", ");
        // 3, 6
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        //7, 1, 3, 3, 2, 1 -> смятаме първо 7+1 + на долния ред 1+3; после 1+3 и долен ред 9+8
        //1, 3, 9, 8, 5, 6
        //4, 6, 7, 9, 1, 0
        int [][] matrix = new int [rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            String [] dataCols = scanner.nextLine().split(", ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(dataCols[j]);
            }
        }
        int maxSum = 0;
        int maxLeftRow = -1; // слагаме невалидна стойност, от която да почнем
        int maxLeftCol = -1;
        for (int i = 0; i < matrix.length -1; i++) { // намаляме с 1, за да не изгърми цикъла
            for (int j = 0; j < matrix[i].length -1; j++) { // тук също
                int currentSum = matrix[i][j] + matrix[i][j+ 1] +
                        matrix[i+1][j] + matrix[i+1][j+1];

                if (currentSum > maxSum){
                    maxSum = currentSum;
                    maxLeftRow = i;
                    maxLeftCol = j;
                }
            }
        }
        System.out.println(matrix[maxLeftRow][maxLeftCol] + " " + matrix[maxLeftRow][maxLeftCol+1]);
        System.out.println(matrix[maxLeftRow+1][maxLeftCol] + " " + matrix[maxLeftRow+1][maxLeftCol+1]);

        System.out.println(maxSum);
    }
}
