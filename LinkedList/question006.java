package LinkedList;
// reorder List
public class question006 {
    static class ListNode{
        int val ;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }
    static ListNode reorder(ListNode head){

        if(head == null || head.next == null){
            return head;
        }
        // find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;

        // reverse it
        ListNode prev = null ;
        ListNode curr = second; // middle joh phele nikala tha

        while (curr != null ){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode l1 = head;
        ListNode l2 = prev;

        while (l2 != null) {

            ListNode next1 = l1.next;
            ListNode next2 = l2.next;

            l1.next = l2;
            l2.next = next1;

            l1 = next1;
            l2 = next2;
        }
        return head;
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
ListNode head = createList(new int[]{1,2,3,4,5});
ListNode ans = reorder(head);
while (ans != null){
    System.out.print(ans.val + " ->");
    ans = ans.next;
}
    }
}
