package Exercise5_6;
import java.util.*;


public class Quadratic {

    // print just n hyphens
    public static void hyphenGen(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("_");
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Considering quadratic equation ax\u00B2 + bx + c = 0, by providing" +
                " a, b and c, you'll get the solutions!");

        System.out.print("\n Enter a: ");
        if(!in.hasNextDouble()){    // check if user input is indeed a number.
            String word = in.next();
            System.err.println(word + " is not a number!");
            return;
        }
        double a = in.nextDouble();

        System.out.print("\n Now,  enter b: ");
        if(!in.hasNextDouble()){    // check if user input is indeed a number.
            String word = in.next();
            System.err.println(word + " is not a number!");
            return;
        }
        double b = in.nextDouble();

        System.out.print("\n And finally, enter c: ");
        if(!in.hasNextDouble()){    // check if user input is indeed a number.
            String word = in.next();
            System.err.println(word + " is not a number!");
            return;
        }
        double c = in.nextDouble();


        double delta = Math.pow(b,2) - 4* a * c; // calculating discriminant

        if (a == 0) {
            hyphenGen(37);
            System.out.println("\nIf 'a' is set to zero, equation is not quadratic anymore!");
            System.out.printf("However, the root is simply %.2f.\n", -c/b);
            hyphenGen(37);

        } else if (delta < 0) {
            hyphenGen(37);
            System.out.println("Equation does not have real solution!");
            hyphenGen(37);

        } else if (delta == 0){
            double x = -b  / (2 * a);
            hyphenGen(40);
            System.out.println("\nThere's just one solution and it's: " + x);
            hyphenGen(40);

        } else {
            double x1 = (-b + delta)  / (2 * a);
            double x2 = (-b - delta)  / (2 * a);
            hyphenGen(25);
            System.out.printf("\nThere are two solutions:\nx\u2081 = %.2f\nx\u2082 = %.2f\n", x1, x2);
            hyphenGen(25);
        }
    }
}
