/*
Problem 16: Days in Month Calculator
    Accept month number (1-12) and year.
    Use switch-case to determine the number of days in that month.
    **** For February, check if it's a leap year to return 28 or 29 days.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("--- Days in Month Calculator ---");

        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        System.out.print("Enter Month(1-12): ");
        byte month = input.nextByte();

        System.out.print("Enter Year: ");
        short year = input.nextShort();

        int days = switch(month){
            case 1, 3, 5, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                if( ( (year % 4 == 0) && (year % 100 != 0) ) || (year % 400 == 0))
                    yield 29;
                else
                    yield 28;
            }
            default -> 0;
        };

        if( month < 1 || month > 12){
            System.out.println("Invalid Month Number");
        }
        else{
            // To Prevent `IndexOutOfBoundsException` -> use [index - 1]
            System.out.printf("Month %s in year %d has %d days.%n", months[month - 1], year, days);
        }
    }
}