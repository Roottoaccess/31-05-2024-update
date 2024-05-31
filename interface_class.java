import java.util.Scanner;
interface Animal{
    public abstract void sound();
}


class Dog implements Animal{
    @Override
    public void sound(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the voice of dog in present continuous tense: ");
        String dog_voice = sc.nextLine();

        System.out.println("The Dog is "+dog_voice);
    }
}

class Lion implements Animal{
    @Override
    public void sound(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the voice of lion in present continuous tense: ");
        String lion_voice = sc.nextLine();

        System.out.println("The lion is "+lion_voice);
    }
}

public class interface_class{
    public static void main(String[] args) {
        /* Creating the object of the class */       
        Dog obj = new Dog();
        obj.sound();

        /* Creating the object of lion class */
        Lion obj1 = new Lion();
        obj1.sound();
    }
}