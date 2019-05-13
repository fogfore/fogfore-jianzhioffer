package tree;

import org.junit.Test;

public class GetNextTest {
    @Test
    public void testNext() {
        GetNext getNext = new GetNext();
        GetNext.Node root = getNext.new Node(1, null);
        GetNext.Node temp = root;
        root.left = getNext.new Node(2, root);
        root.right = getNext.new Node(3, root);
        GetNext.Node troot = root;
        root = root.left;
        root.left = getNext.new Node(4, root);
        root.right = getNext.new Node(5, root);
        root = root.right;
        root.left = getNext.new Node(8, root);
        root.right = getNext.new Node(9, root);
        root = troot.right;
        root.left = getNext.new Node(6, root);
        root.right = getNext.new Node(7, root);
        System.out.println(temp);
        GetNext.Node next = getNext.next(temp.left.right.right);
        if (next == null) {
            System.out.println("没有下一个节点");
        } else {
            System.out.println(next);
        }
    }
}
