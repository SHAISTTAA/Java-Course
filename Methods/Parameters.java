package Methods;

public class Parameters {
    static void getName(String firstname) {
        System.out.println("firstname: " + firstname);
    }
    static String myName(String realname) {
        System.out.println("My name is: " + realname);  
        return realname;
    }
    public static void main(String args[]) {
        getName("Shaista");
        myName("Shaista Afreen");
    }
}
