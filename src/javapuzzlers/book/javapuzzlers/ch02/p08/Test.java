package book.javapuzzlers.ch02.p08;

/**
 * This demo is from JSL 5.6.2
 * @author SUN
 */
public class Test {

    public static void main(String[] args) {
        int i = 0;
        float f = 1.0f;
        double d = 2.0;
        // First int*float is promoted to float*float, then
        // float==double is promoted to double==double:
        if (i * f == d) {
            System.out.println("oops");
        }

// A char&byte is promoted to int&int:
        byte b = 0x1f;
        char c = 'G';
        int control = c & b;
        System.out.println(Integer.toHexString(control));

// Here int:float is promoted to float:float:
        f = (b == 0) ? i : 4.0f;
        System.out.println(1.0 / f);
    }
}
