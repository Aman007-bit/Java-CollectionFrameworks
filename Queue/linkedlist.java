import java.util.LinkedList;
import java.util.Queue;

public class linkedlist{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        // "offer" function helps to add element in the queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        System.out.println(queue);

        // "poll" function use to delete the elemnt
        queue.poll();
        System.out.println(queue);

        // "peek" function helps to check/return head of the queue
        System.out.println(queue.peek());
    }
}