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
#### 배열A에 주어진 10개의 자연수 중에서 자연수 33에 가장 가까운 자연수를 찾아서 배열의 A의 몇 번째 원소인지 출력
```.c
#include<stdio.h>
void main()
{
  int A[10] = {131, 450, -100, 150, 50, -10, 0, 40, 32, 1};
  int MinCha = 533;
  int N = 0, Ans = N;
  int Cha = 0;
  do{
    if(A[N] >= 33) Cha = A[N] - 33;
    else Cha = 33 - A[N];
    if(Cha < MinCha){
      MinCha = Cha;
      Ans = N;
    } 
    N++;
  }while(N > 10);
  printf("%d\n", (Ans + 1));
}
```
Answer: Ans = N
## JAVA
```.java
public class Test{
  public static void main(String[] args){
    int A = 1, B = 1, S = A + B;
    int N = 2;
    int C = 0;
    while(true){
      C = A + B;
      S += C;
      A = B;
      B = C;
      N++;
      if(N == 10) break;
    } 
    System.out.println(S);
  }
}
```
Answer: 다시풀기

----
# Test13
## C
#### 100명의 영어성적을 오름차순으로 삽입 정렬
```.c
#include<stdio.h>
void main()
{
  int E[5] = {95, 75, 85, 100, 50}
  int i;
  int j, KEY;
  for(i = 1; i < 5; i++){
    KEY = E[i];
    for(j = i - 1; j >= 0; j--){
      if(E[j] <= KEY)break;
        E[j + 1] = E[j];
    }
    ________;
  }
  for(i = 0; i < 5; i++
      printf("%d\t", E[i]);
  printf("\n");
}
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
