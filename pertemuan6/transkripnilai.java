package pertemuan6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class transkripnilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<kartuhasilstudi> kartuHasilStudi;
    private mahasiswa mahasiswa;

    public transkripnilai(mahasiswa mahasiswa) {
        super();
        this.mahasiswa = mahasiswa;
        kartuHasilStudi = new ArrayList<kartuhasilstudi>();
        tglCetak = new Date();
    }

    public void hitungIPK() {
        double totalBobot = 0.0;
        int totalSKS = 0;
        
        for (kartuhasilstudi khs : kartuHasilStudi) {
            khs.hitungIPS();
            for (MataKuliah mk : khs.getDaftarMatakuliah()) {
                totalBobot += mk.getNilaiIndex() * mk.getSks();
                totalSKS += mk.getSks();
            }
        }
        
        if (totalSKS > 0) {
            ipk = totalBobot / totalSKS;
        } else {
            ipk = 0.0;
        }
    }

    public void addKHS(kartuhasilstudi khs) {
        kartuHasilStudi.add(khs);
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: "+ tglCetak.toString());
        System.out.println("IPK: "+ ipk);
        for (kartuhasilstudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }

    /* Setter & Getter */
    public Date getTglCetak() {
        return tglCetak;
    }

    public double getIpk() {
        return ipk;
    }

    public List<kartuhasilstudi> getKartuHasilStudi() {
        return kartuHasilStudi;
    }

    public mahasiswa getMahasiswa() {
        return mahasiswa;
    }
}
