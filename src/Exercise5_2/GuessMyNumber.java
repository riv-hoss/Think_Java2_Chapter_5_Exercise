package Exercise5_2;
import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

    // print just n hyphens
    public static void hyphenGen(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("_");
        }
    }


    public static void calculateLog() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");


        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number.");
            return; // terminates the program - without it, program goes further to next block.
        }
        double x = in.nextDouble();
        if (x < 0) {
            System.out.println("Logarithm is not defined.");
        } else {
            double result = Math.log(x);
            System.out.printf("Natural logarithm of %.2f is %.4f.", x, result);
        }
    }

    // =================================Guess My Number========================================

    public static void guessNum(){
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        int myNum = rand.nextInt(100) + 1;
        System.out.println("\nI'm thinking of a number between " +
                "1 and 100 (including both). Can you guess what it is?");
        System.out.print("\nEnter a number: ");

        // ==== guess first time
        if (!in.hasNextInt()) {
            String word = in.next();
            System.err.println(word + " is not a number.");
            return;
        }
        int x = in.nextInt();
        if (x < 1 || x > 100) {
            System.out.println("Number is not between 1 and 100!");
        } else {

            if (x == myNum) {
                System.out.printf("Well done! You guessed %d correctly!", x);
                return;

            } else if (x > myNum + 30){
                System.out.println("\nToo high! Your guess is: " + x);
                System.out.println("The number I was thinking of is: " + myNum);
                System.out.printf("You were off by: %d\n", Math.abs(x - myNum));
                hyphenGen(50);
            } else if (x + 30 < myNum) {
                System.out.println("\nToo low! Your guess is: " + x);
                System.out.println("The number I was thinking of is: " + myNum);
                System.out.printf("You were off by: %d\n", Math.abs(x - myNum));
                hyphenGen(50);
            }else {
                System.out.println("\nThe number I was thinking of is: " + myNum);
                System.out.printf("You were off by: %d\n", Math.abs(x - myNum));
                hyphenGen(50);
            }

        }

        //========= guess second/third time
        for(int j = 0; j<2; j++) {
            int mySecondNum = rand.nextInt(100) + 1;
            System.out.print("\nNo worries! Try another number: ");
            if (!in.hasNextInt()) {
                String word = in.next();
                System.err.println(word + " is not a number.");
                return;
            }
            x = in.nextInt();
            if (x < 1 || x > 100) {
                System.out.println("Number is not between 1 and 100!");
            } else {

                if (x == mySecondNum) {
                    System.out.printf("Well done! You guessed %d correctly!\n", x);
                    return;

                } else if (x > mySecondNum + 30){
                    System.out.println("\nToo high! Your guess is: " + x);
                    System.out.println("The number I was thinking of is: " + mySecondNum);
                    System.out.printf("You were off by: %d\n", Math.abs(x - mySecondNum));
                    hyphenGen(50);
                } else if (x + 30 < mySecondNum) {
                    System.out.println("\nToo low! Your guess is: " + x);
                    System.out.println("The number I was thinking of is: " + mySecondNum);
                    System.out.printf("You were off by: %d\n", Math.abs(x - mySecondNum));
                    hyphenGen(50);
                }else {
                    System.out.println("\nThe number I was thinking of is: " + mySecondNum);
                    System.out.printf("You were off by: %d\n", Math.abs(x - mySecondNum));
                    hyphenGen(50);
                }

            }
        }

        // === end of second/third time guess

    }

    public static void main(String[] args) {
        guessNum();



    }
}

