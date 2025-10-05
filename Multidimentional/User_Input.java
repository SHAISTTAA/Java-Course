import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter the number of rows : ");
        int row = sc.nextInt();

        System.out.print("Enter the number of cols : ");
        int cols = sc.nextInt();


        int Matrix[][] = new int[row][cols];
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < cols; j++) {
                Matrix[i][j] = (i + 1) * (j + 1); 
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
