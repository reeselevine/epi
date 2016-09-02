import java.util.LinkedList;

public class MaxStack {

    private LinkedList<int[]> stack;

    public MaxStack() {
        stack = new LinkedList<int[]>();
    }

    public void push(int value) {
        if (stack.isEmpty()) {
            stack.push(new int[] {value, value});
        } else if (value > stack.peek()[1]) {
            stack.push(new int[] {value, value});
        } else {
            stack.push(new int[] {value, stack.peek()[1]});
        }
    }

    public Integer pop() {
        if (stack.isEmpty()) return null;
        int[] result = stack.pop();
        return result[0];
    }

    public Integer peek() {
        if (stack.isEmpty()) return null;
        return stack.peek()[0];
    }

    public Integer getMax() {
        if (stack.isEmpty()) return null;
        return stack.peek()[1];
    }


}
