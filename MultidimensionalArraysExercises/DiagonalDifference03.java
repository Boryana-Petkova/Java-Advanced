package MultidimensionalArraysExercises;

import java.util.Scanner;

public class DiagonalDifference03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //3
        //11 2 4
        //4 5 6
        //10 8 -12
        int size = Integer.parseInt(scanner.nextLine());

        int [][] matrix = new int [size][size];
        for (int row = 0; row < size; row++) {
            String [] rowInput = scanner.nextLine().split(" ");
            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(rowInput[col]);
            }
        }
        int mainDiagonal = 0;
//        for (int row = 0; row < size; row++) { // Primary Diagonal
//            for (int col = 0; col < size; col++) {
//                if (row == col){
//                    mainDiagonal += matrix[row][col];
//                }
//            }
//        }
        for (int index = 0; index < size; index++) { // Primary Diagonal !!!!! лесен
            mainDiagonal += matrix[index][index];
        }

        int secondaryDiagonal = 0;
//        for (int row = size - 1, col = 0; col < size && row >= 0; row--, col++) {
//            // цикъл с две променливи; Secondary Diagonal !!!!! лесен
//            secondaryDiagonal += matrix[row][col];
//        }
        for (int row = 0; row < size; row++) { // Secondary Diagonal !!!!! Втори вариант! лесен
            secondaryDiagonal += matrix[row][size - 1 - row];
        }
        System.out.println(Math.abs(mainDiagonal - secondaryDiagonal));
    }
}
