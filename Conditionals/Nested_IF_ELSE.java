package Conditionals;

public class Nested_IF_ELSE {
    public static void main(String args[]){
        int a = 11;
        int b = 5;
        int c = 8;

        if(a > b){
            System.out.println("A is greater than B");
            if(a > c){
                System.out.println("A is also greater than C");
                System.out.println("Value of A is : " + a);
        } else {
            System.out.println("C is greater than A");
            System.out.println("Value of C is : " + c);
        }
        } else {
            System.out.println("B is greater than A");
            System.out.println("Value of B is : " + b);
            if(b > c){
                System.out.println("B is also greater than C");
                System.out.println("Value of B is : " + b);
            } else {
                System.out.println("C is greater than B");
                System.out.println("Value of C is : " + c);
            }   
        }
    }
    
}
