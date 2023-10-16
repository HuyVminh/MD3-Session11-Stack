package BaiTap;

import java.util.*;

public class LuuTruVaInRaQueue {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Queue<Integer> queues = new LinkedList<>(inputList);
        System.out.println(queues);
        while (!queues.isEmpty()) {
            System.out.print(queues.poll()+" ");
        }
    }
}
