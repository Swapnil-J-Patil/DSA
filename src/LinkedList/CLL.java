package LinkedList;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL() {
        this.head = null;
        this.tail = null;
    }
    public void insert(int val)
    {
        Node node=new Node(val);
        if(head==null)
        {
            head=node;
            tail=node;
            return;
        }

        tail.next=node;
        node.next=head;
        tail=node;
        size++;
    }
    public void delete(int val)
    {
        if(size==0)
        {
            System.out.println("No item to delete!!!");
            return;
        }
        Node temp=head;
        if(temp.val==val)
        {
            head=temp.next;
            tail.next=head;
            return;
        }
        while (temp.next.val!=val)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    public void display()
    {
        Node temp=head;
        if(head!=null)
        {
            do {
                System.out.print(temp.val +" -> ");
                temp=temp.next;
            }
            while (temp!=head);
        }
        System.out.print("Head");
    }

    private class Node
    {
        Node next;
        Node tail;
        int val;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node next, int val) {
            this.next = next;
            this.val = val;
        }
    }
}
