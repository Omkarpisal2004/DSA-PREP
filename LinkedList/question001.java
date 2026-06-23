package LinkedList;
// reverse Linked List
public class question001 {
   static class  ListNode{
        int val ;
        ListNode next;

        ListNode(int val){
            this.val = val;

        }
    }
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev ;
            prev = curr ;
            curr = next;
        }
        return prev;
    }
     static ListNode createList(int arr[]){
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1 ; i<arr.length ;i++){
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args) {

        ListNode head = createList(new int []{1,2,3,4,5});

        head = reverse(head);

        while (head != null){
            System.out.print(head.val+ " ->");
head = head.next;
        }
    }
}
