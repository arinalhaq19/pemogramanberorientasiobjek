package pertemuan14;

//BankAccount.java
public class BankAccount {
 private final String accountNumber;
 private double balance;

 public BankAccount(String accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
     }
 }

 public final void displayAccountInfo() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: $" + balance);
 }
}