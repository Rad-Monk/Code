import java.util.HashMap;
import java.util.Map;

class learn {
    public String frequencySort(String s) {
        String ret= "";
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i =0; i< s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.replace(s.charAt(i),map.get(s.charAt(i))+1);
            }else {
                map.put(s.charAt(i),1);
            }
        }
        int[] value= new int[map.size()];
        char[] key= new char[map.size()];
        int k=0;
        for(Map.Entry<Character, Integer> m : map.entrySet()){
//            System.out.println("values: "+m.getValue()+" keys: "+m.getKey());
            value[k]= m.getValue();
            key[k]= m.getKey();
            k++;
        }
        int i, j, temp;
        char temp2;
        boolean swapped;
        int n= map.size();
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (value[j] < value[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = value[j];
                    temp2= key[j];
                    value[j] = value[j + 1];
                    key[j]= key[j+1];
                    value[j + 1] = temp;
                    key[j+1]= temp2;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        StringBuilder list= new StringBuilder();
        for(int x =0; x<map.size();x++){
            int c= map.get(key[x]);
            while(c!=0) {
                list.append(key[x]);
                c--;
            }
        }
        ret= list.toString();


        return ret;
    }
    public static void main(String[] args){
        String s= "Aabb";
        learn obj= new learn();
        System.out.println(obj.frequencySort(s));
    }
}