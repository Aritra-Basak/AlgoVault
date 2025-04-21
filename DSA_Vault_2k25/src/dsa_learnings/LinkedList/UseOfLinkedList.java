package DSA_Vault_2k25.src.dsa_learnings.LinkedList;

import java.util.List;

public class UseOfLinkedList {
    public static void main(String [] args){
        System.out.println("\n----------------- Single Linked List -----------------");
        Aritras_LinkedList list = new Aritras_LinkedList();
        list.insertFirst(10);
        list.insertFirst(5);
        list.insertFirst(15);
        list.insertFirst(50); //this will be the latest head
        list.insertLast(20);
        list.insert(30,2);
        list.displayList();
//        System.out.println("First Node deleted: "+list.deleteFirst());
//        list.displayList();
//        System.out.println("Last Node deleted: "+list.deleteLast());
//        list.displayList();
//        System.out.println("Node deleted: "+list.delete(2));
//        list.displayList();
//        System.out.println("Reversed Linked List");
//        list.reverseList();
//        list.displayList();
//        list.insertNodeRecursively(1,25);
//        list.insertNodeRecursively(2,25);
//        list.deleteDuplicates();
//        list.displayList();
//
//
//        System.out.println("\n----------------- Doubly Linked List -----------------");
//        DoubleLinkedList dlist = new DoubleLinkedList();
//        dlist.insertFirst(10);
//        dlist.insertFirst(5);
//        dlist.insertFirst(15);
//        dlist.insertFirst(50);
//        dlist.display();
//
//        System.out.println("\n----------------- Merging Linked List -----------------");
//        Aritras_LinkedList l1 =new Aritras_LinkedList();
//        l1.insertLast(10);
//        l1.insertLast(20);
//        l1.insertLast(30);
//        l1.insertLast(40);
//        l1.insertLast(50);
//
//        Aritras_LinkedList l2 =new Aritras_LinkedList();
//        l2.insertLast(5);
//        l2.insertLast(15);
//        l2.insertLast(25);
//        l2.insertLast(35);
//        l2.insertLast(45);
//
//        new Aritras_LinkedList().mergeLinkedList(l1,l2);
        System.out.println("\n----------------- Circular Linked List -----------------");
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertInCll(50);
        cll.insertInCll(23);
        cll.insertInCll(3);
        cll.insertInCll(19);
        cll.insertInCll(75);
        cll.display();

        System.out.println(cll.isACyleLinkedList(cll.getHead()));
        System.out.println(cll.getLenghtOfCycle(cll.getHead()));

        System.out.println(cll.detectCycle(cll.getHead()));
    }
}
