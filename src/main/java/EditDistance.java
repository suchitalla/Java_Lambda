import java.util.Scanner;

public class EditDistance {

    public static void main(String args[]){
for(int i=0;i<2;i++) {
    editdistance();
}

    }

    public static void editdistance(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word to be converted which word and number of operations executed");

        String word1 = sc.next(); //word1 = horse
        String word2 = sc.next();//word2 = ros
        int times = sc.nextInt(); //insert, delete, replace

//         String word1 = "horse"; //word1 = horse
//         String word2 = "ros";//word2 = ros

        //Operation 1
        char[] word1c = word1.toCharArray();
        char[] word2c = word2.toCharArray();


        for(int i=0;i<word2.length();i++)
        {
            ////Operation 2
            if(word1c[i] != word2c[i]){
                word1c[i] = word2c[i];
            }

        }

        //Operation 3
        String word1cs = new String(word1c).substring(0,word2.length());

        System.out.println(word1cs);

        sc.close();
        word1 = null;
        word2 = null;
        word1c = null;
        word2c = null;
        word1cs = null;


    }
}
