import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {

    private Scanner scanner = new Scanner(System.in);
    private int startInterval;
    private int endSegment;
    private Player player1;
    private Player player2;

    public GuessNumber(int startInterval, int endSegment, Player player1, Player player2) {
        this.startInterval = startInterval;
        this.endSegment = endSegment;
        this.player1 = player1;
        this.player2 = player2;
    }
 
    public void launchingGame() {
        int guessNum =  startInterval + (int) (Math.random() * endSegment);
        Player player = player2; 
        do {
            if (player == player1) {
                player = player2;
            } else {
                player = player1;
            }
            System.out.print(player.getName() + " введи число: ");
            player.setNum(scanner.nextInt());
        } while (!numberСheck(guessNum, player));
    }

    private boolean numberСheck(int guessNum, Player player) {
        if (player.getNum() <= startInterval || player.getNum() > endSegment) {
            System.out.println("Загаданное число не входит в полуинтервал ("
                    + startInterval + ", " + endSegment + "]");
            return false;
        }
        if (player.getNum() != guessNum) {
            if (guessNum > player.getNum()) {
                System.out.println("Число " + player.getNum() + " меньше загаданного");
            } else {
                System.out.println("Число " + player.getNum() + " больше загаданного");
            }
            return false;
        }
        System.out.println("Игрок " + player.getName() + " выиграл. Число " + guessNum);
        return true;
    }
}