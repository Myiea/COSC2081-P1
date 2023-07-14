package tutorial1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise7();
    }
    public static void exercise1(){
        System.out.println("***********");
        System.out.println("*    My   *");
        System.out.println("***********");
    }

    public static void exercise2() {
        int x = 10;
        int y = 20;
        System.out.println("x =" + x);
        System.out.println("y =" + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x =" + x);
        System.out.println("y =" + y);
    }

    public static void exercise3() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of seconds from midnight: ");
        int seconds = input.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        System.out.printf("%d:%2d:%2d", hours, minutes, remainingSeconds);

    }

    public static void exercise4() {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the x coordinate of point A: ");
        double ax = input.nextDouble();
        System.out.println("please enter the y coordinate of point A: ");
        double ay = input.nextDouble();
        System.out.println("please enter the x coordinate of point B: ");
        double bx = input.nextDouble();
        System.out.println("please enter the y coordinate of point B: ");
        double by = input.nextDouble();

        double distance = Math.sqrt(Math.pow(ax - bx, 2) + Math.pow(ay - by, 2));
        double perimeter = 4 * distance;
        double area = Math.pow(distance, 2);

        System.out.printf("Circumference: %.0f%n", perimeter);
        System.out.printf("Area: %.0f%n", area);
    }

    public static void exercise7() {
        double miles, kilometers;
        int lowerBound = 0, upperBound = 10, step = 1;

        System.out.printf("%-10s %s %10s %n", "Miles", "|", "Kilometers");
        System.out.println("-------------------------------------------------");
        for(miles = lowerBound; miles <= upperBound; miles += step) {
            kilometers = miles * 1.609;
            System.out.printf("%-10.1f %s %10.2f %n", miles, "|", kilometers);
        }
        System.out.println("-------------------------------------------------");
        System.out.printf("%-10s %s %10s %n", "Kilometers", "|", "Miles");
        System.out.println("-------------------------------------------------");
        for(kilometers = lowerBound; kilometers <= upperBound * 1.609; kilometers += step * 1.609) {
            miles = kilometers / 1.609;
            System.out.printf("%-10.1f %s %10.2f %n", kilometers, "|", miles);
        }
    }

    public static void exercise8() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int in = input.nextInt();



    }
}
