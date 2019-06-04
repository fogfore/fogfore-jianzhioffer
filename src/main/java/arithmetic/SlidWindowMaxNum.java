package arithmetic;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Iterator;
import java.util.LinkedList;

public class SlidWindowMaxNum {
    public static Integer[] get(int[] array, int winLen) {
        if (ObjectUtils.isEmpty(array) || winLen < 1) {
            return null;
        }
        LinkedList<Integer> queue = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if (queue.isEmpty()) {
                queue.addLast(i);
            } else if (array[queue.getFirst()] > array[i]) {
                Iterator<Integer> iterator = queue.iterator();
                while (iterator.hasNext()) {
                    if (array[iterator.next()] < array[i]) {
                        iterator.remove();
                    }
                }
                queue.addLast(i);
            } else {
                queue.clear();
                queue.addLast(i);
            }

            int delta = i - queue.getFirst() + 1;
            if (delta >= winLen) {
                result.addLast(array[queue.removeFirst()]);
            } else if (i >= winLen - 1) {
                result.addLast(array[queue.getFirst()]);
            }
        }
        return result.toArray(new Integer[result.size()]);
    }
}
