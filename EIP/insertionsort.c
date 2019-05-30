/*Insertion Sort
:Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
삽입정렬: 아직 정렬되지 않은 임의의 데이터를 이미 정렬된 부분의 적절한 위치에 삽입해 가며 정렬하는 방식
*/

#include <stdio.h>
int main()
{
  int AR[31], AR_init[31];
  int KEY, w, m;

  for(w=1; w < 31; w++)
  {
    scanf("%d", &AR[w]);
    AR[w] = rand();
    AR_init[w] = AR[w];
  }
  for(m = 2; m <= 30; m++)
  {
    KEY = AR[m];
    w = m - 1;

    while(w >= 1)
    {
      if(KEY < AR[w])
      {
        AR[w + 1] = AR[w];
        w = w - 1;
      }
      else
        break;
    }
    AR[w + 1] = KEY;
  }
  for(w = 1; w < 31; w++)
    printf("%d.\t %d\t %d\n", w, AR_init[w], AR[w]);

  return 0;
}
