/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { 
        val = x;
       }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode ll1, ListNode ll2) {
    ListNode head = new ListNode(0);
    ListNode l=head;
 
    ListNode l1=ll1;
    ListNode l2=ll2;
    while(l1!=null && l2!=null){
        if(l1.val < l2.val){
            l.next = l1;
            l1 = l1.next;
        }else{
            l.next = l2;
            l2 = l2.next;
        }
       l=l.next;
    }
 
    if(l1!=null){
        l.next = l1;
    }
 
    if(l2!=null){
        l.next = l2;
    }
 
    return head.next;
    }
  /*  ListNode first=new ListNode(1);
    ListNode second=new ListNode(2);
    ListNode third=new ListNode(4);
    first.next=second;
    second.next=third;
    ListNode first1=new ListNode(1);
    ListNode second2=new ListNode(2);
    ListNode third3=new ListNode(4);
    first1.next=second2;
    second2.next=third3;
    
    mergeTwoLists(first,first1);*/

}
