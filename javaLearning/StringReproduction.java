import java.util.Scanner;

public class StringReproduction {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer and a string: ");
        
        int num = input.nextInt();
        
        String word = input.next();

        input.close();
        
        for(int i = 0; i < num; i++){
            System.out.print(word);
        }

        System.out.println();
    }
}
