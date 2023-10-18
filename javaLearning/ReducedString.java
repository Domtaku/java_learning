import java.util.Scanner;

public class ReducedString {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer and a string: ");
        int num = input.nextInt();
        String s = input.next();

        String reduced_string = s.substring(0, num) + s.substring(num + 1);

        System.out.println(reduced_string);

        input.close();
    }
}
