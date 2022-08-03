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

//converting normal addtion/sum of digits to code
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode p1=l1;
      ListNode p2=l2;
        ListNode sentinel=new ListNode(0);//sentinel or head of new list
        ListNode  d= sentinel;
      int sum=0;
        while(p1!=null || p2!=null)
        {
            sum/=10;//for carry
            if(p1!=null){
                sum+=p1.val;
                p1=p1.next;
            }
            if(p2!=null){
                sum+=p2.val;
                p2=p2.next;
            }
            d.next=new ListNode(sum%10);//storing the right digit as the output
            d=d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);//for the extra carry
        return sentinel.next;//returning head of new ll
        
    }
}