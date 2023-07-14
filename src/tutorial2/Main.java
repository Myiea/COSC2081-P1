package tutorial2;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        exercise4();
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

    public static void exercise4() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the total amount need to be divided: ");
        double s = in.nextDouble();

        double amountPerPerson = s/3;
        double minPayment = Math.floor(amountPerPerson * 100) / 100.0;
        double maxPayment = Math.ceil(amountPerPerson * 100) / 100.0;
        double yourPayment = minPayment;
        double friend1Payment = minPayment;
        double friend2Payment = minPayment;

        if (s % 3.0 != 0) {
            double difference = maxPayment * 3.0 - s;
            if (difference >= 0.01) {
                if (maxPayment - yourPayment > 0.01) {
                    yourPayment = maxPayment - 0.02;
                    friend1Payment = friend2Payment = maxPayment + 0.01;
                }
                else if (maxPayment - friend1Payment > 0.01) {
                    friend1Payment = maxPayment - 0.01;
                    yourPayment = friend2Payment = maxPayment - difference;
                }
                else {
                    friend2Payment = maxPayment - 0.01;
                    yourPayment = friend1Payment = maxPayment - difference;
                }
            }
        }
        System.out.printf("You pay %.2f, friend 1 pays %.2f, and friend 2 pays %.2f\n", yourPayment, friend1Payment, friend2Payment);
    }
}