import java.util.Scanner;

public class SquareIt {
    public static void main(String []args){
        Scanner integer = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = integer.nextInt();
        
        int result = num * num;
        System.out.println(num + " squared is " + result);
        integer.close();
    }
}
