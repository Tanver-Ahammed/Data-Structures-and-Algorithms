package bubblesort;

public class BubbleSort {
    public static void bubbleSortAscOrder(int []array) {
        for (int i = 0; i < array.length; i++) {
            boolean flag=false;
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j]>array[j+1]) {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=true;
                }
            }
            if (!flag)
                break;
        }
    }

    public static void bubbleSortDscOrder(int []array) {
        for (int i = 0; i < array.length; i++) {
            boolean flag=false;
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j]<array[j+1]) {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=true;
                }
            }
            if (!flag)
                break;
        }
    }



    public static void printAll(int []array) {
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println(array[array.length-1]+"\n");
    }
}
