package queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackQueue {
    private Queue<String> out = new LinkedList<>();
    private Queue<String> in = new LinkedList<>();

    public void appendTail(String string) {
        if (in.isEmpty()) {
            while (out.size() > 0) {
                in.add(out.remove());
            }
        }
        in.add(string);
    }

    public String removeHead() {
        if (out.isEmpty()) {
            while (in.size() > 0) {
                out.add(in.remove());
            }
        }
        return out.remove();
    }

    @Override
    public String toString() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.add(in.remove());
            }
        }
        return "StackQueue{" +
                "queue=" + out +
                '}';
    }
}
