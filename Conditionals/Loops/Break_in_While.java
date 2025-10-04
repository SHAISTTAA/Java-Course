public class Break_in_While {
    public static void main(String args[]){
        int i = 1;
        while (i <= 10){
                System.out.println("The value of i is : " + i);
                i++;
                if(i == 3) break; // it will break the loop when i is 3
            }
           
    }
    
}
