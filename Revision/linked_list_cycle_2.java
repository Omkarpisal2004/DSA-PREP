package Revision;

import LinkedList.question007;

public class linked_list_cycle_2 {
    static class ListNode{
        int val ;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }
    static ListNode mettingPoint(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return  null;
        }

        ListNode p1 = head;
        ListNode p2 = slow;
        while (p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
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

        ListNode second = head.next;

        ListNode tail = head;

        while(tail.next != null){
            tail = tail.next;
        }

        tail.next = second;

        ListNode temp = head;
        int count = 0;

        while (temp != null && count < 15) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
            count++;
        }
    }

}
