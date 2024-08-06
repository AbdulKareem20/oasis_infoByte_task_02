import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       System.out.println("Welcome to Guess The Number Game ");
        Random rand = new Random();
        int Number = rand.nextInt(10) + 1;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Press 1 to Start Game ");
            System.out.println("Press 0 to exit the Game ");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter your Number ");
                    int guessedNumber = sc.nextInt();
                    if (guessedNumber == Number) {
                        System.out.println("You Guessed Right Congrats");
                    } else if (guessedNumber > Number) {
                        System.out.println("Too High");
                    } else if (guessedNumber < Number) {
                        System.out.println("Too Low");
                    } else {
                        System.out.println("Try it again");
                    }
                    break;
                case 0:
                    System.out.println("exiting ....");
                    System.exit(0);

            }


        }

    }
}