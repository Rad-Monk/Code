import java.io.File;
import java.util.Scanner;

public class _2_1_star {
    public int gaming(String g){
        int[] red= new int[12];
        int[] blue= new int[12];
        int[] green= new int[12];
        int rc=0;
        int bc=0;
        int gc=0;
        StringBuilder game= new StringBuilder(g);
        StringBuilder id= new StringBuilder();
        String[] substrings= new String[]{"red","blue","green"};
        for(int i=0;i<game.length();i++){
            for(int j=i; j< game.length();j++){
                String sub= game.substring(i,j);
                if(j==game.length()-1){
                    sub=game.substring(i,j+1);
                }
                if(sub.equals("Game")){
                    j++;
                    while(game.charAt(j)!=':'){
                        id.append(game.charAt(j));
                        j++;
                    }
                    i=j+2;
                    break;
                }
                for(int k=0;k<3;k++){
                    if (sub.equals(substrings[k])){
                        int num= ((int)game.charAt(i-2)-48)+ (game.charAt(i-3)==' '? 0 : ((int)game.charAt(i-3)-48)*10);
                        if(k==0){
                            red[rc]=num;
                            rc++;
                            i=j+1;
                            break;
                        } else if (k==1) {
                            blue[bc]=num;
                            bc++;
                            i=j+1;
                            break;
                        }
                        else{
                            green[gc]=num;
                            gc++;
                            i=j+1;
                            break;
                        }
                    }
                }
                if(i<game.length() && game.charAt(i)==';'){
                    break;
                }
            }
        }
        for(int i=0;i<12;i++){
            if(red[i]>12 || green[i]>13 || blue[i]>14){
                return 0;
            }
        }

        int sum=100;
        if(id.length()==1) sum= (int)id.charAt(0)-48;
        if(id.length()==2) sum= (((int)id.charAt(0))-48)*10+ (id.charAt(1)-48);
        return sum;
    }

   public static  void main (String[] args){
       _2_1_star obj= new _2_1_star();
       Scanner sc;
       try{
           sc = new Scanner(new File("_2_1_file.txt"));
       }
       catch (Exception e){
           System.out.println("hmmm");
           return;
       }
       long res=0;
       while(sc.hasNext()){
           res+=obj.gaming(sc.nextLine());
       }
       System.out.println(res);
       sc.close();

   }
}
