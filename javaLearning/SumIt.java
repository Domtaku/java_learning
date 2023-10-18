import java.util.Scanner;

public class SumIt {
    public static void main(String []args){
        Scanner integer = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = integer.nextInt();
        int num2 = integer.nextInt();

        int result = num1 + num2;
        System.out.println(num1 + " and " + num2 + " is " + result);

        integer.close();
    }
}
