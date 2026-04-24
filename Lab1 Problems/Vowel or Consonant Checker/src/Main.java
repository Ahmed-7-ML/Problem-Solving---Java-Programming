/*
Problem 18: Vowel or Consonant Checker Accept a single character.
 Use if-else to determine if it's:
     Vowel (a, e, i, o, u- both cases (UPPER, lower)
     Consonant
     Digit
     Special Character Use Character wrapper class methods (isDigit(), isLetter()) where appropriate.
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Accept a Character then convert it to lowercase.
        System.out.print("Enter a Character: ");
        char symbol = input.next().charAt(0);

        // Character Wrapper Class
        symbol = Character.toLowerCase(symbol);

        if (Character.isDigit(symbol)) {
            System.out.println("Digit (Number): " + symbol);
        }
        else if (Character.isLetter(symbol)) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u')
                System.out.println("Vowel Letter: " + symbol);
            else
                System.out.println("Consonant Letter: " + symbol);
        }
        else{
            System.out.println("Special Character: " + symbol);
        }


    }
}