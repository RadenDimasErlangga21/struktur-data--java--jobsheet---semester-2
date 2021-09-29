
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
public class SortMain {

    public static void main(String[] args) {
        int a[] = {15,10,7,22,5};
        Sort urut = new Sort (a, a.length);
        System.out.println("Data sebelum urut");
        urut.tampilData();
        urut.bubbleSort();
        System.out.println("Data sesudah urut Bubble sort (DSC)");
        urut.tampilData();
        System.out.println("Data sesudah urut Selection sort (DSC)");
        urut.selectionSort();
        urut.tampilData();
    }
    
}
