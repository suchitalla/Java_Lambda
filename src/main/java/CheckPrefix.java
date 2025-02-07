import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

//O(n)
public class CheckPrefix {

    public static void main(String args[]) {

        String type = null;
        if(args.length > 0) {

            type = args[0];

            switch (type) {
                case "File":
                    chkInFile();
                    break;
                case "Input":
                    chkInInputString();
                    break;
            }
        }

    }

    public static void chkInFile() {

        Path f = Paths.get("C:\\Suchi\\Software-Code\\Java_Lambda\\src\\main\\resources\\Part1.txt");
        try (Scanner sc = new Scanner(f)) {

            while (sc.hasNextLine()) {

                String firts = sc.next();
                if (firts.startsWith("Sp")) {
                    System.out.println(firts);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static void chkInInputString() {

        Path f = Paths.get("C:\\Suchi\\Software-Code\\Java_Lambda\\src\\main\\resources\\Part1.txt");

        try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter a String");
            while (sc.hasNext()) {
                String firts = sc.next();
                if (firts.startsWith("Sp")) {
                    System.out.println(firts);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}