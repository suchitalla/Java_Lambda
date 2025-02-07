import java.util.Scanner;

public class zigzag {
    public static void main(String args[]){
        printZigZag();

    }

    public static void printZigZag(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String zig = sc.nextLine();
        System.out.println("Enter Number Of Rows");
        int zigL = sc.nextInt();
        int strLen = zig.length();
        char[] zigC = zig.toCharArray();
        int arrl = (int) Math.ceil(strLen/zigL);
        String zig1 = "";
        String zig2 = "";
        String zig3 = "";
        for(int i=0;i<zig.length();i++){
            if(i%3==0)
            {
                zig3 = zig3+zigC[i];
                zig2 = zig2+ " ";
                zig1 = zig1+" ";

            }else if(i%2 ==0)
            {
                zig3 = zig3 + " ";
                zig2 = zig2 + zigC[i];
                zig1 = zig1 + " ";

            }else
            {
                zig3 = zig3 + " ";
                zig2 = zig2+ " ";
                zig1 = zig1 + zigC[i];

            }

        }

        System.out.println(zig1);
        System.out.println(zig2);
        System.out.println(zig3);


    }
}
