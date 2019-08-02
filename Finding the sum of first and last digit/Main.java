#include <stdio.h>
int main() {
	int n,c=0,k=1,sum,f,l,i,z;
    scanf("%d",&n);
    z=n;
    while(n!=0)
    {
     n= n/10; 
      c++;
    }
  n=z;
  l=n%10;
    for(i=1;i<c;i++)
      k=k*10;
  f=n/k;
    sum=f+l; 
  printf("%d",sum);  
	return 0;
}