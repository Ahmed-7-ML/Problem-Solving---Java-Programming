/*
Problem 32: Jagged Array Sum Create a jagged array (array of arrays with different lengths)
representing student marks in different subjects:
     Student 1: 3 subjects
     Student 2: 4 subjects
     Student 3: 2 subjects
     Calculate and display the average marks for each student using nested loops.

-------
What is a Jagged Array?
    - it is an "array of arrays,"
    - but the difference between it and a regular 2D Array (the uniform table) is that not all rows have to be of the same length.
        - A regular 2D Array: is like a table, with all rows, for example, having 3 columns.
        - A Jagged Array: the first row might have 3 slots, the second row 5 slots, and the third row just one slot.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.print("Enter Number of Students: ");
        final int STUDENTS = input.nextInt();

        int[][] studentMarks = new int[STUDENTS][]; // // We have (STUDENTS) rows, but we still don't know the length of each row

        // Define Number of Subjects for each Student.
        for(int i = 0; i < STUDENTS; i++){
            System.out.printf("Enter Number of Subject for %dth Student: ", (i + 1));
            int Subjects = input.nextInt();

            studentMarks[i] = new int[Subjects];
        }

        // Insert Student Marks and Calc. Sum and Average.
        for(int i = 0; i < STUDENTS; i++){
            sum = 0;
            for(int j = 0; j < studentMarks[i].length; j++){
                System.out.printf("Student %d , Enter Course %d Mark: ", (i + 1), (j + 1));
                studentMarks[i][j] = input.nextInt();

                sum += studentMarks[i][j];
            }
            double average = (double) sum / studentMarks[i].length;
            System.out.printf("--- Student %d Statistics ---%n", (i + 1));
            System.out.printf("     Student %d: Subject Marks: %s -> %d Subjects%n", (i + 1), Arrays.toString(studentMarks[i]), (studentMarks[i].length));
            System.out.printf("     Student %d 's Total Marks sum = %d%n", (i + 1), sum);
            System.out.println("    Average = " + average);
            System.out.println("----------------------------");
        }

    }
}