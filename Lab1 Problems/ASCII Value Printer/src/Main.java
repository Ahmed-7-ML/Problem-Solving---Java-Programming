/*
Problem 5: ASCII Value Printer Write a program that takes a character input (using command line
arguments) and prints its ASCII value. Then print the next 5 consecutive characters and their ASCII
values.
 */
public class Main {
    public static void main(String[] args){
        if (args.length == 0) {
            System.out.println("Please provide a character!");
            return;
        }

        // 1. Convert the first character of the String to a char type
        char symbol = args[0].charAt(0);

        // 2. Print the base character and its value in ASCII
        System.out.println("Symbol: " + symbol + " | ASCII: " + (int)symbol);
        System.out.println("---------------------------");

        // 3. Print the following 5 letters
        for(int i =1; i<=5; i++){
            System.out.println("Next Character: " + (char)(symbol + i) + " | ASCII: " + (int)(symbol + i));
        }
    }
}