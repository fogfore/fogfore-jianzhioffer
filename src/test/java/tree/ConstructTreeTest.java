package tree;

import org.junit.Test;

public class ConstructTreeTest {
    @Test
    public void TestConstruct() {
        ConstructTree constructTree = new ConstructTree();
        int[] preOrder = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] inOrder = {4, 7, 2, 1, 5, 3, 8, 6};
        ConstructTree.Node tree = constructTree.construct(preOrder, 0, preOrder.length-1, inOrder, 0, inOrder.length-1);
        System.out.println(tree);
    }
}
