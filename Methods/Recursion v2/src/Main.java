/*
    - Recursion Components:
        1. Base Case       -> Stop case
        2. Recursive Case  -> Iterative case

    - Types of it:
        1. Direct Recursion: The Method call itself directly.
        2. Indirect Recursion: Method (A) calls Method (B) & Method (B) calls Method (A).
        3. Tail Recursion: The Self-recall in the end of the method.
        4. Head Recursion: The Self-recall in the start of the method.

     - Advantages:
        1/ Cleaner and fewer lines of code.
        2/ Ideal for complex problems like tree/graph traversal.
        3/ Transforms complex mathematical problems into simpler and more logical code.

     - Disadvantages:
        1/ Consumes a lot of memory (Stack Memory).
        2/ May cause a Stack Overflow Error if the input is too deep.
        3/ Slower than traditional loops due to the cost of method calls.

*/


public class Main{
    // Fibonacci Series
    static int calcFib(int n){
        if(n == 0 || n == 1)
            return 1;
        else
            return calcFib(n - 1 ) + calcFib( n- 2 );
    }

    static void printFib(int n){

    }
    public static void main(String[] args){

    }
}