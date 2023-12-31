import java.util.LinkedList;
import java.util.List;

public class DemoCustomQueue {
    public static void main(String[] args) {
        Queue<String>queue = new Queue<>();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
        queue.offer("5");
        System.out.printf("Poll ra phần tử %s trong queue\n",queue.poll());
        System.out.printf("Poll ra phần tử %s trong queue\n",queue.poll());
        System.out.printf("Poll ra phần tử %s trong queue\n",queue.poll());
        System.out.printf("Peek của queue là %s ",queue.peek());
    }

    static class Queue<E> {
        List<E> list = new LinkedList<>();

        public void offer(E e) {
            list.add(e);
        }

        public E poll() {
            return list.remove(0);
        }

        public E peek() {
            return list.get(0);
        }

    }
}
