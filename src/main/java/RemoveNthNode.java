import java.util.LinkedList;
import java.util.Scanner;

public class RemoveNthNode {

    public static void main(String args[]){
//        removeNthNode();
        rotateList();
    }

    public static void removeNthNode(){

        LinkedList<Integer> app = new LinkedList<>();
        app.add(1);
        app.add(2);
        app.add(3);
        app.add(4);
        app.add(5);
        app.add(6);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter node to be removed");
        int i = sc.nextInt();

        app.remove(i-1);
        app.stream().forEach(System.out::println);

    }


    public static void rotateList(){


        LinkedList<Integer> app = new LinkedList<>();
        app.add(1);
        app.add(2);
        app.add(3);
        app.add(4);
        app.add(5);
        app.add(6);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rotations");
        int i = sc.nextInt();
        for(int j=1;j<=i;j++) {
            int chng = app.removeLast();
            app.addFirst(chng);
        }
        app.stream().forEach(System.out::println);

    }
}
