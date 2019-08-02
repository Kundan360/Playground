#include<stdio.h>
int main()
{
  long int a,n,i,k=1,j=0;
  scanf("%ld",&n);
  while(n!=0)
  {
    a=n%8;
    k=k*10+a;
    n=n/8;
  }
  
  while(k!=1)
  {
    i=k%10;
    j=j*10+i;
    k=k/10;
  } 
  printf("%ld",j);
  return 0;
}