package MultidimensionalArraysExercises;

import java.util.Scanner;

public class MaximalSum04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int [][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] rowInput = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(rowInput[col]);
            }
        }
            int maxValue = Integer.MIN_VALUE;
            int bestStartRow = 0;
            int bestStartCol = 0;
            for (int row = 0; row < rows - 2; row++) { // ограничаваме матрицата до 2 реда да обхождаме
                for (int col = 0; col < cols - 2; col++) { // и тук също, но до 3 колони в случая
                    int sum = 0;
                    for (int currentRow = row; currentRow < row + 3; currentRow++) { // търсим най-голяма сума от квадратна матрица 3х3
                        for (int currentCol = col; currentCol < col + 3; currentCol++) {
                            sum = sum + matrix[currentRow][currentCol];
                        }
                    }
                    if ( sum > maxValue){
                        maxValue = sum;
                        bestStartRow = row; // запазваме всеки път реда, от който започва
                                            // най-голямата сума на матрица
                        bestStartCol = col; // тук същото, за да принтираме точно тази матрица
                    }
            }
        }
        System.out.println("Sum = " + maxValue);
        for (int row = bestStartRow; row < bestStartRow + 3; row++) {
            for (int col = bestStartCol; col < bestStartCol + 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
