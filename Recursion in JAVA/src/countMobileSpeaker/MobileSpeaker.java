package countMobileSpeaker;

public class MobileSpeaker {
    public static int findMobileSpeakers(int mobiles) {
        if (mobiles == 0) {
            return 0;
        } else {
            if (mobiles % 2 == 0)
                return 2 + findMobileSpeakers(mobiles - 1);
            else
                return 1 + findMobileSpeakers(mobiles - 1);
        }
    }
}