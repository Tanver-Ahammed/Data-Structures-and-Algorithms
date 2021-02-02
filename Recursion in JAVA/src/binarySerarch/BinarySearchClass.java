package binarySerarch;

public class BinarySearchClass {
    public static int binarySearch(int[] array, int sValue, int left, int right) {
        if (left <= right) {
            int middle = left + (right - left) / 2;
            if (array[middle] == sValue)
                return middle;
            else if (array[middle] < sValue)
                return binarySearch(array, sValue, middle + 1, right);
            else
                return binarySearch(array, sValue, left, middle - 1);
        } else
            return -1;
    }
}

