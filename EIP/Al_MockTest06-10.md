# Test6
## C
#### S = (100X1)^2 + (99X2)^2 + (98X3)^2 + ... + (2X99)^2 + (1 X 100)^2의 합
```.c
#include<stdio.h>
void main()
{
  int A = 0, B = 0;
  int S = 0, C = 0;
  do{
    A++;
    B = 101 - A;
    C = A * B;
    C = C * C;
    S += C;
  }while(A < 100);
  printf("%d\n", S);
}
```
Answer: 101 - A
## JAVA
```.java
public class Test{
  public static void main(String[] args){
    int score[][] = {{10, 20}.{30, 10},{20, 30}};
    int sum = 1;
    for(int year = 0; year < scroe.length; year++){
      for(int s = 0; s < score[year].length; s++){
        sum *= score[year][s];
      }
    }
    int row = score.length;
    int col = score[0].length;
    System.out.println(sum / (row * col * 1000));
  }
}
```
Answer: 다시풀기

----
# Test7
## C
#### S = 1 - 2 + 3 - 4 + 5 - 6 + ... - 100의 값
```.c
#include<stdio.h>
void main()
{
  int N = 0,  S = 0;
  do{
    N++;
    S += N;
    N++;
    S -= N;
  }while(N != 100);
  printf("%d\n", S);
}
```
Answer: S -= N
## JAVA
```.java
public class Test{
  public static void main(String[] args){
    String text = "Love is a variety of different feelings, states, and" + "attitudes that ranges from interpersonal affection to pleasure.";
    int cnt = 0;
    for(int i = 0; i < text.length(); i++)
      if(text.charAt(i) == 'a')cnt++;
      System.out.println("a문자:" + cnt);
  }
}
```
Answer: a문자: 10

----
# Test8
## C
#### content
```.c
#include<stdio.h>
void main()
{
  int M = 0;
  int i = 0;
  int ENG[10] = {70, 60, 55, 90, 85, 75, 80, 100, 95, 45}; //영어시험 점수
  int MATH[10] = {90, 45, 60, 77, 85, 65, 80, 95, 80, 55}; //수시험 점수
  while(1){
    if(ENG[i] == 100){
      if(MATH[i] > M)
        M = MATH[i];
    }
    i++;
    if(i >= 10) break;
  }
  printf("%d\n", M);
}
```
Answer: MATH[i] >
## JAVA
```.java



```
Answer:

----
# Test
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
# Test
## C
#### content
```.c



```
Answer:
## JAVA
```.java



```
Answer:
