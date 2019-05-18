import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int numTestCases = in.nextInt();

    for (int testCase=1; testCase<=numTestCases; testCase++) {

        // Store number of creatures and speed of each creature
        int numCreatures = in.nextInt();
        int[] speeds = new int[numCreatures];
        for (int x=0; x<speeds.length; x++) {
            speeds[x]=in.nextInt();
        }

        // Find min speed to run
        int minSpeedToRun = -1;
        for (int i=0; i<speeds.length; i++) {
            int currSpeed = speeds[i];
            if (currSpeed > minSpeedToRun) {
                minSpeedToRun = currSpeed;
            }
        }
        
        System.out.println("Case "+testCase+": "+minSpeedToRun);
    }
    in.close(); 
  }
}