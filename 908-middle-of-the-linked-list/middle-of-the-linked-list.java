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
    public ListNode middleNode(ListNode head) {

        //Brute force approach
        // if(head == null || head.next == null){
        //     return head;
        // }
        // ListNode temp = head;
        // int length = 0;
        // while(temp != null){
        //     length++;
        //     temp = temp.next;
        // }
        // temp =  head;
        // // int middle = (length/2) + 1;
        // // while(temp != null){
        // //     middle = middle - 1;
        // //     if(middle == 0) break;
        // //     temp = temp.next;
        // // }
        // // return temp;
        // //or calculate the middle using for loop
        // for(int i = 0;i < length/2;i++){
        //     temp = temp.next;
        // }
        // return temp;
        
        //optimal solution (Tortoise - hare) approach

        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}