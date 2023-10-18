public class BankAccount4 {
    double balance;

   public BankAccount4(double n){
       balance = n;
   }

   public void withdraw(double n){
       balance = balance - n;
   }

   public void deposit(double n){
       balance = balance + n;
   }

   public void toString(double n){
       System.out.println("The balance is ");
   }
}
