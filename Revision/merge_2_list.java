package Revision;



public class merge_2_list {
    static class ListNode{
        int val ;
        ListNode next ;

        ListNode(int val){
            this.val = val;
        }
    }
    static ListNode mergeList(ListNode p1 , ListNode p2){
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (p1 != null && p2 != null){
            if(p1.val <= p2.val){
                tail.next = p1;
                p1 = p1.next;
            } else {
                tail.next = p2 ;
                p2 = p2.next;
            }
            tail = tail.next;
        }
        if(p1 != null){
            tail.next = p1;
        }
        if(p2 != null){
            tail.next = p2;
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
      ListNode p1 = createList(new int[]{1,2,4});
      ListNode p2 = createList(new int[]{1,3,4});

      ListNode ans = mergeList(p1 , p2);
      while (ans != null){
          System.out.print(ans.val +" ->");
          ans = ans.next;
      }
    }
}
