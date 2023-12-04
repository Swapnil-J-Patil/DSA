package LinkedList;

public class LeetcodeProblems {
    public static void main(String[] args) {

        LeetcodeProblems ll=new LeetcodeProblems();

    }

    public static int lengthOfCycle(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            int count=0;
            if (slow == fast) {
                ListNode temp=slow;
                do {
                    temp=temp.next;
                    count++;
                    if(temp==fast)
                    {
                        return count;
                    }
                }while (temp!=slow);

            }
        }
        return 0;
    }
    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                return true;
            }

        }
        return false;
    }
    public static ListNode detectCycle(ListNode head)
    {
        int length=0;
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                length=lengthOfCycle(slow);
                break;
            }
        }
        if(length==0)
        {
            return null;
        }
    // find the start of cycle
        ListNode f=head;
        ListNode s=head;
        while (length>0)
        {
            s=s.next;
            length--;
        }
        //keep moving both of them they will meet at the cycle start
        while (f!=s)
        {
            f=f.next;
            s=s.next;
        }
        return s;
    }

    //202. Happy Number
    public boolean isHappy(int n)
    {
        int slow=n;
        int fast=n;

        do{
            slow=squareOfNum(n);
            fast=squareOfNum(squareOfNum(n));
        }while (fast!=slow);

        if(slow==1)
        {
            return true;
        }
        return false;
    }
    private int squareOfNum(int num)
    {
        int ans=0;
        while (num>0)
        {
            int rem=num%10;
            ans+=rem*rem;
            num=num/10;
        }
        return ans;
    }

    //876.Middle of the  LinkedList
    public ListNode middleNode(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while (f!=null && f.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    //206. Reverse Linked List
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;


        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


//92.Reverse Linked List II
    public ListNode reverseBetween(ListNode head, int left, int right) {
    if(left==right)
    {
        return head;
    }
    // skip first left-1 nodes
        ListNode current=head;
        ListNode prev=null;

        for (int i = 0;current!=null && i < left-1; i++) {
            prev=current;
            current=current.next;
        }

        ListNode start=prev;
        ListNode end=current;
        //reverse the elements between left and right
        for (int i = 0; current!=null && i < right-left +1; i++) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        if(start.next!=null)
        {
            start.next=prev;
        }
        else
        {
            head=prev;
        }

        end.next=current;
        return head;
    }


    //234. Palindrome Linked List
    public boolean isPalindrome(ListNode head) {
    ListNode mid=middleNode(head);
    ListNode headSecond=reverseList(mid);
    ListNode reReverseHead=headSecond;

    while (head!=null && headSecond!=null)
    {
        if(head.val != headSecond.val)
        {
            break;
        }
        head=head.next;
        headSecond=headSecond.next;
    }
        reverseList(reReverseHead);

    return head==null || headSecond==null;// if any one of them are true then palindrome
    }


    //143. Reorder List
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
        {
            return;
        }
    ListNode mid=middleNode(head);
    ListNode headSecond=reverseList(mid);
    ListNode headFirst=head;
    //here we are creating ll 1->2->3->4 to 1->2->4->3 Reversing from the middle of list
    while (headSecond!=null && headFirst!=null)
    {
        //here 1->4 and so on
        ListNode temp=headFirst.next;
        headFirst.next=headSecond;
        headFirst=temp;

        //here 4->2 and so on
        temp=headSecond.next;
        headSecond.next=headFirst;
        headSecond=temp;
    }

    //next of tail to null
    if(headFirst!=null)
    {
        headFirst.next=null;
    }
    }

    //25. Reverse Nodes in k-Group
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1 || head==null){
            return head;
        }
        ListNode curr=head;
        ListNode prv=null;
        // for checking no of elements traversed
        int s=0;
        // length of linked list

        int length=length(head);

        while(curr!=null){
            ListNode last=prv;
            ListNode newend=curr;

            ListNode next=curr.next;
            for(int i=0;curr!=null && i<k ;i++){

                s++;
                curr.next=prv;
                prv=curr;
                curr=next;
                if(next!=null){
                    next=next.next;
                }
            }
            if(last!=null){
                last.next=prv;
            }else{
                head=prv;
            }
            newend.next=curr;

            // if no of elements left is less than k
            if(length-s<k){
                break;
            }
            prv=newend;
        }
        return head;
    }

    int length(ListNode head){
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }

    //61. Rotate LL k times
    public ListNode rotateRight(ListNode head, int k) {
        if(k<=0 || head==null  ||head.next==null)
        {
            return head;
        }
        ListNode last=head;

        int length=1;
        while (last.next!=null)//to get the length of list
        {
            last=last.next;
            length++;
        }

        last.next=head;
        int rotations=k % length; //to not repeat the rotations like 12 rot will be the same
        int skip=length - rotations; //remaining elements will be as it is

        //to get at end of new list  9 -> 8 -> 7-> 6 ->4-> let it be 6
        ListNode newLast=head;
        for (int i = 0; i < skip-1; i++) {
            newLast=newLast.next;
        }

        head=newLast.next;        //now new head will be next of 6 i.e 4      4->9 -> 8 -> 7-> 6->4
        newLast.next=null;        //now new head will be next of 6 will be null       4->9 -> 8 -> 7-> 6->null

        return head;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode fast = start;
        ListNode slow = start;
        for (int i=1; i<=n; i++) {
            fast = fast.next;
        }
        //here fast will be at n distance from slow
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        //when fast reach end then slow will be at desired location
        slow.next = slow.next.next;
        return start.next;
    }
}
