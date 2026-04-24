/*
   - Unary Operators need only one operand. They are used to increment, decrement, or negate value.
    ex: a++, ++a. a--, --a
    Post Increment/Decrement : a++, a--
    Pre-Increment/Decrement : ++a, --a

    -----------------------------------------------------------------------------------

   - Shift Operators: <<, <<<, >>, >>>
    << , >> : Signed Left/Right Shift Operator
    <<< , >>> : UnSigned Left/Right Shift Operator

    | Operator | الاسم                |    بيملأ من الشمال بـ |
    | -------- | -------------------- | ------------------  |
    | `>>`     | Signed Right Shift   | نفس الإشارة (0 أو 1) |
    | `>>>`    | Unsigned Right Shift | 0 دايمًا             |

    -----------------------------------------------------------------------------------

   - instanceof Operator: Type checking & It can be used to test if an object is an instance
     of a class, a subclass, or an interface

   - Type Casting
    1. Widening Casting: Converting from a smaller type to a larger type without data loss
        ✔️ Java does it automatically (implicitly) because it's safe.

    2. Narrowing Casting: Converting from a larger type to a smaller type
        ⚠️ This can cause data loss → Therefore, you must write the conversion yourself (Explicit)

    *** Explict Casting: It is a manual data type conversion performed by the programmer.
        ✔️ We use it when:
        Converting from a larger type to a smaller type (narrowing)
        This can cause data loss.

        - Format: (type) value;



*/

public class Operators {
    public static void main(String[] args){

        int e = 8;  // 1000
        int a = -8; // (+8) 00001000 -> 2's Complement -> 11110111 + 1 = (-8) 11111000

        System.out.println("e >> 1 = " + (e >> 1)); // 0100 = 4
        System.out.println("e >>> 1 = " + (e >>> 1)); // 0100 = 4

        System.out.println("a >> 1 = " + (a >> 1));  // (-8) 11000 >> 1 : 11100(-4) -> 2's Complement = 00011 + 1 = 00100 (+4)
        System.out.println("a >>> 1 = " + (a >>> 1)); // (-8) 11111000 >>> 1 : 01111100 (124)
        // Jave 32-bit -> Result = 2147483644

        // Narrowing Casting : From Larger (double) to Smaller (int)
        double x = 9.8d;
        int y = (int) x;
        System.out.println(x);
        System.out.println(y);  // 9.8 -> Truncated to 9

        // Widening Casting : From Smaller (int) to Larger (double)
        int s = 10;
        double f = x;

//        System.out.println(s);
//        System.out.println(f);
    }
}
