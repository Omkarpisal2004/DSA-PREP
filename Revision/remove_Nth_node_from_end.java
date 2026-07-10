package Revision;

public class remove_Nth_node_from_end {
    static class ListNode{
        int val ;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }
    static ListNode remove(ListNode head , int n){
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int i = 0 ; i<=n ;i++){
            fast = fast.next;
        }

        while (fast != null ){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
    static ListNode createList(int arr []){
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1 ; i<arr.length ;i++){
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
ListNode head = createList(new int[]{1,2,3,4,5});
int n = 2 ;
ListNode ans = remove(head , n);
while (ans != null){
    System.out.print(ans.val + " ->");
    ans = ans.next;
}
    }
}
