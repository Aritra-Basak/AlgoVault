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


    }

}
