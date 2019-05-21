#include<queue>
#include<cstdio>
#include<cstring>
using namespace std;

int main() {

    int numTeams;
    int testCase = 1;

    // Go through each test case 
    while (scanf("%d",&numTeams)!=EOF && numTeams!=0) {
        printf("Scenario #%d\n", testCase);

        queue<int> q[1002];
        queue<int> teamQ;
        int teamSize;
        int currPerson;
        char command [10];

        int pplArr [1000000];
        bool teamArr [1000];
    
        // Parse each team
        for (int i = 1; i <= numTeams; i++) {
            scanf("%d", &teamSize);
            teamArr[i] = false;
            for (int j = 0; j < teamSize; j++) {
                scanf("%d", &currPerson);
                pplArr[currPerson] = i;
            }
        }

        // Keep going till STOP command
        while (scanf("%s",command)!=EOF && strcmp(command,"STOP")!=0) {
            // Enq
            if (!strcmp(command, "ENQUEUE")) {
                scanf("%d", &currPerson);
                // Case: Not in team
                if (!teamArr[pplArr[currPerson]]){
                    teamQ.push(pplArr[currPerson]);
                    teamArr[pplArr[currPerson]] = true;
                }
                q[pplArr[currPerson]].push(currPerson);

            // Deq
            } else {

                int top = teamQ.front();
                printf("%d\n", q[top].front());
                q[top].pop();

                if (q[top].empty()) {
                    teamQ.pop();
                    teamArr[top] = false;
                }
            }
            
        }
        // Move to next test case
        printf("\n");
        testCase++;
    }
    return 0;
}