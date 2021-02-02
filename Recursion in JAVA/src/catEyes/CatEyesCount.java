package catEyes;

public class CatEyesCount {
    public static int catEyes(int cats) {
        if (cats==0)
            return 0;
        else {
            return 2+catEyes(cats-1);
        }
    }
}
