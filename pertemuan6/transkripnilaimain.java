package pertemuan6;

public class transkripnilaimain {
    public static void main(String[] args) {
        // Create objek matakuliah
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

        // Create objek KHS
        kartuhasilstudi khs = new kartuhasilstudi("20222");
        khs.addMatakuliah(mk1);
        khs.addMatakuliah(mk2);
        khs.addMatakuliah(mk3);

        // Create Objek Mahasiswa
        mahasiswa mhs = new mahasiswa("303040001", "Jhon");

        // Create objek TranskripNilai
        transkripnilai transkrip = new transkripnilai(mhs);
        transkrip.addKHS(khs);
        transkrip.hitungIPK(); // Menghitung IPK sebelum menampilkan
        transkrip.display();
    }
}
