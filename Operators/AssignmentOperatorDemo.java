public class AssignmentOperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("start a = " + a);

        a += 5;
        System.out.println("after a += 5 -> " + a);

        a -= 3;
        System.out.println("after a -= 3 -> " + a);

        a *= 2;
        System.out.println("after a *= 2 -> " + a);

        a /= 4; // integer division
        System.out.println("after a /= 4 -> " + a);

        a %= 3;
        System.out.println("after a %= 3 -> " + a);

        // Demonstrate with double
        double d = 7;
        System.out.println("\nstart d = " + d);
        d /= 2; // regular double division
        System.out.println("after d /= 2 -> " + d);

        // Compound assignment with different types: int *= double literal
        int b = 5;
        b *= 2.5; // allowed: equivalent to b = (int)(b * 2.5)
        System.out.println("\nstart b = 5; after b *= 2.5 -> " + b);

        // Modulo with negative value
        int neg = -7;
        neg %= 3;
        System.out.println("-7 % 3 -> " + neg);
    }
}
