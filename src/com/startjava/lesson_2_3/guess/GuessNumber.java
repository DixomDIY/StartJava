package com.startjava.lesson_2_3.guess;

import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int endSegment = 100;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        int guessNum = 1 + (int) (Math.random() * endSegment);
        Player currentPlayer = player1;
        currentPlayer.setNum(-1);

        while(guessNum != currentPlayer.getNum()) {
            currentPlayer.setNum(enterNum(currentPlayer));
            if(!isGuessed(guessNum, currentPlayer)) {
                currentPlayer = changePlayer(currentPlayer);
            }
        }
    }

    private int enterNum(Player currentPlayer) {
        System.out.print(currentPlayer.getName() + " введи число: ");
        return scanner.nextInt();
    }

    private boolean isGuessed(int guessNum, Player currentPlayer) {
        int playerNum = currentPlayer.getNum();
        if (playerNum <= 0 || playerNum > endSegment) {
            System.out.println("Загаданное число не входит в полуинтервал (0," + endSegment + "]");
            return false;
        }
        if (playerNum != guessNum) {
            if (guessNum > playerNum) {
                System.out.println("Число " + playerNum + " меньше загаданного");
            } else {
                System.out.println("Число " + playerNum + " больше загаданного");
            }
            return false;
        }
        System.out.println("Игрок " + currentPlayer.getName() + " выиграл. Число " + guessNum);
        return true;
    }

    private Player changePlayer(Player currentPlayer) {
        return currentPlayer == player1 ? player2 : player1;
    }
}