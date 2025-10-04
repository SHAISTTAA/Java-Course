import java.util.Scanner;

public class Even_Sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                sum = sum + 2*i;
            }
        }
        System.out.println("The sum of even numbers is : " + sum);
    }
}
