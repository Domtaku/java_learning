import java.util.Scanner;

public class NumToTwenty_while {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int i = num;
        while(i <= 20){
            System.out.print(i + " ");
            i += 1;
        }
        System.out.println();
        input.close();
    }
}
