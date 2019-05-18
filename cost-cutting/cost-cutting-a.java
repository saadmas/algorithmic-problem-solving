import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    while (in.hasNextInt()) {
        int numTestCases = in.nextInt();
    
    for (int i=1; i<=numTestCases; i++) {
        int salary1 = in.nextInt();
        int salary2 = in.nextInt();
        int salary3 = in.nextInt();
        
        int max = 0;
        if (salary1>salary2 && salary1>salary3) {
            max = salary1;
        } else if (salary2>salary1 && salary2>salary3) {
            max = salary2;
        } else {
            max = salary3;
        }
        
        int min = 0;
        if (salary1<salary2 && salary1<salary3) {
            min = salary1;
        } else if (salary2<salary1 && salary2<salary3) {
            min = salary2;
        } else {
            min = salary3;
        }
        
        int mid = 0;
        if (salary1!=max && salary1!=min) {
            mid = salary1;
        } else if (salary2!=max && salary2!=min) {
            mid = salary2;
        } else {
            mid = salary3;
        }
        
        System.out.println("Case "+i+": "+mid);
    }
    }
    
    
    in.close();

  }
}