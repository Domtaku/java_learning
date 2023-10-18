import java.util.Scanner;

public class EvenOdd {
    public static void main(String []args){
        Scanner integer = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = integer.nextInt();

        if(num % 2 == 1){
            System.out.println(num + " is odd.");
        }

        else{
            System.out.println(num + " is even.");
        }

        integer.close();
    }
}
