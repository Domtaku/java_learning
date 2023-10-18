import java.util.Scanner;

public class Bigger{
    public static void main(String []args){
        Scanner integer = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = integer.nextInt();
        int num2 = integer.nextInt();

        if(num1 < num2){
            System.out.println(num2 + " is the biggest.");
        }
        else{
            System.out.println(num1 + " is the biggest.");
        }

        integer.close();
    }
}