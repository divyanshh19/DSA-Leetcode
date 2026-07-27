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
        HashMap<ListNode, Integer> map = new HashMap<>();
        if(head == null){
            return false;
        }
        if(head.next == null){
            return false;
        }
        ListNode temp = head;
        while(temp != null){
            map.put(temp , 1);
            temp = temp.next;
            if(map.containsKey(temp)){
                return true;
            }
        }
        return false;
    }
}