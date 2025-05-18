package tugas11;

public class Main {
    public static void main(String[] args) {
    Kendaraan m = new Mobil();
    Kendaraan s = new sepeda();

    m.nyalakan();
    m.matikan();

    s.nyalakan();
    s.matikan();
    }
}