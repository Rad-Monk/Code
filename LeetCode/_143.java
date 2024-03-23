
//  Definition for singly-linked list.
public class _143{
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public void reorderList(ListNode head) {
            ListNode temp =head;
            int size= 0;
            while(temp!=null){
                size+=1;
                temp=temp.next;
            }
            int[] arr= new int[size];
            temp=head;
            for(int i =0 ; i < size; i++){
                arr[i]=temp.val;
                temp = temp.next;
            }
            int[] newarr= new int[size];
            int j =0;
            for(int i =0 ; i< size; i++){
                if(i%2 ==0 ){
                    newarr[i]= arr[j];
                    j++;
                    continue;
                }
                newarr[i]=arr[size-j];
            }
            temp = head;
            int i =0;
            while(temp!=null){
                temp.val= newarr[i];
                temp= temp.next;
                i++;
            }
        }
    }
}
