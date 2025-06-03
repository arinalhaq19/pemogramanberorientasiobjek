package pertemuan14;

//DatabaseConnection.java
public class DatabaseConnection {
 public static String connectionString;

 static {
     // Inisialisasi kompleks bisa dilakukan di sini
     String host = "localhost";
     String port = "5432";
     String dbName = "my_database";
     connectionString = "jdbc:postgresql://" + host + ":" + port + "/" + dbName;
     System.out.println("Static block executed: Database connection initialized");
 }
}