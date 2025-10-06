
import java.util.Scanner;

public class TernaryOperator_userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value a : ");
        int a = sc.nextInt();

        System.out.println("Enter the value b : ");
        int b = sc.nextInt();

        System.out.println("Enter the value c : ");
        int c = sc.nextInt();



        int max = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;

        System.out.println("The greatest number between a, b and c is : " + max);
        sc.close();
    }
}