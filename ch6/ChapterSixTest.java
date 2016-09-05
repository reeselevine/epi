import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

/** Tests Chapter 6 questions.
 *  @author Reese Levine
 */
public class ChapterSixTest {

    ChapterSix a = new ChapterSix();

    @Test
    public void testDutchFlag() {
        int[] A = {5, 3, 3, 2, 6, 1, 4, 1};
        a.dutchFlag(A, 3);
        assertArrayEquals(A, new int[]{1, 2, 1, 3, 3, 4, 6, 5});
    }

    @Test
    public void testBuyAndSell() {
        int[] A = {310, 315, 275, 295, 260, 270, 290, 230, 255, 250};
        assertEquals(a.buyAndSell(A), 30);
    }

}
