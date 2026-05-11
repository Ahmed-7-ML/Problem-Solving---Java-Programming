/*
1. Java Number Methods -->> https://docs.oracle.com/javase/8/docs/api/java/lang/Number.html
    - Math Class Methods
2. Java String Methods
3. Java Character Methods
4. Java Array Methods
*/

// Import everything in Math Class
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args){
        System.out.println("----- Absolute -----");
        System.out.println(abs(-1213));
        System.out.println(abs(-3.14));
        System.out.println(abs(-23.323));
        System.out.println(abs(-102));

        System.out.println("----- Approximation -----");
        System.out.println("----> 1. ceil() -> Approx to the Highest Integer");
        System.out.println(ceil(123.211));
        System.out.println(ceil(123.443));
        System.out.println(ceil(-123.532));
        System.out.println(ceil(-123.621));


        System.out.println("----> 2. floor() -> Approx to the Smallest Integer");
        System.out.println(floor(123.211));
        System.out.println(floor(123.443));
        System.out.println(floor(-123.532));
        System.out.println(floor(-123.621));

        System.out.println("----> 3. round() -> Approx number (when fraction >= 5");
        System.out.println(round(123.211));
        System.out.println(round(123.443));
        System.out.println(round(123.532));
        System.out.println(round(123.621));

        System.out.println("----- Square Root -----");
        System.out.println(sqrt(64.0));

        System.out.println("----- Power -----");
        System.out.println(pow(2, 3));  // 2^3 = 8

        System.out.println("----- Random Generator -----");
        // Generate random number 0.0 <= value < 1.0
        System.out.println(random());

        System.out.println("----- Range (1 - 10) -----");
        // random() * ((max - min) + 1) + min
        System.out.println( random() * ((10 - 1) + 1) + 1);
        System.out.println( (int) (random() * ((10 - 1) + 1) + 1));

        System.out.println("----- MAX -----");
        System.out.println(max(5, 4));
        System.out.println(max(5.4, 12.2));
        System.out.println(max(5.232323, 5.223232));

        System.out.println("----- MIN -----");
        System.out.println(min(5, 4));
        System.out.println(min(5.4, 12.2));
        System.out.println(min(5.232323, 5.223232));
    }
}