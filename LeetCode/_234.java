//  Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution2 {
    public boolean isPalindrome(ListNode head) {
        ListNode curr= head;
        int size = 0;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        int[] arr= new int[size];
        curr = head;
        for (int i = 0; i < size ; i++) {
            arr[i] = curr.val;
            curr=curr.next;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[size-i-1]) return false;
        }
        return true;
    }
}