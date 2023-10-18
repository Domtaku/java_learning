import java.util.Scanner;

public class NextYear {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = input.next();

        System.out.print("What age are you: ");
        int age = input.nextInt();
        age = age + 1;

        System.out.println("Hello " + name + ", next year you will be " + age);
        input.close();
    }
}
