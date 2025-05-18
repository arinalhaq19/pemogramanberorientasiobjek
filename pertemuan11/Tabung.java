package pertemuan11;

public class Tabung extends Bentuk {
    private int tinggi;

    public Tabung(int jari2, int tinggi) {
        super(jari2);
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
    	return 2 * Math.PI * jari2 * (jari2 + tinggi);
    }

    public void info() {
        System.out.println("jarl2: " + jari2 + ", Tinggi:" + tinggi);
    }

    // Getter & Setter
    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}