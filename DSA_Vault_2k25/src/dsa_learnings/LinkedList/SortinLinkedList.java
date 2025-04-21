package DSA_Vault_2k25.src.dsa_learnings.LinkedList;

public class SortinLinkedList {
    public static void main(String [] args){
        Aritras_LinkedList list = new Aritras_LinkedList();
        list.insertFirst(10);
        list.insertFirst(5);
        list.insertFirst(20);
        list.insertFirst(15);
        list.insertFirst(50);

        list.displayList();
        list.sortList(list.getNode(0));
        list.displayList();


    }


}
