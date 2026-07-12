package LinkedList;
// sortList
public class question010 {
    static class  ListNode{
        int val ;
        ListNode next ;

        ListNode(int val){
            this.val = val;
        }
    }
    static ListNode sortList(ListNode head){

        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(second);

        return merge(left , right);
    }
    static ListNode merge (ListNode p1 , ListNode p2){
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (p1 != null && p2 != null){
            if(p1.val <= p2.val){
                tail.next = p1;
                p1 = p1.next;
            } else {
                tail.next = p2 ;
                p2 = p2.next;
            }
            tail = tail.next;
        }
        if(p1 != null){
            tail.next = p1;
        }
        if(p2 != null){
            tail.next = p2;
        }
        return dummy.next;
    }
    static ListNode create(int arr[]){
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1 ; i< arr.length ;i++){
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
ListNode head = create(new int[]{1,2,3,4,5});
ListNode ans = sortList(head);

while (ans != null){
    System.out.print(ans.val + "->");
    ans = ans.next;
}
    }
}
