import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    // Address each test case
    while (in.hasNextLine()) {
        // Store trip info
        int numPpl = in.nextInt();
        int budget = in.nextInt();
        int numHotels = in.nextInt();
        int numWeeks = in.nextInt();
        
        int minCost = Integer.MAX_VALUE;
        
        // Check each hotel 
        for (int i=0; i<numHotels; i++) {
            // Get price of hotel per person per weekend
            int hotelPricePerPerson = in.nextInt();

            in.nextLine();
            
            // Get num of beds available at hotel each weekend
            String[] bedsPerWeekString = in.nextLine().split(" ");

            for (int j=0; j<bedsPerWeekString.length; j++) {
                int bedsThisWeek = Integer.parseInt(bedsPerWeekString[j]);
                // Check if enough beds during a weekend
                if (bedsThisWeek>=numPpl) {
                    // Check if lowest price that weekend
                    if (hotelPricePerPerson*numPpl < minCost) {
                        minCost = hotelPricePerPerson*numPpl;
                    }
                }
            }
        }
        
      
        if (minCost < budget) {
            System.out.println(minCost);
        } else {
            System.out.println("stay home");
        }
    }
    in.close();
  }
}