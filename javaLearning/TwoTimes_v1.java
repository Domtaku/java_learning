import java.util.Scanner; //imports scanner which takes user input

public class TwoTimes_v1 {
    public static void main(String []args){
        Scanner integer = new Scanner(System.in);
        //Reads in a number
        System.out.print("Enter a number: ");
        int num = integer.nextInt(); 

        //gets the result
        int result = num * 2;
        //prints out the result
        System.out.println("Times two is: " + result);
        integer.close();
    }
}
