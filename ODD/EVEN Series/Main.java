#include<stdio.h>
int main()
{
int n;
  scanf("%d",&n);
  if(n%2==0)
    n=(n/2)-1;
  else
    n=n-1;
  printf("%d",n);
return 0;	
}