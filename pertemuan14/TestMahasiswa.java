package pertemuan14;

//TestMahasiswa.java
public class TestMahasiswa {
 public static void main(String[] args) {
     Mahasiswa mhs1 = new Mahasiswa("123456", "Asep");
     Mahasiswa mhs2 = new Mahasiswa("654321", "Cecep");
     Mahasiswa mhs3 = new Mahasiswa("987654", "Putri");

     System.out.println("=== Informasi Mahasiswa ===");
     mhs1.displayInfo();
     System.out.println();
     mhs2.displayInfo();
     System.out.println();
     mhs3.displayInfo();

     System.out.println("\nTotal Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
     System.out.println("Maksimum SKS untuk semua mahasiswa: " + Mahasiswa.MAX_SKS);
 }
}