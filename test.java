/*
- try... catch
- Convert datatype to another
    Double.parseDouble
    Integer.parseInteger
    .....etc.

- Type Casting
    (float)
    (double)
    .......etc.
*/

public class test {
    public static void main(String[] args) {
        int y = 12;
        float x = y / 5.0f;  // float x = y / 5.0; (Wrong)
        // double d = y / 5.0d; // double d = y / 5.0; (Also Right)
        double d = y / 5.0f;

        System.out.println(x);
        System.out.println(d);
    }
}
