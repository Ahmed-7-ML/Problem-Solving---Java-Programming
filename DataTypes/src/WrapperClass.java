/*
  - Wrapper Class:  Allow primitive data types to be represented as objects.
    - This enables primitives to be used in object-oriented features such as
    collections, generics, and APIs that require objects.

    - encapsulates a corresponding primitive value inside an object
    (e.g., Integer for int, Double for double).

    - Java provides wrapper classes for all eight primitive data types to support object-based
    operations.

   ** AutoBoxing -> Convert Primitive Data Type to Wrapper Class
   ** UnBoxing   -> Convert Wrapper Class objects back into corresponding primitive data type
*/

public class WrapperClass {
    public static void main(String[] args){

        int a = 213;

        // Autoboxing
        Integer b = a;

        System.out.println("Primitive Integer: " + a);
        System.out.println("Integer Object (Wrapper Class): " + b);

        // Unboxing
        int c = b;
        System.out.println("Unboxing -> Primitive Integer: "+ c);
    }
}