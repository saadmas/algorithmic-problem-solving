#include <iostream>
#include <cstdio>
#include <algorithm>
using namespace std;

const int maxn = 30;
int N;

struct task {
	int a , b;
} T[maxn];

bool cmp (task t1 , task t2){
	if (t1.b > t2.a && t2.b > t1.a) return t1.a<t2.a;
	if (t1.b > t2.a) return t2.b<t2.a;
	if (t2.b > t1.a) return t1.a<t1.b;
	return t2.b<t1.b;
}

void initial() {
	for (int i = 0; i < maxn; i++) {
		T[i].a = 0;
		T[i].b = 0;
	}
}

void readcase() {
	int cost;

	for (int i = 0; i < N; i++) {
		scanf("%d" , &cost);
		T[i].a = cost;
	}

	for (int i = 0; i < N; i++) {
		scanf("%d" , &cost);
		T[i].b = cost;
	}
}

void computing() {
	sort(T , T+N , cmp);
	int ans = 0 , now = 0;
	
    for (int i = 0; i < N; i++){
		if (ans < now+T[i].a) ans = now+T[i].a+T[i].b;
		else ans += T[i].b;
		now += T[i].a;
	}
	printf("%d\n" , ans);
}

int main() {
	while (scanf("%d" , &N) != EOF){
		initial();
		readcase();
		computing();
	}
	return 0;
}