import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

/** Tests Chapter 7 questions.
 *  @author Reese Levine
 */
public class ChapterSevenTest {

    ChapterSeven a = new ChapterSeven();

    @Test
    public void testBuildInt() {
        String test = "123";
        assertEquals(123, a.buildInt(test));
        test = "-589";
        assertEquals(-589, a.buildInt(test));
    }

    @Test
    public void testBuildString() {
        int test = 123;
        assertEquals("123", a.buildString(test));
        test = -589;
        assertEquals("-589", a.buildString(test));
        assertEquals("0", a.buildString(0));
    }

}
