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
        ListNode pt1=headA,pt2=headB;
        while(pt1!=pt2){
           pt1=pt1==null?headB:pt1.next;
            pt2=pt2==null?headA:pt2.next;
       
}
        return pt1;
}
}
