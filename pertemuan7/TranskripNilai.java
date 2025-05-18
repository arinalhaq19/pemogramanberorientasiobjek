package pertemuan7;

public class TranskripNilai {
	private String namaMahasiswa;
	private Semester semester;
	
	public TranskripNilai(String namaMahasiswa, Semester semester) {
		this.namaMahasiswa = namaMahasiswa;
		this.semester = semester;
	}
	
	public void tampilkanTranskrip() {
		System.out.println("Nama Mahasiswa: " + namaMahasiswa);
		System.out.println("Semester: " + semester.getNomor());
	}
}
