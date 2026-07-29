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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    //using the data structure to store the elements(brute force approach) technique
    //     ArrayList<Integer> ls = new ArrayList<>();
    //     ListNode temp1 = list1;
    //     ListNode temp2 = list2;

    //     while(temp1 != null){
    //         ls.add(temp1.val);
    //         temp1 = temp1.next;
    //     }
    //     while(temp2 != null){
    //         ls.add(temp2.val);
    //         temp2 = temp2.next;
    //     }

    //     Collections.sort(ls);
    //     return convertToNode(ls);
    // }
    // public ListNode convertToNode(ArrayList <Integer> ls){
    //     if(ls.size() == 0) return null;
    //     ListNode head = new ListNode(ls.get(0));
    //     ListNode current = head;

    //     for(int i = 1;i < ls.size();i++){
    //         ListNode temp = new ListNode(ls.get(i));
    //         current.next = temp;
    //         current = temp;
    //     }
    //     return head;

    //using the two pointer apporoach by storing the elements in dummyNode 

        ListNode dummyNode = new ListNode(-1);
        ListNode t1 = list1;
        ListNode t2 = list2;
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
            temp = t1;
            t1 = t1.next;
        }
        else{
            temp.next = t2;
            temp = t2;
        }
        return dummyNode.next;
    }
}