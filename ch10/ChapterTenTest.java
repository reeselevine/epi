import static org.junit.Assert.*;
import org.junit.Test;

/** Tests Chapter 10 questions.
 *  @author Reese Levine
 */
public class ChapterTenTest {

    ChapterTen a = new ChapterTen();

    @Test
    public void testIsBalanced() {
       BinaryTreeNode A = new BinaryTreeNode(1);
       A.left = new BinaryTreeNode(2);
       A.right = new BinaryTreeNode(3);
       A.left.left = new BinaryTreeNode(4);
       A.left.right = new BinaryTreeNode(5);
       A.right.left = new BinaryTreeNode(6);
       assertEquals(true, a.isBalanced(A));
       A.right.right = new BinaryTreeNode(7);
       A.right.right.left = new BinaryTreeNode(8);
       A.right.right.left.right = new BinaryTreeNode(9);
       assertEquals(false, a.isBalanced(A));
    }
}
