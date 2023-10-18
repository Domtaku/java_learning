import java.util.Scanner;

public class LengthOfName
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        
        // Use the length() method of the String class.
        int length = name.length();
        System.out.println("Hello " + name + ", your name has " + length + " letters.");
        
        input.close();
    }
}