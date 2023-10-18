import java.util.Scanner;

public class FirstThree
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Tell me your name: ");
        String name = input.next();
        
        // Use the substring() method of the String class.
        String nickname = name.substring(0, 3);
        System.out.println("Your nickname is " + nickname + ".");

        input.close();
    }
}