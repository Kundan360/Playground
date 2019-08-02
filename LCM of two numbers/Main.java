#include<stdio.h>
int main()
{
  int a,b,m,i;
  scanf("%d%d",&a,&b);
  if(a>b)
    m=a;
  else
    m=b;
  for(i=m;i<=a*b;i++)
  {
    if(i%a==0 && i%b==0)
    {
      printf("%d",i);
      break;
    }
  }
    
  return 0;
}