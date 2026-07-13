package LinkedList;

public class question008 {
    static class ListNode{
        int val ;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    static ListNode add2number(ListNode l1 , ListNode l2){

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry!= 0){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x+y+carry;

            int digit = sum%10;
            carry = sum/10;

            tail.next = new ListNode(digit);
            tail =tail.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null ) l2 = l2.next;
        }
        return dummy.next;
    }
    static ListNode create (int arr[] ){
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i =1 ;i< arr.length;i++ ){
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
ListNode l1 = create(new int[]{2,4,3});
ListNode l2 = create(new int[]{5,6,4});
        ListNode ans = add2number(l1,l2);
        while (ans != null){
            System.out.print(ans.val + "->");
            ans = ans.next;
        }
    }
}
