import java.util.Scanner;

/*
Problem29: StringCase Toggle
- Accept a String and create a new String where every alternate character is upper case and lower case
- (e.g., "hello" → "HeLlO").
- Use charAt() and String concatenation in a loop.
 */
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Text: ");
        String text = input.next();     // Immutable -> Not adjustable in its place
        String result = "";

        // As String = Array of Characters -> We can loop over it
        for(int i = 0; i < text.length(); i++){
            if( i % 2 != 0){    // ODD -> LowerCase
                result += Character.toLowerCase( text.charAt(i) );
            }
            else{               // EVEN -> UpperCase
                result += Character.toUpperCase( text.charAt(i) );
            }
        }

        System.out.println("Original Text: " + text);
        System.out.println("Converted Text: " + result);
    }
}