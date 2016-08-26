import java.util.Arrays;
public class ChapterSix {

    /** Solve 6.1, sort array into less than, equal, greater parts */
    public void dutchFlag(int[] A, int pivot) {
        int x = 0;
        int y = 0;
        int z = A.length - 1;
        while (y <= z) {
            int temp = A[y];
            if (A[y] < pivot) {
                A[y] = A[x];
                A[x] = temp;
                x++; y++;
            } else if (A[y] == pivot) {
                y++;
            } else {
                A[y] = A[z];
                A[z] = temp;
                z--;
            }
        }
    }

    /** Solve 6.6, buy and sell a stock once */
    public int buyAndSell(int[] A) {
        int max = 0;
        int start = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] - A[start] > max) {
                max = A[i] - A[start];
            } else if (A[i] - A[start] < 0) {
                start = i;
            }
        }
        return max;
    }

}
