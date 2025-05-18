package pertemuan4;

//Buat class Student
public class Student {
	
	private String nrp;
	public static void main(String[] args) {
		    	
		// Buat objek Student x dan y
			Student x = new Student();
		    Student y = x;
		        
		// Set nrp x menjadi 01
		    x.setNrp("01");
		        
		// Set nrp y menjadi 02
		    y.setNrp("02");

		// Cetak nrp x dan y
		    System.out.println(x.getNrp());
		        
		// Buat Objek z dengan nrp 03
		    Student z = new Student();
		    z.setNrp("03");
		        
		// Set x menjadi z
		     x = z;
		        
		// outprint nrp x dan y
		    System.out.println(x.getNrp());
		    System.out.println(y.getNrp());
		    }
		    
		    // Buat method setNrp
		    public void setNrp(String nrp) {
		        this.nrp = nrp;
		    }

		    // Buat method getNrp
		    public String getNrp() {
		        return nrp;
		    }
}


