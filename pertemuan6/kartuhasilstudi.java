package pertemuan6;

import java.util.ArrayList;
import java.util.List;

public class kartuhasilstudi {
    private String semester;
    private double ips;
    private List<MataKuliah> daftarMatakuliah;
    
    public kartuhasilstudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }
    
    public void addMatakuliah(MataKuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }
    
    public String display() {
        StringBuilder sb = new StringBuilder();
        for (MataKuliah mk : daftarMatakuliah) {
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public void hitungIPS() {
        double totalBobot = 0.0;
        int totalSKS = 0;
        
        for (MataKuliah mk : daftarMatakuliah) {
            totalBobot += mk.getNilaiIndex() * mk.getSks();
            totalSKS += mk.getSks();
        }
        
        if (totalSKS > 0) {
            ips = totalBobot / totalSKS;
        } else {
            ips = 0.0;
        }
    }
    
    /* Setter & Getter */
    public String getSemester() {
        return semester;
    }

    public double getIps() {
        return ips;
    }

    public List<MataKuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }
}