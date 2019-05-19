import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int numTests = in.nextInt();
    in.nextLine();
    
    for (int test=0; test<numTests; test++) {
        
        int numJobs = in.nextInt();
        int myJobPos = in.nextInt(); // zero based indexing of jobs
        Job myJob = new Job(myJobPos,0);
        in.nextLine();
        
        // Add jobs to list
        ArrayList<Job> jobsList = new ArrayList<Job>();
        for (int i=0; i<numJobs; i++) {
            if (i==myJobPos) {
                myJob.priority = in.nextInt();
                jobsList.add(myJob);
            } else {
                Job j = new Job(i, in.nextInt());
                jobsList.add(j);
            }
        }
        
        // Find time taken till specified job 
        int timeTaken = 0;
        boolean updateMax = false;
        int maxPriority = findMaxPriority(jobsList);
        
        while (jobsList.contains(myJob)) {
            // Check job at front
            Job currJob = jobsList.get(0);
            // Put it at end of list if there is a job with higher priority
            if (currJob.priority<maxPriority) {
                jobsList.remove(0);
                jobsList.add(currJob);
            // Else, print it 
            } else {
                updateMax = true;
                jobsList.remove(0);
                timeTaken++;
            }
            
            if (updateMax) {
                maxPriority = findMaxPriority(jobsList);
            }
        }
        
        // Print output and move to next test case
        if (in.hasNextLine()) {in.nextLine();}
        System.out.println(timeTaken);
    }
    in.close();
  }
 
    public static int findMaxPriority(ArrayList<Job> jobsList) {
        int max = -1;
        for (Job j : jobsList) {
            if (j.priority>=max) {
                max = j.priority;
            }
        }
        return max;
    }
}

class Job {
    int index;
    int priority;
    
    Job(int i, int p) {
        index = i;
        priority = p;
    }
}