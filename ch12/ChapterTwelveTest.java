import static org.junit.Assert.*;
import org.junit.Test;

/** Tests Chapter 12 questions.
 *  @author Reese Levine
 */
public class ChapterTwelveTest {

    ChapterTwelve twelve = new ChapterTwelve();

    @Test
    public void testModifiedBinarySearch() {
        int[] A = new int[] {-14, -10, 2, 108, 108, 243, 285, 285, 285, 401};
        assertEquals(3, twelve.modifiedBinarySearch(A, 108));
        assertEquals(6, twelve.modifiedBinarySearch(A, 285));
    }

}
