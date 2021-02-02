package binarySearch.normal;

public class BinarySearch {
    public static int binarySearch(Integer[] array, int sValue) {
        int left, right, middle, index;
        left = 0;
        right = array.length - 1;
        index = -1;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if (array[middle] > sValue)
                right = middle - 1;
            else if (array[middle] < sValue)
                left = middle + 1;
            else {
                index = middle;
                break;
            }
        }
        return index;
    }
}
