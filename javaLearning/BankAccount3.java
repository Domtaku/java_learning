public class BankAccount3 {
   double balance;

   public BankAccount3(double n){
       balance = n;
   }

   public void withdraw(double n){
       balance = balance - n;
   }
}
