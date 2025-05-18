package pertemuan6;

public class mahasiswa {
    private String NRP;
    private String nama;

    public mahasiswa() {
        // TODO Auto-generated constructor stub
    }

    public mahasiswa(String nRP, String nama) {
        super();
        NRP = nRP;
        this.nama = nama;
    }
    
    public String display() {
        return "NRP: "+ NRP+ ", Nama: "+ nama;
    }

    /* Setter & Getter */
    public String getNRP() {
        return NRP;
    }

    public void setNRP(String nRP) {
        NRP = nRP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
