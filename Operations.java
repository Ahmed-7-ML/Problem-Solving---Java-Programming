// Addition +
// Subtraction -
// Multiplication *
// Division /
// Reminder (Modulus) %

public class Operations{
    public static void main(String[] args){
        int n1 = 10;
        int n2 = 20;
        
        System.out.println(n1 / n2);    // 0
        
        // As we divide integer number over integer number the result is also integer number
        // we should make one of these as float or double
        
        double n3 = 30;
        System.out.println(n1 / n3);    // 10 / 30.0 = 0.33333333333
        
        
        // ---------------------------------------------------
        
        // 1. n1 % n2 = 0   -> when n1 = n2
        System.out.println(10 % 10);
        
        // 2. n1 % n2 = n1  -> when n1 < n2 
        System.out.println(7 % 10);
        
        // 3. n1 % n2 = n1 - (n2 * [n1 / n2])  -> when n1 > n2 
        // Or Recurisively do (n1 - n2) until result < n2
        System.out.println(11 % 10);
        System.out.println(11 - (10 * (11 / 10)));
        
    }
}









