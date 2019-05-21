#include<stdio.h>
#include <string.h>
#include <iostream>
#include <algorithm>
using namespace std;

const int MAXN=1010;
struct Node {
    int B,J;
} node[MAXN];

bool cmp (Node a, Node b) {
    return a.J > b.J;
}

int main() {
    int n;
    int iCase=0;
    
    while (scanf("%d",&n) == 1 && n) {
        iCase++;

        for (int i=0;i<n;i++) {
            scanf("%d%d",&node[i].B,&node[i].J);
        }
          
        sort(node,node+n,cmp);
        int ans=0;
        int tmp=0;
        
        for (int i=0;i<n;i++) {
            tmp+=node[i].B;
            ans=max(ans,tmp+node[i].J);
        }
        
        printf("Case %d: %d\n",iCase,ans);
    }
    return 0;
}