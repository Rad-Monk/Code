import java.util.Arrays;

public class _950 {
    public static int[] deckRevealedIncreasing(int[] deck) {
        int[] increasing_order = new int[deck.length];
        Arrays.sort(deck);
        int i=0,j=0,flag=0;
        boolean reset = true;
        while(j< deck.length){
            if(reset && increasing_order[i] == 0){
                increasing_order[i]=deck[j];
                reset = false; j++;
            }
            if(increasing_order[i] == 0) flag++;
            if (flag == 2 && increasing_order[i] == 0){
                increasing_order[i] = deck[j];
                flag = 0; j++;
            }
            if(++i == increasing_order.length) {
                reset = true; i = 0;
            }
        }
        return increasing_order;
    }

    public static void main(String[] args) {
        int[] deck = new int[]{17,13,11,2,3,5,7};
        int[] order = deckRevealedIncreasing(deck);
        for (int i : order) {
            System.out.println(i);
        }
    }
}
