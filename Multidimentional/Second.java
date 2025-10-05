package Multidimentional;

public class Second {
    int Marks [][] = { { 90, 80, 70 }, { 60, 50, 40 }, { 30, 20, 10 } };
    public static void main(String args[]){
        Second obj = new Second();
        System.out.println(obj.Marks[0][0]);
        System.out.println(obj.Marks[1][1]);
        System.out.println(obj.Marks[2][2]);
    
}
}
