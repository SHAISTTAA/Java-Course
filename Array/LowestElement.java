public class LowestElement {
    public static void main(String[] args) {
        int[] ages = {22, 14, 25, 19, 29};
        int lowestAge = ages[0];

        for (int age : ages) {
            if (lowestAge > age) {
                lowestAge = age;
            }
        }
        System.out.println("The lowest age is: " + lowestAge);
    }
}

