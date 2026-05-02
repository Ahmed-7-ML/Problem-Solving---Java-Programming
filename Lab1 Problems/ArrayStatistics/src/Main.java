/*
Problem28:Array Statistics
- Create an array of 20 integers initialized with random values(use Math.random()).
- Write methods to find:
     Maximum value
     Minimum value
     Second largest value
     Sum of all elements using enhanced for-loop
 */
public class Main {
    public static void main(String[] args){
        int[] numbers = new int[20];

        for(int i = 0; i < numbers.length; i++) {
            // As Math.random() : returns a number between 0  and 1 (exclusive) -> Multiply it by (e.g. 10)
            numbers[i] = (int) (Math.random() * 10);
        }

        displayArray(numbers);
        System.out.println("Maximum Value: " + findMax(numbers));
        System.out.println("Minimum Value: " + findMin(numbers));
        System.out.println("Second Largest Value: " + findSecondLargest(numbers));
        System.out.println("Total Sum: " + calcSum(numbers));
    }

    static void displayArray(int[] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + (i == arr.length - 1 ? "\n" : " "));
    }

    static int findMax(int[] arr){
        int max = arr[0];
        for(int a: arr){
            if(a > max)
                max = a;
        }
        return max;
    }

    static int findSecondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            }
            else if( arr[i] > secondLargest && arr[i] < max){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    static int findMin(int[] arr){
        int min = arr[0];
        for(int a: arr){
            if(a < min)
                min = a;
        }
        return min;
    }

    static int calcSum(int[] arr){
        int sum = 0;
        for(int a: arr)
            sum += a;

        return sum;
    }
}