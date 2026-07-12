package Revision;

public class palindrome_LinkedList {
    static class ListNode{
        int val;
        ListNode next ;

        ListNode(int val){
            this.val = val;
        }
    }
    static boolean isPalindrome(ListNode head){
        if(head == null || head.next == null){
            return false;
        }

        // find mid
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse the second mid
        ListNode prev = null;
        ListNode curr = slow;

        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // now compare
        ListNode p1 = head;
        ListNode p2 = prev;

        while (p2 != null){
            if(p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
    static ListNode create(int arr[]){
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i =1 ; i<arr.length ; i++){
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head = create(new int[]{1,2,2});
        System.out.println(isPalindrome(head));
    }
}
