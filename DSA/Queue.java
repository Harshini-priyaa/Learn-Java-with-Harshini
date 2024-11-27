import java.util.LinkedList;
import java.util.Queue;

public class Queue{
    public static void main(String[] args) {
        Queue <Integer> Queue = new LinkedList<>();
            // enqueue - offer()
        queue.offer(1);
        queue.offer(2);

        //dequeue - poll()

        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

}