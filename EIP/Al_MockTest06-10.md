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
public class Test{
  public static void main(String[] args){
    String date = new String("2018-01-08");

    String s[] = date.split("-";
    System.out.print(s[0] + "년" + s[1] + "월" + s[2] + "일=> ");

    for(int i = 1; i < s.length; i++){
      if(10 > Integer.parseint(s[i]) && s[i].contains("0"))
        s[i] = s[i].replace("0", ""); 
    }
    System.out.println(s[0] + ". " + s[1] + ". " + s[2]+ ".");
  }
}
```
Answer: 2018년01월08일=> 2018. 1. 8.

----
# Test9
## C
#### 1부터 100사이 가장 큰 소수 구하기
```.c
#include<stdio.h>
#include<math.h>
void main()
{
  int P = 2;
  int N = 1;
  while(1){
    int M = int(sqrt(double(N)));
    for(int = 2; i <= M; i++){
      int R = ;
      if(R == 0)
        break;
      if(i == M)
        P = N;
    }
    N++;
    if(N > 100) break;
  }
  printf("%d\n", P);
}
```
Answer: 다시풀기
## JAVA
```.java
public class Test{
  public static void main(String[] args){
    String path = "C:/Users/Downloads/test.txt";
    String dir, fileName, ext;

    int index = path.lastIndexOf(".");
    int fdir = path.lastIndexOf("/");
    if(index == -1) return;
    dir = path.substring(0. fdir);
    fileName = path.substring(fdir + 1, index);
    ext = path.substring(index + 1);
    System.out.println("디렉토리:" + dir + "\n파일명:" + fileName);
    System.out.println("확장자:" + ext);
  }
}
```
Answer: 다시풀기

----
# Test10
## C
#### 3의 배수이면서 4의 배수인 숫자의 개수 구하기
```.c
#include<stdio.h>
void main()
{
  int A[10] = {21, 17, 4,51, 24, 75, 40, 27, 48, 72};
  int CNT = 0;
  int i = 0;

  do{
    int N3 = A[i] % 3;
    int N4 = A[i] % 4;
    int N = N3 + N4;

    if(N == 0)CNT++;
    i++;
  }while(i < 10);
  printf("%d\n", CNT);
}
```
Answer: == 0
## JAVA
```.java
public class Test{
  public static void main(String[] args){
    int M = 1;
    int N = 1;
    While(true){
      M = M * N;
      N = N + 1;
      if(N > 5)break;
    }
    System.out.println(M);
  }
}
```
Answer: 120(주의!)
