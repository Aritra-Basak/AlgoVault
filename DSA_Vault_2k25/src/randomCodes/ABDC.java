package DSA_Vault_2k25.src.randomCodes;

abstract class AbstractClass {

    abstract void animal();

    public void methodWIthBody(){
        System.out.println("Hello WOrld");
    }
}


public class ABDC extends AbstractClass{

    public static void main(String[] args){
     new ABDC().animal();
    }
    void animal(){
        System.out.println("Hello");
    }
}
