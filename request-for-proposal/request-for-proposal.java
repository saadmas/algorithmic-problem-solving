import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int RFP = 0;

    // Go through each RFP
    while (in.hasNextLine()) {
    
        int numReqs = in.nextInt();
        int numProposals = in.nextInt();

        // EoF
        if (numReqs==0 && numProposals==0) {
            break;
        }
        
        // Spaces BETWEEN RFP only
        if (RFP!=0) {
            System.out.println();
        }

        RFP++;
        in.nextLine();
        
        // Store names of all requirements
        LinkedList<String> reqNames = new LinkedList<String>();
        for (int line=0; line<numReqs; line++) {
                reqNames.add(in.nextLine());
        }
            
        String bestProposal = "";
        double lowestPrice = -1;
        String[] proposalNames = new String[numProposals];
        int[] numReqsMetPerProposal = new int[numProposals];
        float[] proposalPrices = new float[numProposals];
        
        // Go through and parse each proposal 
        for (int j=0; j<numProposals; j++) {
            

            proposalNames[j] = in.nextLine();
            proposalPrices[j] = in.nextFloat();
            int numMetReqs = in.nextInt();
            numReqsMetPerProposal[j] = numMetReqs;
            in.nextLine();
            
            for (int k=0; k<numMetReqs; k++) {
                in.nextLine();
            }  
        }
        // ^ done with a proposal loop
        
        // Find proposal that meets most requirements
        int maxReqsIndex = 0;
        for (int p=0; p<numReqsMetPerProposal.length; p++) {
            if (p==0) {
                maxReqsIndex = 0;
            } else {
                if (numReqsMetPerProposal[p] > numReqsMetPerProposal[maxReqsIndex]) {
                    maxReqsIndex = p;
                }
            }
        }
        
        // In case of multiple proposals with same requirements, find the one with lowest price
        // Check proposal for level of compliance
        for (int p=0; p<numReqsMetPerProposal.length; p++) {
            if (numReqsMetPerProposal[p]==numReqsMetPerProposal[maxReqsIndex] && proposalPrices[p]<proposalPrices[maxReqsIndex]) {
                maxReqsIndex = p;
            }
        }
            
        // Output
        if (RFP!=0) {
            bestProposal = proposalNames[maxReqsIndex];
            System.out.println("RFP #"+RFP);
            System.out.println(bestProposal);
        }
    }
    in.close();
  }
}