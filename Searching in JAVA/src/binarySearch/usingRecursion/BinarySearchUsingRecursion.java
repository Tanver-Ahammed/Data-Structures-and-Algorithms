package binarySearch.usingRecursion;

public class BinarySearchUsingRecursion {
    public static int binarySrcRecursion(Integer[] array, int sValue, int left, int right) {
        if (left<right) {
            int middle = left+(right-left)/2;
            if (array[middle]>sValue)
                return binarySrcRecursion(array,sValue,left,middle-1);
            else if (array[middle]<sValue)
                return binarySrcRecursion(array,sValue,middle+1,right);
            else
                return middle;
        }
        else
            return -1;
    }
}
