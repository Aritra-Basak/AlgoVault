package DSA_Vault_2k25.src.dsa_learnings.Queue;

public class Aritra_Custom_Queue {
    int []data;
    private static final int DEFAULT_ARRAY_SIZE=10;
    int end=0;
    public Aritra_Custom_Queue(int size){
        data=new int[size];
    }
    public Aritra_Custom_Queue(){
        this(DEFAULT_ARRAY_SIZE);
    }

    public boolean isFilled(){
        return end==data.length;
    }
    public boolean isEmpty(){
        return end==0;
    }

    public boolean push(int value) throws Exception {
        if(isFilled())
            throw new Exception("Queue is full");
        data[end]=value;
        end++;
        return true;
    }

    //Takes O(n) of time complexity
    public int pop() throws Exception{
        if(isEmpty())
            throw new Exception("Queue is empty");
        int removed =data[0];
        //shift the elements the to the left, thus automatically eliminates the first element.
        for(int i=1;i<data.length;i++){
            data[i-1]=data[i];
        }
        end--; //as the first element gets eliminated, so reducing the size by 1;
        return removed;
    }

    public void display(){
        for(int i=0;i<end;i++){
            System.out.println(data[i]);
        }
    }

}
