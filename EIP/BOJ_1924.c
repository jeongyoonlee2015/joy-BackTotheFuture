#include <stdio.h>

int Month[13] = { 0,31,28,31,30,31,30,31,31,30,31,30,31 };
char *Week[7] { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

int main() {
	int mon, d;
	
  scanf("%d %d", &mon, &d);
	
  for (int i = 1; i < mon; ++i) {
		day += Month[i];
	}
  
	printf("%s\n", Week[d % 7]);
	return 0;
}
