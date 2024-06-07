package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> openBracketsStack = new ArrayDeque<>();
        boolean areBalanced = false;

        for (char bracket : input.toCharArray()) {
            if (bracket == '[' || bracket == '(' || bracket == '{'){
            openBracketsStack.push(bracket);

            } else if (bracket == ']' || bracket == ')' || bracket == '}') {
                if (openBracketsStack.isEmpty()){
                    areBalanced = false;
                    break;
                    // ВИНАГИ КОГАТО ПРЕМАХВАМЕ ЕЛЕМЕНТ,
                    // ПЪРВО ПРОВЕРЯВАМЕ СТЕК ИЛИ ОПАШКАТА ДАЛИ СА ПРАЗНИ!!!
                }
            char lastOpenBracket = openBracketsStack.pop(); // взимаме последната отворена и я трием,
                                                                    // защото тя не ни трябва повече
                if (lastOpenBracket == '(' && bracket == ')'){
                    //сравняваме отваряща и затваряща скоба
                    areBalanced = true;
                } else if (lastOpenBracket == '[' && bracket == ']') {
                    areBalanced = true;
                } else if (lastOpenBracket == '{' && bracket == '}'){
                    areBalanced = true;
                } else {
                    areBalanced = false;
                    break;
                }
            }
        }
        if (areBalanced){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
