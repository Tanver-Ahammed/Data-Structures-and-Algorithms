package insertionsort;

public class InsertionSort {
    public static void insertionAscSort(int[] array) {
        int i, j, item;
        for (i = 1; i < array.length; i++) {
            item = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > item) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = item;
        }
    }

    public static void insertionDscSort(int[] array) {
        int i, j, item;
        for (i = 1; i < array.length; i++) {
            item = array[i];
            j = i - 1;
            while (j >= 0 && array[j] < item) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = item;
        }
    }

    public static void printAll(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[array.length - 1]);
    }
}
