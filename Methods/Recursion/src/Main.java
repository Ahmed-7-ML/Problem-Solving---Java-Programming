/*
- Recursion: Process in which a method calls itself continuously.
- Recursive Method: Method that calls itself continuously.
*/

public class Main{
    static void fun(){
        System.out.println("Hi");
        fun();
    }

    static void fun(int x){
        if(x == 5){  // Base Case   -> When the Recursive Method Stops Execution.
            return;
        }
        else{       // Recursive Case
            System.out.println("HI " + x);
            x = x + 1;
            fun(x) ;
        }
    }

    // Find the Factorial of Number using Recursion
    // 5! = 5 * 4 * 3 * 2 * 1
    //    = 5 * 4!
    // 1! = 0! = 1
    static long calcFactorial(int n){
        if( n == 1 || n == 0)  // Base Case
            return 1;
        else
            return n * calcFactorial(n - 1);
    }
    /* 5 * calcFactorial(4)
           4 * calcFactorial(3)
             3 * calcFactorial(2)
               2 * calcFactorial(1)
                 1 */
    public static void main(String[] args){

        // fun();  // Can Lead to Stack overflow Error Like Infinite Loop
        fun(1);

        System.out.println("Factorial = " + calcFactorial(0));
    }
}