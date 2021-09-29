
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
public class arrayBalok {
    public static void main(String[] args) {
        balok[] b1Array = new balok[3];
        
        b1Array[0] = new balok(100,30,12);
        b1Array[1] = new balok(120,40,15);
        b1Array[2] = new balok(210,50,25);
        
    for (int i = 0; i < 3; i++){
        System.out.println("volume balok ke "+i+": "+b1Array[i].hitungVolume());
    }
        segitiga[] sgArray = new segitiga[4];
        
        sgArray[0] = new segitiga(10,4);
        sgArray[1] = new segitiga(20,10);
        sgArray[2] = new segitiga(15,6);
        sgArray[3] = new segitiga(25,10);
        
    for (int i = 0; i < 3; i++){
        System.out.println("luas segitiga ke "+i+": "+sgArray[i].hitungluas());
        System.out.println("keliling segitiga ke "+i+": "+sgArray[i].hitungkeliling());
    }
    }
}