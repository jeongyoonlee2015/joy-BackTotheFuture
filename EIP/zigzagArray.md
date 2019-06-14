# Zigzag

```.c
#include <stdio.h>

int main()
{
	int SON[6][6];
	int R, C, TR, START, END, SW, K;

	TR = 0, START = 1, END = 5, SW = 1, K = 0;

	for(R = 1; R !=6; R++)
	{
		for(C = START; C != (END + SW); C +- SW) // % 연산으로 바꿔도 될 듯
		{
			K = K + 1;
			SON[R][C] = K;
		}

		TR = START;
		START = END;
		END = TR;
		SW = SW*(-1);
	}

	for(R = 1; R < 6; R++)
	{
		for(C = 1; C < 6; C++)
			printf("%d\t", SON[R][C]);
		printf("\n")
	}

	return 0;
}

```
