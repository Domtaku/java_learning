import java.util.Scanner;

public class Cent2Fahr {
    public static void main(String []args){
        Scanner integer = new Scanner(System.in);

        System.out.print("Enter a temperature in Centigrade: ");
        int f = integer.nextInt();
        
        double result = (double) f * 9/5 + 32 ;
        System.out.print("Temperature in Farenheit is " + result);
        integer.close();
    }
}
