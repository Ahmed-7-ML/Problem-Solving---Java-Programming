import java.util.Scanner;

/*
Problem 15: The Reverse Printer

    Ask the user to enter 5 grades.

    Storage them in a matrix.

    Print the grades exactly as they appear (from beginning to end).

    Print the grades in reverse order (from fifth to first).
 */
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your 5 Marks: ");

        // Initialize Array with 5 Integers
        int[] marks = new int[5];

        // Accept 5 Marks from the user
        for(int i = 0; i < marks.length; i++){
            marks[i] = input.nextInt();
        }

        // Display Original Order
        System.out.print("Original Order: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + (i < marks.length - 1 ? ", " : ""));
        }

        System.out.println();

        // Display Reverse Order
        System.out.print("Reverse Order: ");
        for(int i = marks.length - 1; i >= 0; i--){
            System.out.print(marks[i] + (i > 0? ", " : ""));
        }

    }
}