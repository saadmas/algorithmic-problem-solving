import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int setNum = 0;
    
    while (sc.hasNextInt()) {
            
        int numStacks = sc.nextInt();
        if (numStacks==0) {
            break;
        }
        
        setNum++;
        sc.nextLine();
        
        // Store heights of stacks and total num of blocks
        int[] stacks = new int[numStacks];
        int totalBlocks = 0;
        for (int i=0; i<stacks.length; i++) {
            stacks[i] = sc.nextInt();
            totalBlocks+=stacks[i];
        }
        
        int equalHeight = totalBlocks/numStacks;
        
        // Set stacks to equal heights
        Arrays.sort(stacks);
        int minMoves = 0;
        for (int i=0; i<stacks.length; i++) {
            while (stacks[i] < equalHeight) {
                addBlocks(stacks, i, equalHeight);
                minMoves++;
            }
        }
        System.out.println("Set #"+setNum);
        System.out.println("The minimum number of moves is "+minMoves+".\n");
        sc.nextLine();
    }
    sc.close();
  }
  
  public static void addBlocks(int[] stacks, int index, int equalHeight) {
      // Find stack with max height
      int maxIndex = -1;
      for (int i=stacks.length-1; i>index; i--) {
          if (stacks[i] > equalHeight) {
              maxIndex = i;
          }
      }
      stacks[maxIndex]--;
      stacks[index]++;
  }
}