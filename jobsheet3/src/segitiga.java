
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
public class segitiga {
    public int alas;
    public int tinggi;
        
    public segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
    public int hitungluas(){
        int luas = alas * tinggi / 2;
        return luas;
    }
    public int hitungkeliling(){
        int ss = (alas*alas) + (tinggi*tinggi);
        int keliling = alas + tinggi + ss;
        return keliling;
    }
}
