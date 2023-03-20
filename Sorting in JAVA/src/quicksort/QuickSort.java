package quicksort;

public class QuickSort {
    public static void quickSortMethod(int[] array, int low, int high, boolean flag) {
        if (low >= high)
            return;
        int pivot = 0;
        if (flag)
            pivot = PartitionClass.partitionAscOrder(array, low, high);
        else
            pivot = PartitionClass.partitionDecOrder(array, low, high);

        quickSortMethod(array, low, pivot - 1, flag);
        quickSortMethod(array, pivot + 1, high, flag);
    }


    static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
