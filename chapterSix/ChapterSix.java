import java.util.Arrays;
public class ChapterSix {

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

}
