import java.util.Scanner;

/*
Problem27:Reverse Number
- Accept an integer and print its reverse using a while loop
- (e.g., input 12345 → output 54321).
- Handle negative numbers (preserve the sign).

- The remainder of a negative number (for example -123 % 10) comes out as -3.
    - the sign will stay with you correctly and the result will automatically come out as -321 without any additional effort.
 */
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = input.nextInt();
        int digit = 0;
        int reversed = 0;

//        System.out.println(12345 % 10);     // 5
//        System.out.println(12345 % 100);    // 45
//        System.out.println(12345 % 1000);   // 345
//        System.out.println(12345 % 10000);  // 2345
//        System.out.println(12345 % 100000); // 12345

//        12345 % 10 -> 5 , 12345 / 10 -> 1234
//        1234 % 10 -> 4  , 1234 / 10 -> 123
//        123 % 10 -> 3   , 123 / 10 -> 12
//        12 % 10 -> 2    , 12 / 10 -> 1
//        1 % 10 -> 1     , 1 / 10 -> 0

//        5 * 10 = 50
//          + 4 = 54
//        54  * 10 = 540
//          + 3 = 543
//        543  * 10 = 5430
//          + 2 = 5432
//        5432  * 10 = 54320
//           + 1 = 54321

        while(number != 0){
            digit = number % 10;
            number = number / 10;
            reversed = (reversed * 10) + digit;
        }

        System.out.println(reversed);
    }
}