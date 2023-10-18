import java.util.Scanner;

public class Reverse {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int num = input.nextInt();
        int [] numbers = new int[num];

        System.out.print("Enter " + num + " numbers: ");

        for (int i = 0; i < num; i++) {
            int n = input.nextInt();
            numbers[i] = n;
        }

        for(int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        input.close();
    }
}
