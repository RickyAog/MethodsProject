import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

System.out.println(helloWorld());
System.out.println(helloPerson());
System.out.println(multiply());
System.out.println(divideNumbers());
System.out.println(doubleIT());
System.out.println(worldHello());
    }
    public static String helloWorld(){
        return("Hello World");
    }
    public static String helloPerson() {
        System.out.println("Please give me a name");
        String personName;
        Scanner keyboard;
        keyboard=new Scanner (System.in);
        personName = keyboard.nextLine();
        return("Hello " + personName);
        }
        public static float multiply(){
          System.out.println("Give me 2 numbers please they can be decimals");
        float multiplyOne,multiplyTwo;
          Scanner keyboard;
            keyboard=new Scanner (System.in);
            multiplyOne= keyboard.nextFloat();
            multiplyTwo= keyboard.nextFloat();
        return(multiplyOne * multiplyTwo);
        }
        public static String worldHello(){
        System.out.println("Give me a greetings and someone/something that is YOUR world");
        String world,hello;
        Scanner keyboard;
            keyboard=new Scanner (System.in);
            hello= keyboard.nextLine();
            world=keyboard.nextLine();
        return(world + hello);
        }
        public static float divideNumbers (){
        System.out.println("Give me 2 numbers please, they can be decimals");
        float numberUno,numberDos;
            Scanner keyboard;
            keyboard=new Scanner (System.in);
            numberUno = keyboard.nextFloat();
            numberDos = keyboard.nextFloat();
        return(numberUno/numberDos);
    }
    public static double doubleIT(){
        System.out.println("Give me 2 numbers");
        Scanner keyboard;
        keyboard=new Scanner (System.in);
        double unoDouble,dosDouble;
        unoDouble=keyboard.nextDouble();
        dosDouble=keyboard.nextDouble();
        return(unoDouble-dosDouble);
    }





}