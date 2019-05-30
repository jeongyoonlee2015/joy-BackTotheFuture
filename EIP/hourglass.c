/*
1234567
 23456
  345
   4
  345
 23456
1234567
*/
#include <stdio.h>

int main()
{
  int A[8][8]={0,};
  int C, T, J, Q, SMALL, LARGE;

  C =4;
  T = 0, J = 0, Q = 0;
  SMALL = 1;
  LARGE = 7;
  for (T = 1; T <= 7; T++)
  {
    Q = SMALL;
    for(J = SMALL; J <= LARGE; J++)
    {
      A[T][J] = Q;
      Q++;
    }
    if(T < C)
      SMALL++, LARGE--;
    else
      SMALL--, LARGE++;
  }
  for(T = 1; T <= 7; T++)
  {
      for(J = 1; J <= 7; J++)
        printf(" %d ", A[T][J]);
      printf("\n");
  }
}
