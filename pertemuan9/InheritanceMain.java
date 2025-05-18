package pertemuan9;

public class InheritanceMain {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Tom", "Anggora", 4);
        Anjing anjing = new Anjing("Spike", "Bulldog", "Coklat");
        Burung burung = new Burung("Tweety", "Kenari", true);
        
        System.out.println("=== Informasi Hewan ===");
        System.out.println("Kucing: " + kucing.getNama() + " - Jenis: " + kucing.getJenis());
        System.out.println("Anjing: " + anjing.getNama() + " - Jenis: " + anjing.getJenis());
        System.out.println("Burung: " + burung.getNama() + " - Jenis: " + burung.getJenis());
        
        System.out.println("\n=== Suara Hewan ===");
        kucing.bersuara();
        anjing.bersuara();
        burung.bersuara();
        
        System.out.println("\n=== Aktivitas Hewan ===");
        kucing.berjalan();
        anjing.menggonggong();
        burung.terbang();
    }
}
