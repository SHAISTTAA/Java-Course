public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b)); // integer division
        System.out.println("a % b = " + (a % b)); // modulo

        // Demonstrate with double
        double x = 10.0;
        double y = 3.0;

        System.out.println("\nx = " + x + ", y = " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y)); // floating-point division
        System.out.println("x % y = " + (x % y)); // modulo
    }
}