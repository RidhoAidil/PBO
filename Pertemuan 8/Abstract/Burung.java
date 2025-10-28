package Abstract;
public class Burung extends Hewan {
    /* Constructor */
    public Burung(String nama, int jumlahKaki, boolean bisaTerbang) {
        super(nama, jumlahKaki, bisaTerbang);
    }
    
    /* Implementasi  abstact method bersuara dari kelas Hewan */
    @Override
    public void bersuara() {
        System.out.println("Kwak kwak");
    }
}
