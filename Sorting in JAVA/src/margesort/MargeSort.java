package margesort;

public class MargeSort {
    public static void margeSort(int[] array, int left, int right, boolean flag) {
        if (left >= right)
            return;
        int mid = left + (right - left) / 2;

        margeSort(array, left, mid, flag);
        margeSort(array, mid + 1, right, flag);

        MargeTheArray.marge(array, left, mid, right, flag);
    }

    public static void printTheArray(int[] array) {
        System.out.println("Marge Sort (Ascending Order):");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[array.length - 1] + "\n");
    }
}
