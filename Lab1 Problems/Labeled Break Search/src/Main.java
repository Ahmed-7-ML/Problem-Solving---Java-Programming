/*
Problem 34: Labeled Break Search
- Create a 5x5 matrix (2D array) with numbers 1-25.
- Search for a specific number using nested loops.
    - If found, use a labeled break to exit both loops immediately and print the position (row, col).
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                // (Math.random() * Max) + Min
                matrix[i][j] = (int) (Math.random() * 25 + 1);
            }
        }

        System.out.print("Enter the value to search for: ");
        int value = input.nextInt();
        boolean found = false;

        search:
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == value){
                    System.out.printf("Found at Position: Row = %d , Column = %d%n", (i + 1), (j + 1) );
                    found = true;
                    break search;
                }
            }
        }

        if(!found)
            System.out.println("Value Not Found.");

        System.out.println("------ Matrix ------");
        display2DArray(matrix);
    }

    static void display2DArray(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}