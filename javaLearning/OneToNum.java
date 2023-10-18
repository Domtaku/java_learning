import java.util.Scanner;

public class OneToNum {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        input.close();
    }
}
