public class MobilBaru {
    public static void main(String[] args) {
        Mobil mobilgua = new Mobil();

        mobilgua.merk = "Ferari";
        mobilgua.warna = "Merah";
        mobilgua.tipe = "Sport";
        mobilgua.tahunProduksi = 2019;
        mobilgua.harga = 20000000;

        System.out.println("Mobil Baru Gua Tuh");
        System.out.println("Merk: " + mobilgua.merk);
        System.out.println("Warna: " + mobilgua.warna);
        System.out.println("Tipe: " + mobilgua.tipe);
        System.out.println("Tahun Produksi: " + mobilgua.tahunProduksi);
        System.out.println("Harga: " + mobilgua.harga);

        mobilgua.gadai();
    }
}
