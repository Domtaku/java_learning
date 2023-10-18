import java.util.Scanner;

public class InitialLess {
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Tell me your name: ");
        String name = input.next();
        int length = name.length();
        String no_initial = name.substring(1, length);
        System.out.println("Initialless, your name is " + no_initial + ".");

        input.close();
    }
    
}
