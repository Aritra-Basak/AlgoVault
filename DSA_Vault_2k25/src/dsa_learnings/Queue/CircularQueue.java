package DSA_Vault_2k25.src.dsa_learnings.Queue;

public class CircularQueue {
    int []data;
    private static final int DEFAULT_ARRAY_SIZE=10;
    int end=0;
    int front =0;
    int size=0;
    public CircularQueue(int size){
        data=new int[size];
    }
    public CircularQueue(){
        this(DEFAULT_ARRAY_SIZE);
    }

    public boolean isFilled(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean push(int value) throws Exception {
        if(isFilled())
            throw new Exception("Queue is full");
        data[end++]=value;
        end=end%data.length;
        size++;
        return true;
    }

    public int remove()throws Exception{
        if(isEmpty())
            throw new Exception("Queue is empty");

        int remove=data[front++];
        front=front% data.length; // the data.length is 10 or any specific size. So front%10 will be front itself until front=data.length, then it's % will be 0, again making front =0
        size--;
        return remove;
        }

    public int getFront() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty");
        return data[front];
    }

    public void display() throws Exception{
        if(isEmpty())
            throw new Exception("Queue is Empty");
        int i=front;
        do{
            System.out.println(data[i++]);
            i=i%data.length;
        }while (i!=end);
    }
}




