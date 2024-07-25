/*package practice;

import java.util.Random;

class Account{
	long accNum;
	double balance;
	Person accHolder;
	public Account(long accNum, double balance, Person accHolder) {
		this.accNum=accNum;
		this.balance=balance;
		this.accHolder=accHolder;
	}
	public void setAccNum(long accNum) {
		this.accNum=accNum;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder=accHolder;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	private long generateAccountNumber() {
		Random random=new Random();
		
		return random.nextLong(9000)+1000;
	}
	
	public void deposit(double amount) {
		balance +=amount;
		System.out.println("Deposited: INR "+amount);
		System.out.println("Current Balance for "+accHolder+": INR "+balance);
	}
	
	public void withdraw(double amount) {
		if(balance>=amount) {
			balance-=amount;
			System.out.println("Withdrawn: INR "+amount);
			System.out.println("Current Balance for "+accHolder);			
		}else {
			System.out.println("Insufficient balance for "+accHolder);
		}
	}
	public void display() {
		System.out.println("Account Number: "+ accNum);
		System.out.println("Account Holder: "+ accHolder);
		System.out.println("Current Balance: INR "+ balance);
	}
	public String toString() {
		return "BankAccount{"+ "accNum="+ accNum + ", accHolder= '"+ accHolder +'\''+", balance= INR " + balance+'}';
	}
	
}
class Person{
	String name;
	float age;
	public Person(String name, float age) {
		this.name=name;
		this.age=age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(float age) {
		this.age=age;
	}
	public float getAge() {
		return age;
	}
public class AccountDetails {

	public static void main(String[] args) {
		Account smithAccount = new Account("Smith", 2000);
        Account kathyAccount = new Account("Kathy", 3000);
        
        smithAccount.deposit(2000);

        // Withdraw 2000 INR from Kathy's account
        kathyAccount.withdraw(2000);

        // Display updated balances
        System.out.println("\nUpdated Balances:");
        smithAccount.display();
        kathyAccount.display();

        // Display account details using toString()
        System.out.println("\nAccount Details:");
        System.out.println(smithAccount);
        System.out.println(kathyAccount);

	}

}
}*/
