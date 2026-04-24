/*
 Syntax:- (Prototype)
    [Return Value Type] [Method Name] (Parameters){     <---- Prototype(Declaration)

        [Body of the Function]

    }

    *** If you use any return type other than (void) -> you must use return statement.

  Calling(Invoking): [As the Function is implemented only when calling]
        [Method Name](Arguments);

 Benefits of Methods:-
    1. Reusability.
    2. Single Responsibility Principle.



    --- Advanced Method Concepts ---

  1. Method Overloading (التحميل الزائد):
     - يمكنك تعريف أكثر من Method بنفس الاسم، بشرط اختلاف الـ Parameters
     (اختلاف العدد أو النوع أو الترتيب). جافا بتعرف تنادي مين فيهم بناءً على الـ Arguments.

  2. Static vs Instance Methods:
     - الـ Static Method (زي اللي كاتبها): تنتمي للكلاس نفسه، تناديها باسم الكلاس.
     - الـ Instance Method: لا نستخدم فيها كلمة static، وتنتمي للـ Object (الكائن).

  3. Pass-by-Value:
     - جافا دايماً بتمرر "نسخة" من القيمة (Value). لو غيرت قيمة الـ Parameter جوه
     الـ Method، القيمة الأصلية بره مش هتتغير (في حالة الـ Primitive types).

  4. Single Responsibility Principle (مبدأ المسئولية الواحدة):
     - الـ Method الناجحة هي اللي بتعمل "حاجة واحدة بس" وبشكل مثالي.
 */

public class Main {
    public static void displayName(String name){
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args){

        displayName("Ahmed");

        double sum = Add(10.0, 20.0);
        System.out.println("Summation = " + sum);

    }

    public static double Add(double n1, double n2){
        return  n1 + n2;
    }
}