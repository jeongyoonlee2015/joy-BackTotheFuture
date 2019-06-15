```.java

public class MinMax{
  public static void main(String[] args){
    int a[] = {10,30,50,70,90};
    int i, min, max;
    min = a[0];
    max = a[0];
    
    for(i = 0; i < 5; i++){
      if(a[i] > max) // or a[i] >= max;
        max = a[i];
      
      if(a[i] < min) // or a[i] <= min;
        min = a[i];
      
      }
      
      System.out.printf("%d\n", max);
      System.out.printf("%d\n", min);
  }
}
```
