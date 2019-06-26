# 2017_01
### C: Min
```.c
.
.
.
for(i = 0; i <= 9; i++)
{
  if(min > num[i]); //min보다 작으니까 최소값에 넣기
    min = num[i];
}

```
Answer: num[i]

### JAVA: Sort
```.java

// pause

```

----
# 2018_01
## C
#### 5개의 정수를 입력받아 홀수의 개수를 구하여 출력하기
```.c
#include<stdio.h>
void main(){
  int i, a[5], cnt = 0;
  for(i = 0; i < 5; i++)
    scanf("%d", &a[i]);
    
  for(i = 0; i < 5; i++){
    if(a[i] % 2 != 0)
      cnt = cnt + 1;
  }
  printf("홀수의 개수: %d개", cnt);
}
```
### 약수 출력하기
1의 약수: 1

2의 약수: 2

3의 약수: 13

4의 약수: 124

5의 약수: 15
```.c
#include<stdio.h>
void main(){
  int i, j;
  for(i = 1; i <= 5; i++){
    printf("%d의 약수: ", i);
    for( j = 1; j <= 5; j++){
      if(i % j == 0)
        printf("%d", j);
    }
    printf("\n");
  }
  return 0;
}
```

## JAVA
#### 출력 형식 보고 빈칸에 알맞은 답 쓰기
01234

12345

23456
```.java
public class Problem{
  public static void main(String[] args){
    int[][] a = new int[3][5];
    for(int i = 0; i < 3; i++){
      a[i][j] = i + j;
      System.out.printf("%d", a[i][j]);
    }
    system.out.println();
  }
}
```
