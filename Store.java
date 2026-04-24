public class Store{
    
    public static void main(String[] args){
        
        /* 
            1) Variables -> Container to store values into memory.
            
            2) Data Types:
                1. Integers = Whole Numbers (byte, short, int, long)
                    - byte -> 8-bit signed
                    - short -> 16-bit signed
                    - int -> 32-bit signed
                    - long -> 64-bit signed
                
                2. Decimal numbers = Floating Point Numbers (float, double)
                    - float -> 7 digits after decimal point & 32-bit
                    - double -> 15 digits after decimal point & 64-bit
                
                3. Boolean = true(1) / false(0) (boolean)
                
                4. Texts = Any thing enclosed into double quotes (String) or Singlq Quotes (char)
                    - String -> Array of Character , uses only Double Quotes " "
                    - char -> Only One Character , uses only Single Quotes ' '
            
            3) Rules for Variable Names:
                1. Cannot contain spaces.
                2. Cannot be Reserved Words (Keywords).
                3. Cannot Start with a Number or any Symbol except ( $, _ ).
                4. Start with ( $ , _ ) or any character except numbers.
                5. Can Contain Numbers but not in the first of the variable name.
                6. Case-Sensitive -> int sum != int SUM.
                7. 1 Unique name for each variable.
                8. Cannot name more than one variable with the same name -> 
                    To avoid error: variable _ is already defined.
                9. Make the variable names -> Short, Clear and Descriptive.
              
            4) Concatenation:   
                1. Concatenation Symbol ( + ) between 2 String and another Variabel -> String + Variable
                - linking (merging) a String with another String or with any other data type into a single text.
                - Java automatically converts the number/float/boolean to a String
            
                2. Concatenation Method (stringVar.concat()): Link only 2 Strings.
                    - Otherwise -> it will raises an error: incompatible types: int/float/bool cannot be converted to String
        */

        byte age = 22;
        
        float gpa = 3.72f;
        double e = 2.718281828;
        
        boolean is_adult = false;
        boolean is_male = true;
        
        char x = 's';
        String name1 = "Ahmed"; 
        char[] name2 = {'A', 'h', 'm', 'e', 'd', '9'}; // String = Array of Characters
        
        // System.out.print(name2);
        
        System.out.println("Name: " + name1 );  // Str + Str
        System.out.println("Age: " + age );     // Str + Int
        System.out.println("GPA: "+gpa);        // Str + Float
        System.out.println("Is he adult ?: " + is_adult );  // Str + Bool
        System.out.println("Male ?: " + is_male );

        String fname = "Ahmed";
        String lname = "Akram";
        System.out.println("Full Name: " + fname + " " + lname);
        
        // The Order is Very Important -> Operations done from left to right
        System.out.println(2 + 3 + "Hello");    // Apply Addition first then Concatenation
        System.out.println("Hello" + 2 + 3);    // Apply Concatenation first then Addition
        // The first thing that encounters String → converts everything else to String
        
        String fullname = fname.concat(lname);
        System.out.println(fullname);
        
        
    }
}