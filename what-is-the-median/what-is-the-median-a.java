import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner (System.in);
	    ArrayList<Integer> intList = new ArrayList<Integer>();
	    
	    while (sc.hasNextInt()) {
	        intList.add(sc.nextInt());
	        Collections.sort(intList);
	        System.out.println(findMedian(intList));
	    }
		sc.close();
	}
	
	public static int findMedian(ArrayList<Integer> intList) {
	    int medianIndex = -1;
	    int listLength = intList.size();
	    boolean evenSize = false;
	    
	    // Even
	    if (listLength%2==0) {
	        medianIndex = listLength/2;
	        evenSize = true;
	    // Odd
	    } else {
	        medianIndex = (listLength+1)/2;
	    }
	    
	    // Account for zero-based indexing 
	    medianIndex--;
	    
	    if (evenSize) {
	        return (intList.get(medianIndex) + intList.get(medianIndex+1))/2;
	    } else {
	        return intList.get(medianIndex);
	    }
	}
}