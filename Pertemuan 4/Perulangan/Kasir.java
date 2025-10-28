import java.util.Scanner;

public class Kasir {
    private static final int MAX_ITEMS = 100;
    private Barang[] daftarBelanja;
    private int itemCount; 
    private Scanner scanner;

    public Kasir(Scanner scanner1) {
        this.daftarBelanja = new Barang[MAX_ITEMS];
        this.itemCount = 0;
        this.scanner = new Scanner(System.in);
    }

    public void tampilkanMenu() {
        System.out.println("===========================");
        System.out.println("     MENU KASIR SEDERHANA    ");
        System.out.println("===========================");
        System.out.println("1. Fitur Tambah Barang");
        System.out.println("2. Hitung Total Belanja");
        System.out.println("3. Keluar Program");
        System.out.println("===========================");
    }

    public void tambahBarang() {
        if (itemCount >= MAX_ITEMS) {
            System.out.println("Keranjang belanja penuh. Tidak dapat menambahkan barang lagi.");
            return;
        }

        System.out.print("Masukkan nama barang: ");
        String nama = scanner.next();
        double harga = -1;
        while (harga < 0) {
            try {
                System.out.print("Masukkan harga barang: ");
                harga = scanner.nextDouble();
                if (harga < 0) {
                    System.out.println("Harga tidak boleh negatif. Silakan coba lagi.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan angka.");
                scanner.next();
                harga = -1;
            }
        }
        daftarBelanja[itemCount] = new Barang(nama, harga);
        itemCount++; 
        System.out.println("Barang berhasil ditambahkan!");
    }

    public void hitungTotal() {
        if (itemCount == 0) {
            System.out.println("Keranjang belanja kosong. Silakan tambahkan barang terlebih dahulu.");
            return;
        }

        double total = 0;
        System.out.println("===========================");
        System.out.println("         RINCIAN BELANJA     ");
        System.out.println("===========================");
        for (int i = 0; i < itemCount; i++) {
            System.out.printf("- %s: Rp. %.2f%n", daftarBelanja[i].getNama(), daftarBelanja[i].getHarga());
            total += daftarBelanja[i].getHarga();
        }
        System.out.println("---------------------------");
        System.out.printf("TOTAL BELANJA: Rp. %.2f%n", total);
        System.out.println("===========================");
    }
    
    public void tutupScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}