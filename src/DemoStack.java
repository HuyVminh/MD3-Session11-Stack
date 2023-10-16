import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Thực hiện hàm pop(), giá trị bị loại bỏ là :" + stack.pop());
        System.out.println("Đỉnh stack hiện tại của mình là : " + stack.peek());
        System.out.println("Thực hiện hàm pop(), giá trị bị loại bỏ là :" + stack.pop());
        System.out.println("Thực hiện hàm pop(), giá trị bị loại bỏ là :" + stack.pop());
        System.out.println(stack.isEmpty() ? "Stack đang rỗng" : "Stack có phần tử");
    }

    static class Stack<E> {
        private List<E> list =  new ArrayList<>();

        public void push(E integer) {
            list.add((E) integer);
        }

        public Integer pop() {
            Integer peek = (Integer) list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return peek;
        }

        public E peek() {
            return list.get(list.size() - 1);
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public boolean isEmpty2() {
            return list.size() == 0;
        }
    }
}
