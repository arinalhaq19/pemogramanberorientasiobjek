package pertemuan9;

public class Burung extends Hewan {
    private boolean bisaTerbang;
    
    public Burung(String nama, String jenis, boolean bisaTerbang) {
        super(nama, jenis);
        this.bisaTerbang = bisaTerbang;
    }
    
    @Override
    public void bersuara() {
        System.out.println("Cuit cuit!");
    }
    
    public void terbang() {
        if (bisaTerbang) {
            System.out.println("Burung sedang terbang");
        } else {
            System.out.println("Burung ini tidak bisa terbang");
        }
    }
}