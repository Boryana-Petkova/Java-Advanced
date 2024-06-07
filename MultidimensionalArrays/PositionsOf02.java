package MultidimensionalArrays;

import java.util.Scanner;

public class PositionsOf02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        //2 3

        int [][] matrix =  new int [rows][cols];
        for (int i = 0; i < rows; i++) {
            String [] dataCols = scanner.nextLine().split(" ");

            for (int j = 0; j < cols; j++) {
                matrix [i][j] = Integer.parseInt(dataCols[j]);
            }
        }
        //1 2 3
        //4 2 2

        int n = Integer.parseInt(scanner.nextLine());
        //2

        boolean isFound = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] == n){
                isFound = true;
                System.out.println(i + " " + j);
            }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }
    }
}
