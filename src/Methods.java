import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
Scanner keyboard;
keyboard=new Scanner (System.in);
System.out.println(helloWorld());
System.out.println(helloPerson());
System.out.println(multiply());


System.out.println(worldHello());
    }
    public static String helloWorld(){
        return("Hello World");
    }
    public static String helloPerson() {
        String personName;
        Scanner keyboard;
        keyboard=new Scanner (System.in);
        personName = keyboard.nextLine();
        return("Hello " + personName);
        }
        public static int multiply(){
        return(186*2);
        }
        public static String worldHello(){
        return("WorldHello");
        }





}