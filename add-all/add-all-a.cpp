#include <iostream>
#include <vector>
#include <queue>
using namespace std;

int main() {
    
    int numCount;
    priority_queue<int, vector<int>, greater<int> > pq;
    
    // Go through each test case until EoF
    while(scanf("%d", &numCount) && numCount) {
        
        // New heap for each test case 
        while (!pq.empty()) {
	        pq.pop();
        }
        
        // Add numbers to min heap
        for (int i = 0; i < numCount; i++) {
		    int currNum;
            scanf("%d", &currNum);
	        pq.push(currNum);
        }
        
        // Find sum by adding mins of min-heap
        int sum = 0;
	    while (pq.size() > 1)  {
	        
    	    int min1 = pq.top();
    		pq.pop();
    		
    		int min2 = pq.top();
    		pq.pop();
    		int min = min1 + min2;
    		
    		sum += min;
    		pq.push(min);
	    }
	    
	    // Print output for each test case
	    cout << sum << endl;
    }
    return 0;
}