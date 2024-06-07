package MultidimensionalArraysExercises;

import java.util.Scanner;

public class FillTheMatrix01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String pattern = input[1];
        
        int counter = 1; // даваме стойност и ще я
                // увеличаваме на всяко квадратче, защото не са ни дадени числа за колоните
        int [][] matrix = new int[n][n];

        if (pattern.equals("A")){
            fillMatrixA(n, counter, matrix);

        } else if (pattern.equals("B")){
            fillMatrixB(n, counter, matrix);
        }

        printMatrix(n, matrix);
    }
    private static void fillMatrixB(int n, int counter, int[][] matrix) {
        for (int col = 0; col < n; col++) {
            if (col % 2 == 0){ // ако е четна колоната
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = counter; // пълни я надолу
                    counter++;
                }
            } else { // ако е нечетна колона
                for (int row = n -1; row >= 0 ; row--) { // пишем n -1, защото ако редовете са 4, то последния е 4 - 1
                    // пълни отдолу нагоре по колоната, тоест от последния ред към първия на едан и съща колона
                    matrix[row][col] = counter; // пълни нагоре
                    counter++;
                }
            }
        }
    }
    private static void fillMatrixA(int n, int counter, int[][] matrix) {
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                matrix[row][col] = counter;
                counter++;
            }
        }
    }

    private static void printMatrix(int n, int[][] matrix) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
