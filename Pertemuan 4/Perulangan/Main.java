import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Kasir kasir = new Kasir(scanner);
        
        int pilihan;
        
        do {
            kasir.tampilkanMenu();
            System.out.print("Masukkan pilihan Anda: ");
            
            try {
                pilihan = scanner.nextInt();
                
                switch (pilihan) {
                    case 1:
                        kasir.tambahBarang();
                        break;
                    case 2:
                        kasir.hitungTotal();
                        break;
                    case 3:
                        System.out.println("Terima kasih telah menggunakan program kasir.");
                        scanner.close(); 
                        return;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                        break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.next(); 
                pilihan = 0; 
            }
            
            System.out.println(); 
        } while (true);
    }
}