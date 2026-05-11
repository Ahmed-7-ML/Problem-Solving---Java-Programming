import java.util.Scanner;

public class Main {

    // Find the Smallest Number among 3 numbers
    static int findSmallest(int n1, int n2, int n3){
        if(n1 <= n2 && n1 <= n3)
            return n1;
        else if(n2 <= n1 && n2 <= n3)
            return n2;
        else
            return n3;
    }

    // Find the Largest Number among 3 numbers
    static int findLargest(int n1, int n2, int n3){
        if(n1 >= n2 && n1 >= n3)
            return n1;
        else if(n2 >= n1 && n2 >= n3)
            return n2;
        else
            return n3;
    }

    // Find the Average of 3 Numbers
    static float findAverage(float n1, float n2, float n3){
        return (n1 + n2 + n3) / 3.0f;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x, y, z;
        System.out.print("Enter #1: ");
        x = input.nextInt();

        System.out.print("Enter #2: ");
        y = input.nextInt();

        System.out.print("Enter #3: ");
        z = input.nextInt();

        System.out.println("Smallest Number: " + findSmallest(x, y, z));
        System.out.println("Largest Number: " + findLargest(x, y, z));
        System.out.println("Average = " + findAverage(x, y, z));


        System.out.println("Sum = " + Add(1, 2, 3, 4));
        System.out.println("Sum = " + Add(1, 2, 3, 4, 5));
        System.out.println("Sum = " + Add(1, 2, 3, 4, 5, 6));
    }

    // Variable Number of Arguments ...
    static int Add(int ...numbers){
        int sum = 0;

        // .length : to get the length of array -> As it is Dynamic
        //for(int i =0; i < numbers.length; i++){
        //    sum += i;
        //}

        // For-each Loop
        for(int n: numbers){
            sum += n;
        }
        return sum;
    }
}