import java.util.Scanner;

public class HelloSon {
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Tell me your name: ");
        String name = input.nextLine();

        System.out.println("Hello" + name);
        input.close();
    }
}
