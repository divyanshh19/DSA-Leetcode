/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // HashMap<ListNode, Integer> map = new HashMap<>();
        // if(head == null || head.next == null){
        //     return false;
        // }
        // ListNode temp = head;
        // while(temp != null){
        //     map.put(temp , 1);
        //     temp = temp.next;
        //     if(map.containsKey(temp)){
        //         return true;
        //     }
        // }
        // return false;

        //optimal approach solution(Tortoise & hare) ----

        if(head == null || head.next == null){
            return false;
        }
        ListNode slow =  head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}