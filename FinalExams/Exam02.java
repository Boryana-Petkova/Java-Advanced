package FinalExams;

import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];
        int caught = 0;
        int row = -1;
        int col = -1;

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            matrix[i] = line.toCharArray();
            if (line.contains("S")) {
                row = i;
                col = line.indexOf("S");
            }
        }

        while (true) {
            String command = scanner.nextLine();
            matrix[row][col] = '-';

            switch (command) {
                case "up":
                    row = (row - 1 + n) % n;
                    break;
                case "down":
                    row = (row + 1) % n;
                    break;
                case "left":
                    col = (col - 1 + n) % n;
                    break;
                case "right":
                    col = (col + 1) % n;
                    break;
            }

            if (matrix[row][col] == 'W') {
                System.out.println("You fell into a whirlpool! The ship sank and you lost the fish you caught. Last coordinates of the ship: [" + row + "," + col + "]");
                return;
            } else if (Character.isDigit(matrix[row][col])) {
                int quantity = Character.getNumericValue(matrix[row][col]);
                caught += quantity;
                matrix[row][col] = '-';
            }

            if (command.equals("collect the nets")) {
                if (caught >= 20) {
                    System.out.println("Success! You managed to reach the quota!");
                } else {
                    int lack = 20 - caught;
                    System.out.println("You didn't catch enough fish and didn't reach the quota! You need " + lack + " tons of fish more.");
                }
                System.out.println("Amount of fish caught: " + caught + " tons.");
                break;
            }
        }

        matrix[row][col] = 'S';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
