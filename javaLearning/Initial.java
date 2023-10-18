import java.util.Scanner;

public class Initial
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        
        // Use the substring() method of the String class.
        String first_initial = name.substring(0, 1);
        System.out.println(name + " starts with the letter " + first_initial + ".");

        input.close();
    }
}