import java.util.Scanner;

public class HowManyNumbers {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int num = input.nextInt();
        int count = 0;
        while(num != -1)
        {
            num = input.nextInt();
            count++;
        }

        System.out.println(count + " numbers were entered.");
        input.close();
    }
}
