/*
Problem 31: Linear Search Implement linear search on an int array. Return the index if found,-1
otherwise. Use a for-each loop with a break statement when found.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        final int SIZE = input.nextInt();

        int[] numbers = new int[SIZE];
        for(int i = 0; i < SIZE; i++){
            numbers[i] = (int) (Math.random() * 10);
        }

        for(int i = 0; i < SIZE; i++){
            System.out.print(numbers[i] + ( (i == numbers.length - 1)? "\n" : " ") );
        }

        System.out.print("Enter the value you search for: ");
        int value = input.nextInt();

        System.out.println((search(numbers, value) == -1 ? "Not Found" : "Index = " + search(numbers, value)));
    }

    static int search(int[] arr, int value){
        boolean found = false;
        byte counter = -1;
        for(int a: arr){
            counter ++;
            if(value == a){
                found = true;
                break;
            }
        }

        if(found)
            return counter;     // The Actual Index
        else
            return -1;

    }
}