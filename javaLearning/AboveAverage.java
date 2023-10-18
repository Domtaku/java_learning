import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int num = input.nextInt(); //reads the amount of numbers

        double [] numbers = new double[num];

        System.out.print("Enter " + num + " numbers: ");
        double sum = 0.0; 

        for (int i = 0; i < num; i++) {
            double n = input.nextDouble();
            numbers[i] = n;
            sum += n; 
        }

        double average = sum / num;
        //int count = 0;
        System.out.println("The above average numbers are:");
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > average){
                System.out.print(" " + numbers[i]);
            }
        }

        System.out.println();
        input.close();
    }
}