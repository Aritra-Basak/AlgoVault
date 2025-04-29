package DSA_Vault_2k25.src.dsa_learnings.Queue;

public class CustomQueueImplementation {
    public static void main(String[] args) throws Exception{
        Aritra_Custom_Queue queue = new Aritra_Custom_Queue(5);
        queue.push(1);
        queue.push(3);
        queue.push(5);
        queue.push(7);
        queue.push(9);
        queue.display();
        System.out.println("Element eliminated from the QUEUE: "+queue.pop());
        queue.display();

        System.out.println("Circular Queue.......");
        CircularQueue cQueue = new CircularQueue();
        cQueue.push(1);
        cQueue.push(3);
        cQueue.push(5);
        cQueue.push(7);
        cQueue.push(9);
        cQueue.display();
        System.out.println("Element eliminated from the QUEUE: "+cQueue.remove());
        cQueue.push(10);
        cQueue.display();

    }

}
