
package Methods;
import java.util.Scanner;



public class Return_value2 {

    static int cityZipCode(int zipcode){
        return zipcode;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your city zip code: ");
        int zip = sc.nextInt();
        System.out.println("Your city zip code is: " + cityZipCode(zip));       
        sc.close();
    }
    
}
