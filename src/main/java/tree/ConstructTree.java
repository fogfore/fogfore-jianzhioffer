package tree;

public class ConstructTree {
    public Node construct(int[] preOrder, int startPreOrder, int endPreOrder, int[] inOrder, int startInOrder, int endInOrder) {
        int rootIndexInOrder = 0;
        int rootValue = preOrder[startPreOrder];
        for (int i = 0; i < inOrder.length; i++) {
            if (inOrder[i] == rootValue) {
                rootIndexInOrder = i;
            }
        }
        Node root = new Node(rootValue);
        // 构造左子树
        if (rootIndexInOrder > startInOrder) {
            int startPre = startPreOrder + 1;
            int endPre = startPreOrder + (rootIndexInOrder - startInOrder);
            int startIn = startInOrder;
            int endIn = rootIndexInOrder - 1;
            root.left = construct(preOrder, startPre, endPre, inOrder, startIn, endIn);
        }
        // 构造右子树
        if (rootIndexInOrder < endInOrder) {
            int startPre= startPreOrder + (rootIndexInOrder - startInOrder) + 1;
            int endPre = endPreOrder;
            int startIn = rootIndexInOrder + 1;
            int endIn = endInOrder;
            root.right = construct(preOrder, startPre, endPre, inOrder, startIn, endIn);
        }
        return root;
    }
    class Node {
        int value;
        Node right;
        Node left;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }
}

