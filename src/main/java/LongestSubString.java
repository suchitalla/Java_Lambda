import java.util.*;

/**
 * Given a string s, find the length of the longest
 * substring
 *  without repeating characters.
 */
public class LongestSubString {

    public static void main(String[] args){
        if(args.length == 1) {
            String inputStr = args[0];
            int len = longSubstring(inputStr);
            System.out.println("Max Len = " + len);
        } else{
            System.out.println("No Input or improper Input");
        }
    }

    //Not working
    public static int longSubstring(String inputStr){

        //find substring with non-repeating characters

        int len = inputStr.length();
        //arrange the chars in ascending order
        char[] sorarr = inputStr.toCharArray();

        for(int k=0; k < len;k++) {
            for (int i = 0; i < len - 1; i++) {
                int j = i + 1;
                if (sorarr[i] > sorarr[j]) {
                    char exc = sorarr[j];
                    sorarr[j] = sorarr[i];
                    sorarr[i] = exc;
                }
            }
        }

        int[] samechars = new int[len/2];
        Arrays.fill(samechars, -1);
        int k=0;
        for (int i = 0; i < len - 1; i++) {
            int j = i + 1;
            if (sorarr[i] == sorarr[j]) {
                samechars[k] = i;
                k++;
            }
        }


        HashSet<Integer> hs = new HashSet<Integer>();
        for (int d=0;d<len/2;d++){
           if(samechars[d] == -1){
               break;
           } else{
               hs.add(d);
           }
        }

        String[] l1=new String[ hs.size()+1];
       String newIn = new String(sorarr);
        for(int l=0; l <= hs.size();l++) {
            if(l == 0) {
                l1[l] =  newIn.substring(0, samechars[l]+1);
                System.out.println("Longest String " + l1[l]);
            }else if(samechars[l] == -1 ){
                l1[l] = newIn.substring(samechars[l-1] + 1);
                System.out.println("Longest String " + l1[l]);
            }else if(samechars[l] != -1 ){
                l1[l] = newIn.substring(samechars[l-1] + 1,samechars[l]+1);
                System.out.println("Longest String " + l1[l]);
            }
        }

        HashMap<String,Integer> longLen = new HashMap<String,Integer>();
        for(String str: l1){
            longLen.put(str,str.length());
        }
        int maxlen = Collections.max(longLen.values());

        String key = getKeyByValue(longLen, maxlen);
        if (key != null) {
            System.out.println("Key for value " + maxlen + " is: " + key);
        } else {
            System.out.println("Value " + maxlen + " not found in the map.");
        }

        return maxlen;

    }

    public static <K, V> K getKeyByValue(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null; // Return null if the value is not found
    }
}