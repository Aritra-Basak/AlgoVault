package DSA_Vault_2k25.src.dsa_learnings.LinkedList;

public class MiddleOfLinkedList {
    public static void main(String[] args){
        Aritras_LinkedList list = new Aritras_LinkedList();
        list.insertFirst(10);
        list.insertFirst(5);
        list.insertFirst(15);
        list.insertFirst(50); //this will be the latest head
        list.insertLast(20);
        list.displayList();
        System.out.println("Middle of the list is: "+list.getTheMiddleNode(list));

    }
}
