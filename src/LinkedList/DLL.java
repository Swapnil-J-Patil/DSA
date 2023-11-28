package LinkedList;

public class DLL {

    Node head;
    private Node tail;
    private int size;

    public void insertHead(int val)
    {
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null)
        {
            head.prev=node;
        }
        head=node;
        size++;
    }

    public void insertAtEnd(int val)
    {
        if(size==0){
            insertHead(val);
        }
        Node temp=head;
        Node node=new Node(val);
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
        node.next=null;
        node.prev=temp;
        size++;
    }
    public int find(int val)
    {
        Node temp=head;
        int index=0;
        while (temp!=null)
        {
            if(temp.val==val)
            {
                return index;
            }
            temp=temp.next;
            index++;
        }
        return -1;
    }

    public void insertAfter(int target,int val)
    {
        int index=find(target);
        if(index==-1)
        {
            System.out.println("Target val Does not exist!!!");
            return;
        }
        Node temp=head;
        Node node=new Node(val);
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        if(temp.next==null)
        {
            insertAtEnd(val);
            return;
        }
        node.next=temp.next;
        temp.next=node;

        node.prev=temp;
        node.next.prev=node;


    }
    public void display()
    {
        Node temp=head;
        System.out.print("null -> ");
        while (temp!=null)
        {
            System.out.print(temp.val +" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void displayRev() {
        Node temp = head;
        Node last = null;

        while (temp != null) {
            last = temp;
            temp = temp.prev;
        }
        System.out.println();
        Node reverseLast = last; // Create a copy of last to print in reverse again

        while (reverseLast != null) {
            System.out.print(reverseLast.val + " -> ");
            reverseLast = reverseLast.next; // Traverse in the opposite direction
        }
    }

    private class Node
    {
        private Node prev;
        private Node next;
        private int val;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node prev, Node next, int val) {
            this.prev = prev;
            this.next = next;
            this.val = val;
        }
    }
}
