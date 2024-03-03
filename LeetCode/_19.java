

class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;
        ListNode curr= head;
        int size=0;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        size-=n;
        if(size==0){
            head=head.next;
            return head;
        }
        curr=head.next;
        ListNode rmv=head;
        while(size>1){
            size--;
            curr=curr.next;
            rmv=rmv.next;
        }
        if(rmv.next.next==null){
            rmv.next=null;
        }
        else{
            rmv.next=rmv.next.next;
        }
        return head;
    }
}