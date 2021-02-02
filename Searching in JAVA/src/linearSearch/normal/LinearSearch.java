package linearSearch.normal;

public class LinearSearch {
    public static int findValue(int []array,int sValue) {
        int index=-1;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==sValue) {
                index=i;
                break;
            }
        }
        return index;
    }
}
