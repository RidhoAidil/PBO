package Abstract;
public abstract class Hewan {
    private String nama;
    private int jumlahKaki;
    private boolean bisaTerbang;

    /* Constructor */
    public Hewan(String nama, int jumlahKaki, boolean bisaTerbang) {
        this.nama = nama;
        this.jumlahKaki = jumlahKaki;
        this.bisaTerbang = bisaTerbang;
    }

    public void isHewan(){

    }

    /* Abstract Method  yang wajib di-override di kelas turunannya */
    public abstract void bersuara();
}