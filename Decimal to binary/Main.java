#include<stdio.h>
int main()
{
  long int n,k=1,d=0,i,z;
  scanf("%ld",&n);
  z=n;
  while(n!=0)
  {
    if(n%2==0)
      k=(k*10)+0;
    else
      k=k*10+1;
    n=n/2;
  }
  n=z;
  while(k!=1)
  {
    i=k%10;
    d=d*10+i;
    k=k/10;
  }
  printf("%ld",d);
  return 0;
}