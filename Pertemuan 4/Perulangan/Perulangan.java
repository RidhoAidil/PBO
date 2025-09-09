public class Perulangan {
    public static void main(String[] args) {
        System.out.println("Perulangan for");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Perulangan ke-" + i);
        }

        System.out.println("\nPerulangan while");
        int i = 1;
        while (i <= 10) {
            System.out.println("Perulangan ke-" + i);
            i++;
        }

        System.out.println("\nPerulangan do while");
        int j = 1;
        do {
            System.out.println("Perulangan ke-" + j);
            j++;
        } while (j <= 10);
    }
}
