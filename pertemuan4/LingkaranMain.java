package pertemuan4;

public class LingkaranMain {
	    public static void main(String[] args) {
	        
	    	// Lingkaran 11 dengan jari-jari 5
	        Lingkaran lingkaran11 = new Lingkaran(5);
	        
	        // Lingkaran 12 dengan jari-jari sama dengan Lingkaran l1
	        Lingkaran lingkaran12 = lingkaran11;
	        
	        // Cetak jari-jari Lingkaran l1 dan l2
	        System.out.println(lingkaran11.getJari2()); //5
	        System.out.println(lingkaran12.getJari2()); //5
	        
	        // Set lingkaran l2 menjadi 4
	        ubahJari2(lingkaran12);
	        
	        // out print jari-jari Lingkaran l1 dan l2
	        System.out.println(lingkaran11.getJari2()); //4
	        System.out.println(lingkaran12.getJari2()); //4
	    }

	    // Method ubah Jari2
	    public static void ubahJari2(Lingkaran obj) {
	        obj.setJari2(4);
	    }
}
