package MultidimensionalArrays;

import java.util.Scanner;

public class DemoPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String []parts = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(parts[0]);
        int cols = Integer.parseInt(parts[1]);

        int [][] data = new int [rows][cols];

        for (int i = 0; i < rows; i++) {   // обхождаме
            String [] rowNums = scanner.nextLine().split(" ");

            for (int j = 0; j < cols; j++) {
                data [i][j] = Integer.parseInt(rowNums[j]);
            }
        }
        for (int i = 0; i < rows; i++) {  // принтиране на масив
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
