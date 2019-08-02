#include <stdio.h>
int main() {
	int n,i,c=0,d=0,b,k,j,s=1;
  scanf("%d",&n);
  k=n;
  while(n!=0)
  {
    n=n/10;
    c++;
  }
  n=k;
  for(i=1;i<=c;i++)
  {
    b=n%10;
    for(j=1;j<=c;j++)
    {
      s=s*b;
      
    } 
    d=d+s;
    n=n/10;
    s=1;
  
  }
 if(d==k)
    printf("Armstrong Number");
 else
 printf("Not an Armstrong Number");
	return 0;
}