/*
Find the Maximum and Minimum Numbers in Array of 10 Integer Numbers using For-each
 */

public class Main {
    public static void main(String[] args){
        int[] numbers = {10, -100, 1212, 2132, 43, -1213, 21312, 1, 2, 323};

        int max = numbers[0], min = numbers[0];
        for(int n: numbers){
            if(n > max)
                max = n;

            if(n < min)
                min = n;
        }

        System.out.println("Maximum Number = " + max);
        System.out.println("Minimum Number = " + min);
    }
}