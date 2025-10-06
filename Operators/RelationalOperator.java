public class RelationalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b));   // false
        System.out.println("a < b: " + (a < b));   // true
        System.out.println("a >= b: " + (a >= b)); // false
        System.out.println("a <= b: " + (a <= b)); // true

        // Demonstrate with double
        double x = 10.5;
        double y = 20.5;

        System.out.println("\nx = " + x + ", y = " + y);
        System.out.println("x == y: " + (x == y)); // false
        System.out.println("x != y: " + (x != y)); // true
        System.out.println("x > y: " + (x > y));   // false
        System.out.println("x < y: " + (x < y));   // true
        System.out.println("x >= y: " + (x >= y)); // false
        System.out.println("x <= y: " + (x <= y)); // true
    }
}