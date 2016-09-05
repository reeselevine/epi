import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;

public class ChapterTwelve {

    public int modifiedBinarySearch(int[] A, int k) {
        int uIdx = A.length - 1;
        int lIdx = 0;
        int result = -1;
        while (uIdx >= lIdx) {
            int mid = lIdx + (uIdx - lIdx) / 2;
            if (k < A[mid]) {
                uIdx = mid - 1;
            } else if (k > A[mid]) {
                lIdx = mid + 1;
            } else {
                result = mid;
                uIdx = mid - 1;
            }
        }
        return result;
    }
}
