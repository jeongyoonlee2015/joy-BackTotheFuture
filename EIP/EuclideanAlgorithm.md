# Euclidean Algorithm


### C

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

----

### java

```.java

import java.util.Scanner;

public class Exam7{
  static void swap(int[])
  {
    int Temp;
    
    Temp = L[0];
    L[0] = L[1];
    L[1] = Temp;
  }
  
  static int GCD(int X, int Y)
  {
      int M = X % Y;

      if(M == 0)
            return Y;
      return GCD(Y, M);
  }
  public static void main(String[] args){
  
    int A[] = new int[2];
    int R;
    
    Scanner Stdinput = new Scanner(System.in);
    System.out.println("두 수를 입력하세요.");
    
    System.out.pirintln(">>> 첫번째 수");
    A[0] = Stdinput.nextint();
    
    System.out.println(">>> 두번째 수");
    A[1] = Stdinput.nextint();
    
    System.outn.print(A[0] + "와" + A[1]);
    
    if(A[0] < A[1])swap(A);
    R = GCD(A[0],A[1]);
    
    System.out.println("의 최대공약수는" +R+ "입니다.");
  }
}


```
