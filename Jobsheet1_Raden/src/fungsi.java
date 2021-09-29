
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;

public class fungsi {

    static int fibonacciPerulangan(int nil) {
        int fibonacci1 = 0, fibonacci2 = 1;
        for (int i = 1; i <= nil; ++i) {
            System.out.print("[" + fibonacci1 + "]");
            int fibonacci3 = fibonacci1 + fibonacci2;
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacci3;
        }
        return (fibonacci1);
    }

    static int fibonacciRekursif(int nilai) {
        if (nilai == 0) {
            return 0;
        }
        if (nilai == 1 || nilai == 2) {
            return 1;
        }
        return fibonacciRekursif(nilai - 2) + fibonacciRekursif(nilai - 1);
    }

    public static void main(String args[]) {
        int nilaiFib = 9;
        System.out.println("=== # Fungsi Fibonacci Perulangan # ===");
        System.out.print("Deret Fibonacci " + nilaiFib + " adalah : ");
        fibonacciPerulangan(nilaiFib);
        System.out.println(" ");
        System.out.println("=== # Fungsi Fibonacci Rekursif   # ===");
        System.out.print("Deret Fibonacci " + nilaiFib + " adalah : ");
        for (int i = 0; i < nilaiFib; i++) {
            System.out.print("[" + fibonacciRekursif(i) + "]");
        }
    }
}
