/*
Problem 33: Continue Skip Pattern Print numbers from 1 to 50, but skip all multiples of 3 using
the continue statement. Count how many numbers were printed and display the count.
 */
public class Main {
    public static void main(String[] args){
        int counter = 0;
        for(int i = 1; i <= 50; i++){
            if(i % 3 == 0)
                continue;

            System.out.println("Number: " + i);
            counter++;
        }

        System.out.println("How Many numbers were printed? " + counter + " numbers");
    }
}