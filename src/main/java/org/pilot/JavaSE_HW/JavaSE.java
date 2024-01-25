package org.pilot.JavaSE_HW;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Write code in Java to solve following problems. Please write your
 * own answers. You are highly encouraged to present more than one way to answer
 * the questions. Please follow best practice when you write the code so that it would
 * be easily readable, maintainable, and efficient. Clearly state your assumptions if you
 * have any. You may discuss with others on the questions, but please write your own
 * code.
 * 1. Develop a mathematical org.pilot.JavaSE_HW.Calculator
 * a. (2 Variables -- X=5,Y=7) -->> Add, Sub, Mul, Div
 * b. (3 Variables -- X=5,Y=6,Z=7) -->> Add, Sub, Mul, Div
 * The input contains two array, an array of variables and an array of operators:
 * input1 = [5,6,14,7], input2 = [“Add”, “Sub”, “Div”]
 * The precedence of operator needs to be taken care of, for example, the above example should
 * be 5 + 6 - (14 / 7) = 9 instead of (5 + 6 - 14) / 7 = 0 (if the end result is not integer, output the
 * floor of the decimal result)
 * Assumption:
 * 1. No parentheses
 * 2. Input will always be valid
 * 3. input2.length = input1.length - 1
 */
public class JavaSE {
    public static void main(String[] args) {
//        int[] numbers = new int[]{5, 6, 14, 7};
//        String[] operators = {"Add", "Sub", "Div"};
//        org.pilot.JavaSE_HW.Calculator calculator = new org.pilot.JavaSE_HW.Calculator(numbers, operators);
//        System.out.println(calculator.getResult());
        int[] numbers2 = new int[]{5, 6, 14, 7, 4};
        String[] operators2 = {"Add", "Sub", "Div", "Mul"};
        Calculator calculator2 = new Calculator(numbers2, operators2);
        System.out.println(calculator2.getResult());
    }
}

class Calculator {
    int[] numbers;
    String[] operators;

    public Calculator(int[] numbers, String[] operators) {
        this.numbers = numbers;
        this.operators = operators;
    }

    public int getResult() {
        if (numbers.length == 0) {
            return 0;
        }
        Deque<Integer> num = new ArrayDeque<>();
        Deque<String> op = new ArrayDeque<>();
        num.addLast(numbers[0]);
        for (int i = 0; i < operators.length; i++) {
            if (operators[i].equals("Mul")) {
                int curNum = mul(num.pollLast(), numbers[i + 1]);
                num.offerLast(curNum);
            } else if (operators[i].equals("Div")) {
                int curNum = div(num.pollLast(), numbers[i + 1]);
                num.offerLast(curNum);
            } else {
                num.offerLast(numbers[i + 1]);
                op.offerLast(operators[i]);
            }
        }

        while (!op.isEmpty()) {
            String curOp = op.poll();
            if (curOp.equals("Add")) {
                int curNum = add(num.pollFirst(), num.pollFirst());
                num.offerFirst(curNum);
            } else {
                int curNum = sub(num.pollFirst(), num.pollFirst());
                num.offerFirst(curNum);
            }
        }
        return num.pollFirst();
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int sub(int a, int b) {
        return a - b;
    }

    private int mul(int a, int b) {
        return a * b;
    }

    private int div(int a, int b) {
        return a / b;
    }
}
