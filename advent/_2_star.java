import javax.print.DocFlavor;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _2_star {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("_2_star_file.txt"));
        } catch (Exception e) {
            System.out.println("hmmm"+ e);
            return;
        }
        long res = 0;
        while (sc.hasNext()) {
            res += sum(sc.nextLine());
        }
        System.out.println(res);
        sc.close();
    }
//     public static void main(String[] args){
//         int sum=sum("7pqrstsixteen");
//         System.out.println(sum);
//     }

    public static int sum(String word) {
        String[] arrword = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        char[] arrnum = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int[] s = new int[2];
        int flag1 = 0;
        int flag2 = 0;
        StringBuilder w = new StringBuilder(word);
        for (int i = 0; i < word.length(); i++) {
            for (int z = 0; z <= 8; z++) {
                if (w.charAt(i) == arrnum[z] && flag1 == 0) {
                    s[0] = ((int) arrnum[z] - 48) * 10;
//                    System.out.println(s[0] + " : number that comes first in num arr");
                    flag1 = 1;
//                    System.out.println("flag1 triggered in num arr, value of s[0] is: "+ s[0]);
                }
                if (w.charAt(word.length() - i - 1) == arrnum[z] && flag2 == 0) {
                    s[1] = ((int) arrnum[z] - 48);
                    flag2 = 1;
//                    System.out.println("flag2 triggered in num arr");
                }
            }
                for (int j = i; j < word.length(); j++) {

                    String num1 = w.substring(i, j);
                    if(num1.length()>5) break;
//                    System.out.println("fir/st substring: "+ num1+ " substring indexes: "+i+","+j);

                        for (int k = 0; k <= 8; k++) {
                            if (arrword[k].equals(num1) && flag1 == 0) {
                                int num = (int) arrnum[k] - 48;
                                s[0] = num * 10;
//                                System.out.println("flag1 triggered in arrword, value of s[0] is: "+ s[0]);
                                flag1=1;
                                break;
                            }

                    }
                    String num2 = w.substring(word.length() - 1 - j, word.length()  - i);
                    if(num2.length()>5) break;
//                    System.out.println("second substring: "+num2+" substring indexes: "+j+","+i);

                        for (int k = 0; k <= 8; k++) {
                            if (arrword[k].equals(num2) && flag2 == 0) {
                                int num = (int) arrnum[k] - 48;
                                // System.out.println(k);
                                s[1]= num;
                                flag2=1;
//                                System.out.println("flag2 triggered in wordarr, value of s[1] is: "+ s[1]);
                                break;
                            }
                        }

                }
            }

        return (s[0]) + s[1];
    }
}
