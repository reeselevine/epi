import static org.junit.Assert.*;
import org.junit.Test;

/** Tests Chapter 11 questions.
 *  @author Reese Levine
 */
public class ChapterElevenTest {

    ChapterEleven el = new ChapterEleven();

    @Test
    public void testMergeSortedArrays() {
        int[] a = new int[] {3, 5, 7};
        int[] b = new int[] {0, 6};
        int[] c = new int[] {0, 6, 28};
        int[] expected = new int[] {0, 0, 3, 5, 6, 6, 7, 28};
        Integer[] result = el.mergeSortedArrays(new int[][] {a, b, c});
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], (int) result[i]);
        }
    }

}
