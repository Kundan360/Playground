#include<stdio.h>
int main()
{
  int a=0,b=1,i,n,k;
  scanf("%d",&n);
  printf("%d %d ",a,b);
  for(i=0;i<n-2;i++)
  {
    k=a+b;
    a=b;
   b=k;
    printf("%d ",k);
  }
  
  return 0;
}