package pertemuan9;

public class Anjing extends Hewan {
    public Anjing(String nama, String jenis, String warnaBulu) {
        super(nama, jenis);
    }
    
    @Override
    public void bersuara() {
        System.out.println("Guk guk!");
    }
    
    public void menggonggong() {
        System.out.println("Anjing menggonggong dengan keras");
    }
}
