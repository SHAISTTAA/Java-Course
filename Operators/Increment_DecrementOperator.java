public class Increment_DecrementOperator {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Initial a = " + a);

        // Post-increment
        System.out.println("Post-increment a++ = " + (a++)); // prints 5, then a becomes 6
        System.out.println("After post-increment, a = " + a); // prints 6

        // Pre-increment
        System.out.println("Pre-increment ++a = " + (++a)); // a becomes 7, then prints 7
        System.out.println("After pre-increment, a = " + a); // prints 7

        // Post-decrement
        System.out.println("Post-decrement a-- = " + (a--)); // prints 7, then a becomes 6
        System.out.println("After post-decrement, a = " + a); // prints 6

        // Pre-decrement
        System.out.println("Pre-decrement --a = " + (--a)); // a becomes 5, then prints 5
        System.out.println("After pre-decrement, a = " + a); // prints 5

        // Demonstrate in expressions
        int b = 10;
        int result1 = b++ + 5; // result1 = 10 + 5, then b becomes 11
        System.out.println("\nUsing post-increment in expression:");
        System.out.println("result1 = b++ + 5 -> " + result1); // prints 15
        System.out.println("After expression, b = " + b); // prints 11

        int c = 10;
        int result2 = ++c + 5; // c becomes 11, then result2 = 11 + 5
        System.out.println("\nUsing pre-increment in expression:");
        System.out.println("result2 = ++c + 5 -> " + result2); // prints 16
        System.out.println("After expression, c = " + c); // prints 11
    }
}