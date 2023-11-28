package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertAtHead(3);
        list.insertAtHead(4);
        list.insertAtHead(5);
        list.insertAtHead(6);
        list.insertAtHead(7);
        list.insertAtHead(8);
        list.display();

        list.insertAtTail(48);
        list.display();

        list.insetAtIndex(33,3);
        list.display();

        System.out.println();
        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();// Deleted node will be removed by garbage collector

        System.out.println(list.deleteAtIndex(2));
        list.display();// Deleted node will be removed by garbage collector

        System.out.println();
        System.out.println(list.find(5));
        list.display();

        list.insertRecur(44,2);
        list.display();
        System.out.println("End of Singly LinkedList!! \n\n");
        //Doubly LinkedList
        DLL list1=new DLL();
        list1.insertHead(4);
        list1.insertHead(8);
        list1.insertHead(5);
        list1.insertHead(6);
        list1.insertHead(9);
        list1.insertHead(7);
        list1.insertHead(1);
        list1.insertHead(12);
        list1.insertHead(33);

        list1.display();
        list1.displayRev();

        list1.insertAtEnd(11);
        System.out.println();
        list1.display();

        System.out.println();
        list1.insertAfter(11,14);
        list1.display();

        System.out.println("End of Doubly LinkedList!! \n");
        //Circular Linked List

        CLL cll=new CLL();
        cll.insert(2);
        cll.insert(3);
        cll.insert(4);
        cll.insert(5);
        cll.insert(6);
        cll.insert(7);
        cll.insert(8);
        cll.insert(9);
        cll.insert(10);

        System.out.println();
        cll.display();

        System.out.println();
        cll.delete(10);
        cll.display();

        //Leetcode----------------------------------------------------------------------------------------

        System.out.println("\n");
        list.RemoveDuplicates();
        list.display();

        LL list3=new LL();
        list3.insertAtTail(1);
        list3.insertAtTail(2);
        list3.insertAtTail(3);
        list3.insertAtTail(4);
        LL list2=new LL();
        list2.insertAtTail(1);
        list2.insertAtTail(2);
        list2.insertAtTail(3);
        list2.insertAtTail(4);

        LL ans=list.Mergell(list2,list3);
        ans.display();
    }
}
