package day5;

public class Main {
public static void main(String[] args) {
 
   SavingsAcc savingsAccount = new SavingsAcc(1001, 1500.0, 0.03); 
   CurrentAcc currentAccount = new CurrentAcc(2001, 2500.0); 
   savingsAccount.deposit(500.0);
   savingsAccount.withdraw(200.0);
   double savingsBalance = savingsAccount.balance();
   System.out.println("Current balance (Savings Account #" + savingsAccount.getAccountNumber() + "): " + savingsBalance);

   double savingsInterest = savingsAccount.calculateInterest();
   System.out.println("Interest accrued (Savings Account #" + savingsAccount.getAccountNumber() + "): " + savingsInterest);

   System.out.println();
   
   currentAccount.deposit(1000.0);
   currentAccount.withdraw(3000.0);
   double currentBalance = currentAccount.balance();
   System.out.println("Current balance (Current Account #" + currentAccount.getAccountNumber() + "): " + currentBalance);
}
}
