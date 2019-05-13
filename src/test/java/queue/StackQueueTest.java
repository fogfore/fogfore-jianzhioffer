package queue;

import org.junit.Test;

public class StackQueueTest {
    @Test
    public void testAppendTail() {
        StackQueue queue = new StackQueue();
        queue.appendTail("wo");
        System.out.println(queue);
        queue.appendTail("men");
        System.out.println(queue);
        queue.appendTail("ai");
        System.out.println(queue);
        queue.removeHead();
        System.out.println(queue);
        queue.appendTail("xue");
        System.out.println(queue);
        queue.appendTail("xi");
        System.out.println(queue);
    }

    @Test
    public void testRemoveHead() {
        StackQueue queue = new StackQueue();
        System.out.println(queue.removeHead());
        System.out.println(queue.removeHead());
        System.out.println(queue.removeHead());
    }

}
