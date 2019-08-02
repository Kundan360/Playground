#include<stdio.h>

int main()
{
  long int n,a=0,y=0,d=0,c,z,i=0,k,l=0;
  scanf("%d",&n);
  while(n!=0)
  {
    a=n%10;
    z=a*pow(2,i);
      y=y+z;
    n=n/10;
    
    
    i++;
  }
 // printf("%d\n",y);
  while(y!=0)
  {
    c=y%8;
    d=d*10 +c;
    y=(y/8);
  }
 // printf("%d\n",d);
  while(d!=0)
  {
    k=d%10;
    l=l*10 +k;
    d=d/10;
  }
  printf("%d",l);
  return 0;
}