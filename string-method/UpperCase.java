import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = string.nextLine();
        
        System.out.println(str.toUpperCase());

    }
}
