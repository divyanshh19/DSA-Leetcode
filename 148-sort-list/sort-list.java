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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode middle = findMiddle(head);
        ListNode rightHead = middle.next;
        middle.next = null;
        ListNode leftHead = head;
        
        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);

        return mergeSort(leftHead , rightHead);
    }
    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next; //as we want only middle1

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode mergeSort(ListNode head1 ,ListNode head2){
        ListNode t1 = head1;
        ListNode t2 = head2;
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        while(t1 != null && t2 != null){
            if(t1.val < t2.val){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if(t1 != null){
            temp.next = t1;
        }
        else{
            temp.next = t2;
        }
        return dummyNode.next;  //always return the new linked list which is dummy node with next link
    }
}