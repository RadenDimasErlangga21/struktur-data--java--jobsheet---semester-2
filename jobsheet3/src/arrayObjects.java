
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;
public class arrayObjects {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("masukkan length array: ");
       int nilai = sc.nextInt();
       persegipanjang[][]ppArray = new persegipanjang[nilai][nilai];
       for (int i =0; i<nilai; i++){
                  for (int j =0; j<nilai; j++){
           ppArray[i][j] = new persegipanjang();
           System.out.println("persegi panjang ke-"+i+" "+j);
           System.out.print("Masukkan panjang: ");
           ppArray[i][j].panjang=sc.nextInt();
           System.out.print("Masukkan lebar: ");
           ppArray[i][j].lebar=sc.nextInt();
       }
       }
       for (int i=0; i<nilai; i++){
                  for (int j=0; j<nilai; j++){
           System.out.println("Persegi panjang ke-" +i+" "+j);
           System.out.println("Panjang : "+ppArray[i][j].panjang+", lebar "+ppArray[i][j].lebar);
       }
       }
       persegi[] pgArray = new persegi[100];
       pgArray[5] = new persegi();
       pgArray[5].sisi=20;
       System.out.println("Persegi panjang ke-" +pgArray[5].sisi);
    }
}