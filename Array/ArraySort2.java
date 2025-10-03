import java.util.Arrays;

public class ArraySort2 {
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 1, 2};
        // Arrays.sort(arr, 1, 7); // This would throw ArrayIndexOutOfBoundsException
        Arrays.sort(arr, 1, arr.length); // Sort from index 1 to end

        for (int i : arr) {
            System.out.println(" " + i);
        }
    }
}
