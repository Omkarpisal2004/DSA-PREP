package Revision;
// linked list Cycle (floyed cycle detection)
public class linked_list_cycle {
    static  class ListNode{
        int val ;
        ListNode next ;

        ListNode(int val){
            this.val = val;
        }
    }
    static boolean cycle(ListNode head){
        ListNode slow = head ;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    static ListNode createNode(int arr[]){
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1 ; i< arr.length;i++){
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }
    public static void main(String[] args) {
     ListNode head = createNode(new int[]{1,2,3,4,5});
        System.out.println(cycle(head));
    }
}
