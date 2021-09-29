
package Praktikum2;
/**
 * # nim : 2031710121 
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;
public class StackMain {
    public static void main(String[] args) {
        Stack st = new Stack(8);
        Scanner sc = new Scanner (System.in);
        char pilih;
        do { 
            System.out.print("Judul: ");
            String judul = sc.nextLine();
            System.out.print("Nama Pengarang: ");
            String nama = sc.nextLine();
            System.out.print("Tahun Terbit: ");
            int tahun = sc.nextInt();
            System.out.print("Jumlah Halaman: ");
            int jml = sc.nextInt();
            System.out.print("harga: ");
            int hrg = sc.nextInt();

            Buku bk = new Buku(judul, nama, tahun, jml, hrg); 
            do {
                System.out.println("-------------------------------------");
                System.out.println("Pilih Menu untuk melakukan command : ");
                System.out.println("1.Push");
                System.out.println("2.Pop");
                System.out.println("3.Peek");
                System.out.println("4.Print");
                System.out.print("masukkan pilihan method : ");
                int pilihan = sc.nextInt();
                if (pilihan == 1) {
                    st.push(bk);
                }
                else if (pilihan == 2) { 
                    st.pop();
                }
                else if (pilihan == 3){
                    st.peek();
                }
                else if (pilihan == 4){
                    st.print();
                }
                else {
                    System.out.println("silahkan masukkan nomor yang benar");
                }
                System.out.print("Apakah Anda ingin menambahkan command lagi? (y/n)");
                pilih = sc.next().charAt(0);
                sc.nextLine();
            } while (pilih == 'y');

            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)");
            pilih = sc.next().charAt(0);
            sc.nextLine();
        } while (pilih == 'y');
        st.print();
    }
}
