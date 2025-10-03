public class Average {
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};

        float average;
        float sum = 0;
        int len = arr.length;

        for(int num : arr){
            sum += num;
        }
        System.out.println(sum);
        average = sum / len;
        System.out.println("The average of the array elements is: " + average);
    }
    
}
