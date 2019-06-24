# Test11
## C
#### 4에서 500까지의 자연수 중에서 완전수를 찾아서 출력하고 그 개수를 구하기
```.c
#include<stdio.h>
void main()
{
  int TN = 0;
  for(int N = 4; N <= 500; N++){
    int SUM = 0;
    int K = N / 2;
    for(int J = 1; J <= K; J ++){
      if(N % J == 0)
        SUM += J;
    }
    if( N == SUM){
      printf("N = %d\n", N);
      _______;
    }
  }
  printf("%d\n", TN);
}
```
Answer: 다시풀기
## JAVA
```.java
public class Test{
  public static void main(String[] args){
    int A = 2, D = 3, S = A, N = 2, AN = 0;
    while(true){
      AN = A + (N - 1) * D;
      S = S + AN;
      N = N + 1;
      if(N > 5) break;
    }
    System.out.println(S);
  }
}
```
Answer: 40

----
# Test12
## C
#### content
```.c



```
Answer:
## JAVA
```.java



```
Answer:

----
# Test13
## C
#### content
```.c



```
Answer:
## JAVA
```.java



```
Answer:

----
# Test14
## C
#### content
```.c



```
Answer:
## JAVA
```.java



```
Answer:
----
# Test15
## C
#### content
```.c



```
Answer:
## JAVA
```.java



```
Answer:
