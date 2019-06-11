### C

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
