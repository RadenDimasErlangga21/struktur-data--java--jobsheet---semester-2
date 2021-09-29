
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;

public class PencarianMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] jmlArr = new double[7];
        for (int i = 0; i < jmlArr.length; i++) {
            System.out.print("Masukkan nilai array ke-" + (i + 1) + ": ");
            jmlArr[i] = sc.nextDouble();
        }
        double[] data = {jmlArr[0], jmlArr[1], jmlArr[2], jmlArr[3], jmlArr[4], jmlArr[5], jmlArr[6]};
        OrderedSearch os = new OrderedSearch(data);
        System.out.println("Isi elemen array:");
        os.tampilkan();
        double key = 3.12;
        int index = os.cari(key);
        if (index != -1) {
            System.out.println("Data " + key + " pada index " + (index + 1));
        } else {
            System.out.println("Data " + key + " tidak ditemukan");
        }
    }
}
