package pertemuan9;

public class Hewan {
    protected String nama;
    protected String jenis;
    
    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getJenis() {
        return jenis;
    }
}