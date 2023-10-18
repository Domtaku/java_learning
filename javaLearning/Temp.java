import java.util.Scanner;

public class Temp {
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Give me a Farenheit temperature: ");
        double temp = input.nextDouble();

        temp = Convert.fahr2cels(temp);

        System.out.println("In Celsius that would be: " + temp);

        input.close();
    }
}
