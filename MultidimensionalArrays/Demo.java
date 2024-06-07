package MultidimensionalArrays;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] table = new int [3][2];

        System.out.println(table.length); // принтира само редовете
        System.out.println(table[0].length); // принтира реда и колоните

        System.out.println(table[1]); // дава грешка, Не можем да принтираме

        for (int i = 0; i < table.length; i++) { // обхождане на масив
            for (int j = 0; j < table[0].length; j++) {
                table [i][j] = i + j;
            }
        }

        for (int i = 0; i < table.length; i++) {  // принтиране на масив
            for (int j = 0; j < table[0].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
