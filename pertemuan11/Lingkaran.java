package pertemuan11;

public class Lingkaran extends Bentuk {
    public Lingkaran(int jari2) {
        super(jari2);
    }

    @Override
    public double luas() {
        return PHI * jari2 * jari2; // Menggunakan PHI dari parent class (3.14)
    }

    public void info() {
        System.out.println("jarl2: " + jari2);
    }
}