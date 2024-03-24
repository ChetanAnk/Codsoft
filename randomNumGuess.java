
import java.util.Random;
import java.util.Scanner;

class randomNumGuess {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner S = new Scanner(System.in);
        System.out.println("......................... Random Gussing Game....................");

        System.out.println("\n There will be three Chance if you go wrong. ");
        for (int i = 0; i < 3; i++) {
            boolean check = true;
            int Rnum = rand.nextInt(101);
            while (check) {
                System.out.println("\n Enter your guess number:");
                int num = S.nextInt();
                if (num == Rnum) {
                    System.out.println("\n You Guessed the CORRECT Number.");
                    check = true;
                } else {
                    System.out.println("\n You Guessed the WRONG Number.");
                    System.out.println("\n Correct Number was:" + Rnum);
                    check = false;
                }
            }
        }

        System.out.println("\n\t\t Game END.");
    }
}