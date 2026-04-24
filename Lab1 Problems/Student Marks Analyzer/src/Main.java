/*Problem 4: Student Marks Analyzer Create variables for marks in 5 subjects (byte data type to
save memory). Calculate and display:
 Total marks
 Average (as float)
 Percentage (as double)
 */

public class Main {
    public static void main(String[] args){
        byte mark1 = 100, mark2 = 85, mark3 = 95, mark4 = 80, mark5 = 90;
        byte numberOfSubjects = 5;
        short maxMarkPerSubject = 100;

        int sum = 0;
        float avg = 0;
        double percentage = 0;

        sum = mark1 + mark2 + mark3 + mark4 + mark5;
        avg = sum / (float)(numberOfSubjects);
        percentage = sum / (double)(numberOfSubjects * maxMarkPerSubject) * 100;

        System.out.println("Total Sum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Percentage% = " + percentage + " %");


    }
}