```.c

#include<stdio.h>
void main()
{
  int K = 0;
  double S = 0;
  int SW = 0;
  double L = 0;
  
  do {
    K++;
    L = (double) K / ((K + 1) * (K + 2));
    if(SW == 0){
      S += L;
      SW = 1;
    }
   else{
      S -= L;
      SW = 0;
    }
  }while(K != 49);
  
  printf("%f\n", S);
}
  

```
