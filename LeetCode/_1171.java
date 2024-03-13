

    class Solution {
        public ListNode removeZeroSumSublists(ListNode head) {
            HashMap<Integer,ListNode> map= new HashMap<>();
            int sum=0;
            ListNode curr= head;
            while(curr!=null){
                sum+=curr.val;
                System.out.println(sum);
                if(map.containsKey(sum)){
                    ListNode a= map.get(sum);
                    a.next=curr.next;
                    curr=head;
                    map.clear();
                    sum=0;
                    continue;
                }
                else{
                    map.put(sum,curr);
                }
                curr=curr.next;
            }
            if(map.containsKey(0)){
                ListNode a=map.get(0);
                head=a.next;
            }
            if(sum==0) head=null;
            return head;
        }
    }

