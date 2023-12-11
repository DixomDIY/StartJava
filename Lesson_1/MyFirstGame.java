public class MyFirstGame {
    public static void main(String[] args) {
        int startInterval = 0;
        int endSegment = 100;
        int guessNum = 30;
        int playerNum = 15;
        if (guessNum <= startInterval || guessNum > endSegment) {
            System.out.println("Загаданное число не входит в полуинтервал (0, 100]");
        } else {
            while (playerNum != guessNum) {
                if (guessNum > playerNum) {
                    System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                    playerNum += 2;
                } else {
                    System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                    playerNum -= 3;
                }
            }
            System.out.println("Вы победили!");
        }
    }
}