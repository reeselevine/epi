import static org.junit.Assert.*;
import org.junit.Test;

/** Tests Chapter 9 questions.
 *  @author Reese Levine
 */
public class ChapterNineTest {

    @Test
    public void testMaxStack() {
        MaxStack stack = new MaxStack();
        assertEquals(null, stack.getMax());
        stack.push(-5);
        stack.push(-6);
        stack.push(10);
        assertEquals(new Integer(10), stack.getMax());
        stack.pop();
        assertEquals(new Integer(-5), stack.getMax());
        stack.pop();
        stack.pop();
        assertEquals(null, stack.getMax());
    }

}
