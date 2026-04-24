/*

1) Selection Statements -> If...else if...else
    if(Condition 1){
        Code Block
    }
    else if(Condition 2){
        Code Block
    }
    else{
        Code Block
    }

NOTE: 1- If the Code block for if() is only 1 Statement, Write it as :-
                if(Condition) Statement;

    2- If More than 1 Statement -> Use the curly brackets {} to define Code Block
------------------------------------------------------

2) Relational Operators:-
    1. == equal to
    2. != not equal to
    3. > greater than
    4. < less than
    5. >= greater than or equal to
    5. <= less than or equal to
------------------------------------------------------

3) Logical Operators:-
    1. && and
        true  &&  true   ->  true
        true  &&  false  ->  false
        false &&  true   ->  false
        false &&  false  ->  false

    2. || or
        true  ||  true   ->  true
        true  ||  false  ->  true
        false ||  true   ->  true
        false ||  false  ->  false

    3. !  not
        !true -> false
        !false -> true
------------------------------------------------------

4) Ternary Operator = ShortHand if-else Statement
    variable = (Condition)? value1 : value2  -> Short Hand IF
    variable = (Condition1)? value : (Condition2)? value : (Condition3)? value : ... and so on  -> Short Hand IF Else-IF
------------------------------------------------------

5) instanceof
    - Check the object is an object from the (eg. String).
*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(input instanceof Scanner);

        System.out.println("Enter a Number: ");
        int num = input.nextInt();
        if ( num % 2 == 0 ){ // Even Case
            System.out.print("Even and ");
            if(num > 0)
                System.out.println("Positive Number");
            else
                System.out.println("Negative Number");
        }
        else{
            System.out.print("Odd and ");
            if(num > 0)
                System.out.println("Positive Number");
            else
                System.out.println("Negative Number");
        }

        // Exercise:-
        int grade = input.nextInt();

        if(grade >= 90 && grade <= 100)
            System.out.println("Grade A");
        else if(grade >=80)
            System.out.println("Grade B");
        else if(grade >=70)
            System.out.println("Grade C");
        else if(grade >=60)
            System.out.println("Grade D");
        else
            System.out.println("Invalid!, Enter Correct Grade.");

        // Ternary Operator
        int n = 11;
        String y = (n %2 == 0)? "Even" : (n > 0)? "Positive but not even" : "Negative and Odd";

        System.out.println(y);
    }
}