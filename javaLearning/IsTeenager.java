import java.util.Scanner;

public class IsTeenager {
    public static void main(String[] args){
        Scanner integer = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = integer.nextInt();

        if(age <= 19 && age >= 13){
            System.out.println("You are a teenager.");
        }
        else{
            System.out.println("You are not a teenager.");
        }

        integer.close();
    }
}
