package tutorial3;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        exercise1();
    }

    public static int[] generateRandomArray(int N) {
        Random rand = new Random();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = rand.nextInt(N + 1);
        }
        return arr;
    }

    public static void exercise1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the bound for the array: ");
        int N = scanner.nextInt();
        int[] arr = generateRandomArray(N);
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }

    public static int getIndexMin(int[] numbers) {
        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        return minIndex;
    }

    public static void exercise2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n]; // ask the user to input the size of the array then stored it
        System.out.println("Enter the elements of the array:"); // scanning through the array position from 0 -> n position
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        int minIndex = getIndexMin(arr);
        System.out.println("The index of the minimum element is: " + minIndex);
    }

    public  static int getIndexMinFrom(int[] numbers, int from) {
        int minIndex = from;
        for (int i = from + 1; i < numbers.length; i++)
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        return minIndex;
    }

    public static void exercise3() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n]; // ask the user to input the size of the array then stored it
        System.out.println("Enter the index to start from: ");
        int i = in.nextInt();
        System.out.println("Enter the elements of the array:");
        // scanning through the array position from 0 -> n position
        for (int j = i ;j < n; j++) arr[i] = in.nextInt();

        int minIndex = getIndexMinFrom(arr, i);
        System.out.println("The index of the minimum element from " + i + " is " + minIndex);
    }

    public static  int[] exchangeMinFrom(int[] numbers, int from) {
        int minIndex = getIndexMinFrom(numbers, from);
        int temp = numbers[from];
        numbers[from] = numbers[minIndex];
        numbers[minIndex] = temp;
        return numbers;
    }

    public static void exercise4() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int[] numbers = new int[n]; // ask the user to input the size of the array then stored it
        System.out.println("Enter the elements of the array:");
        // scanning through the array position from 0 -> n position
        for (int i = 0 ;i < n; i++) numbers[i] = input.nextInt();

        int from = 0; // or any other index you want to start from
        numbers = exchangeMinFrom(numbers, from);
        System.out.print("Resulting array: ");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

}