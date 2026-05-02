/*
Problem30:Autoboxing/Unboxing Demonstration
- Create a method that accepts a primitive int array and
  returns the sum as an Integer object(autoboxing).
- In main, unbox this Integer to a primitive int and display it.
- Also demonstrate converting an int to String using wrapper class.

-----
Autoboxing and Unboxing
This is the 'automatic conversion' that Java does between a Primitive and its Wrapper.

    1. Autoboxing: It is converting a Primitive to a Wrapper automatically.
    2. Unboxing: It is the opposite, converting a Wrapper Object to a Primitive.
*/
public class Main {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Unboxing
        int sum = calcSum(numbers);

        String sumString = Integer.toString(sum);

        System.out.println("The sum is: " + sumString);
    }

    static Integer calcSum(int[] arr){
        // Return Type: Integer for Autoboxing
        int sum = 0;
        for(int a: arr)
            sum += a;

        return sum;
    }
}