package Abstract;
public class Sapi extends Hewan {
    /* Constructor */
    public Sapi(String nama, int jumlahKaki, boolean bisaTerbang){
        super(nama, jumlahKaki, bisaTerbang);
    }

    /* Implementasi abstract method bersuara dari kelas Hewan */
    @Override
    public void bersuara(){
        System.out.println("Moo");
    }
}

