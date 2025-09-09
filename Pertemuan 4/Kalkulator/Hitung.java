import java.util.Scanner;

public class Hitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan angka pertama: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Hasil penjumlahan: " + kalkulator.tambah(a, b));
                break;
            case 2:
                System.out.println("Hasil pengurangan: " + kalkulator.kurang(a, b));
                break;
            case 3:
                System.out.println("Hasil perkalian: " + kalkulator.kali(a, b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Kesalahan: Tidak bisa membagi dengan nol.");
                } else {
                    System.out.println("Hasil pembagian: " + kalkulator.bagi(a, b));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
            }
    }
}