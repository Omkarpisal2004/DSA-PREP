package LinkedList;
// swap in pairs
public class question009 {
    static class  ListNode{
        int val;
        ListNode next ;

        ListNode(int val){
            this.val = val;
        }
    }
    static ListNode swap(ListNode head){
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null){


            ListNode first = prev.next;
            ListNode second = first.next;
            ListNode nextPair = second.next;

            second.next = first;
            prev.next = second;
            first.next = nextPair;
            prev = first;
        }
        return dummy.next;

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
ListNode head = createList(new int[]{1,2,3,4,5,6});
ListNode ans = swap(head);
while (ans != null){
    System.out.print(ans.val + "->");
    ans = ans.next;
}
    }
}
