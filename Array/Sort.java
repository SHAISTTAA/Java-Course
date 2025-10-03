import java.util.Arrays;
public class Sort {
    public static void main(String[] args) {
        int[] myNum = {5, 4, 7, 1, 9, 2, 4, 3};
        Arrays.sort(myNum);
        for (int num : myNum) {
            System.out.println(" " + num);
        }
    }
}
