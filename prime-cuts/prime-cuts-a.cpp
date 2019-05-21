#include<stdio.h>
#include<math.h>

int isPrime(int num) {

    for (int i=2; i<=sqrt(num); i++) {
        if (num%i==0) {
            return 0;
        }
    }
    return 1;
}

int main() {
    
    int i, j=1, maxNum, printCount, primesArr[500];
    primesArr[0]=1;
    
    // Find and store primes 
    for(i=2; i<1005; i++) {
        if (isPrime(i)) {
            primesArr[j]=i;
            j++;
        }
    }
    
    while (scanf("%d%d",&maxNum,&printCount)==2) {
        
        printf("%d %d:",maxNum,printCount);
        
        int count=0;
        for (i=0; primesArr[i]<=maxNum; i++) {
            count++;
        }
        
        if (printCount > (count+1)/2) {
            printCount = (count+1)/2;
        }
        
        // Even #prints
        if (count%2==0) {
            
            for (j=count/2 -printCount; j<=count/2 + printCount-1; j++) {
                printf(" %d",primesArr[j]);
            }
            
            printf("\n\n");

        // Odd #prints
        } else {
            for (j=count/2 -(printCount-1); j<=count/2 + printCount-1; j++) {
                printf(" %d",primesArr[j]);
            }
            printf("\n\n");
        }
    }
    return 0;
}