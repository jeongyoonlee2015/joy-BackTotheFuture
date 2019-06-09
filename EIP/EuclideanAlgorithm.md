# Euclidean Algorithm

```.c

#include <stdio.h>
void swap(int *L, int *R)
{
  int Temp;

  Temp = *L;
  *L = *R;
  *R = Temp;
}

int GCD(int X, intY)
{
  for( ; ; ){
            int M = X % Y;
            if(M == 0)
                  break;
            X = Y;
            Y = M;
            
      }
      return Y;
 }
 
 void main()
 {
  int A, B, R;
  
  printf("두 수를 입력하세요. \n>>> 첫번째 수 =");
  scanf("%d", &A);
  
  printf(">>>두번째 수 = ");
  scanf("%d", &B);
  
  if(A < B) swap(&A, &B);
  R = GCD(A,B);
  
  printf("최대공약수는  %d입니다.\n", R);
}
              
```
