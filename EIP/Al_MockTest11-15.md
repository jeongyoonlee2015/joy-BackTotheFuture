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
public class Test{
  public static void main(String[] args){
    int N = 0, S = 0;
    do{
      N++;
      S +=N;
      N++;
      S -= N;
    }while(N != 10);
    System.out.println(S);
  }
}
```
Answer:

----
# Test14
## C
#### 100명의 영어성적을 오름차순으로 선택정렬
```.c
#include<stdio.h>
void main(){
  int E[5] = {95, 75, 85, 100, 50};
  int i = 0, Temp;
  do{
    int j_____;
    do{
      if(E[i] > E[j]){
        Temp = E[i];
        E[i] = E=[j];
        E[j]= Temp;
      }
      j++;
    }while(j < 5);
    i++;
  }while(i < 4);
  for(int a = 0; a < 5; a++)printf("%d\t", E[a]);
  printf("\n");
}
```
Answer:
## JAVA
```.java
public class Test{
  public static void main(String[] args){
    int A[][] = new int[5][5];
    int V = 1;
    int R = 0;
    int C;
    do{
      C = R;
      do{
        A[R][C] = V;
        V++;
        C++;
      }while(C <= 4);
      R++;
    }while(R <= 4);
  }
}
```
Answer:
----
# Test15
## C
#### 학생 10명의 점수가 배열T에 주어질 때 평균점수보다 높은 점수를 얻는 학생들의 수를 계산하는 프로그램
```.c
#include<stdio.h>
void main(){
  int T[10] = {55, 66, 78, 25, 48, 95, 100, 95, 73, 70};
  int S = 0;
  int i = 0;
  do{
    S += T[i];
    i++;
  }while(i < 10);
  double M = S / 10;
  int CNT = 0;
  i = 0;
  do{
    if(T[i] > M)CNT++;
    i++;
  }while(i < 10);
  printf("퍙균점 %.2lf보다 높은 성적의 학생수: %d\n", M, CNT);
}
```
Answer: T[i] > M
## JAVA
```.java
public class Test{
  public static void main(String[] args){
    char A[][] = {{'A', 'B', 'C', 'D', 'E'},{'F', 'G', 'H', 'I', 'J'}, {'K', 'L', 'M', 'N', 'O'}, {'P', 'Q', 'R', 'S', 'T'}, {'U', 'V', 'W', 'X', 'Y'}};
    char B[][] = new char[5][5];
    int N;
    for(int R = 0; R <= 4; R++){
      for(int C = 0; C <= 4; C++){
        N = 4 - R;
        B[C][N] = A[R][C];
      }
    }
  }
}

```
Answer:
