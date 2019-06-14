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

```.java

public class zigzagArray{
	public static void main(String[] args){
		int length = 5;
		int output = length;
		int[][] array = new int[length][length];
		int i, j;
		int SW = 1;
		int k = 1;

		for(i = 0; i < length; i++){
			if(SW == 1){
				for(j = 0; j < length; j++){
					array[i][i = k;
					k = k+1;
				}
			}
			else{
				for(j = length - 1; j >= 0; j--){
					array[i][j] = k;
					k = k+1;
				}
			}
			SW = SW * (-1);
		}

		for(i = 0; i < 5; i++){
			for(j = 0; j < 5; j++){
				System.out.printf("%2d", array[i][j]);
			}
			System.out.println();
		}
	}
}

```

