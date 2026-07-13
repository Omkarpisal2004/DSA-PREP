package LinkedList;
// reverseKGroups
public class question012 {
    static class ListNode{
        int val ;
        ListNode next ;

        ListNode(int val){
            this.val = val;
        }
    }
    static  ListNode reverseKGroups(ListNode head , int k){
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prevGroup = dummy;

        while (true){

            ListNode kth = prevGroup;
            // first kth group
            for (int i = 0 ; i<k && kth != null ; i++){
                kth = kth.next;

            }
            if(kth == null){
                break;
            }

            ListNode nextGroup = kth.next;

            ListNode curr = prevGroup.next;
            ListNode prev = nextGroup;

            while (curr != nextGroup){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            //reconnect
            ListNode temp = prevGroup.next;

            prevGroup.next = kth;
            prevGroup = temp;
        }
        return dummy.next;

    }
    static  ListNode create(int arr[]){
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1 ; i< arr.length ; i++){
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
ListNode head = create(new int[]{1,2,3,4,5});
int k = 3 ;
ListNode ans = reverseKGroups(head , k);
while (ans != null){
    System.out.print(ans.val + "->");
    ans =ans.next;
}
    }
}
