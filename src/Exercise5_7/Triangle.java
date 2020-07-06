package Exercise5_7;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        System.out.println("Triangles cannot be build by three random-sized sides!" +
                "Provide measurements of your triangle sides to check if they are valid.");

        System.out.print("\n Enter side a: ");
        Scanner in = new Scanner(System.in);
        if(!in.hasNextDouble()){    // check if user input is indeed a number.
            String word = in.next();
            System.err.println(word + " is not a number!");
            return;
        }
        double a = in.nextDouble();

        System.out.print("\n Now,  enter side b: ");
        if(!in.hasNextDouble()){    // check if user input is indeed a number.
            String word = in.next();
            System.err.println(word + " is not a number!");
            return;
        }
        double b = in.nextDouble();

        System.out.print("\n And finally, enter side c: ");
        if(!in.hasNextDouble()){    // check if user input is indeed a number.
            String word = in.next();
            System.err.println(word + " is not a number!");
            return;
        }
        double c = in.nextDouble();

        // check if sides are valid
        boolean testOne = a > b + c;
        boolean testTwo = b > a + c;
        boolean testThree = c > a + b;

        if (testOne || testTwo || testThree) {
            System.out.printf("\nYou cannot form a triangle with %.2f, %.2f and %.2f.\n", a, b, c);
        } else {
            System.out.printf("\nValid sides! You are able to form a triangle with" +
                    " %.2f, %.2f and %.2f.\n", a, b, c);
        }


    }
}
