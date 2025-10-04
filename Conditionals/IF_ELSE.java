package Conditionals;

public class IF_ELSE {
    public static void main(String args[]){
        int age = 18;
        if(age <= 18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
        System.out.println("Dont worry, you will be eligible to vote after " + (18 - age) + " years");
    }
    
}
