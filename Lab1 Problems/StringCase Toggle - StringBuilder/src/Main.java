import java.util.Scanner;

/*
- The StringBuilder is the programmer's loyal friend when dealing with texts that change a lot inside a loop,
    because it saves memory consumption and makes the code much faster.
- Imagine a regular String as if it were a 'paper written with ink';
    if you want to change it, you have to tear the paper and get a new one and write on it all over again.
- But the StringBuilder is like a 'whiteboard'; you can erase and add freely in the same place.

 */

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Text: ");
        String text = input.nextLine();

        // Instantiate an Object
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < text.length(); i++){
            char currentChar = text.charAt(i);

            if(i % 2 == 0)
                result.append(Character.toUpperCase(currentChar));
            else
                result.append(Character.toLowerCase(currentChar));
        }

        System.out.println("Converted Text: " + result.toString());
    }

    /*
    Why this version is 'smarter'?
    1) Memory Efficiency: StringBuilder does not make new copies of the text in every loop; it has a buffer (storage space) that it modifies directly.
    2) Speed: For long texts, StringBuilder is thousands of times faster than regular String concatenation.
    */
}