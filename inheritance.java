import java.util.Scanner;
import java.lang.Thread;
class Name extends Thread{
    Scanner sc = new Scanner(System.in);
    String name;
    void identity(){
        System.out.println("\t--WELCOME TO OUR PORTAL--");
        try{
            Thread.sleep(500);
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
class Id extends Name{
    int user_id;
    void identity1(){
        System.out.print("Mr / Mrs "+name+" please enter your USER ID: ");
        user_id = sc.nextInt();
    }
}
class Pass extends Id{
    long pass;
    void identity2(){
        try{
            System.out.print("Enter your Password for the ID "+user_id+" :");
            pass = sc.nextLong();
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("\t--THANKYOU FOR VISITING US HAVE A NICE DAY--");
    }
}
public class inheritance {
    public static void main(String[] args) {
        /* Now Creating the object of the Inherite class and running the program */
        Pass obj = new Pass();
        obj.identity();
        obj.identity1();
        obj.identity2();
    }
}