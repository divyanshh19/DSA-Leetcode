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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null){
            ListNode KthNode = findKNode(temp, k);
            if(KthNode == null){
                if(prev != null){
                    prev.next = temp;
                }
                break;
            }
            ListNode nextNode = KthNode.next;
            KthNode.next = null;
            ListNode newHead = reverse(temp);
            if(temp == head){
                head = KthNode;
            }
            else{
                prev.next = KthNode;
            }
            prev = temp;
            temp = nextNode;
        }
        return head;
    }
    public ListNode findKNode(ListNode temp ,int k){
        k--;
        while(temp != null && k > 0){
            k--;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode reverse(ListNode head){
        //First write the reverse method
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
        // ListNode newHead = reverse(temp.next);
        // ListNode front = temp.next;
        // front.next = temp;
        // temp.next = null;
        // return newHead;
    }
}