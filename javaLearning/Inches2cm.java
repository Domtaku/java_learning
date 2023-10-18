import java.util.Scanner;

public class Inches2cm {
    public static void main(String []args){
        Scanner num = new Scanner(System.in);

        System.out.print("Please enter a quantity in inches: ");
        int inches = num.nextInt();

        double centimeters = inches * 2.54;
        System.out.println(inches + " inch is " + centimeters + " cm");
        num.close();
    }    
}
