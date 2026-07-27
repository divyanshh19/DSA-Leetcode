/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {


        //basic approach using hashmap ----
        // HashMap<ListNode , Integer> mpp = new HashMap<>();

        // ListNode temp1 = headA;
        // while(temp1 != null){
        //     mpp.put(temp1 , 1);
        //     temp1 = temp1.next;
        // }
        // ListNode temp2 = headB;
        // while(temp2 != null){
        //     if(mpp.containsKey(temp2)){
        //         return temp2;
        //     }
        //     temp2 = temp2.next;
        // }
        // return null;


        //Optimal approach 

        if(headA == null || headB == null) return null;
        ListNode t1 = headA;
        ListNode t2 = headB;

        while(t1 != t2){
            t1 = t1.next;
            t2 = t2.next;

            if(t1 == t2) return t1;

            if(t1 == null) t1 = headB;

            if(t2 == null) t2 = headA;
        }
        return t1;
    }
}