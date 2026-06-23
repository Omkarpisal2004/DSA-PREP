package LinkedList;
// middle of list
public class question002 {
    static class  ListNode{
        int val ;
        ListNode next;

        ListNode(int val){
            this.val = val;

        }
    }
    static ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head ;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
ListNode head = createList(new int[]{1,2,3,4,5,6,7,8});
head = middle(head);
        System.out.println(head.val);
    }
}
