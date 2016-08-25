import static org.junit.Assert.*;
import org.junit.Test;

/** Tests Chapter 5 questions.
 *  @author Reese Levine
 */
public class ChapterFiveTest {

    ChapterFive a = new ChapterFive();
    @Test
    public void testParity() {
        assertEquals(a.parity(0b10010001100100011111001011100101), true);
        assertEquals(a.parity(0b00000000000000000000000000000001), false);
    }

    @Test
    public void testSwapBits() {
        assertEquals(a.swapBits(0b10001110101101101010110000110010, 31, 0), 0b00001110101101101010110000110011);
    }

}
