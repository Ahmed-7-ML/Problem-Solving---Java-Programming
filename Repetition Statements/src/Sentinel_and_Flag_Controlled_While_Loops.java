/*
    // Counter Controlled While Loop
    // Sentinel Controlled While Loop
    // Flag Controlled While Loop  --> Boolean Value (true , false)
*/

import java.util.Scanner;

public class Sentinel_and_Flag_Controlled_While_Loops {

    public static void main(String[] args){
        // Counter Controlled While Loop
        int i = 0;
        while(i <= 5){
            System.out.print("Hi #" + i);
            i++;
        }

        Scanner input = new Scanner(System.in);

        char letter = 'a';
        int c = 0;

        // Sentinel Controlled While Loop
        while(letter != 'q'){   // Sentinel Variable
            letter = input.next().charAt(0);
            c++;
        }
        System.out.println("Counter = " + c);

        // Flag Controlled While Loop  --> Boolean Value (true , false)
        boolean flag = true;
        while(flag){
            letter = input.next().charAt(0);
            c++;
            if(letter == 'q') flag = false;
        }

        // Exercise: Accept unknown number of grade of courses and find the average.
        // Sentinel While Loop
        float grade = 0.0f;
        int count = 0;
        int sum = 0;
        while(grade != -1){
            System.out.print("Enter your Grade #" + (count+1) + ": ");
            grade = input.nextFloat();
            if(grade != -1) {
                sum += grade;
                count++;
            }
        }

        System.out.print("\nAverage = " + sum/count);

    }
}