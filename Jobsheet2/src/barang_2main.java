
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
public class barang_2main {
    public static void main(String[] args) {
        barang_2 b1 = new barang_2();
        b1.namaBarang = "Corsair 2 GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 10;
        b1.tambahStok(1);
        b1.kurangiStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = "+hargaTotal);
        barang_2 b2 = new barang_2("logitech", "wireless mouse", 25, 150000);
        b2.tampilBarang();
    } 
}