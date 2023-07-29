package tutorial3;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    // Helper method to display the elements in a given integer array
    public static void printArray(int numbers[]){
        for (int i: numbers)
            System.out.printf(" %d ", i);
        System.out.println();
    }

    // Exercise 1
    public static int[] ex1(int array[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        array = new int[n];

        for (int i = 0; i < n; i++)
            array[i] = (int) Math.round(Math.random()* n);

        return array;
    }

    // Exercise 3 (Special case = 0 is Exercise 2)
    public static int getIndexMinFrom (int[] numbers, int from){
        int indexMin = from;

        for (int i = from; i < numbers.length; i++){
            // try <= to see the difference
            if (numbers[i] < numbers[indexMin]){
                indexMin = i;
            }
        }

        return indexMin;
    }

    // Exercise 4
    public static int[] exchangeMinFrom(int[] numbers, int from) {
        int index = getIndexMinFrom(numbers, from);

        int temp = numbers[from];
        numbers[from] = numbers[index];
        numbers[index] = temp;

        return numbers;
    }

    // Exercise 5
    public static int[] sortBySelection(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            exchangeMinFrom(numbers, i);
            System.out.print((i + 1) + "th iteration: ");
            printArray(numbers);
        }

        return numbers;
    }

    // Exercise 6
    public static void swapString(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = scanner.next();
        System.out.println("Enter the second string: ");
        String secondString = scanner.next();
        System.out.println("Strings before swap: 1st = " +
                firstString + " and 2nd = "+ secondString);

        firstString = firstString + secondString;
        secondString = firstString.substring(0,firstString.length() - secondString.length());
        firstString = firstString.substring(secondString.length());

        /*
        firstString = firstString + secondString;
        secondString = firstString.replace(secondString, "");
        firstString = firstString.replace(secondString, "");
         */

        System.out.println("Strings after swap: 1st = " +
                firstString + " and 2nd = "+ secondString);
    }

    // Exercise 7
    public static void uniqueNumbers(){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        System.out.println("Enter a sequence of integers:");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean invalid = false;
            String[] array = scanner.nextLine().split(" +");
            for (String s: array){
                if (!s.matches("-?\\+?\\d+")){
                    System.out.println("Please enter a valid list of integers!!!");
                    invalid = true;
                }
            }
            if (invalid) continue;
            for (int i = 0; i < array.length; i++){
                Integer num = Integer.parseInt(array[i]);
                Integer freq = map.get(num);
                map.put(num, (freq == null ? 1 : freq.intValue() + 1));
            }
            break;
        }
        for (Integer num: map.keySet()){
            if (map.get(num) == 1){
                System.out.print(num + " ");
            }
        }
    }

    // Exercise 8
    /*
    a) 0 or 11 or 101
    0 | 11 | 101
    b) only 0s
    0*
    c) all binary strings
    (0|1)*
    d) all binary strings except empty string
    (0|1)(0|1)*
    e) begins with 1, ends with 1
    1|(0|1)*|1
    f) ends with 00
    (0|1)*00
    g) contains at least three 1s
    (0|1)*1(0|1)*1(0|1)*1(0|1)*
    h) contains at least three consecutive 1s
    (0|1)*111(0|1)*
    i) contains the substring 110
    (0|1)*110(0|1)*
    j) doesn't contain the substring 110
    (0|10)*1*
    k) has at least 3 characters, and the third character is 0
    (0|1)(0|1)0(0|1)*
    l) starts and ends with the same character
    1(0|1)*1 | 0(0|1)*0
    m) starts with 0 and has odd length, or starts with 1 and has even length
    0((0|1)(0|1))* | 1(0|1)((0|1)(0|1))*
    n) length is at least 1 and at most 3
    (0|1)|(0|1)(0|1)|(0|1)(0|1)(0|1)
     */

    // Exercise 9
    public static void displayGame(char[][] board){
        for (char[] row: board){
            for (char cell: row){
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    public static char endGame(char[][] board){
        int BOARD_SIZE = 3;
        char [] players = {'X', 'O'};
        for (char player: players){
            for (int row = 0; row < BOARD_SIZE; row++){
                if (board[row][0] == player && board[row][1] == player && board[row][2] == player)
                    return player;
            }
        }
        for (char player: players){
            for (int col = 0; col < BOARD_SIZE; col++){
                if (board[col][0] == player && board[col][1] == player && board[col][2] == player)
                    return player;
            }
        }

        for (char player: players){
            if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
                return player;
            if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
                return player;
        }

        for(int row = 0; row < BOARD_SIZE; row++){
            for(int col = 0; col < BOARD_SIZE; col++){
                if (board[row][col] == '.'){
                    return '.';
                }
            }
        }
        return ' ';
    }

    // Exercise 10
    public static void playTicTacToe(){
        char [] players = {'X', 'O'};
        int currentPlayer = 0;
        char[][] gameBoard = {
                {'.','.','.'},
                {'.','.','.'},
                {'.','.','.'}
        };

        Scanner scanner = new Scanner(System.in);
        char finish = endGame(gameBoard);
        while (finish == '.'){
            //game not finish , display the game board
            displayGame(gameBoard);
            // advance to the next player
            currentPlayer = (currentPlayer + 1) % players.length;
            System.out.println("Current player: " + players[currentPlayer]);
            // get new piece from current Player
            System.out.println("Choose row (0-2): ");
            int row = scanner.nextInt();
            System.out.println("Choose column (0-2): ");
            int col = scanner.nextInt();
            gameBoard[row][col] = players[currentPlayer];
            //check game state
            finish = endGame(gameBoard);
        }
        if (finish == ' '){
            System.out.println("It's a tie");
        }
        else {
            System.out.println(players[currentPlayer] + " wins!");
        }
    }

    public static void main (String args[]){
        /*int array[] = ex1(array);
        printArray(array);*/

        /*array = exchangeMinFrom(array, 3);
        printArray(array);*/

        /*array = sortBySelection(array);
        printArray(array);
        */

        // swapString();
        // uniqueNumbers();
        playTicTacToe();
    }
}

