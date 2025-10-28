package Abstract;
public class Main {
    /* Main method */
    public static void main(String[] args) {
        /* Membuat objek hewan */
        Hewan s = new Sapi("Sapi Derman", 2, true);
        Hewan b = new Burung("Burung Gagak", 2, true);

        /* Memanggil method bersuara */
        s.bersuara();
        b.bersuara();
    }
}
