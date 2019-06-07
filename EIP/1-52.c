#include <stdio.h>
int main(){
	SUM = 0;
	N1, N2, N;
	scanf("%d", &N1);
	scanf("%d", &N2);

	for(N = N1; N <= N2; N++){
		SUM = SUM + N;
	}
	printf("%d부터, %d까지 정수의 합은 %d이다.", N1, N2, SUM);

}