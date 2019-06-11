### C

## Factor
```.c

#include <stdio.h>
 
main() {
	int i, j;
  
	for (i = 1; i <= 5; i++) 
	{
		printf("%d의 약수 : ", i);
    
		for (j = 1; j <= i; j++) 
		{
			if (i % j == 0)
			{
				printf("%d ", j);
			}
		}
    
		printf("\n");
    
	}
}

```
## modulo

```.c

#include <stdio.h>
 
main() 
{
	int num[5];
 
	for (int a = 0;a <= 4;a++)
	{
		scanf("%d", &num[a]);
	}
 
	int c = 0, count = 0;
	for(int i = 0;i <= 4;i++)
	{
		if ((num[i] % 2) != 0)
		{
			count = count+1;
		}
	}
	printf("%d",count);
}

```
