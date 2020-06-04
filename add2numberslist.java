/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode dummyhead=new ListNode(0);
    ListNode ans=dummyhead;
        int d1=0;
        int d=0;
        int carry=0;
        while(l1!=null||l2!=null){
           int no1=(l1!=null)?l1.val:0;
            int no2=(l2!=null)?l2.val:0;
            int sum=no1+no2+carry;
            carry=sum/10;
            int digit=sum%10;
            ListNode dummy=new ListNode(digit);
            ans.next=dummy;
            ans=ans.next;
            if(l1!=null){l1=l1.next;}
            if(l2!=null){l2=l2.next;}
       }
        if(carry>0){
            ListNode dummy=new ListNode(carry);
            ans.next=dummy;
            ans=ans.next;
        }
       
        return dummyhead.next;
    }
}
