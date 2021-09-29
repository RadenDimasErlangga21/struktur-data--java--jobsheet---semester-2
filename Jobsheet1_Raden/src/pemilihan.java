
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;

public class pemilihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tugas, uts, uas, maxtugas, maxuts, maxuas;
        double total;
        System.out.println("#=== program menghitung nilai akhir ===#");
        System.out.print("Masukkan Nilai Tugas : ");
        tugas = input.nextInt();
        System.out.print("Masukkan Nilai UTS   : ");
        uts = input.nextInt();
        System.out.print("Masukkan Nilai UAS   : ");
        uas = input.nextInt();
        maxtugas = (tugas * 20 / 100);
        maxuts = (uts * 35 / 100);
        maxuas = (uas * 45 / 100);
        total = (maxtugas + maxuts + maxuas);
        if (total >= 80 && total <= 100) {
            System.out.println("=====================");
            System.out.printf("nilai akhir : %4.1f %n", total);
            System.out.println("nilai huruf :A");
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("# Selamat anda LULUS #");
        } else if (total >= 73 && total < 80) {
            System.out.println("=====================");
            System.out.printf("nilai akhir : %4.1f %n", total);
            System.out.println("nilai huruf :B+");
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("# Selamat anda LULUS #");
        } else if (total >= 65 && total < 73) {
            System.out.println("=====================");
            System.out.printf("nilai akhir : %4.1f %n", total);
            System.out.println("nilai huruf :B");
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("# Selamat anda LULUS #");
        } else if (total >= 60 && total < 65) {

            System.out.println("=====================");
            System.out.printf("nilai akhir : %4.1f %n", total);
            System.out.println("nilai huruf :C+");
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("# Selamat anda LULUS #");
        } else if (total >= 50 && total < 60) {

            System.out.println("=====================");
            System.out.printf("nilai akhir : %4.1f %n", total);
            System.out.println("nilai huruf :C");
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("# Selamat anda LULUS #");
        } else if (total >= 39 && total < 50) {
            System.out.println("=====================");
            System.out.printf("nilai akhir : %4.1f %n", total);
            System.out.println("nilai huruf :D");
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("# mohon maaf anda tidak lulus #");
        } else {
            System.out.println("=====================");
            System.out.printf("nilai akhir : %4.1f %n", total);
            System.out.println("nilai huruf :E");
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("# mohon maaf anda tidak lulus #");
        }
    }
}
