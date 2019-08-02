#include <stdio.h>
int main() {
  int n,c,z,t=1,a,i;
  scanf("%d",&n);
  z=n;
  while(n!=0)
  {
    n=n/10;
    c++;
  }
  n=z;
  for(i=1;i<(c-1);i++)
  {
    t=t*10;
  }
  a=(n/t)%10;
  printf("%d",a);
	
	return 0;
}