#include<stdio.h>
int main()
{
	long int s=1,i,n;
     scanf("%ld",&n);
   for(i=1;i<=n;i++)
     s=s*i;
  printf("%ld",s);
  return 0;
}