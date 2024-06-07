package StacksLab;

import java.util.*;

public class SimpleCalculator02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        String[] expressionParts = expression.split(" "); // масив 2 + 5 + 10 - 2 - 1
        //List<String> partsList = Arrays.asList(expressionParts); // правим лист...
       // Collections.reverse(partsList); // за да ривърснем, и да подредим елементите наобратно,
                                        // заради бъдещия стек, иначе ще почне първо да изважда 1 и 2,
                                        // защото те ще са най-отгоре

        ArrayDeque<String> stack = new ArrayDeque<>();
        //stack.addAll(partsList); // може и така да ривърснем елементите
        // OR
        Collections.addAll(stack, expressionParts); // ръвирсвъме от масив в стек
                                                    // и си спестяваме всичко останало!!!!!!

       /* for (String part : partsList) { // iter and enter to do foreach
           stack.push(part);
        }*/
        while (stack.size() > 1){
            int first = Integer.parseInt(stack.pop()); // OR
            //int first = Integer.valueOf(stack.pop());
            String operator = stack.pop();
            int second = Integer.parseInt(stack.pop());
            //int second = Integer.valueOf(stack.pop());

            int result; // няма нужда да даваме нулева стойност в случая
            switch (operator){
                case "+": result = first + second; // OR
                //case "+": stack.push(String.valueOf(first + second));
                break;
                case "-": result = first - second;
                //case "-": stack.push(String.valueOf(first - second));
                break;
                default:
                    System.out.println("Unknown operator" + operator);
                    return; // прекратяваме всичко, ако имаме друг оператор
            }
            stack.push(result + ""); // result е int, затова го правим на стринг,
                                        // за да го прибавим в стека Стринг
        }
        System.out.println(stack.peek());
    }
}
