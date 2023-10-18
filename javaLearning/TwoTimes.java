import java.util.Scanner; //imports scanner which takes user input

public class TwoTimes{
    public static void main(String []args){
        Scanner integer = new Scanner(System.in);
        //Reads in a number
        System.out.print("Enter a number: ");
        int num = integer.nextInt(); 

        //gets the result
        int result = Helper.twoTimes(num);
        //prints out the result
        System.out.println("Times two is: " + result);
        integer.close();
    }
}