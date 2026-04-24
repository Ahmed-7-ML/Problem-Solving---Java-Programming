/*
Problem 13: Leap Year Checker
    Accept a year as input.
    Determine if it's a leap year using these rules:
     Divisible by 4, but not by 100, unless also divisible by 400
     Use nested if statements and logical operators (&&, ||).

    ** A leap year occurs every four years.
        It has 366 days instead of 365, with an extra day added on February 29th.
        This extra day is known as "intercalary day."
        In Arabic, "leap year" translates to "سنة كَبيسة" (leap year).

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Year: ");
        int year = input.nextInt();

//        if( ( ( (year % 100 != 0) && (year % 4 == 0) ) || (year % 400 ==0) ){
//            System.out.println(year + " is a Leap Year");
//        }
//        else{
//            System.out.println(year + " is NOT a Leap Year");
//        }

        // ---------> Nested-IF
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(year + " is a Leap Year");
                }
                else{
                    System.out.println(year + " is not a Leap Year");
                }
            }else{
                    System.out.println(year + " is a Leap Year");
            }
        }else{
                    System.out.println(year + " is not a Leap Year");
        }
    }
}