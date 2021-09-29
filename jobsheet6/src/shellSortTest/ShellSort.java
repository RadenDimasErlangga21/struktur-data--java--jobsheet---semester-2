package shellSortTest;

/**
 * # nim : 2031710121 # nama : Raden Dimas Erlangga
 */
public class ShellSort {

    public int[] data;
    public int jumData;

    public ShellSort(int Data[], int jmlData) {
        jumData = jmlData;
        data = new int[jmlData];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    void tampilData() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println(" ");
    }

    void shellsort() {
        int interval;
        for (interval = jumData / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < jumData; i += 1) {
                int temp = data[i];
                int j;
                for (j = i; j >= interval && data[j - interval] > temp; j -= interval) {
                    data[j] = data[j - interval];
                }
                data[j] = temp;
            }
        }
    }
}
