package pertemuan11;

public class AbstractMain {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(10);
        Tabung tabung = new Tabung(10, 5);

        System.out.println("= Lingkaran ==");
        lingkaran.info();
        System.out.println("luas:" + lingkaran.luas());

        System.out.println("\n== Tabung ==");
        tabung.info();
        System.out.println("luas:" + tabung.luas());
    }
}