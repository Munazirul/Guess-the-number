import java.util.Random;
import java.util.Scanner;

public class firstGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the game!");
        System.out.println("To get started, enter your name:");
        Scanner sc = new Scanner(System.in);
        String name =sc.next();
        System.out.println("Hello "+ name+"!");
        System.out.println("Are you ready?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int ready = sc.nextInt();
        while (ready!=1){
            System.out.println("Are you ready?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            ready = sc.nextInt();
        }
        Random random= new Random();
        int x = random.nextInt(20) + 1;
        System.out.println("Guess the Number: ");
        int y = sc.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while (!shouldFinish){
            timesTried++;
            if (timesTried<5){
                if (y==x){
                    hasWon =true;
                    shouldFinish=true;
                }
                else if (y>x){
                    System.out.println("Guess lower");
                    y = sc.nextInt();
                }else {
                    System.out.println("Guess higher");
                    y = sc.nextInt();
                }

            }else {
                shouldFinish = true;
            }
        }
        if (hasWon){
            System.out.println("Congratulations! you have guessed in your "+ timesTried + " guess");
        }
        else {
            System.out.println("Game over!");
            System.out.println("The number was "+x);
        }
    }
}
