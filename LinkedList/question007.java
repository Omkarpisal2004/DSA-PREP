package LinkedList;
// linked list cycle 2
public class question007 {
    static class ListNode{
        int val ;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }
    static ListNode linkedList2(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        // check if cycle exist
        while (fast != null || fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }
        }
        // return null if no cycle exist
        if (fast == null || fast.next == null) {
            return null;
        }

        // find the exact
        ListNode p1 = head;
        ListNode p2 = slow;
        while (p1 != p2){
            p1= p1.next;
            p2=p2.next;
        }
        return p1;
    }
    static ListNode createList(int arr[]){
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1 ; i< arr.length;i++){
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
ListNode head = createList(new int[] {1,2,3,4,5});
        System.out.println(linkedList2(head));
    }
}
