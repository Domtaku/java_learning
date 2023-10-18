import java.util.Scanner;

public class Thrice {
    public static void main(String []args){
        Scanner integer = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int n1, n2, n3, result;
        n1 = integer.nextInt();
        n2 = integer.nextInt();
        n3 = integer.nextInt();

        result = n1 * n2 * n3;

        System.out.println("The product is " + result);
        integer.close();

    }
}
