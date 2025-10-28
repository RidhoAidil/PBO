public class Array {
    public static void main(String[] args) {
        String [][] negaraIbukota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Amerika", "Washington DC"}
        };
        System.out.println("Ibukota " + negaraIbukota[0][0] + " adalah " + negaraIbukota[0][1]);
        System.out.println("Ibukota " + negaraIbukota[1][0] + " adalah " + negaraIbukota[1][1]);
        System.out.println("Ibukota " + negaraIbukota[2][0] + " adalah " + negaraIbukota[2][1]);

        for (int i = 0; i < negaraIbukota.length; i++) {
            System.out.println("Ibukota " + negaraIbukota[i][0] + " adalah " + negaraIbukota[i][1]);
        }
    } 
}
