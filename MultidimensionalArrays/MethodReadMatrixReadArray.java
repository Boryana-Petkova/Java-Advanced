package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MethodReadMatrixReadArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] matrix = readMatrix(scanner);
        int [] arr = readArray(scanner);
    }
    private static int[][] readMatrix (Scanner scanner){
        int size = Integer.parseInt(scanner.nextLine());

        int [][] matrix = new int [size][size];

        for (int i = 0; i < size; i++) {
            matrix[i] = readArray(scanner);

        }
        return matrix;
    }
    private static int [] readArray (Scanner scanner){
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
