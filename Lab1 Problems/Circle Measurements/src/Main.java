/*
Problem 9: Circle Measurements Given the radius as a double, calculate and display:
     Area(πr²)- use 3.14159
     Circumference (2πr)
     Diameter (2r)
     Use the ternary operator to check if radius is positive; if not, print "Invalid radius".
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // final float PI = 3.14159f;      // Constant Variable or Use Math.PI

        System.out.print("Enter the Radius: ");
        double radius = input.nextDouble();

        String result = (radius > 0) ? "Calculations:" : "Invalid radius";
        System.out.println(result);

        if(radius > 0){
            System.out.printf("Area (πr²): %.5f%n", ( Math.PI * Math.pow( radius, 2 ) ) );
            System.out.printf("Circumference (2πr): %.5f%n", ( 2 * Math.PI * radius ) );
            System.out.printf("Diameter (2r): %.1f%n", ( 2 * radius ) );
        }
    }
}