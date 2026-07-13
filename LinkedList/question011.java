package LinkedList;
// reverse k groups
public class question011 {
    static class ListNode{
        int val ;
        ListNode next ;

        ListNode(int val){
            this.val = val;
        }
    }
    static ListNode reverseKGroups(ListNode head , int k){
        int count = 0;
        ListNode x = head;

        while (x != null && count < k){
            count++;
            x = x.next;
        }
        if (count <k){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        while (curr != x){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = reverseKGroups(curr, k);

        return prev;
    }
    static ListNode create(int arr[]){
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1 ; i< arr.length;i++){
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
ListNode head = create(new int[]{1,2,3,4,5});
int k = 2;
ListNode ans = reverseKGroups(head,k);
while (ans != null){
    System.out.print(ans.val + " ->");
    ans = ans.next;
}
    }
}
