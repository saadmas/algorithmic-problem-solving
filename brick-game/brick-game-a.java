import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int numTests = sc.nextInt();
		sc.nextLine();
		
		for (int testCase=1; testCase<=numTests; testCase++) {
		    
		    int teamSize = sc.nextInt();
		    int captainIndex = (teamSize+1)/2;
		    
		    for (int i=0; i<captainIndex-1; i++) {
		        sc.nextInt();
		    }

		    int captain = sc.nextInt();
		    System.out.println("Case "+testCase+": "+captain);
		    sc.nextLine();
		}
		sc.close();
	}
}