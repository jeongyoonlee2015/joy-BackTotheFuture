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
