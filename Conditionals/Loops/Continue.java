public class Continue {
    public static void main(String args[]){
        for(int i = 1; i <= 10; i++){
            if(i == 5 || i >= 4){
                continue; // it will skip the value of i when i is 5
            }
            System.out.println("The value of i is : " + i);
        }
    }
}
