package MultidimensionalArrays;

import java.util.Scanner;

public class CompareMatrices01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String []inputDimensions = scanner.nextLine().split(" ");
        int firstRows = Integer.parseInt(inputDimensions[0]);
        int firstCols = Integer.parseInt(inputDimensions[1]);

        int [][] firstMatrix = new int [firstRows][firstCols];

        for (int i = 0; i < firstRows; i++) {
            String [] rowNums = scanner.nextLine().split(" ");

            for (int j = 0; j < firstCols; j++) {
                firstMatrix [i][j] = Integer.parseInt(rowNums[j]);
            }
        }
        String []inputDimensions2 = scanner.nextLine().split(" ");
        int secondRows = Integer.parseInt(inputDimensions2[0]);
        int secondCols = Integer.parseInt(inputDimensions2[1]);

        int [][] secondMatrix = new int [secondRows][secondCols];

        for (int i = 0; i < secondRows; i++) {
            String [] rowNums = scanner.nextLine().split(" ");

            for (int j = 0; j < secondCols; j++) {
                secondMatrix [i][j] = Integer.parseInt(rowNums[j]);
            }
        }
        if (firstRows != secondRows || firstCols != secondCols ){
            System.out.println("not equal");
            return;
        }
        for (int i = 0; i < firstRows; i++) {
            for (int j = 0; j < firstCols; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]){
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");
    }
}
