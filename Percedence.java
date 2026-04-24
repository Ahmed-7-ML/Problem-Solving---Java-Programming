/*
    1. Parentheses ()
    
    2. Multiplication *
       Division /
       Modulus %
       → They are all at the same level and are carried out from left to right
       
    3. Addition +
       Subtraction -
       → They are all at the same level and are carried out from left to right
*/

/*
    1. X += n --> X = X + n
    2. X -= n --> X = X - n
    3. X *= n --> X = X * n
    4. X /= n --> X = X / n 
    5. X %= n --> X = X % n
    
    6. X++   --> X = X + 1
    7. ++X   --> X = X + 1
    
    
    NOTE:
        System.out.println(++X); -> It Will increment X by one then print X
        System.out.println(X++); -> It Will print X first then increment X by one 

*/
        

public class Percedence{
    public static void main(String[] args){
        int  X = 10;
        System.out.println(X);      // 10
        
        X += 2;
        
        System.out.println(X);      // 12
        
        System.out.println(X++);    // 12 and X is incremented by 1 -> The Final value of X is 13 
        
        System.out.println(++X);    // Increment X by 1 and Print it --> 13 + 1 = 14
        
        X -= 2;
        
        System.out.println(X);  // 14 - 2 = 12
        
        X *= 2;
        
        System.out.println(X);  // 12 * 2 = 24
        
        X /= 2;
        
        System.out.println(X);  // 24 / 2 = 12  
        
        X %= 2;
        
        System.out.println(X);  // 12 % 2 = 0  
    }
}