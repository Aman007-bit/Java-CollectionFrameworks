import java.util.Queue;
import java.util.PriorityQueue;

public class pq{
    public static void main(String[] args) {

        // currently it is behave like a minheap
        // Queue<Integer> pqu = new PriorityQueue<>();
        // when we use "Comparator.reverseOrder()" then it is behave like maxheap"
        Queue<Integer> pqu = new PriorityQueue<>(Comparator.reverseOrder());
        pqu.offer(10);
        pqu.offer(2);
        pqu.offer(30);
        pqu.offer(14);
        pqu.offer(5);
        System.out.println(pqu);

        // "poll" function will delete the element which have least priority
        pqu.poll();
        System.out.println(pqu);

        System.out.println(pqu.peek());


    }
}