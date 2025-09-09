public class Penilaian {
    public void main(int nilai) {
        if (100 >= nilai && nilai >= 85) {
            System.out.println("Lulus");
        } else if (84 >= nilai && nilai >= 70) {
            System.out.println("Lulus");
        } else if (69 >= nilai && nilai >= 60) {
            System.out.println("Lulus");
        } else if (59 >= nilai && nilai >= 50){
            System.out.println("Tidak Lulus");
        } else if (49 >= nilai && nilai >= 0){
            System.out.println("Tidak Lulus");
        }
    }
}