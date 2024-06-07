package MultidimensionalArraysExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotation = scanner.nextLine();
        String rotationNumberString = rotation.split("[()]")[1];
        int rotationNumber = Integer.parseInt(rotationNumberString);
        int angelRotation = rotationNumber % 360; // винаги делим с остатък
                                                    // дадените градуси на 360

        String input = scanner.nextLine();
        List<String> wordlist = new ArrayList<>();
        int maxWord = Integer.MIN_VALUE;

        while (!input.equals("END")){
            wordlist.add(input);
            if (input.length() > maxWord){
                maxWord = input.length();
            }

            input = scanner.nextLine();
        }
        int rows = wordlist.size(); // редовете са колкото е големината на листа
        int cols = maxWord; // най-дългата дума сме намерили

        char[][] matrix = new char[rows][cols]; // матрица от char-ове
        for (int row = 0; row < rows; row++) {
            String currentWord = wordlist.get(row);
            for (int col = 0; col < cols; col++) {
                if (col < currentWord.length()){

                    char currentChar = currentWord.charAt(col);
                    matrix[row][col] = currentChar;
                } else {
                    matrix[row][col] = ' '; // ако думата е по-къса от колоните на матрицата,
                                            // запълваме следващите колони с празно място
                }

            }
        }
        switch (angelRotation){
            case 0: // ако ни дадат 360, това означава 0
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 90: // при 450, означава 90
                for (int col = 0; col < cols; col++) {
                    for (int row = rows - 1; row >= 0; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 180: // при 540, въртим раелно на 180
                for (int row = rows - 1; row >= 0; row--) {
                    for (int col = cols - 1; col >= 0; col--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 270: // по този начин, или въртим винаги няколко пъти по 90 градуса,
                    // но трябва да се изпробва. Това важи за всеки даден градус.
                    // Просто въртиш за пореден път на 90 градуса. Да се изпробва!!!
                for (int col = cols - 1; col >= 0; col--) {
                    for (int row = 0; row < rows; row++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
        }
    }
}
