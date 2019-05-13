package tree;

public class GetNext {
    public Node next(Node cur) {
        if (cur == null) {
            return null;
        }
        if (cur.right == null) {
            Node p = cur.parent;
            while (p != null && p.right == cur) {
                cur = p;
                p = cur.parent;
            }
            if (p!= null && p.left == cur) {
                return p;
            }
        } else {
            Node c = cur.right;
            while (c.left != null) {
                c = c.left;
            }
            return c;
        }
        return null;
    }

    class Node {
        int value;
        Node parent;
        Node left;
        Node right;

        Node(int value, Node parent) {
            this.value = value;
            this.parent = parent;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj instanceof Node) {
                Node node = (Node) obj;
                return this == node || this.value == node.value;
            }
            return false;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }

}