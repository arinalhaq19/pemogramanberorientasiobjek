package pertemuan14;

//TestBankAccount.java
public class TestBankAccount {
 public static void main(String[] args) {
     BankAccount account1 = new BankAccount("123456789", 1000.0);
     account1.deposit(500.0);
     account1.displayAccountInfo();

     SavingsAccount savings = new SavingsAccount("987654321", 2000.0, 2.5);
     // savings.displayAccountInfo(); // Tetap memanggil method final dari parent
     savings.displaySavingsInfo(); // Memanggil method baru yang menampilkan info tambahan
 }
}