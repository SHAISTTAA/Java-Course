import java.util.Scanner;

public class Question {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Day: ");
        int day = sc.nextInt();

        if(day == 1 || day == 3){
            System.out.println("Wear a red dress");
        } else if(day == 2){
            System.out.println("Wear a blue dress");
        }
        else if(day == 4){
            System.out.println("Wear a yellow dress");
        }
        else if(day == 5){
            System.out.println("Wear a black dress");
        }
        else if(day == 6){
            System.out.println("Wear a white dress");
        }
        else if(day == 7){
            System.out.println("You can wear any color you want");
        }

        sc.close();
    }
}
