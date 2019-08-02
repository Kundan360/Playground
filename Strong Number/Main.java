#include <stdio.h>
int main() {
	int n,i,k,y=1,z,c=0,s=0,j;
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
    z=n%10;
    
    for(j=1;j<=z;j++) {
    y=j*y;
    }
    s=s+y;
    n=n/10;
    y=1;
  
  }
  
  
  if(s==k)
    printf("Yes");
  else
 printf("No");
  
	return 0;
}