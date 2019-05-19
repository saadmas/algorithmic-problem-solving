#include<stdio.h>
int main(){

	int t=1;
	int n;

	while(scanf("%d",&n)==1&&n>=0) {
		printf("Case %d:\n",t++);

		int sum=n,i;
		int m[12];
		int need[12];

		for (i=0;i<12;i++)
			scanf("%d",&m[i]);

		for (i=0;i<12;i++)
			scanf("%d",&need[i]);

		for (i=0;i<12;i++) {
			if (sum>=need[i]) {
				printf("No problem! :D\n");
				sum-=need[i];
			} else {
                printf("No problem. :(\n");
            }	
			sum+=m[i];
		}
	}
	return 0;
}