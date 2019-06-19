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
### JAVA
```.java

public lcass Test{
  public static void main(String[] args){
    int[]a = {1,2,3,4,5,6};
    int i = a.length -1;
    while ( i >= 0){
      System.out.print(a[i]);
      i--;
    }
  }
}

Answer: 654321

```
----
