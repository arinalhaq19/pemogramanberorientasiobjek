package pertemuan7;

public class Main {
	public static void main(String[] args) {
//		skenario 1
		Dosen dosen1 = new Dosen("Sandhika Galih");
		Matakuliah matkul1 = new Matakuliah("Pemograman Berorientasi Objek", dosen1);
		matkul1.tampilkaInfoMatkul();
		
		System.out.println();
		
//		skenario 2
		Semester semester1 = new Semester(4);
		TranskripNilai transkrip = new TranskripNilai("Budi", semester1);
		transkrip.tampilkanTranskrip();
	}
}
