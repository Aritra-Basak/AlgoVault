package DSA_Vault_2k25.src.dsa_learnings.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class PredefinedQueue {
    public static void main(String[] args){
        Queue<Integer> queue= new LinkedList<>(); //Queue is an interface in Java which extends the property of Collection
        queue.add(1);
        queue.add(3);
        queue.add(5);
        queue.add(7);
        display(queue);
        System.out.println("First element removed, "+queue.remove()); // remove() will remove the first element from the queue, it will throw an error when the queue is empty,
                                                                    // but the use of poll() can remove the element and it will not throw an error when the queue is empty
        display(queue);

        // Operation in dequeue is faster than normal dequeue as insertion and deletion can be done from both ends.
        Deque<Integer> dequeue = new ArrayDeque<>();
        dequeue.add(2);
        dequeue.add(4);
        dequeue.add(8);
        dequeue.add(12);
        dequeue.add(10);
        dequeue.add(5);
        dequeue.addFirst(1);
        System.out.println("Dequeue Data...");
        dequeue.forEach(eachElement -> {
            System.out.println(eachElement);
        });
    }

    public static void display(Queue<?> queue){
        for(Object each : queue){
            System.out.println(each);
        }
    }
}
