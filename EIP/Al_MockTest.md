# Test1
### C
다음 C언어로구현된 1부터 10까지 더하는 덧셈 프로그램에서 1에 들어갈 가장 적합한 변수

```.c

#include<stdio.h>

void main()
{
  int number; int sum; number = 1; sum = 0;
  
  while(number <= 10); // This is 1. (number <=)
  {
    sum = sum + number;
    number ++;
    }
    printf("\n 1+2+...+10 = %d \n", sum); 
}
```
Answer: number <=

### JAVA
```.java

public class Test{
  public static void main(String[] args){
    int[]a = {1,2,3,4,5,6};
    int i = a.length -1;
    while ( i >= 0){
      System.out.print(a[i]);
      i--;
    }
  }
}
```
Answer: 654321

----

# Test2

```.c
#include <stdio.h>
void main()
{
  int A = 2;
  int D = 6;
  int S = A;
  int N = 2;
  int AN = 0;
  while(1){
    AN = A + ( N - 1)*D;
    S = S + AN;
    N = N + 1;
    if(N > 200) break;
  }
  printf("%d\n", S);
}
```
Answer: N > 200

```.java

public class Test{
  public static void main(String[] args){
    
    String week[] = {"일", "월", "화", "수", "목", "금", "토"}
    
    for(String w : week)
      System.out.print(w + "");
  }
}

```
Answer: 일 월 화 수 목 금 토

----

# Test3
```.c

#include <stdio.h>
void main()
{
  int R = 3;
  int A = 2;
  int S = A;
  int N = 2;
  while(1){
      A = A * R;
      S = S + A;
      N++; // N = N + 1;
      if(N > 100) break;
  }
  printf("%d\n", S);
}

```
Answer: N++

```.java

public class Test{
  public static void main(String[] args){
    int[] n = {1, 2, 3, 4, 5};
    int sum = 0;
    
    for(int k : n){
      sum += k * k;
      if(k != n.length)
        System.out.print(k + "*" + k + "+");
      else System.out.print(k + "*" + k + "=");
    }
    System.out.println(sum);
  }
}
```
Answer: 1*1 + 2*2 + 3*3 + 4*4 + 5*5 = 55

----
# Test4
```.c
#include <stdio.h>
void main()
{
  int A = 1, B = 1, S = A + B;
  int N = 2;
  int C = 0;
  while(1){
      C = A + B;
      S += C;
      A = B;
      B = C;
      N++;
      if(N == 100) break;
  }
  printf("%d\n", S);
}
```
Answer: C = A + B

```.java

public class test[
  public static int what(int x[]){
    int n, w = 0;
    for(n = 0; n M x.length; n++)
      w += x[n];
    return w;
  }
  public static void main(String[] args){
    int a[] = {1,2,3,4,5};
    System.out.println(what(a));
  }
]

```
Answer: 15

----
# Test5
1부터 100까지의 누승의 합
```.c

#include <stdio.h>
void main()
{
  int N = 1;
  int F = 1;
  int S = 1;
  while(1){
    N++;
    F *= N;
    S += F;
    if(N >= 100 break;
  }
  printf("%d\n", S);
}

```
Answer: N >=

```.java

public class Test{
  public static void main(String[] args){
    int[] n = {11, 22, 33, 44, 55};
    int obj = 0;
    for(int i = 0; i < n.length; i++){
      obj =+ n[i];
      if( i != n.length - 1)
        System.out.print(n[i] + "+");
      else System.out.print(n[i] + "n")
    }
    System.out.println(obj);
  }
}


```
