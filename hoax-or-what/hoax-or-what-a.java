import java.util.*;

class Main {
  public static void main(String[] args) {
      
    // Get num tests
    Scanner sc = new Scanner(System.in);
    int numDays = sc.nextInt();
    
    // EoF 
    while (numDays!=0) {
        sc.nextLine();
        
        long totalPaid = 0;
        LinkedList<Integer> urn = new LinkedList<Integer>();
        
        // Calculate pay-out at end of each day
        for (int i=0; i<numDays; i++) {
            
            boolean billAdded = false;
            int numBills = sc.nextInt();
           
            
            for (int bill=0; bill<numBills; bill++) {
                int currBill = sc.nextInt();
                urn.add(currBill);
                if (bill==0) {billAdded = true;}
            }
     
            // Add the day's pay-out to total pay-out of promo
            if (billAdded) {Collections.sort(urn);}
            int maxBill = urn.remove(urn.size()-1);
            int minBill = urn.remove(0);

            maxBill-=minBill;
            totalPaid+=maxBill;
            sc.nextLine();
        }
        
        System.out.println(totalPaid);
        // Next test case
        numDays = sc.nextInt();
    }
    sc.close();
  }
}