/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
public class array {
    public static void main(String[] args) {
        System.out.println("#======================= # SOAL A # =======================#");
        System.out.println("#============ Program Toko Bunga Royal Garden =============#");
        System.out.println("\t\t  [talgonema] [keladi] [alocasia] [mawar]");
        String[] rgarden = new String[4];
        rgarden[0] = "Royal Garden 1";
        rgarden[1] = "Royal Garden 2";
        rgarden[2] = "Royal Garden 3";
        rgarden[3] = "Royal Garden 4";
        int[][] jumlahBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9},};
        int totalBunga1 = (jumlahBunga[0][0] + jumlahBunga[1][0] + jumlahBunga[2][0] + jumlahBunga[3][0]);
        int totalBunga2 = (jumlahBunga[0][1] + jumlahBunga[1][1] + jumlahBunga[2][1] + jumlahBunga[3][1]);
        int totalBunga3 = (jumlahBunga[0][2] + jumlahBunga[1][2] + jumlahBunga[2][2] + jumlahBunga[3][2]);
        int totalBunga4 = (jumlahBunga[0][3] + jumlahBunga[1][3] + jumlahBunga[2][3] + jumlahBunga[3][3]);
        for (int i = 0; i < rgarden.length; i++) {
            System.out.print("[ " + rgarden[i] + " ]  ");
            for (int j = 0; j < jumlahBunga[i].length; j++) {
                System.out.print("\t  " + jumlahBunga[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("============================================================");
        System.out.println("# total stok bunga - setiap cabang berdasarkan jenis bunga #");
        System.out.println("1. [Talgonema]  : " + totalBunga1);
        System.out.println("2. [keladi]     : " + totalBunga2);
        System.out.println("3. [alocasia]   : " + totalBunga3);
        System.out.println("4. [mawar]      : " + totalBunga4);
        System.out.println("#======================= # SOAL B # =======================#");
        System.out.println("<!>  terdapat informasi tambahan berupa pengurangan stock karena bunga tersebut mati pada cabang  <!>\n"
                + "<!>  RoyalGarden 1. Dengan rincian Aglonema -1, Keladi -2, Alocasia -0,Mawar -5.                  <!>");
        jumlahBunga[0][0] = jumlahBunga[0][0] - 1;
        jumlahBunga[0][1] = jumlahBunga[0][1] - 2;
        jumlahBunga[0][3] = jumlahBunga[0][3] - 5;
        System.out.println("============================================================");
        System.out.println("# total stok bunga - Royal Garden 1 (setelah informasi tambahan) #");
        System.out.println("1. [Talgonema]  : " + jumlahBunga[0][0]);
        System.out.println("2. [keladi]     : " + jumlahBunga[0][1]);
        System.out.println("3. [alocasia]   : " + jumlahBunga[0][2]);
        System.out.println("4. [mawar]      : " + jumlahBunga[0][3]);
        System.out.println("============================================================");
        System.out.println("#  total pendapatan Royal Garden 1 jika stok bunga terjual habis  #");
        System.out.println("[no.] [nama bunga]      [harga bunga]  [jumlah harga sesuai stok]  ");
        int bunga1talgo = 75000 * jumlahBunga[0][0];
        int bunga2keladi = 50000 * jumlahBunga[0][1];
        int bunga3alocasia = 60000 * jumlahBunga[0][2];
        int bunga4mawar = 10000 * jumlahBunga[0][3];
        System.out.println("1.    [Talgonema]         Rp.75000     Rp." + bunga1talgo);
        System.out.println("2.    [keladi]            Rp.50000     Rp." + bunga2keladi);
        System.out.println("3.    [alocasia]          Rp.60000     Rp." + bunga3alocasia);
        System.out.println("4.    [mawar]             Rp.10000     Rp." + bunga4mawar);
        System.out.println("============================================================");
        int totalRG1 = (bunga1talgo + bunga2keladi + bunga3alocasia + bunga4mawar);
        System.out.println(" total pendapat Royal Garden 1       : Rp." + totalRG1);
        System.out.println("============================================================");
    }
}
