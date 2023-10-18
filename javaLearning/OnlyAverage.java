import java.util.Scanner;

public class OnlyAverage {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int num = input.nextInt(); //reads the amount of numbers

        System.out.print("Enter " + num + " numbers: ");
        double sum = 0.0; 
        for (int i = 0; i < num; i++) {
            double n = input.nextDouble();
            sum += n; 
        }

        double average = sum / num;

        System.out.println("The average is " + average); //outputs the average
        input.close();
    }
}
