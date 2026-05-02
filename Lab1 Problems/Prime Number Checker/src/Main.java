import java.util.Scanner;

/*
Problem 23: Prime Number Checker
    Accept a number and determine if it's prime using a loop that runs from 2 to √n (use Math.sqrt()).
    Optimize the loop to skip even numbers after checking 2

    --> Hint: A prime number is a number that is only divisible by itself and 1 (and is greater than 1).
    This means you'll need a for loop starting from 2 and going to the middle of the number to see if there are any other numbers divisible by it.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        boolean isPrime = true; // افترضنا إنه صح وغيرناه لو ثبت العكس

        if(n <= 1)
            isPrime = false;
        else if(n == 2) // اسأل عن الـ 2 الأول
            isPrime = true;
        else if( n % 2 == 0) // أي رقم زوجي تاني (زي 4، 6، 8) هيبقى false
            isPrime = false;
        else {
            for(int i = 3; i <= Math.sqrt(n); i += 2) {
                if(n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number ✨");
        } else {
            System.out.println(n + " is NOT a Prime Number ❌");
        }
    }
}