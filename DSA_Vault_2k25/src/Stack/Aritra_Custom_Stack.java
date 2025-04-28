package DSA_Vault_2k25.src.Stack;

public class Aritra_Custom_Stack {
    private int [] data;
    private int ptr=-1;
    private static final int DEFAULT_ARRAY_SIZE=10;

    public Aritra_Custom_Stack(int size){
        this.data=new int[size];
    }

    public Aritra_Custom_Stack(){
        this(DEFAULT_ARRAY_SIZE); // calls the argument constructor.
    }

    public boolean push(int value) throws Exception {
        if(isFilled()){
            throw new Exception("Stack is full.");
        }
        ptr++;
        data[ptr]=value;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty())
            throw new Exception("Stack is empty.");
        return data[ptr--];
    }

    public int peek() throws Exception {
        if(isEmpty())
            throw new Exception("Stack is empty.");
        return data[ptr];
    }

    public void display(){
        for(int i=ptr;i>=0;i--){
            System.out.println(data[i]);
        }
    }

    public boolean isFilled(){
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
        return ptr==-1;
    }
}
