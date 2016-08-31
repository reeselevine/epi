import java.lang.StringBuilder;

public class ChapterSeven {

    public int buildInt(String a) {
        int toMultiply;
        int result = 0;
        if (a.charAt(0) == '-') {
            toMultiply = -1;
            a = a.substring(1);
        } else toMultiply = 1;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            result = 10 * result + (int)(c - '0');
        }
        return toMultiply * result;
    }

    public String buildString(int a) {
        StringBuilder result = new StringBuilder();
        boolean isNegative = false;
        if (a == 0) {
            result.append('0');
        }
        if (a < 0) {
            isNegative = true;
            a = -a;
        }
        while (a != 0) {
            result.append(a % 10);
            a = a / 10;
        }
        if (isNegative) {
           result.append('-');
        }
        result.reverse();
        return result.toString();
    }

}
