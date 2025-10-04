package Conditionals;

import java.util.Scanner;

public class IF_ELSE_ELSE_IF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter your number below: ");
        int age = sc.nextInt();

        if(age <= 17){
            System.out.println("You will vote in the nexr election");
        } else if(age == 18){
            System.out.println("You are eligible to vote this year");
        }
        else{
            System.out.println("You are ready to vote");
        }
    
        sc.close();
    }
}
