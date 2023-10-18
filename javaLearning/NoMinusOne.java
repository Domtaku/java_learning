import java.util.Scanner;

public class NoMinusOne {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter numbers: ");
        int num = input.nextInt();
        int store = 0;
        while(num != -1)
        {
            store = num;
            num = input.nextInt();
        }
        input.close();
        System.out.println("The penultimate number was: " + store);
    }
}
