//Assignment-8 : 16 June 2020
//Banking System

// Create a Banking System which has following functionality.

// Create two object to perform below scenario.
// 1) Method to debit amount
// 2) Method to credit amount
// 3) Method to printBalance [it will print current balance]
// 4) individualTransactionSummary() method should show how many times individually debit, credit & printBalance method called .
// Hint : Create 3 non static instance variable.
// Output:
// user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
// user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

// 5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
// Hint : Create 3 static variable will be required.
// Output:
// All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time 

package assignments;

public class StaticBankSystem {
	
	static int countDebit;
	static int countcredit;
	static int printStatment;
	static int countuser;
	
	 int countDbt;
	 int countCdt;
	 int printstat;
	 int balance;
	 
	 void setInitialBalance(int amount)
	 {
		 countuser++;
		 balance = amount;
		 System.out.println("Initial Balance of user"+countuser+" : "+balance);
		
	 }
	 
	void debitAmount(int debitAmt) 
	{
		if(balance < debitAmt)
		{
			System.out.println("insufficient balance");
		}
		else
		{
			balance -= debitAmt;
			System.out.println("Avilable balance of user"+countuser+" is : "+balance);
			countDbt++;
			countDebit++;
		}
			
	}
	
	void creditAmount(int creditAmt)
	{
		balance += creditAmt;
		countCdt++;
		countcredit++;
	}
	
	void printBalance()
	{
		System.out.println("Available balance of user"+countuser+" is : "+balance);
		printstat++;
		printStatment++;
	}
	
	void individualTransactionSummary()
	{
		System.out.println("User"+countuser+" numbers of Debits is : "+countDbt);
		System.out.println("User"+countuser+" numbers of credits is : "+countCdt);
		System.out.println("User"+countuser+" print statement count : "+printstat);
	}
	
	void allTransactionSummary()
	{
		System.out.println("User"+countuser+" Number of Credits"+countDebit);
		System.out.println("User"+countuser+" Number of Credits"+countcredit);
		System.out.println("User"+countuser+" Print statement count :"+printStatment);
		
	}
	
	public static void main(String[] args)
	{
		StaticBankSystem staticbanksystem1 = new StaticBankSystem();
		staticbanksystem1.setInitialBalance(15000);
		staticbanksystem1.debitAmount(5000);
		staticbanksystem1.creditAmount(2000);
		staticbanksystem1.debitAmount(1000);
		staticbanksystem1.creditAmount(12000);
		staticbanksystem1.creditAmount(20000);
		staticbanksystem1.printBalance();
		staticbanksystem1.individualTransactionSummary();
		staticbanksystem1.allTransactionSummary();
		System.out.println(" ");
		StaticBankSystem staticbanksystem2 = new StaticBankSystem();
		staticbanksystem2.setInitialBalance(20000);
		staticbanksystem2.debitAmount(3000);
		staticbanksystem2.creditAmount(2000);
		staticbanksystem2.printBalance();
		staticbanksystem2.individualTransactionSummary();
		staticbanksystem2.allTransactionSummary();
		
	}

}
