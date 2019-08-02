#include<stdio.h>
int main()
{
  long int n,i=0,x=0,m;
  scanf("%ld",&n);
  while(n!=0)
  {
    m=n%10;
    x=x+(m*power(i));
    i++;
    n=n/10;
  }
  printf("%d",x);
  return 0;
}
int power(n)
{
  int i,k=1;
  for(i=1;i<=n;i++)
    k=k*2;
  return k;
}