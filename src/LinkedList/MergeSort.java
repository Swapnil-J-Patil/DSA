package LinkedList;

public class MergeSort {

    public ListNode sortList(ListNode head)
    {
        if(head == null || head.next==null)
        {
            return head;
        }

        ListNode mid=middleNode(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);

        return mergeTwoLists(left,right);
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        if (list1 == null)
            return list2;
        return list1;
    }
    public ListNode middleNode(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while (f!=null)
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
}
