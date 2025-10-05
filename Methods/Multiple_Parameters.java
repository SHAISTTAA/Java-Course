package Methods;

public class Multiple_Parameters {
    static void candidateInfo(String name, int roll){
        System.out.print("My name is " + name + " and my roll number is " + roll + ".\n");
    }
    public static void main(String args[]){
        candidateInfo("Ali", 101);
        candidateInfo("Aisha", 102);
        candidateInfo("Omar", 103);
    }
}
