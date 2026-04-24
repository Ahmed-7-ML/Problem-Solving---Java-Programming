import java.util.Scanner;

/*
Problem 17: Largest of Three (Ternary) Find the largest of three numbers using only nested
ternary operators (no if statements). Print the largest number with a message identifying which
variable it was.
 */
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 Numbers: ");
        short n1 = input.nextShort();
        short n2 = input.nextShort();
        short n3 = input.nextShort();

        // Nested Ternary Operator -> Condition ? (Nested Condition) : (Another Nested Condition)
        short largest = (n1 > n2)? (n1 > n3)? n1 : n3 : (n2 > n3)? n2 : n3;
        System.out.printf("Largest Number: %d%n", largest);

        // Another Solution
        String result = (n1 >= n2 && n1 >= n3) ?  "n1 is the largest (" + n1 + ")" :
                        (n2 >= n1 && n2 >= n3) ?  "n2 is the largest (" + n2 + ")" :
                                                  "n3 is the largest (" + n3 + ")" ;

        System.out.printf( result);


    }
}