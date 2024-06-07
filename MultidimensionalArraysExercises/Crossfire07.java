package MultidimensionalArraysExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crossfire07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dimensions = scanner.nextLine();

        int rows = Integer.parseInt(dimensions.split("\\s+")[0]);
        int cols = Integer.parseInt(dimensions.split("\\s+")[1]);

        List<List<Integer>> ListMatrix = new ArrayList<>();
        fillListMatrix(ListMatrix, rows, cols); // за да махаме после елементи от матрицата,
                                                // правим лист от листове

        String command = scanner.nextLine();
        while (!command.equals("Nuke it from orbit")){
            String [] tokens = command.split("\\s+");
            int rowCommand = Integer.parseInt(tokens[0]);
            int colCommand = Integer.parseInt(tokens[1]);
            int radiusCommand = Integer.parseInt(tokens[2]);

            //destroy up, down по редовете, после долу наляво и надясно по колоните в редаКоманда
            for (int row = rowCommand - radiusCommand; row <= rowCommand + radiusCommand ; row++) {
                if (isInMatrix (row, colCommand, ListMatrix)){ //валидираме реда, от който ще вземем
                    ListMatrix.get(row).set(colCommand, 0); // заменяме елемента с нула на текущ. ред
                }
            }
                for (int col = colCommand - radiusCommand; col <=  colCommand + radiusCommand; col++) {
                    if(isInMatrix(rowCommand, col, ListMatrix)) { //валидираме колоната, от която ще вземем
                        ListMatrix.get(rowCommand).set(col, 0); // заменяме елемента с нула в текущ. ред
                    }
            }
            for (int row = 0; row < ListMatrix.size(); row++) { // ще изтриваме нулите по текущия ред
                List<Integer> currentRow = ListMatrix.get(row);
                currentRow.removeAll(List.of(0)); // премахваме всички нули от текущия ред

                if (ListMatrix.get(row).size() == 0){ // ако има цял празен ред
                    ListMatrix.remove(row); // премахваме го
                    row--; // но тук задължително намаляме итерациите по редовете
                }
            }
            command = scanner.nextLine();
        }
        printMatrix(ListMatrix);

    }

    private static boolean isInMatrix(int row, int col, List<List<Integer>> ListMatrix) {
        return  (row >= 0 && row < ListMatrix.size() && col >= 0 && col < ListMatrix.get(row).size());

    }

    private static void printMatrix(List<List<Integer>> ListMatrix) {
        for (List<Integer> row: ListMatrix) {
            for (int element: row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void fillListMatrix (List<List<Integer>> ListMatrix, int rows, int cols){
        int number = 1;
        for (int row = 0; row < rows; row++) {
            ListMatrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                ListMatrix.get(row).add(number++);
            }
        }
    }
}
