import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Search a Number in 2D Array
        int[][] matrix ={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.print("Enter a Number to search for: ");
        int n = input.nextByte();
        search:
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[row].length; col++){
                if(matrix[row][col] == n) {
                    System.out.println("Found " + n + " at row = " + row);
                    break search;       // If you found it -> Go out from the Outer Loop.
                }
            }
        }

        // Star Patterns in Triangle
        Star:
        for(int row = 1; row <= 5; row++){
            for(int col = 1; col <= 10; col++){
                if(col > row){
                    System.out.println();
                    continue Star;
                }
                System.out.print("* ");
            }
        }

    }
}