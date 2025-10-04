package Math_Class;

public class Math_Function {
    public static void main(String args[]){
        System.out.println(Math.sqrt(16)); // it will return the square root of 16
        System.out.println(Math.max(10, 20)); // it will return the maximum value between 10 and 20
        System.out.println(Math.min(10, 20)); // it will return the minimum value between 10 and 20
        System.out.println(Math.abs(-10)); // it will return the absolute value of -10
        System.out.println(Math.random()); // it will return a random value between 0.0 and 1.0
        System.out.println(Math.random() * 100); // it will return a random value between 0.0 and 100.0
        System.out.println((int)(Math.random() * 100)); // it will return a random integer value between 0 and 100

        int random = (int)(Math.random() * 100);
        System.out.println(random);
    }
    
}
