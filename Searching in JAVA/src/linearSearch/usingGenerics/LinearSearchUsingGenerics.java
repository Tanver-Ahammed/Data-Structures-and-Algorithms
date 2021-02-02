package linearSearch.usingGenerics;

public class LinearSearchUsingGenerics<T> {

    public static <T> int linearSerGenerics(T[]array,T sValue) {
        int index = -1;
        for (T t : array) {
            ++index;
            if (t.equals(sValue)){
                break;
            }
        }
        return index;
    }
}
