import java.util.Scanner;

public class DoubleDivision {
    public static void main(String []args){
        Scanner integer = new Scanner(System.in);

        System.out.print("Please enter two floating point numbers: ");
        double num1, num2;
        num1 = integer.nextDouble();
        num2 = integer.nextDouble();

        double result = num1 / num2;

        System.out.println(num1 + " / " + num2 + " is " + result);

        integer.close();
    }
}
