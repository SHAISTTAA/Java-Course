import java.util.Arrays;
public class Equals {
    public static void main(String args []){
        String arr1 [] = {"apple", "banana", "cherry"};
        String arr2 [] = {"apple", "banana", "cherry"};
        String arr3 [] = {"date", "fig", "grape"};

        System.out.println(Arrays.equals(arr1, arr2)); // true
        System.out.println(Arrays.equals(arr1, arr3)); // false
    }
    
}
