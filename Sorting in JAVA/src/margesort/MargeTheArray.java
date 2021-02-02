package margesort;

public class MargeTheArray {

    public static void marge(int[] array, int left, int mid, int right, boolean flag) {

        int leftIndex = mid - left + 1;
        int rightIndex = right - mid;

        int leftArray[] = new int[leftIndex];
        int rightArray[] = new int[rightIndex];

        for (int i = 0; i < leftIndex; ++i)
            leftArray[i] = array[left + i];
        for (int j = 0; j < rightIndex; ++j)
            rightArray[j] = array[mid + 1 + j];


        int i = 0, j = 0;

        int index = left;

        if (flag) {
            while (i < leftIndex && j < rightIndex) {
                if (leftArray[i] <= rightArray[j]) {
                    array[index] = leftArray[i];
                    i++;
                } else {
                    array[index] = rightArray[j];
                    j++;
                }
                index++;
            }
        }

        else {
            while (i < leftIndex && j < rightIndex) {
                if (leftArray[i] >= rightArray[j]) {
                    array[index] = leftArray[i];
                    i++;
                } else {
                    array[index] = rightArray[j];
                    j++;
                }
                index++;
            }
        }

        /* Copy remaining elements of L[] if any */
        while (i < leftIndex) {
            array[index] = leftArray[i];
            i++;
            index++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < rightIndex) {
            array[index] = rightArray[j];
            j++;
            index++;
        }
    }
}