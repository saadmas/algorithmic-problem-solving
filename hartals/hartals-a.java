import java.util.*;

class Main {
  public static void main(String[] args) {
      
    // Get num tests
    Scanner sc = new Scanner(System.in);
    int numTests = sc.nextInt();
    sc.nextLine();
    
    for (int test=0; test<numTests; test++) {
        
        int numDays = sc.nextInt();
        sc.nextLine();
        
        int numParties = sc.nextInt();
        sc.nextLine();
        
        boolean[] hArr = new boolean[numDays];
        for (int i=0; i<numParties; i++) {
            findDaysLost(sc.nextInt(), numDays, hArr);
            if(sc.hasNextLine()) {
                sc.nextLine();
            }
        }

        int daysLost = 0;
        for (int i=0; i<numDays; i++) {
            if (hArr[i]) {
                daysLost++;
            }
        }
        
        System.out.println(daysLost);
    }
    sc.close();
  }
  
  public static void findDaysLost (int h, int numDays, boolean[] hArr) {
      int currDay = h;

      while (currDay <= numDays) {
          // No hartals on Fri or Sat
          if (currDay%7!=6 && currDay%7!=0) {
            hArr[currDay-1] = true;
          }
          // Move to next hartal
          currDay+=h;
      }
  } 
}