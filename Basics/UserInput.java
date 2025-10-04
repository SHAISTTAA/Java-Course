
package Basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println("The number is : " + num);

    sc.nextLine(); // consume the leftover newline
    String string = sc.nextLine();
    System.out.println(string);

    sc.close();
    }
    
}
