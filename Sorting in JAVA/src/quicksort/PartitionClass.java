package quicksort;

public class PartitionClass {
    public static int partitionAscOrder(int[] array, int low, int high) {
        int pivot = array[high];
        int index = low - 1;
        for (int i = low; i < high; i++) {
            if (array[i] < pivot) {
                ++index;
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }
        int temp=array[index+1];
        array[index+1] = array[high];
        array[high] = temp;
        return index+1;
    }

    public static int partitionDecOrder(int[] array, int low, int high) {
        int pivot = array[high];
        int index = low - 1;
        for (int i = low; i < high; i++) {
            if (array[i] > pivot) {
                ++index;
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }
        int temp=array[index+1];
        array[index+1] = array[high];
        array[high] = temp;
        return index+1;
    }


}
