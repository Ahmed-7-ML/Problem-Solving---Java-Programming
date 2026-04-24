/*
    Problem 10: Increment/Decrement Sequence Initialize int a = 5 and int b = 10. Write a program
    that prints the following sequence using pre-post increment/decrement operators:
     Print a++ (then print current a)
     Print ++b (then print current b)
     Print--a + b-- (then print both values)
 */

public class Main {
    public static void main(String[] args){
        int a = 5, b = 10;

        // Post-Increment
        System.out.println(a++);    // Display original value (5) then increment by 1 (finally a = 5 + 1 = 6)
        System.out.println(a);      // 6

        // Pre-Increment
        System.out.println(++b);    // Increment b by 1 -> 10 + 1 = 11 then display it (11)
        System.out.println(b);      // 11

        System.out.println("---------------------------------");

        // Pre-Decrement
//        System.out.println(--a);    // Decrement a by 1 -> 6 - 1 = 5 then display it (5)
//        System.out.println(a);      // 5
//
//        // Post-Decrement
//        System.out.println(b--);    // Display the vale of b (11) then decrement it by 1 -> (11 - 1 = 10)
//        System.out.println(b);      // 10

        System.out.println(--a + b--);  // 5 + 11 = 16

    }
}