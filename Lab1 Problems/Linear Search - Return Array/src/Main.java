import java.util.Scanner;

/*
Like Normal Linear Search but handles the duplicates
Problem 32: Find Duplicates
- Initialize an array with random values.
- Use nested loops to compare each element with the rest of the array.
- Print the duplicate values found.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        // 1. ملء المصفوفة بأرقام عشوائية من 0 لـ 9
        System.out.print("Array Elements: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
            System.out.print(numbers[i] + (i == numbers.length - 1 ? "" : " "));
        }
        System.out.println("\n----------------------------");

        // 2. استدعاء ميثود البحث عن المكررات
        findDuplicates(numbers);
    }

    static void findDuplicates(int[] arr) {
        System.out.println("Duplicate Elements:");
        boolean foundAny = false;

        // اللوب الخارجية تمسك عنصر عنصر
        for (int i = 0; i < arr.length; i++) {

            // تكة احترافية: نتحقق إذا كان الرقم ده تم فحصه قبل كدة عشان ميكررش الطباعة
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) continue;

            // اللوب الداخلية تقارن العنصر الحالي (i) بالعناصر اللي بعده فقط (j = i + 1)
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Number " + arr[i] + " is duplicated.");
                    foundAny = true;
                    break; // نخرج من اللوب الداخلية بمجرد إيجاد أول تكرار لهذا الرقم
                }
            }
        }

        if (!foundAny) {
            System.out.println("No duplicates found.");
        }
    }
}