
package Praktikum3;
/**
 * # nim : 2031710121 
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;
public class PostfixMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String P, Q;
    System.out.println("Masukkan ekspresi matematika (infiks): ");
    Q = sc.nextLine();
    Q = Q.trim();
    Q = Q + ")";
    int total = Q.length();
    Postfix post = new Postfix(total);
    P = post.konversi(Q);
    System.out.println("Postfix: "+ P);
    }
    
}
