import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

/** Tests Chapter 8 questions.
 *  @author Reese Levine
 */
public class ChapterEightTest {

    ChapterEight x  = new ChapterEight();

    @Test
    public void testMergeLists() {
        Node a = new Node(2, null);
        a.next = new Node(5, null);
        a.next.next = new Node(7, null);
        Node b = new Node(3, null);
        b.next = new Node(11, null);
        Node r = x.mergeLists(a, b);
        assertEquals(2, r.value);
        assertEquals(3, r.next.value);
        assertEquals(5, r.next.next.value);
        assertEquals(7, r.next.next.next.value);
        assertEquals(11, r.next.next.next.next.value);
        assertEquals(null, r.next.next.next.next.next);
    }

}
