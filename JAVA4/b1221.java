import java.util.PriorityQueue;
import java.util.Queue;

public class b1221 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();   //堆
        queue.offer(231);
        queue.offer(421);
        queue.offer(11);
        queue.offer(921);
        System.out.println(queue.peek());//堆 的排列默认为小堆  从小到大
    }

    public void heapSort(){

    }

}
