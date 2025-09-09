import java.util.Scanner;

public class HitungNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Penilaian penilaian = new Penilaian();
        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();
        penilaian.main(nilai);
    }
}
