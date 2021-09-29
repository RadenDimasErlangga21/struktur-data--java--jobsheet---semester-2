package insertionSortTest;

/**
 * # nim : 2031710121 
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;
public class InsertionMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai jumlah array : ");
        int jumlahArray = sc.nextInt();
        int a[] = new int [jumlahArray];
        for(int i=0; i < jumlahArray; i++){
            System.out.print("masukkan nilai index ke-"+i+" : ");
            a[i] = sc.nextInt();
        }
        Insertion urut = new Insertion(a, a.length);
        
        System.out.println("data sebelum sorting");
        urut.tampilData();
        
        System.out.println("data sesudah sorting ASC");
        urut.insertionSort();
        urut.tampilData();
    }

}
