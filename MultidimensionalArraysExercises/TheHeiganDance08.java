package MultidimensionalArraysExercises;

import java.util.Scanner;

public class TheHeiganDance08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[15][15];
        fillMatrix(matrix);

        int player = 18500;
        double heigan = 3000000;

        double damage = Double.parseDouble(scanner.nextLine());
        int countCloud = 1;

        String currentSpell = "";
        int positionRow = 7;
        int positionCol = 7;

        while (isZero(player, heigan)){
            fillMatrix(matrix);
            matrix[positionRow][positionCol] = 7;
            if (countCloud % 2 == 0){
                player -= 3500;
                countCloud = 1;
                heigan -= damage;
            } else {
                heigan -= damage;
            }
            if (heigan <= 0 || player <= 0){
                break;
            }
            String[] tokens = scanner.nextLine().split("\\s+");
            String spell = tokens[0];

            int row = Integer.parseInt(tokens[1]);
            int col = Integer.parseInt(tokens[2]);

            boolean isCloud = false;
            boolean isEruption = false;

            switch (spell) {
                case "Cloud":
                    for (int i = row - 1; i < row + 2; i++) {
                        if (isCloud){
                            break;
                        }
                        for (int j = col - 1; j < col + 2; j++) {
                            if (isValid(i, j)) {
                                int current = matrix[i][j];
                                if (current == 7) {
                                    positionRow = i;
                                    positionCol = j;
                                    isCloud = true;
                                    break;
                                }
                            }
                        }
                    }
                    for (int i = row - 1; i < row + 2; i++) {
                        for (int j = col - 1; j < col + 2; j++) {
                            if (isValid(i, j)) {
                                matrix[i][j] = 0;
                            }
                        }
                    }
                    break;

                case "Eruption":
                    for (int i = row - 1; i < row + 2; i++) {
                        if (isEruption){
                            break;
                        }
                        for (int j = col - 1; j < col + 2; j++) {
                            if (isValid(i, j)) {
                                int current = matrix[i][j];
                                if (current == 7) {
                                    positionRow = i;
                                    positionCol = j;
                                    isEruption = true;
                                    break;
                                }
                            }
                        }
                    }
                    for (int i = row - 1; i < row + 2; i++) {
                        for (int j = col - 1; j < col + 2; j++) {
                            if (isValid(i, j)) {
                                matrix[i][j] = 0;
                            }
                        }
                    }
                    break;
            }

            boolean moved = false;

            if (isEruption || isCloud) {
                matrix[positionRow][positionCol] = 7;

                if (isMove(positionRow - 1, positionCol, matrix)) {
                    matrix[positionRow - 1][positionCol] = 7;
                    positionRow = positionRow - 1;
                    matrix[positionRow][positionCol] = 0;
                    moved = true;

                } else if (isMove(positionRow, positionCol + 1, matrix)) {
                    matrix[positionRow][positionCol + 1] = 7;
                    positionCol = positionCol + 1;
                    matrix[positionRow][positionCol] = 0;
                    moved = true;

                } else if (isMove(positionRow + 1, positionCol, matrix)) {
                    matrix[positionRow + 1][positionCol] = 7;
                    positionRow = positionRow + 1;
                    matrix[positionRow][positionCol] = 0;
                    moved = true;

                } else if (isMove(positionRow, positionCol - 1, matrix)) {
                    matrix[positionRow][positionCol - 1] = 7;
                    positionCol = positionCol - 1;
                    matrix[positionRow][positionCol] = 0;
                    moved = true;
                }
            }

            if (!moved && isCloud){
                player -= 3500;
                countCloud++;
                currentSpell = "Plague Cloud";
                if (player <= 0){
                    break;
                }
            } else if (!moved && isEruption) {
                player -= 6000;
                currentSpell = "Eruption";
                if (player <= 0){
                    break;
                }
            }
        }

        if (heigan <= 0){
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.printf("Heigan: %.2f%n", heigan);
        }

        if (player <= 0){
            System.out.println("Player: Killed by " + currentSpell);
        } else {
            System.out.println("Player: " + player);
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 7){
                    positionRow = i;
                    positionCol = j;
                }
            }
        }
        System.out.printf("Final position: %d, %d", positionRow, positionCol);

    }
    private static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                matrix[i][j] = 1;
            }
        }
    }
    private static boolean isValid(int row, int col){
        return row >= 0 && row < 15 && col >= 0 && col < 15;
    }
    private static boolean isMove(int row, int col, int[][] matrix){
        return row >= 0 && row < 15 && col >= 0 && col < 15 && matrix[row][col] != 0;
    }
    private static boolean isZero(int life, double hero){
        return life > 0 && hero > 0;
    }
}
