package org.vashonsd;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import static java.util.concurrent.TimeUnit.SECONDS;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);

        int p1Guess = -1;
        int p2Guess = -1;
        System.out.println("This is Guess the random number its a two player game and whoever wins will get a prize!");
        SECONDS.sleep(2);

        while (p1Guess < 0){
            System.out.println("Player one guess a positive number:");
            try {
                p1Guess = scan.nextInt();
            } catch (Exception e) {
                System.out.println("bro buggin... try that again");
                p1Guess = -1;
                scan.nextLine();
            }
        }

        while (p2Guess < 0){
            System.out.println("Player two guess a positive number:");
            try {
                p2Guess = scan.nextInt();
            } catch (Exception e) {
                System.out.println("bro buggin... try that again");
                p1Guess = -1;
                scan.nextLine();
            }
        }


        SECONDS.sleep(1);
        System.out.println("READY");
        SECONDS.sleep(1);
        System.out.println("SET");
        SECONDS.sleep(1);

        int u = 0;
        int i = 0;
        while (i < 9) {
            System.out.println(u);
            Random rand = new Random();
            i = rand.nextInt(10);
            SECONDS.sleep(1);
            u ++;



        }

        double closer = Math.abs(u - p1Guess) < Math.abs(u - p2Guess) ? p1Guess : p2Guess;

        if(closer == p1Guess) {
            System.out.println("THE NUMBER IS " + u + "! PLAYER 1 WINS WITH THE GUESS OF " + (int)closer);
        }
        else {
            System.out.println("THE NUMBER IS " + u + "! PLAYER 2 WINS WITH THE GUESS OF " + (int)closer);
        }


    }

}
