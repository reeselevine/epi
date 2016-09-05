public class ChapterTen {

    private static class BalanceStatusAndHeight {
        public boolean balanced;
        public int height;

        public BalanceStatusAndHeight(boolean balanced, int height) {
            this.balanced = balanced;
            this.height = height;
        }
    }

    public BalanceStatusAndHeight checkBalance(BinaryTreeNode root) {
        if (root == null) {
            return new BalanceStatusAndHeight(true, -1);
        }
        BalanceStatusAndHeight leftResult = checkBalance(root.left);
        if (!leftResult.balanced) {
            return leftResult;
        }
        BalanceStatusAndHeight rightResult = checkBalance(root.right);
        if (!rightResult.balanced) {
            return rightResult;
        }
        boolean balanced = Math.abs(leftResult.height - rightResult.height) <= 1;
        int height = Math.max(leftResult.height, rightResult.height) + 1;
        return new BalanceStatusAndHeight(balanced, height);
    }

    public boolean isBalanced(BinaryTreeNode root) {
        return checkBalance(root).balanced;
    }


}
