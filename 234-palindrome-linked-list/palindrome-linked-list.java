/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        // Stack<Integer> stack = new Stack<>();
        // ListNode temp = head;
        // while(temp != null){
        //     stack.push(temp.val);
        //     temp = temp.next;
        // }
        // temp = head;
        // while(temp != null){
        //     if(temp.val != stack.peek()){
        //       return false;
        //     }
        //     temp = temp.next;
        //     stack.pop();
        // }
        // return true;


        if(head == null || head.next == null) return true;

        //finding out the middle for first and second half for comparison
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse the second-half 
        ListNode newHead = reverse(slow);
        ListNode firstHalf = head;
        ListNode secondHalf = newHead;
        //comparison
        while(secondHalf != null){
            if(firstHalf.val != secondHalf.val){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }


    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        //Iterative approach---
        ListNode temp =  head;
        ListNode prev = null;

        while(temp != null){
            ListNode front = temp.next; //assign the front node next to head
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;

        //Recursrive approach 
        // ListNode newHead = reverse(head.next);

        // ListNode front = head.next;
        // front.next = head;
        // head.next = null;

        // return newHead;
    }
}