import java.util.Scanner;

public class TellMeAboutYourself {
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Tell me your name: ");
        String name = input.next();

        System.out.print(name + " what is your age and what is your favourite colour?");
        int age = input.nextInt();
        String colour = input.next();

        System.out.println("Hello " + name + ", you are " + age + " and your favourite colour is " + colour + ".");
        input.close();
    }
}
