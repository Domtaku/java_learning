import java.util.Scanner;

public class Absolute {
    public static void main(String []args){
        Scanner integer = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = integer.nextInt();
        int absolute;
        if(num < 0){
            absolute = num * -1;
        }
        else{
            absolute = num;
        }

        System.out.println("The absolute value is " + absolute + ".");

        integer.close();
    }
}
