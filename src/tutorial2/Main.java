package tutorial2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        exercise3();
    }
    public static void exercise1() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the length of the square side: ");
        int input = in.nextInt();
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void exercise2() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the length of the square side: ");
        int input = in.nextInt();
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if (i == 0 || i == input - 1 || j == 0 || j == input - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static double squareRoot(double n) {
        double min = 1, max = n;
        double avg = (min + max) / 2;

        while (Math.abs(avg * avg - n) > 0.00001) {
            if (avg * avg > n) {
                max = avg;
                System.out.println("the avg is too big, make it smaller");
                System.out.println(max);
            } else {
                min = avg;
                System.out.println("the avg is too small, make it bigger");
                System.out.println(min);
            }
            avg = (min + max) / 2;
        }

        return avg;
    }

    public static void exercise3() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        double n = in.nextDouble();
        System.out.println("The square root of " + n + " is " + squareRoot(n));
    }
}