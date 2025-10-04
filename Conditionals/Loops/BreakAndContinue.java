public class BreakAndContinue {
    public static void main(String args []){
        for (int i = 1; i <= 10; i++){
            if (i == 5){
                System.out.println("The value of i is : " + i);
                break; // it will break the loop when i is 5
            }
            System.out.println("The value of i is : " + i);
        }
    }
}