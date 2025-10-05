package Methods;

public class Basic_Methods {
    public static void main(String args[]){
        greet();
        putName("Shaista");
        putAge(20);
        putCity("Ranchi");
        putEducation("Engineering");
        putContact(1234567890);
    }
    static void greet(){
        System.out.println("Hello, Welcome to Java Programming");
    }
    static void putName(String name){
        System.out.println("My name is : " + name);
    }
    static void putAge(int age){
        System.out.println("My age is : " + age);
    }
    static void putCity(String city){
        System.out.println("My city is : " + city);
    }
    static void putEducation(String education){
        System.out.println("My education is : " + education);
    }
    static void putContact(long contact){
        System.out.println("My contact number is : " + contact);
    
    }
}
