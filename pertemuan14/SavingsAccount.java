package pertemuan14;

//SavingsAccount.java
public class SavingsAccount extends BankAccount {
 private double interestRate;

 public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
     super(accountNumber, initialBalance);
     this.interestRate = interestRate;
 }

 // Error: Cannot override the final method from BankAccount
 /*
 @Override
 public void displayAccountInfo() {
     super.displayAccountInfo();
     System.out.println("Interest Rate: " + interestRate + "%");
 }
 */

 // Solusi: Membuat method baru untuk menampilkan informasi tambahan
 public void displaySavingsInfo() {
     displayAccountInfo(); // Memanggil method final dari parent class
     System.out.println("Interest Rate: " + interestRate + "%");
 }
}