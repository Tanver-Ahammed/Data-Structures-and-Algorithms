package linearSearch.usingRecurtion;

public class LinearSearchUsingRecursion<T> {
    public static int recursiveLinearSearch(int []array,int sValue,int left,int right) {
        if (left>right)
            return -1;
        if (array[left]==sValue)
            return left;
        if (array[right]==sValue)
            return right;
        return recursiveLinearSearch(array,sValue,left+1,right-1);
    }
}
