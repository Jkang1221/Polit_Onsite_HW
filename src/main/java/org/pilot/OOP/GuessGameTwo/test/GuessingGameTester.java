package org.pilot.OOP.GuessGameTwo.test;


import org.pilot.OOP.GuessGameTwo.model.GuessingGame;

import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: Conner
 */
public class GuessingGameTester {
    public static void main(String[] args) {
//        GuessingGame guessingGame = new GuessingGame();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the maximum number to start the game or enter exit to finish the game");
            String maxOrExit = scanner.nextLine();
            if (maxOrExit.equals("exit")) {
                break;
            }
            int maxNum = Integer.parseInt(maxOrExit);
            GuessingGame guessingGame = new GuessingGame(maxNum);
            System.out.println("Enter the maximum number to guess allowed");
            int maxGuessNumber = Integer.parseInt(scanner.nextLine());
            guessingGame.newGame(maxGuessNumber);
            while (true) {
                System.out.println("Enter the number of guess allowed");
                int guess = Integer.parseInt(scanner.nextLine());
                guessingGame.Guess(guess);
                if (guessingGame.isGameOver()){
                    System.out.println("The answer is " + guessingGame.getAnswer());
                    break;
                }
            }
        }
    }
}
