public class ChapterEight {

    public Node mergeLists(Node a, Node b) {
        Node result = new Node(0, null);
        Node toReturn = result;
        while (a != null && b != null) {
            if (a.value <= b.value) {
                result.next = a;
                a = a.next;
            } else {
                result.next = b;
                b = b.next;
            }
            result = result.next;
        }
        if (a != null) {
            result.next = a;
        } else {
            result.next = b;
        }
        return toReturn.next;
    }

}
