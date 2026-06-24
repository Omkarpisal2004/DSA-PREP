package LinkedList;
// palindrome linked list
public class question005 {
    static class ListNode{
        int val ;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }
    static boolean palindrome(ListNode head){

        // Edge case
        if(head == null || head.next == null){
            return true;
        }

        // find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse it
        ListNode prev = null ;
        ListNode curr = slow; // middle joh phele nikala tha

        while (curr != null ){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // now compare
        ListNode l1 = head ;
        ListNode l2 = prev;

        while (l2 != null){
            if(l1.val != l2.val){
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }
    static ListNode createList(int [] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1 ; i< arr.length;i++){
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head = createList(new int[]{1,2,2,1,0});
        System.out.println(palindrome(head));
    }
}
