package LinkedList;

import java.util.List;

// merge 2 linked list
public class question003 {
    static class  ListNode{
        int val ;
        ListNode next;

        ListNode(int val){
            this.val = val;

        }
    }
    static ListNode merge2List(ListNode l1 , ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (l1 != null && l2 != null){

            if(l1.val <= l2.val){
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if(l1 != null){
            tail.next = l1;
        }
        if(l2 != null){
            tail.next = l2;
        }
        return dummy.next;
    }
    static ListNode createList(int[] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1 ; i< arr.length;i++){
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
ListNode l1 = createList(new int[] {1,3,5});
ListNode l2 = createList(new int[]{2,4,6});

  ListNode ans = merge2List(l1 , l2);
  while (ans != null){
      System.out.print(ans.val +" ->");
      ans = ans.next;
  }
    }
}
