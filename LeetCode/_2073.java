public class _2073 {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int i =0;
        while(true){
            if(tickets[k] == 0) break;
            if(tickets[i]==0) {
                i++;
                if(i== tickets.length) i=0;
                continue;
            }
            tickets[i]--;
            time++;
            i++;
            if(i==tickets.length) i=0;
        }
        return time;
    }

    public static void main(String[] args) {
        int[] tickets = new int[]{5,1,1,1};
        System.out.println(timeRequiredToBuy(tickets, 0));
    }
}
