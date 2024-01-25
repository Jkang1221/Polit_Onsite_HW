package org.pilot.OOP.GuessGame;

import java.util.Random;
import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: Conner
 */
public class GuessRules {
    //
    public static void ruleOne() {
        Random random = new Random();
        int target = random.nextInt();
//        int target = 5;
        Scanner scanner = new Scanner(System.in);
        int pre = 0;
        while (true) {
            System.out.println("Please input your answer");
            String userAnswer = scanner.nextLine();
            int userAnswerNumber = Integer.parseInt(userAnswer);
            int dif = target - userAnswerNumber;
            if (checkFirstTime(dif)) {
                break;
            }
            if (pre != 0) {
                checkLastTime(pre, dif);
            }
            pre = dif;
        }
    }

    public static void ruleTwo() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input anything to start the game or input exit to finish");
            String userInput = scanner.nextLine();
            if ("exit".equalsIgnoreCase(userInput)) {
                break;
            }
            ruleOne();
        }

    }

    private static boolean checkFirstTime(int dif) {
        if (dif == 0) {
            System.out.println("winer");
            return true;
        } else if (dif > 0) {
            System.out.println("Too Low");
        } else {
            System.out.println("Too high");
        }
        return false;
    }

    private static void checkLastTime(int dif1, int dif2) {
        if (Math.abs(dif1) > Math.abs(dif2)) {
            System.out.println("Getting Warmer");
        } else {
            System.out.println("Getting Colder");
        }
    }

    public static void main(String[] args) {
        // ruleOne();
        ruleTwo();
    }
}
