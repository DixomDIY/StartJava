import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private int startInterval = 0;
    private int endSegment = 100;
    public void play() {
        int guessNum = startInterval + (int) (Math.random() * endSegment);
        Player currentPlayer = player1;
        currentPlayer.setNum(-1);

        while(guessNum != currentPlayer.getNum()) {
            currentPlayer.setNum(enterNum(currentPlayer));
            if(!isGuessed(guessNum, currentPlayer)){
                currentPlayer = currentPlayer == player1 ? player2 : player1;
            }
        }
    }

    private Scanner scanner = new Scanner(System.in);
    private int enterNum(Player currentPlayer) {
        System.out.print(currentPlayer.getName() + " введи число: ");
        return scanner.nextInt();
    }

    private boolean isGuessed(int guessNum, Player currentPlayer) {
        if (currentPlayer.getNum() <= startInterval || currentPlayer.getNum() > endSegment) {
            System.out.println("Загаданное число не входит в полуинтервал ("
                    + startInterval + ", " + endSegment + "]");
            return false;
        }
        if (currentPlayer.getNum() != guessNum) {
            if (guessNum > currentPlayer.getNum()) {
                System.out.println("Число " + currentPlayer.getNum() + " меньше загаданного");
            } else {
                System.out.println("Число " + currentPlayer.getNum() + " больше загаданного");
            }
            return false;
        }
        System.out.println("Игрок " + currentPlayer.getName() + " выиграл. Число " + guessNum);
        return true;
    }
}