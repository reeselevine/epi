import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;

public class ChapterEleven {

    public Integer[] mergeSortedArrays(int[][] lists) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>(lists.length, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
        ArrayList<Integer> result = new ArrayList<Integer>();
        int totalLength = 0;
        for (int i = 0; i < lists.length; i++) {
            minHeap.add(new int[] {lists[i][0], 0, i});
            totalLength += lists[i].length;
        }
        while (minHeap.size() > 0) {
            int[] entry = minHeap.poll();
            result.add(entry[0]);
            if (lists[entry[2]].length > entry[1] + 1) {
                minHeap.add(new int[] {lists[entry[2]][entry[1] + 1], entry[1] + 1, entry[2]});
            }
        }
        return result.toArray(new Integer[0]);
    }

}
