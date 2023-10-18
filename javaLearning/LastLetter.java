import java.util.Scanner;

public class LastLetter {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = input.next();
        
        int length = name.length();
        String last_letter = name.substring(length - 1);
        System.out.println("The last letter of your name is " + last_letter + ".");

        input.close();
    }
}
