#include<stdio.h>
int main()
{
  int i,n,a,b,k=1;
  scanf("%d",&n);
  if(n%2==0)
  {
    a=n/2;
    b=3;
  }
  else
  {
    a=(n/2)+1;
    b=2;
  }
  for(i=1;i<a;i++)
    k=b*k;
  printf("%d",k);
  return 0;
}