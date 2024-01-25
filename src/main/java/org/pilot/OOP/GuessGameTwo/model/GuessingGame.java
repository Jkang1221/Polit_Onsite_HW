package org.pilot.OOP.GuessGameTwo.model;

import java.util.Random;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: Conner
 */
public class GuessingGame {
    private int answer;
    private Random random;
    private boolean gameOver;
    private int differential;
    private int max;
    private int maxGuessesAllowed;
    private int numGuessesTaken;

    public GuessingGame() {
        this.max = 0;
        random = new Random();
    }

    public GuessingGame(int max) {
        this.max = max;
        random = new Random();
    }

    public void newGame(int maxGuessesAllowed) {
        this.maxGuessesAllowed = maxGuessesAllowed;
        this.answer = random.nextInt(max);
//        this.answer = 10;
        gameOver = false;
        differential = max;
        numGuessesTaken = 0;
    }

    public void Guess(int newGuess) {
        if (newGuess < 0 || newGuess > max) {
            System.out.println("Guess out of range, The guess must be between 0 and " + max);
        }
        else if (newGuess > answer) {
            System.out.println("Too high");
        } else if (newGuess == answer) {
            System.out.println("Correct");
            isGameOver(true);
            return;
        } else {
            System.out.println("Too low");
        }
        int curDifferential = Math.abs(answer - newGuess);
        if (numGuessesTaken != 0) {
            if (differential < curDifferential) {
                System.out.println("colder");
            } else {
                System.out.println("warmer");
            }
        }

        if (++numGuessesTaken >= maxGuessesAllowed) {
            this.isGameOver(true);
        }
    }

    public boolean isGameOver(boolean flag) {
        if (flag) {
            gameOver = true;
            return true;
        } else {
            gameOver = false;
            return false;
        }
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public int getDifferential() {
        return differential;
    }

    public void setDifferential(int differential) {
        this.differential = differential;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMaxGuessesAllowed() {
        return maxGuessesAllowed;
    }

    public void setMaxGuessesAllowed(int maxGuessesAllowed) {
        this.maxGuessesAllowed = maxGuessesAllowed;
    }

    public int getNumGuessesTaken() {
        return numGuessesTaken;
    }

    public void setNumGuessesTaken(int numGuessesTaken) {
        this.numGuessesTaken = numGuessesTaken;
    }
}
