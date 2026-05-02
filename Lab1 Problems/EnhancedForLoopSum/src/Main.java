/*
Problem26:Enhanced For Loop Sum
- Initialize an int array with 10 values.
- Use an enhanced for-loop(for-each) to calculate and display:
     Sum of all elements
     Sum of even numbers only
     Average as a double
 */
public class Main {
    public static void main(String[] args){
        // Reserve 10 integer numbers in memory consecutively
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sumTotal = 0, sumEven = 0;
        double average = 0.0d;

        // For each int named `n` in `numbers` array
        for(int n: numbers){
            // Here n represents the current number in each iteration
            sumTotal += n;

            if(n % 2 == 0)
                sumEven += n;
        }
        average = (double) sumTotal / numbers.length;

        System.out.println("Total Sum = " + sumTotal);
        System.out.println("Total Even Sum = " + sumEven);
        System.out.println("Average = " + average);

    }
}