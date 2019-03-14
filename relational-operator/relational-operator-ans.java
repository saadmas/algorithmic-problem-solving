import java.util.*;

public class Main {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in); 

    int setsToCompare = in.nextInt();

    for (int i=0; i<setsToCompare; i++) {

        long num1 = in.nextLong();
        long num2 = in.nextLong();

        if (num1 > num2) {
            System.out.println(">");
        } else if (num1 < num2) {
            System.out.println("<");
        } else {
            System.out.println("=");
        }

    }

    in.close();

    }
}