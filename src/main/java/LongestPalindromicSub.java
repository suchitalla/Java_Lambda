import java.util.Scanner;

public class LongestPalindromicSub {

    public static void main(String args[]){

        longestStr();
    }

    public static void longestStr(){
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        char[] inputchars = input.toCharArray();

        for(int k=3;k<=inputchars.length;k++) {
            //Take More than 2 chars
            String chp = input.substring(0, k);
            StringBuilder first3 = new StringBuilder(chp);

            String revfirst3 = String.valueOf(first3.reverse());
            //check if first and last are same
            int com = chp.compareTo(revfirst3);
            if (com == 0) {
                System.out.println("Palindrome = " + first3);
                System.out.println("Palindrome = " + revfirst3);
            }
        }


    }
}
