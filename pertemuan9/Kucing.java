package pertemuan9;

public class Kucing extends Hewan {
    private int jumlahKaki;
    
    public Kucing(String nama, String jenis, int jumlahKaki) {
        super(nama, jenis);
        this.jumlahKaki = jumlahKaki;
    }
    
    @Override
    public void bersuara() {
        System.out.println("Meong meong!");
    }
    
    public void berjalan() {
        System.out.println("Kucing berjalan dengan " + jumlahKaki + " kaki");
    }
}
