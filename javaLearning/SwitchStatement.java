import java.util.Scanner;

public class SwitchStatement{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a command");
        String text = input.nextLine();

        switch(text){
            case "start":
                System.out.println("System booting\n... \n....\nSystem Online");
                break;
            
                case "stop":
                    System.out.println("System closing");
                    break;
            
            default:
                System.out.println("Command not recognized. Please enter another command.");
        }
        input.close();
    }
}
