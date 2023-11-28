package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertAtHead(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size++;
    }
    public void insertAtTail(int val)
    {
        if(tail==null)
        {
            insertAtHead(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;

        size++;
    }
    public void insetAtIndex(int val,int index)
    {
       if(index==0)//index is zero
       {
           insertAtHead(val);
       }
       if(index==size)//index is size of the list
       {
           insertAtTail(val);
       }
       Node temp=head;//This is the first index, so we will start loop from 1
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        // so here we will be at:7      7 -> 8 -> 5 -> 4 -> 3 ->null
        // Initially 7 -> 8

        Node node=new Node(val,temp.next);// here 9 -> 8
        temp.next=node;                   // here 7 -> 9 -> 8
        size++;
    }

    public void insertRecur(int val, int index)
    {
        head=insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node)
    {
        if(index==0)
        {
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next= insertRec(val,index-1,node.next);
        return node;
    }

    public int  deleteFirst()
    {
        int val=head.value;
        head=head.next;
        size--;
        if(head==null)
        {
            tail=null;
        }
        return val;
    }

    public int deleteLast()
    {
        if(size<=1)
        {
            deleteFirst();
        }
        int val=tail.value;
        if(head==null)
        {
            tail=null;
        }
        Node secondLast=getIndex(size-2);// 9 -> 8 -> 7-> 6 ->4-> you will get 6
        tail=secondLast;
        tail.next=null;
        return val;
    }

    public int deleteAtIndex(int index)
    {
        if(index==0)
        {
            deleteFirst();
        }
        if(index==size-1)
        {
            deleteLast();
        }
        Node prevnode=getIndex(index-1);
        int val=prevnode.next.value;

        prevnode.next=prevnode.next.next;
        return  val;
    }

    public int find(int val)
    {
        Node temp=head;
        int index=0;
        while (temp!=null)
        {
            if(temp.value==val)
            {
                return index;
            }
            temp=temp.next;
            index++;
        }
        return -1;
    }

    public Node getIndex(int index)
    {
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
    public void display()
    {
        Node temp=head; //changing temp will not change head
        while (temp!=null)
        {
            System.out.print(temp.value +" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

   private class Node {
       private int value;
       private Node next;

       public Node(int value) {
           this.value = value;
       }

       public Node(int value, Node next) {
           this.value = value;
           this.next = next;
       }
   }

   //-------------------------Leetcode Problems-----------------------------------------------------------------------

    //83. Remove Duplicates from Sorted List
    public void RemoveDuplicates()
    {
        Node temp=head;

        while (temp.next!=null)
        {
            if(temp.value==temp.next.value)
            {
                temp.next=temp.next.next;
                size--;
            }
            else
            {
                temp=temp.next;
            }
        }
        tail=temp;
        tail.next=null;
    }
    /*
    public ListNode deleteDuplicates(ListNode node) {

        if(node==null)
        {
            return node;
        }
        ListNode head=node;
        while (node.next!=null)
        {
            if(node.val==node.next.val)
            {
                node.next=node.next.next;

            }
            else
            {
                node=node.next;
            }
        }
        return head;
    }*/

    //21. Merge Two Sorted Lists

    public LL Mergell(LL list1,LL list2)
    {
        Node f=list1.head;
        Node s=list2.head;

        LL ans=new LL();
        while (f!=null && s!=null)
        {
            if(f.value<s.value)
            {
                ans.insertAtTail(f.value);
                f=f.next;
            }
            else
            {
                ans.insertAtTail(s.value);
                s=s.next;
            }
        }
        while (f!=null)
        {
            ans.insertAtTail(f.value);
            f=f.next;
        }
        while (s!=null)
        {
            ans.insertAtTail(s.value);
            s=s.next;
        }
        return ans;
    }
    /*public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         if(list1!=null && list2!=null){
        if(list1.val<list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
        }
        }
        if(list1==null)
            return list2;
        return list1;
    }*/
}



