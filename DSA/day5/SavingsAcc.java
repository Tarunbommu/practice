package day5;

//AccountOperations.java
interface AccountOperations {

 // Deposit amount into account
 void deposit(double amount);

 // Withdraw amount from account
 void withdraw(double amount);

 // Check balance of account
 double balance();
}

//SavingsAcc.java
class SavingsAcc implements AccountOperations {

 private int accountNumber;
 private double balance;
 private double interestRate;

 // Constructor to initialize account number, balance, and interest rate
 public SavingsAcc(int accountNumber, double initialBalance, double interestRate) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
     this.interestRate = interestRate;
 }

 // Implementing interface methods

 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited " + amount + " into savings account #" + accountNumber);
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn " + amount + " from savings account #" + accountNumber);
     } else {
         System.out.println("Insufficient funds.");
     }
 }

 @Override
 public double balance() {
     return balance;
 }

 // Calculate interest based on current balance and interest rate
 public double calculateInterest() {
     double interest = balance * interestRate;
     System.out.println("Interest accrued for savings account #" + accountNumber + ": " + interest);
     return interest;
 }

 
 public int getAccountNumber() {
     return accountNumber;
 }
}

class CurrentAcc implements AccountOperations {

 private int accountNumber;
 private double balance;


 public CurrentAcc(int accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
 }

 // Implementing interface methods

 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited " + amount + " into current account #" + accountNumber);
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn " + amount + " from current account #" + accountNumber);
     } else {
         System.out.println("Insufficient funds.");
     }
 }

 @Override
 public double balance() {
     return balance;
 }

 // Getter method for account number
 public int getAccountNumber() {
     return accountNumber;
 }
}

