/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga 
 */
import java.util.Scanner;
public class perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    String hariHari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
    System.out.println("# program perulangan untuk menampilkan hari #");
    System.out.println("#===    dari dua digit belakang NIM      ===#");
    System.out.print("masukkan nim anda : ");
        int nim = input.nextInt();
        int n = nim % 100;
        if (n < 10){
            n+=10;
        }
        for (int i=0; i<n; i++){
            System.out.print(hariHari[i%7] + " ");
        }
        System.out.println();
    }
}