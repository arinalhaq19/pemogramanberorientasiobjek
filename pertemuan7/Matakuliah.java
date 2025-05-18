package pertemuan7;

public class Matakuliah {
	private String namaMatkul;
	private Dosen dosenPengampu;
	
	public Matakuliah(String namaMatkul, Dosen dosenPengampu) {
		this.namaMatkul = namaMatkul;
		this.dosenPengampu = dosenPengampu;
	}
	
	public void tampilkaInfoMatkul() {
		System.out.println("Mata kuliah: " + namaMatkul);
		System.out.println("Dosen Pengampu: " + dosenPengampu.getNama());
	}
}
